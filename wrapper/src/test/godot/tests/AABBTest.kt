package godot.tests

import godot.core.*


class AABBTest {
    fun test() {
        Godot.print("Testing AABB")
        Godot.print("--------------------------------------")
        var aabb = AABB()
        Godot.print("Testing constructor(): " +
                if (aabb.position == Vector3() && aabb.size == Vector3())
                    "OK"
                else
                    "ERROR")
        aabb = AABB(Vector3(1,2,3), Vector3(4,5,6))
        Godot.print("Testing constructor(Vector3, Vector3): " +
                if (aabb.position[0] == 1f && aabb.position[1] == 2f &&
                        aabb.position[2] == 3f && aabb.size[0] == 4f &&
                        aabb.size[1] == 5f && aabb.size[2] == 6f)
                    "OK"
                else
                    "ERROR")
        aabb.size.x = 0f
        Godot.print("Testing hasNoArea: " +
                if (aabb.hasNoArea())
                    "OK"
                else
                    "ERROR")
        aabb.size.y = 0f
        aabb.size.z = 0f
        Godot.print("Testing hasNoSurface: " +
                if (aabb.hasNoSurface())
                    "OK"
                else
                    "ERROR")
        var p_aabb = AABB(Vector3(5,5,5), Vector3(1,1,1))
        aabb = AABB(Vector3(4,4,4), Vector3(1,1,1))
        Godot.print("Testing intersects: " +
                if (!aabb.intersects(p_aabb))
                    "OK"
                else
                    "ERROR")
        Godot.print("Testing intersectsInclusive:" +
                if (aabb.intersectsInclusive(p_aabb))
                    "OK"
                else
                    "ERROR")
        aabb.position = Vector3(-1,-1,-1)
        aabb.size = Vector3(2,2,2)
        p_aabb.position = Vector3(-0.5,-0.5,-0.5)
        p_aabb.size = Vector3(1,1,1)
        Godot.print("Testing encloses: " +
                if (aabb.encloses(p_aabb))
                    "OK"
                else
                    "ERROR")
        aabb.position = Vector3(0,0,0)
        aabb.size = Vector3(1,1,1)
        Godot.print("Testing getSupport: " +
                if (aabb.getSupport(Vector3(-1,-1,-1)) == Vector3(1,1,1))
                    "OK"
                else
                    "ERROR")
        Godot.print("Testing getEndpoint: " +
                if (aabb.getEndpoint(0) == Vector3(0,0,0))
                    "OK"
                else
                    "ERROR")
        var plane = Plane(-1,-1,-1, -2)
        Godot.print("Testing intersectsConvexShape: " +
                if (aabb.intersectsConvexShape(arrayOf(plane), 1))
                    "OK"
                else
                    "ERROR")
        Godot.print("Testing hasPoint: " +
                if (aabb.hasPoint(Vector3(0.5, 0.5, 0.5)))
                    "OK"
                else
                    "ERROR")
        aabb.expandTo(Vector3(2, 2, 2))
        Godot.print("Testing expandTo: " +
                if (aabb.size == Vector3(2, 2, 2))
                    "OK"
                else
                    "ERROR")
        Godot.print("Testing projectRangeInPlane: " +
                if (aabb.projectRangeInPlane(plane).first == -4f &&
                        aabb.projectRangeInPlane(plane).second == 2f)
                    "OK"
                else
                    "ERROR")
        aabb.size = Vector3(1,2,3)
        Godot.print("Testing getLongestAxisSize: " +
                if (aabb.getLongestAxisSize() == 3f)
                    "OK"
                else
                    "ERROR")
        Godot.print("Testing getShortestAxisSize: " +
                if (aabb.getShortestAxisSize() == 1f)
                    "OK"
                else
                    "ERROR")

        aabb.position = Vector3(1,1,1)
        aabb.size = Vector3(1,1,1)
        Godot.print("Testing smitsIntersectRat(1): " +
                if (aabb.smitsIntersectRat(Vector3(0,0,0), Vector3(1,1,1), 1f, 2f))
                    "OK"
                else
                    "ERROR")
        Godot.print("Testing smitsIntersectRat(2): " +
                if (!aabb.smitsIntersectRat(Vector3(-1,0,0), Vector3(1,1,1), 1f, 2f))
                    "OK"
                else
                    "ERROR")
        aabb.growBy(1f)
        Godot.print("Testing growBy: " +
                if (aabb.position == Vector3(0,0,0) && aabb.size == Vector3(3,3,3))
                    "OK"
                else
                    "ERROR")
        Godot.print("Testing getArea: " +
                if (aabb.getArea() == 27f)
                    "OK"
                else
                    "ERROR")

        aabb.position = Vector3(0,0,0)
        aabb.size = Vector3(1,1,1)
        p_aabb.position = Vector3(1,1,1)
        p_aabb.size = Vector3(1,1,1)
        aabb.mergeWith(p_aabb)
        Godot.print("Testing mergeWith: " +
                if (aabb.position == Vector3(0,0,0) && aabb.size == Vector3(2,2,2))
                    "OK"
                else
                    "ERROR")

        aabb.position = Vector3(0,0,0)
        aabb.size = Vector3(1,1,1)
        p_aabb.position = Vector3(1,1,1)
        p_aabb.size = Vector3(1,1,1)
        Godot.print("Testing intersection(1): " +
                if (aabb.intersection(p_aabb) == AABB())
                    "OK"
                else
                    "ERROR")

        aabb.position = Vector3(0,0,0)
        aabb.size = Vector3(2,2,2)
        p_aabb.position = Vector3(1,1,1)
        p_aabb.size = Vector3(2,2,2)
        Godot.print("Testing intersection(2): " +
                if (aabb.intersection(p_aabb) == AABB(Vector3(1,1,1), Vector3(1,1,1)))
                    "OK"
                else
                    "ERROR")

        Godot.print("--------------------------------------")
        Godot.print("")
    }
}