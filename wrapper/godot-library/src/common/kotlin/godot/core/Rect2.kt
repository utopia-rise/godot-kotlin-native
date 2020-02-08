@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import kotlin.math.max
import kotlin.math.min


expect class Rect2 {
    var position: Vector2
    var size: Vector2


    constructor()
    constructor(x: Number, y: Number, width: Number, height: Number)
    constructor(position: Vector2, size: Vector2)
}

fun Rect2.getArea(): Double = size.width * size.height

fun Rect2.intersects(rect: Rect2): Boolean =
    when {
        position.x >= (rect.position.x + rect.size.width) -> false
        (position.x+size.width) <= rect.position.x          -> false
        position.y >= (rect.position.y + rect.size.height)-> false
        (position.y+size.height) <= rect.position.y         -> false
        else                                        ->  true
    }

fun Rect2.encloses(rect: Rect2): Boolean =
    (rect.position.x>=position.x) && (rect.position.y>=position.y) &&
        ((rect.position.x+rect.size.x)<(position.x+size.x)) &&
        ((rect.position.y+rect.size.y)<(position.y+size.y))

fun Rect2.hasNoArea(): Boolean =
    size.x<=0 || size.y<=0

fun Rect2.hasPoint(point: Vector2): Boolean =
    when {
        point.x < position.x           -> false
        point.y < position.y           -> false
        point.x >= (position.x+size.x) -> false
        point.y >= (position.y+size.y) -> false
        else                        -> true
    }

fun Rect2.noArea(): Boolean =
    size.width<=0 || size.height<=0


fun Rect2.grow(by: Double): Rect2 {
    val g = this
    g.position.x -= by
    g.position.y -= by
    g.size.width += by * 2
    g.size.height += by * 2
    return g
}

fun Rect2.expand(vector: Vector2): Rect2 {
    val r = this
    r.expandTo(vector)
    return r
}

fun Rect2.expandTo(vector: Vector2) {
    val begin = position
    val end = position + size

    if (vector.x < begin.x)
        begin.x = vector.x
    if (vector.y < begin.y)
        begin.y = vector.y

    if (vector.x > end.x)
        end.x = vector.x
    if (vector.y > end.y)
        end.y = vector.y

    position = begin
    size = end-begin
}


fun Rect2.distanceTo(point: Vector2): Double {
    var dist = 1e20
    if (point.x < position.x) {
        dist = min(dist,position.x-point.x)
    }
    if (point.y < position.y) {
        dist = min(dist,position.y-point.y)
    }
    if (point.x >= (position.x+size.x) ) {
        dist= min(point.x-(position.x+size.x),dist)
    }
    if (point.y >= (position.y+size.y) ) {
        dist= min(point.y-(position.y+size.y),dist)
    }
    return if (dist==1e20)
        0.0
    else
        dist
}

fun Rect2.clip(rect: Rect2): Rect2 {
    if (!intersects(rect)) return Rect2()

    rect.position.x = max( rect.position.x , position.x )
    rect.position.y = max( rect.position.y , position.y )

    val rectEnd = rect.position+rect.size
    val end = position+size

    rect.size.x = min(rectEnd.x,end.x) - rect.position.x
    rect.size.y = min(rectEnd.y,end.y) - rect.position.y

    return rect
}

fun Rect2.merge(rect: Rect2): Rect2 {

    rect.position.x= min( rect.position.x , position.x )
    rect.position.y= min( rect.position.y , position.y )


    rect.size.x = max( rect.position.x+rect.size.x , position.x+size.x )
    rect.size.y = max( rect.position.y+rect.size.y , position.y+size.y )

    rect.size = rect.size - rect.position //make relative again

    return rect
}

fun Rect2.intersectsSegment(from: Vector2, to: Vector2, boolPos: Boolean, boolNormal: Boolean): Triple<Boolean, Vector2?, Vector2?> {
    var min = 0.0
    var max = 1.0
    var axis = 0
    var sign = 0.0

    for (i in 0..1) {
        val segFrom = from[i]
        val segTo = to[i]
        val boxBegin = position[i]
        val boxEnd = boxBegin + size[i]
        val cmin: Double
        val cmax: Double
        val csign: Double

        if (segFrom < segTo) {
            if (segFrom > boxEnd || segTo < boxBegin)
                return Triple(false, null, null)
            val length=segTo-segFrom
            cmin = if (segFrom < boxBegin) ((boxBegin - segFrom)/length) else 0.0
            cmax = if (segTo > boxEnd) ((boxEnd - segFrom)/length) else 1.0
            csign = -1.0
        } else {
            if (segTo > boxEnd || segFrom < boxBegin)
                return Triple(false, null, null)
            val length = segTo-segFrom
            cmin = if (segFrom > boxEnd) (boxEnd - segFrom)/length else 0.0
            cmax = if (segTo < boxBegin) (boxBegin - segFrom)/length else 1.0
            csign = 1.0
        }

        if (cmin > min) {
            min = cmin
            axis = i
            sign = csign
        }
        if (cmax < max)
            max = cmax
        if (max < min)
            return Triple(false, null, null)
    }

    val rel = to - from
    var normal: Vector2? = null
    var pos: Vector2? = null
    if (boolNormal) {
        normal = Vector2()
        normal[axis] = sign
    }

    if (boolPos)
        pos = from + rel * min

    return Triple(true, pos, normal)
}

fun Rect2.intersectsTransformed(xform: Transform2D, rect: Rect2): Boolean {
    val xfPoints = arrayOf(xform.xform(rect.position),
        xform.xform(Vector2(rect.position.x+rect.size.x,rect.position.y)),
        xform.xform(Vector2(rect.position.x,rect.position.y+rect.size.y)),
        xform.xform(Vector2(rect.position.x+rect.size.x,rect.position.y+rect.size.y)))

    var lowLimit = position.y+size.y

    when {
        xfPoints[0].y > position.y -> {}
        xfPoints[1].y > position.y -> {}
        xfPoints[2].y > position.y -> {}
        xfPoints[3].y > position.y -> {}
        else -> return false
    }

    when {
        xfPoints[0].y < lowLimit -> {}
        xfPoints[1].y < lowLimit -> {}
        xfPoints[2].y < lowLimit -> {}
        xfPoints[3].y < lowLimit -> {}
        else -> return false
    }

    when {
        xfPoints[0].x > position.x -> {}
        xfPoints[1].x > position.x -> {}
        xfPoints[2].x > position.x -> {}
        xfPoints[3].x > position.x -> {}
        else -> return false
    }

    lowLimit = position.x + size.x

    when {
        xfPoints[0].x < lowLimit -> {}
        xfPoints[1].x < lowLimit -> {}
        xfPoints[2].x < lowLimit -> {}
        xfPoints[3].x < lowLimit -> {}
        else -> return false
    }

    val xfPoints2 = arrayOf(position,
        Vector2(position.x+size.x,position.y),
        Vector2(position.x,position.y+size.y),
        Vector2(position.x+size.x,position.y+size.y))

    var maxa = xform.elements[0].dot(xfPoints2[0])
    var mina = maxa

    var dp = xform.elements[0].dot(xfPoints2[1])
    maxa = max(dp, maxa)
    mina = min(dp, mina)

    dp = xform.elements[0].dot(xfPoints2[2])
    maxa= max(dp,maxa)
    mina= min(dp,mina)

    dp = xform.elements[0].dot(xfPoints2[3])
    maxa= max(dp,maxa)
    mina= min(dp,mina)

    var maxb=xform.elements[0].dot(xfPoints[0])
    var minb=maxb

    dp = xform.elements[0].dot(xfPoints[1])
    maxb= max(dp,maxb)
    minb= min(dp,minb)

    dp = xform.elements[0].dot(xfPoints[2])
    maxb= max(dp,maxb)
    minb= min(dp,minb)

    dp = xform.elements[0].dot(xfPoints[3])
    maxb= max(dp,maxb)
    minb= min(dp,minb)


    if ( mina > maxb || minb > maxa )
        return false

    maxa=xform.elements[1].dot(xfPoints2[0])
    mina=maxa

    dp = xform.elements[1].dot(xfPoints2[1])
    maxa= max(dp,maxa)
    mina= min(dp,mina)

    dp = xform.elements[1].dot(xfPoints2[2])
    maxa= max(dp,maxa)
    mina= min(dp,mina)

    dp = xform.elements[1].dot(xfPoints2[3])
    maxa= max(dp,maxa)
    mina= min(dp,mina)

    maxb=xform.elements[1].dot(xfPoints[0])
    minb=maxb

    dp = xform.elements[1].dot(xfPoints[1])
    maxb= max(dp,maxb)
    minb= min(dp,minb)

    dp = xform.elements[1].dot(xfPoints[2])
    maxb= max(dp,maxb)
    minb= min(dp,minb)

    dp = xform.elements[1].dot(xfPoints[3])
    maxb= max(dp,maxb)
    minb= min(dp,minb)

    if ( mina > maxb || minb > maxa )
        return false

    return true
}

