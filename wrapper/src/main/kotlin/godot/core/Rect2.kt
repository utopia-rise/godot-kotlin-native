package kotlin.godot.core

<<<<<<< Updated upstream
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.MemScope


open class Rect2: CoreType {
    constructor()
    constructor(a: Number, b: Number, c: Number, d: Number)


    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setRawMemory(mem: COpaquePointer) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
=======
import godot.godot_rect2
import godot.godot_transform2d
import kotlinx.cinterop.*

class Rect2: CoreType {

    lateinit var pos: Vector2
    lateinit var size: Vector2

    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return cValuesOf(pos[0], pos[1], size[0], size[1]).getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        val arr = mem.reinterpret<FloatVar>()
        pos[0] = arr[0]
        pos[1] = arr[1]
        size[0] = arr[2]
        size[1] = arr[3]
    }

    internal constructor(native: CValue<godot_rect2>) {
        memScoped {
            this@Rect2.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }

    constructor()
    constructor(p_x: Float, p_y: Float, p_width: Float, p_height: Float) {
        pos = Vector2(p_x, p_y)
        size = Vector2(p_width, p_height)
    }
    constructor(p_pos: Vector2, p_size: Vector2) {
        pos = p_pos
        size = p_size
    }

    fun get_pos(): Vector2 = pos
    fun set_pos(p_pos: Vector2) {pos = p_pos}
    fun get_size(): Vector2 = size
    fun set_size(p_size: Vector2) {size = p_size}

    fun get_area(): Float = size.width * size.height

    fun intersects(p_rect: Rect2): Boolean =
            when {
                pos.x >= (p_rect.pos.x + p_rect.size.width) -> false
                (pos.x+size.width) <= p_rect.pos.x          -> false
                pos.y >= (p_rect.pos.y + p_rect.size.height)-> false
                (pos.y+size.height) <= p_rect.pos.y         -> false
                else                                        ->  true
            }

    fun encloses(p_rect: Rect2): Boolean =
            (p_rect.pos.x>=pos.x) && (p_rect.pos.y>=pos.y) &&
                    ((p_rect.pos.x+p_rect.size.x)<(pos.x+size.x)) &&
                    ((p_rect.pos.y+p_rect.size.y)<(pos.y+size.y))

    fun has_no_area(): Boolean =
            size.x<=0 || size.y<=0

    fun has_point(p_point: Vector2): Boolean =
            when {
                p_point.x < pos.x           -> false
                p_point.y < pos.y           -> false
                p_point.x >= (pos.x+size.x) -> false
                p_point.y >= (pos.y+size.y) -> false
                else                        -> true
            }

    fun no_area(): Boolean =
            size.width<=0 || size.height<=0

    override fun equals(other: Any?): Boolean =
            when (other) {
                is Rect2 -> pos==other.pos && size==other.size
                else     -> false
            }

    fun grow(p_by: Float): Rect2 {
        val g = this
        g.pos.x -= p_by
        g.pos.y -= p_by
        g.size.width += p_by * 2
        g.size.height += p_by * 2
        return g
    }

    fun expand(p_vector: Vector2): Rect2 {
        val r = this
        r.expand_to(p_vector)
        return r
    }

    fun expand_to(p_vector: Vector2) {
        val begin = pos
        val end = pos + size

        if (p_vector.x < begin.x)
            begin.x = p_vector.x
        if (p_vector.y < begin.y)
            begin.y = p_vector.y

        if (p_vector.x > end.x)
            end.x = p_vector.x
        if (p_vector.y > end.y)
            end.y = p_vector.y

        pos = begin
        size = end-begin
    }

    private fun MAX(n1: Float, n2: Float) =
            if (n1 > n2) n1 else n2

    private fun MIN(n1: Float, n2: Float) =
            if (n1 < n2) n1 else n2

    fun distance_to(p_point: Vector2): Float {
        var dist = 1e20f
        if (p_point.x < pos.x) {
            dist = MIN(dist,pos.x-p_point.x)
        }
        if (p_point.y < pos.y) {
            dist = MIN(dist,pos.y-p_point.y)
        }
        if (p_point.x >= (pos.x+size.x) ) {
            dist=MIN(p_point.x-(pos.x+size.x),dist)
        }
        if (p_point.y >= (pos.y+size.y) ) {
            dist=MIN(p_point.y-(pos.y+size.y),dist)
        }
        if (dist==1e20f)
            return 0f
        else
            return dist
    }

    fun clip(p_rect: Rect2): Rect2 {
        val new_rect = p_rect
        if (!intersects( new_rect ))
            return Rect2()

        new_rect.pos.x = MAX( p_rect.pos.x , pos.x )
        new_rect.pos.y = MAX( p_rect.pos.y , pos.y )

        val p_rect_end = p_rect.pos+p_rect.size
        val end = pos+size

        new_rect.size.x = MIN(p_rect_end.x,end.x) - new_rect.pos.x
        new_rect.size.y = MIN(p_rect_end.y,end.y) - new_rect.pos.y

        return new_rect
    }

    fun merge(p_rect: Rect2): Rect2 {
        val new_rect = p_rect

        new_rect.pos.x=MIN( p_rect.pos.x , pos.x )
        new_rect.pos.y=MIN( p_rect.pos.y , pos.y )


        new_rect.size.x = MAX( p_rect.pos.x+p_rect.size.x , pos.x+size.x )
        new_rect.size.y = MAX( p_rect.pos.y+p_rect.size.y , pos.y+size.y )

        new_rect.size = new_rect.size - new_rect.pos //make relative again

        return new_rect
    }

    override fun toString(): String =
            pos.toString() + ", " + size.toString()

    fun intersects_segment(p_from: Vector2, p_to: Vector2, r_pos: Vector2?, r_normal: Vector2?): Triple<Boolean, Vector2?, Vector2?> {
        var min = 0f
        var max = 1f
        var axis = 0
        var sign = 0f

        for (i in 0..1) {
            val seg_from=p_from[i]
            val seg_to=p_to[i]
            val box_begin=pos[i]
            val box_end=box_begin+size[i]
            val cmin: Float
            val cmax: Float
            val csign: Float

            if (seg_from < seg_to) {
                if (seg_from > box_end || seg_to < box_begin)
                    return Triple(false, r_pos, r_normal)
                val length=seg_to-seg_from
                cmin = if (seg_from < box_begin) ((box_begin - seg_from)/length) else 0f
                cmax = if (seg_to > box_end) ((box_end - seg_from)/length) else 1f
                csign = -1f
            } else {
                if (seg_to > box_end || seg_from < box_begin)
                    return Triple(false, r_pos, r_normal)
                val length = seg_to-seg_from
                cmin = if (seg_from > box_end) (box_end - seg_from)/length else 0f
                cmax = if (seg_to < box_begin) (box_begin - seg_from)/length else 1f
                csign = 1f
            }

            if (cmin > min) {
                min = cmin
                axis = i
                sign = csign
            }
            if (cmax < max)
                max = cmax
            if (max < min)
                return Triple(false, r_pos, r_normal)
        }

        val rel = p_to - p_from
        var normal: Vector2? = null
        var pos: Vector2? = null
        if (r_normal != null) {
            normal = Vector2()
            normal[axis] = sign
        }

        if (r_pos != null)
            pos = p_from + rel * min

        return Triple(true, pos, normal)
    }

    fun intersects_transformed(p_xform: Transform2D, p_rect: Rect2): Boolean {
        val xf_points = arrayOf(p_xform.xform(p_rect.pos),
                p_xform.xform(Vector2(p_rect.pos.x+p_rect.size.x,p_rect.pos.y)),
                p_xform.xform(Vector2(p_rect.pos.x,p_rect.pos.y+p_rect.size.y)),
                p_xform.xform(Vector2(p_rect.pos.x+p_rect.size.x,p_rect.pos.y+p_rect.size.y)))

        var low_limit: Float

        when {
            xf_points[0].y>pos.y -> {}
            xf_points[1].y>pos.y -> {}
            xf_points[2].y>pos.y -> {}
            xf_points[3].y>pos.y -> {}
            else -> return false
        }
        low_limit = pos.y+size.y

        when {
            xf_points[0].y<low_limit -> {}
            xf_points[1].y<low_limit -> {}
            xf_points[2].y<low_limit -> {}
            xf_points[3].y<low_limit -> {}
            else -> return false
        }

        when {
            xf_points[0].x>pos.x -> {}
            xf_points[1].x>pos.x -> {}
            xf_points[2].x>pos.x -> {}
            xf_points[3].x>pos.x -> {}
            else -> return false
        }

        low_limit=pos.x+size.x

        when {
            xf_points[0].x<low_limit -> {}
            xf_points[1].x<low_limit -> {}
            xf_points[2].x<low_limit -> {}
            xf_points[3].x<low_limit -> {}
            else -> return false
        }

        val xf_points2 = arrayOf(pos,
                Vector2(pos.x+size.x,pos.y),
                Vector2(pos.x,pos.y+size.y),
                Vector2(pos.x+size.x,pos.y+size.y))

        var maxa = p_xform.elements[0].dot(xf_points2[0])
        var mina = maxa

        var dp = p_xform.elements[0].dot(xf_points2[1])
        maxa=MAX(dp,maxa)
        mina=MIN(dp,mina)

        dp = p_xform.elements[0].dot(xf_points2[2])
        maxa=MAX(dp,maxa)
        mina=MIN(dp,mina)

        dp = p_xform.elements[0].dot(xf_points2[3])
        maxa=MAX(dp,maxa)
        mina=MIN(dp,mina)

        var maxb=p_xform.elements[0].dot(xf_points[0])
        var minb=maxb

        dp = p_xform.elements[0].dot(xf_points[1])
        maxb=MAX(dp,maxb)
        minb=MIN(dp,minb)

        dp = p_xform.elements[0].dot(xf_points[2])
        maxb=MAX(dp,maxb)
        minb=MIN(dp,minb)

        dp = p_xform.elements[0].dot(xf_points[3])
        maxb=MAX(dp,maxb)
        minb=MIN(dp,minb)


        if ( mina > maxb )
            return false
        if ( minb > maxa  )
            return false

        maxa=p_xform.elements[1].dot(xf_points2[0])
        mina=maxa

        dp = p_xform.elements[1].dot(xf_points2[1])
        maxa=MAX(dp,maxa)
        mina=MIN(dp,mina)

        dp = p_xform.elements[1].dot(xf_points2[2])
        maxa=MAX(dp,maxa)
        mina=MIN(dp,mina)

        dp = p_xform.elements[1].dot(xf_points2[3])
        maxa=MAX(dp,maxa)
        mina=MIN(dp,mina)

        maxb=p_xform.elements[1].dot(xf_points[0])
        minb=maxb

        dp = p_xform.elements[1].dot(xf_points[1])
        maxb=MAX(dp,maxb)
        minb=MIN(dp,minb)

        dp = p_xform.elements[1].dot(xf_points[2])
        maxb=MAX(dp,maxb)
        minb=MIN(dp,minb)

        dp = p_xform.elements[1].dot(xf_points[3])
        maxb=MAX(dp,maxb)
        minb=MIN(dp,minb)


        if ( mina > maxb )
            return false
        if ( minb > maxa  )
            return false


        return true
>>>>>>> Stashed changes
    }
}