package godot.codegen

class Graph<T>(elements: List<T>, sortFun: (T, T) -> Boolean) {
    val nodes = mutableListOf<Node<T>>()

    init {
        for (vertex in elements)
            nodes.add(Node(vertex))
        for (v1 in nodes)
            for (v2 in nodes)
                if (sortFun(v1.value, v2.value)) {
                    v2.childs.add(v1)
                    v1.parent = v2
                }
    }


    class Node<T>(val value: T) {
        var parent: Node<T>? = null
        var childs = mutableListOf<Node<T>>()
    }
}


fun List<Class>.buildTree(): Graph<Class> {
    return Graph(this) { child, parent -> child.baseClass == parent.name }
}

fun Graph<Class>.getMethodFromAncestor(cl: Class, method: Method): Method? {
    fun check(m: Method): Boolean {
        if (m.name == method.name && m.arguments.size == method.arguments.size) {
            var flag = true

            for (i in m.arguments.indices) {
                if (m.arguments[i].type != method.arguments[i].type) flag = false
            }

            if (flag) return true
        }
        return false
    }

    fun Graph.Node<Class>.findMethodInHierarchy(): Method? {
        value.methods.forEach {
            if (check(it)) return it
        }

        return parent?.findMethodInHierarchy()
    }
    return nodes.find { it.value.name == cl.name }?.parent?.findMethodInHierarchy()
}

fun Graph<Class>.doAncestorsHaveMethod(cl: Class, method: Method): Boolean {
    if (method.name == "toString") return true

    if (cl.baseClass == "") return false

    return getMethodFromAncestor(cl, method) != null
}


fun Graph<Class>.doAncestorsHaveProperty(cl: Class, prop: Property): Boolean {
    if (cl.baseClass == "") return false

    fun Graph.Node<Class>.findPropertyInHierarchy(): Boolean {
        value.properties.forEach {
            if (it.name == prop.name) return true
        }
        return parent?.findPropertyInHierarchy() ?: false
    }
    return nodes.find { it.value.name == cl.name }!!.parent!!.findPropertyInHierarchy()
}

fun Graph<Class>.getSanitisedArgumentName(method: Method, index: Int, cl: Class): String {
    val parentMethod = getMethodFromAncestor(cl, method)
    return (parentMethod ?: method).arguments[index].name
}

fun Graph<Class>.isObjectOrItsChild(className: String): Boolean {
    var isObjectFamily = false
    var classToCheck = nodes.find { it.value.name == className } ?: return false

    while (!isObjectFamily) {
        isObjectFamily = classToCheck.value.name == "Object"

        if (isObjectFamily) return true

        classToCheck = classToCheck.parent ?: return false
    }
    return isObjectFamily
}
