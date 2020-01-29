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


fun Graph<Class>.doAncestorsHaveMethod(cl: Class, method: Method): Boolean {
    if (cl.baseClass == "")
        return false

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
    fun Graph.Node<Class>.findMethodInHierarchy(): Boolean {
        value.methods.forEach {
            if (check(it)) return true
        }

        return parent?.findMethodInHierarchy() ?: false
    }
    return nodes.find { it.value.name == cl.name }!!.parent!!.findMethodInHierarchy()
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