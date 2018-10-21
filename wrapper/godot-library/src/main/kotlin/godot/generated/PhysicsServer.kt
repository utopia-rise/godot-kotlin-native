@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PhysicsServer : Object {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class BodyAxis(val id: Long) {
        BODY_AXIS_LINEAR_X(1),
        BODY_AXIS_LINEAR_Y(2),
        BODY_AXIS_LINEAR_Z(4),
        BODY_AXIS_ANGULAR_X(8),
        BODY_AXIS_ANGULAR_Y(16),
        BODY_AXIS_ANGULAR_Z(32),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class ProcessInfo(val id: Long) {
        INFO_ACTIVE_OBJECTS(0),
        INFO_COLLISION_PAIRS(1),
        INFO_ISLAND_COUNT(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class AreaBodyStatus(val id: Long) {
        AREA_BODY_ADDED(0),
        AREA_BODY_REMOVED(1),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class BodyMode(val id: Long) {
        BODY_MODE_STATIC(0),
        BODY_MODE_KINEMATIC(1),
        BODY_MODE_RIGID(2),
        BODY_MODE_SOFT(3),
        BODY_MODE_CHARACTER(4),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class ShapeType(val id: Long) {
        SHAPE_PLANE(0),
        SHAPE_RAY(1),
        SHAPE_SPHERE(2),
        SHAPE_BOX(3),
        SHAPE_CAPSULE(4),
        SHAPE_CYLINDER(5),
        SHAPE_CONVEX_POLYGON(6),
        SHAPE_CONCAVE_POLYGON(7),
        SHAPE_HEIGHTMAP(8),
        SHAPE_CUSTOM(9),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class PinJointParam(val id: Long) {
        PIN_JOINT_BIAS(0),
        PIN_JOINT_DAMPING(1),
        PIN_JOINT_IMPULSE_CLAMP(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class SpaceParameter(val id: Long) {
        SPACE_PARAM_CONTACT_RECYCLE_RADIUS(0),
        SPACE_PARAM_CONTACT_MAX_SEPARATION(1),
        SPACE_PARAM_BODY_MAX_ALLOWED_PENETRATION(2),
        SPACE_PARAM_BODY_LINEAR_VELOCITY_SLEEP_THRESHOLD(3),
        SPACE_PARAM_BODY_ANGULAR_VELOCITY_SLEEP_THRESHOLD(4),
        SPACE_PARAM_BODY_TIME_TO_SLEEP(5),
        SPACE_PARAM_BODY_ANGULAR_VELOCITY_DAMP_RATIO(6),
        SPACE_PARAM_CONSTRAINT_DEFAULT_BIAS(7),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class ConeTwistJointParam(val id: Long) {
        CONE_TWIST_JOINT_SWING_SPAN(0),
        CONE_TWIST_JOINT_TWIST_SPAN(1),
        CONE_TWIST_JOINT_BIAS(2),
        CONE_TWIST_JOINT_SOFTNESS(3),
        CONE_TWIST_JOINT_RELAXATION(4),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class JointType(val id: Long) {
        JOINT_PIN(0),
        JOINT_HINGE(1),
        JOINT_SLIDER(2),
        JOINT_CONE_TWIST(3),
        JOINT_6DOF(4),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class BodyState(val id: Long) {
        BODY_STATE_TRANSFORM(0),
        BODY_STATE_LINEAR_VELOCITY(1),
        BODY_STATE_ANGULAR_VELOCITY(2),
        BODY_STATE_SLEEPING(3),
        BODY_STATE_CAN_SLEEP(4),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class BodyParameter(val id: Long) {
        BODY_PARAM_BOUNCE(0),
        BODY_PARAM_FRICTION(1),
        BODY_PARAM_MASS(2),
        BODY_PARAM_GRAVITY_SCALE(3),
        BODY_PARAM_LINEAR_DAMP(4),
        BODY_PARAM_ANGULAR_DAMP(5),
        BODY_PARAM_MAX(6),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class G6DOFJointAxisParam(val id: Long) {
        G6DOF_JOINT_LINEAR_LOWER_LIMIT(0),
        G6DOF_JOINT_LINEAR_UPPER_LIMIT(1),
        G6DOF_JOINT_LINEAR_LIMIT_SOFTNESS(2),
        G6DOF_JOINT_LINEAR_RESTITUTION(3),
        G6DOF_JOINT_LINEAR_DAMPING(4),
        G6DOF_JOINT_LINEAR_MOTOR_TARGET_VELOCITY(5),
        G6DOF_JOINT_LINEAR_MOTOR_FORCE_LIMIT(6),
        G6DOF_JOINT_ANGULAR_LOWER_LIMIT(7),
        G6DOF_JOINT_ANGULAR_UPPER_LIMIT(8),
        G6DOF_JOINT_ANGULAR_LIMIT_SOFTNESS(9),
        G6DOF_JOINT_ANGULAR_DAMPING(10),
        G6DOF_JOINT_ANGULAR_RESTITUTION(11),
        G6DOF_JOINT_ANGULAR_FORCE_LIMIT(12),
        G6DOF_JOINT_ANGULAR_ERP(13),
        G6DOF_JOINT_ANGULAR_MOTOR_TARGET_VELOCITY(14),
        G6DOF_JOINT_ANGULAR_MOTOR_FORCE_LIMIT(15),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class SliderJointParam(val id: Long) {
        SLIDER_JOINT_LINEAR_LIMIT_UPPER(0),
        SLIDER_JOINT_LINEAR_LIMIT_LOWER(1),
        SLIDER_JOINT_LINEAR_LIMIT_SOFTNESS(2),
        SLIDER_JOINT_LINEAR_LIMIT_RESTITUTION(3),
        SLIDER_JOINT_LINEAR_LIMIT_DAMPING(4),
        SLIDER_JOINT_LINEAR_MOTION_SOFTNESS(5),
        SLIDER_JOINT_LINEAR_MOTION_RESTITUTION(6),
        SLIDER_JOINT_LINEAR_MOTION_DAMPING(7),
        SLIDER_JOINT_LINEAR_ORTHOGONAL_SOFTNESS(8),
        SLIDER_JOINT_LINEAR_ORTHOGONAL_RESTITUTION(9),
        SLIDER_JOINT_LINEAR_ORTHOGONAL_DAMPING(10),
        SLIDER_JOINT_ANGULAR_LIMIT_UPPER(11),
        SLIDER_JOINT_ANGULAR_LIMIT_LOWER(12),
        SLIDER_JOINT_ANGULAR_LIMIT_SOFTNESS(13),
        SLIDER_JOINT_ANGULAR_LIMIT_RESTITUTION(14),
        SLIDER_JOINT_ANGULAR_LIMIT_DAMPING(15),
        SLIDER_JOINT_ANGULAR_MOTION_SOFTNESS(16),
        SLIDER_JOINT_ANGULAR_MOTION_RESTITUTION(17),
        SLIDER_JOINT_ANGULAR_MOTION_DAMPING(18),
        SLIDER_JOINT_ANGULAR_ORTHOGONAL_SOFTNESS(19),
        SLIDER_JOINT_ANGULAR_ORTHOGONAL_RESTITUTION(20),
        SLIDER_JOINT_ANGULAR_ORTHOGONAL_DAMPING(21),
        SLIDER_JOINT_MAX(22),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class HingeJointParam(val id: Long) {
        HINGE_JOINT_BIAS(0),
        HINGE_JOINT_LIMIT_UPPER(1),
        HINGE_JOINT_LIMIT_LOWER(2),
        HINGE_JOINT_LIMIT_BIAS(3),
        HINGE_JOINT_LIMIT_SOFTNESS(4),
        HINGE_JOINT_LIMIT_RELAXATION(5),
        HINGE_JOINT_MOTOR_TARGET_VELOCITY(6),
        HINGE_JOINT_MOTOR_MAX_IMPULSE(7),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class G6DOFJointAxisFlag(val id: Long) {
        G6DOF_JOINT_FLAG_ENABLE_LINEAR_LIMIT(0),
        G6DOF_JOINT_FLAG_ENABLE_ANGULAR_LIMIT(1),
        G6DOF_JOINT_FLAG_ENABLE_MOTOR(2),
        G6DOF_JOINT_FLAG_ENABLE_LINEAR_MOTOR(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class HingeJointFlag(val id: Long) {
        HINGE_JOINT_FLAG_USE_LIMIT(0),
        HINGE_JOINT_FLAG_ENABLE_MOTOR(1),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class AreaSpaceOverrideMode(val id: Long) {
        AREA_SPACE_OVERRIDE_DISABLED(0),
        AREA_SPACE_OVERRIDE_COMBINE(1),
        AREA_SPACE_OVERRIDE_COMBINE_REPLACE(2),
        AREA_SPACE_OVERRIDE_REPLACE(3),
        AREA_SPACE_OVERRIDE_REPLACE_COMBINE(4),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class AreaParameter(val id: Long) {
        AREA_PARAM_GRAVITY(0),
        AREA_PARAM_GRAVITY_VECTOR(1),
        AREA_PARAM_GRAVITY_IS_POINT(2),
        AREA_PARAM_GRAVITY_DISTANCE_SCALE(3),
        AREA_PARAM_GRAVITY_POINT_ATTENUATION(4),
        AREA_PARAM_LINEAR_DAMP(5),
        AREA_PARAM_ANGULAR_DAMP(6),
        AREA_PARAM_PRIORITY(7),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    @ThreadLocal    companion object {
        infix fun from(other: Object): PhysicsServer = PhysicsServer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): PhysicsServer = fromVariant(PhysicsServer(""), other)


        // Constants
        const val JOINT_PIN: Long = 0
        const val JOINT_HINGE: Long = 1
        const val JOINT_SLIDER: Long = 2
        const val JOINT_CONE_TWIST: Long = 3
        const val JOINT_6DOF: Long = 4
        const val PIN_JOINT_BIAS: Long = 0
        const val PIN_JOINT_DAMPING: Long = 1
        const val PIN_JOINT_IMPULSE_CLAMP: Long = 2
        const val HINGE_JOINT_BIAS: Long = 0
        const val HINGE_JOINT_LIMIT_UPPER: Long = 1
        const val HINGE_JOINT_LIMIT_LOWER: Long = 2
        const val HINGE_JOINT_LIMIT_BIAS: Long = 3
        const val HINGE_JOINT_LIMIT_SOFTNESS: Long = 4
        const val HINGE_JOINT_LIMIT_RELAXATION: Long = 5
        const val HINGE_JOINT_MOTOR_TARGET_VELOCITY: Long = 6
        const val HINGE_JOINT_MOTOR_MAX_IMPULSE: Long = 7
        const val HINGE_JOINT_FLAG_USE_LIMIT: Long = 0
        const val HINGE_JOINT_FLAG_ENABLE_MOTOR: Long = 1
        const val SLIDER_JOINT_LINEAR_LIMIT_UPPER: Long = 0
        const val SLIDER_JOINT_LINEAR_LIMIT_LOWER: Long = 1
        const val SLIDER_JOINT_LINEAR_LIMIT_SOFTNESS: Long = 2
        const val SLIDER_JOINT_LINEAR_LIMIT_RESTITUTION: Long = 3
        const val SLIDER_JOINT_LINEAR_LIMIT_DAMPING: Long = 4
        const val SLIDER_JOINT_LINEAR_MOTION_SOFTNESS: Long = 5
        const val SLIDER_JOINT_LINEAR_MOTION_RESTITUTION: Long = 6
        const val SLIDER_JOINT_LINEAR_MOTION_DAMPING: Long = 7
        const val SLIDER_JOINT_LINEAR_ORTHOGONAL_SOFTNESS: Long = 8
        const val SLIDER_JOINT_LINEAR_ORTHOGONAL_RESTITUTION: Long = 9
        const val SLIDER_JOINT_LINEAR_ORTHOGONAL_DAMPING: Long = 10
        const val SLIDER_JOINT_ANGULAR_LIMIT_UPPER: Long = 11
        const val SLIDER_JOINT_ANGULAR_LIMIT_LOWER: Long = 12
        const val SLIDER_JOINT_ANGULAR_LIMIT_SOFTNESS: Long = 13
        const val SLIDER_JOINT_ANGULAR_LIMIT_RESTITUTION: Long = 14
        const val SLIDER_JOINT_ANGULAR_LIMIT_DAMPING: Long = 15
        const val SLIDER_JOINT_ANGULAR_MOTION_SOFTNESS: Long = 16
        const val SLIDER_JOINT_ANGULAR_MOTION_RESTITUTION: Long = 17
        const val SLIDER_JOINT_ANGULAR_MOTION_DAMPING: Long = 18
        const val SLIDER_JOINT_ANGULAR_ORTHOGONAL_SOFTNESS: Long = 19
        const val SLIDER_JOINT_ANGULAR_ORTHOGONAL_RESTITUTION: Long = 20
        const val SLIDER_JOINT_ANGULAR_ORTHOGONAL_DAMPING: Long = 21
        const val SLIDER_JOINT_MAX: Long = 22
        const val CONE_TWIST_JOINT_SWING_SPAN: Long = 0
        const val CONE_TWIST_JOINT_TWIST_SPAN: Long = 1
        const val CONE_TWIST_JOINT_BIAS: Long = 2
        const val CONE_TWIST_JOINT_SOFTNESS: Long = 3
        const val CONE_TWIST_JOINT_RELAXATION: Long = 4
        const val G6DOF_JOINT_LINEAR_LOWER_LIMIT: Long = 0
        const val G6DOF_JOINT_LINEAR_UPPER_LIMIT: Long = 1
        const val G6DOF_JOINT_LINEAR_LIMIT_SOFTNESS: Long = 2
        const val G6DOF_JOINT_LINEAR_RESTITUTION: Long = 3
        const val G6DOF_JOINT_LINEAR_DAMPING: Long = 4
        const val G6DOF_JOINT_LINEAR_MOTOR_TARGET_VELOCITY: Long = 5
        const val G6DOF_JOINT_LINEAR_MOTOR_FORCE_LIMIT: Long = 6
        const val G6DOF_JOINT_ANGULAR_LOWER_LIMIT: Long = 7
        const val G6DOF_JOINT_ANGULAR_UPPER_LIMIT: Long = 8
        const val G6DOF_JOINT_ANGULAR_LIMIT_SOFTNESS: Long = 9
        const val G6DOF_JOINT_ANGULAR_DAMPING: Long = 10
        const val G6DOF_JOINT_ANGULAR_RESTITUTION: Long = 11
        const val G6DOF_JOINT_ANGULAR_FORCE_LIMIT: Long = 12
        const val G6DOF_JOINT_ANGULAR_ERP: Long = 13
        const val G6DOF_JOINT_ANGULAR_MOTOR_TARGET_VELOCITY: Long = 14
        const val G6DOF_JOINT_ANGULAR_MOTOR_FORCE_LIMIT: Long = 15
        const val G6DOF_JOINT_FLAG_ENABLE_LINEAR_LIMIT: Long = 0
        const val G6DOF_JOINT_FLAG_ENABLE_ANGULAR_LIMIT: Long = 1
        const val G6DOF_JOINT_FLAG_ENABLE_MOTOR: Long = 2
        const val G6DOF_JOINT_FLAG_ENABLE_LINEAR_MOTOR: Long = 3
        const val SHAPE_PLANE: Long = 0
        const val SHAPE_RAY: Long = 1
        const val SHAPE_SPHERE: Long = 2
        const val SHAPE_BOX: Long = 3
        const val SHAPE_CAPSULE: Long = 4
        const val SHAPE_CYLINDER: Long = 5
        const val SHAPE_CONVEX_POLYGON: Long = 6
        const val SHAPE_CONCAVE_POLYGON: Long = 7
        const val SHAPE_HEIGHTMAP: Long = 8
        const val SHAPE_CUSTOM: Long = 9
        const val AREA_PARAM_GRAVITY: Long = 0
        const val AREA_PARAM_GRAVITY_VECTOR: Long = 1
        const val AREA_PARAM_GRAVITY_IS_POINT: Long = 2
        const val AREA_PARAM_GRAVITY_DISTANCE_SCALE: Long = 3
        const val AREA_PARAM_GRAVITY_POINT_ATTENUATION: Long = 4
        const val AREA_PARAM_LINEAR_DAMP: Long = 5
        const val AREA_PARAM_ANGULAR_DAMP: Long = 6
        const val AREA_PARAM_PRIORITY: Long = 7
        const val AREA_SPACE_OVERRIDE_DISABLED: Long = 0
        const val AREA_SPACE_OVERRIDE_COMBINE: Long = 1
        const val AREA_SPACE_OVERRIDE_COMBINE_REPLACE: Long = 2
        const val AREA_SPACE_OVERRIDE_REPLACE: Long = 3
        const val AREA_SPACE_OVERRIDE_REPLACE_COMBINE: Long = 4
        const val BODY_MODE_STATIC: Long = 0
        const val BODY_MODE_KINEMATIC: Long = 1
        const val BODY_MODE_RIGID: Long = 2
        const val BODY_MODE_SOFT: Long = 3
        const val BODY_MODE_CHARACTER: Long = 4
        const val BODY_PARAM_BOUNCE: Long = 0
        const val BODY_PARAM_FRICTION: Long = 1
        const val BODY_PARAM_MASS: Long = 2
        const val BODY_PARAM_GRAVITY_SCALE: Long = 3
        const val BODY_PARAM_LINEAR_DAMP: Long = 4
        const val BODY_PARAM_ANGULAR_DAMP: Long = 5
        const val BODY_PARAM_MAX: Long = 6
        const val BODY_STATE_TRANSFORM: Long = 0
        const val BODY_STATE_LINEAR_VELOCITY: Long = 1
        const val BODY_STATE_ANGULAR_VELOCITY: Long = 2
        const val BODY_STATE_SLEEPING: Long = 3
        const val BODY_STATE_CAN_SLEEP: Long = 4
        const val AREA_BODY_ADDED: Long = 0
        const val AREA_BODY_REMOVED: Long = 1
        const val INFO_ACTIVE_OBJECTS: Long = 0
        const val INFO_COLLISION_PAIRS: Long = 1
        const val INFO_ISLAND_COUNT: Long = 2
        const val SPACE_PARAM_CONTACT_RECYCLE_RADIUS: Long = 0
        const val SPACE_PARAM_CONTACT_MAX_SEPARATION: Long = 1
        const val SPACE_PARAM_BODY_MAX_ALLOWED_PENETRATION: Long = 2
        const val SPACE_PARAM_BODY_LINEAR_VELOCITY_SLEEP_THRESHOLD: Long = 3
        const val SPACE_PARAM_BODY_ANGULAR_VELOCITY_SLEEP_THRESHOLD: Long = 4
        const val SPACE_PARAM_BODY_TIME_TO_SLEEP: Long = 5
        const val SPACE_PARAM_BODY_ANGULAR_VELOCITY_DAMP_RATIO: Long = 6
        const val SPACE_PARAM_CONSTRAINT_DEFAULT_BIAS: Long = 7
        const val BODY_AXIS_LINEAR_X: Long = 1
        const val BODY_AXIS_LINEAR_Y: Long = 2
        const val BODY_AXIS_LINEAR_Z: Long = 4
        const val BODY_AXIS_ANGULAR_X: Long = 8
        const val BODY_AXIS_ANGULAR_Y: Long = 16
        const val BODY_AXIS_ANGULAR_Z: Long = 32


        private val rawMemory: COpaquePointer by lazy { getSingleton("PhysicsServer", "PhysicsServer") }


        // Properties


        // Methods
        private val shapeCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "shape_create") }
        fun shapeCreate(type: Long): RID {
            return _icall_RID_Long(shapeCreateMethodBind, this.rawMemory, type)
        }


        private val shapeSetDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "shape_set_data") }
        fun shapeSetData(shape: RID, data: Variant) {
            _icall_Unit_RID_Variant(shapeSetDataMethodBind, this.rawMemory, shape, data)
        }


        private val shapeGetTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "shape_get_type") }
        fun shapeGetType(shape: RID): PhysicsServer.ShapeType {
            return PhysicsServer.ShapeType.fromInt(_icall_Long_RID(shapeGetTypeMethodBind, this.rawMemory, shape))
        }


        private val shapeGetDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "shape_get_data") }
        fun shapeGetData(shape: RID): Variant {
            return _icall_Variant_RID(shapeGetDataMethodBind, this.rawMemory, shape)
        }


        private val spaceCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "space_create") }
        fun spaceCreate(): RID {
            return _icall_RID(spaceCreateMethodBind, this.rawMemory)
        }


        private val spaceSetActiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "space_set_active") }
        fun spaceSetActive(space: RID, active: Boolean) {
            _icall_Unit_RID_Boolean(spaceSetActiveMethodBind, this.rawMemory, space, active)
        }


        private val spaceIsActiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "space_is_active") }
        fun spaceIsActive(space: RID): Boolean {
            return _icall_Boolean_RID(spaceIsActiveMethodBind, this.rawMemory, space)
        }


        private val spaceSetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "space_set_param") }
        fun spaceSetParam(space: RID, param: Long, value: Double) {
            _icall_Unit_RID_Long_Double(spaceSetParamMethodBind, this.rawMemory, space, param, value)
        }


        private val spaceGetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "space_get_param") }
        fun spaceGetParam(space: RID, param: Long): Double {
            return _icall_Double_RID_Long(spaceGetParamMethodBind, this.rawMemory, space, param)
        }


        private val spaceGetDirectStateMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "space_get_direct_state") }
        fun spaceGetDirectState(space: RID): PhysicsDirectSpaceState {
            return _icall_PhysicsDirectSpaceState_RID(spaceGetDirectStateMethodBind, this.rawMemory, space)
        }


        private val areaCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_create") }
        fun areaCreate(): RID {
            return _icall_RID(areaCreateMethodBind, this.rawMemory)
        }


        private val areaSetSpaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_set_space") }
        fun areaSetSpace(area: RID, space: RID) {
            _icall_Unit_RID_RID(areaSetSpaceMethodBind, this.rawMemory, area, space)
        }


        private val areaGetSpaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_get_space") }
        fun areaGetSpace(area: RID): RID {
            return _icall_RID_RID(areaGetSpaceMethodBind, this.rawMemory, area)
        }


        private val areaSetSpaceOverrideModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_set_space_override_mode") }
        fun areaSetSpaceOverrideMode(area: RID, mode: Long) {
            _icall_Unit_RID_Long(areaSetSpaceOverrideModeMethodBind, this.rawMemory, area, mode)
        }


        private val areaGetSpaceOverrideModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_get_space_override_mode") }
        fun areaGetSpaceOverrideMode(area: RID): PhysicsServer.AreaSpaceOverrideMode {
            return PhysicsServer.AreaSpaceOverrideMode.fromInt(_icall_Long_RID(areaGetSpaceOverrideModeMethodBind, this.rawMemory, area))
        }


        private val areaAddShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_add_shape") }
        fun areaAddShape(area: RID, shape: RID, transform: Transform = Transform()) {
            _icall_Unit_RID_RID_Transform(areaAddShapeMethodBind, this.rawMemory, area, shape, transform)
        }


        private val areaSetShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_set_shape") }
        fun areaSetShape(area: RID, shapeIdx: Long, shape: RID) {
            _icall_Unit_RID_Long_RID(areaSetShapeMethodBind, this.rawMemory, area, shapeIdx, shape)
        }


        private val areaSetShapeTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_set_shape_transform") }
        fun areaSetShapeTransform(area: RID, shapeIdx: Long, transform: Transform) {
            _icall_Unit_RID_Long_Transform(areaSetShapeTransformMethodBind, this.rawMemory, area, shapeIdx, transform)
        }


        private val areaGetShapeCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_get_shape_count") }
        fun areaGetShapeCount(area: RID): Long {
            return _icall_Long_RID(areaGetShapeCountMethodBind, this.rawMemory, area)
        }


        private val areaGetShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_get_shape") }
        fun areaGetShape(area: RID, shapeIdx: Long): RID {
            return _icall_RID_RID_Long(areaGetShapeMethodBind, this.rawMemory, area, shapeIdx)
        }


        private val areaGetShapeTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_get_shape_transform") }
        fun areaGetShapeTransform(area: RID, shapeIdx: Long): Transform {
            return _icall_Transform_RID_Long(areaGetShapeTransformMethodBind, this.rawMemory, area, shapeIdx)
        }


        private val areaRemoveShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_remove_shape") }
        fun areaRemoveShape(area: RID, shapeIdx: Long) {
            _icall_Unit_RID_Long(areaRemoveShapeMethodBind, this.rawMemory, area, shapeIdx)
        }


        private val areaClearShapesMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_clear_shapes") }
        fun areaClearShapes(area: RID) {
            _icall_Unit_RID(areaClearShapesMethodBind, this.rawMemory, area)
        }


        private val areaSetCollisionLayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_set_collision_layer") }
        fun areaSetCollisionLayer(area: RID, layer: Long) {
            _icall_Unit_RID_Long(areaSetCollisionLayerMethodBind, this.rawMemory, area, layer)
        }


        private val areaSetCollisionMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_set_collision_mask") }
        fun areaSetCollisionMask(area: RID, mask: Long) {
            _icall_Unit_RID_Long(areaSetCollisionMaskMethodBind, this.rawMemory, area, mask)
        }


        private val areaSetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_set_param") }
        fun areaSetParam(area: RID, param: Long, value: Variant) {
            _icall_Unit_RID_Long_Variant(areaSetParamMethodBind, this.rawMemory, area, param, value)
        }


        private val areaSetTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_set_transform") }
        fun areaSetTransform(area: RID, transform: Transform) {
            _icall_Unit_RID_Transform(areaSetTransformMethodBind, this.rawMemory, area, transform)
        }


        private val areaGetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_get_param") }
        fun areaGetParam(area: RID, param: Long): Variant {
            return _icall_Variant_RID_Long(areaGetParamMethodBind, this.rawMemory, area, param)
        }


        private val areaGetTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_get_transform") }
        fun areaGetTransform(area: RID): Transform {
            return _icall_Transform_RID(areaGetTransformMethodBind, this.rawMemory, area)
        }


        private val areaAttachObjectInstanceIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_attach_object_instance_id") }
        fun areaAttachObjectInstanceId(area: RID, id: Long) {
            _icall_Unit_RID_Long(areaAttachObjectInstanceIdMethodBind, this.rawMemory, area, id)
        }


        private val areaGetObjectInstanceIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_get_object_instance_id") }
        fun areaGetObjectInstanceId(area: RID): Long {
            return _icall_Long_RID(areaGetObjectInstanceIdMethodBind, this.rawMemory, area)
        }


        private val areaSetMonitorCallbackMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_set_monitor_callback") }
        fun areaSetMonitorCallback(area: RID, receiver: Object, method: String) {
            _icall_Unit_RID_Object_String(areaSetMonitorCallbackMethodBind, this.rawMemory, area, receiver, method)
        }


        private val areaSetAreaMonitorCallbackMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_set_area_monitor_callback") }
        fun areaSetAreaMonitorCallback(area: RID, receiver: Object, method: String) {
            _icall_Unit_RID_Object_String(areaSetAreaMonitorCallbackMethodBind, this.rawMemory, area, receiver, method)
        }


        private val areaSetMonitorableMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_set_monitorable") }
        fun areaSetMonitorable(area: RID, monitorable: Boolean) {
            _icall_Unit_RID_Boolean(areaSetMonitorableMethodBind, this.rawMemory, area, monitorable)
        }


        private val areaSetRayPickableMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_set_ray_pickable") }
        fun areaSetRayPickable(area: RID, enable: Boolean) {
            _icall_Unit_RID_Boolean(areaSetRayPickableMethodBind, this.rawMemory, area, enable)
        }


        private val areaIsRayPickableMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_is_ray_pickable") }
        fun areaIsRayPickable(area: RID): Boolean {
            return _icall_Boolean_RID(areaIsRayPickableMethodBind, this.rawMemory, area)
        }


        private val bodyCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_create") }
        fun bodyCreate(mode: Long = 2, initSleeping: Boolean = false): RID {
            return _icall_RID_Long_Boolean(bodyCreateMethodBind, this.rawMemory, mode, initSleeping)
        }


        private val bodySetSpaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_set_space") }
        fun bodySetSpace(body: RID, space: RID) {
            _icall_Unit_RID_RID(bodySetSpaceMethodBind, this.rawMemory, body, space)
        }


        private val bodyGetSpaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_get_space") }
        fun bodyGetSpace(body: RID): RID {
            return _icall_RID_RID(bodyGetSpaceMethodBind, this.rawMemory, body)
        }


        private val bodySetModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_set_mode") }
        fun bodySetMode(body: RID, mode: Long) {
            _icall_Unit_RID_Long(bodySetModeMethodBind, this.rawMemory, body, mode)
        }


        private val bodyGetModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_get_mode") }
        fun bodyGetMode(body: RID): PhysicsServer.BodyMode {
            return PhysicsServer.BodyMode.fromInt(_icall_Long_RID(bodyGetModeMethodBind, this.rawMemory, body))
        }


        private val bodySetCollisionLayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_set_collision_layer") }
        fun bodySetCollisionLayer(body: RID, layer: Long) {
            _icall_Unit_RID_Long(bodySetCollisionLayerMethodBind, this.rawMemory, body, layer)
        }


        private val bodyGetCollisionLayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_get_collision_layer") }
        fun bodyGetCollisionLayer(body: RID): Long {
            return _icall_Long_RID(bodyGetCollisionLayerMethodBind, this.rawMemory, body)
        }


        private val bodySetCollisionMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_set_collision_mask") }
        fun bodySetCollisionMask(body: RID, mask: Long) {
            _icall_Unit_RID_Long(bodySetCollisionMaskMethodBind, this.rawMemory, body, mask)
        }


        private val bodyGetCollisionMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_get_collision_mask") }
        fun bodyGetCollisionMask(body: RID): Long {
            return _icall_Long_RID(bodyGetCollisionMaskMethodBind, this.rawMemory, body)
        }


        private val bodyAddShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_add_shape") }
        fun bodyAddShape(body: RID, shape: RID, transform: Transform = Transform()) {
            _icall_Unit_RID_RID_Transform(bodyAddShapeMethodBind, this.rawMemory, body, shape, transform)
        }


        private val bodySetShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_set_shape") }
        fun bodySetShape(body: RID, shapeIdx: Long, shape: RID) {
            _icall_Unit_RID_Long_RID(bodySetShapeMethodBind, this.rawMemory, body, shapeIdx, shape)
        }


        private val bodySetShapeTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_set_shape_transform") }
        fun bodySetShapeTransform(body: RID, shapeIdx: Long, transform: Transform) {
            _icall_Unit_RID_Long_Transform(bodySetShapeTransformMethodBind, this.rawMemory, body, shapeIdx, transform)
        }


        private val bodyGetShapeCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_get_shape_count") }
        fun bodyGetShapeCount(body: RID): Long {
            return _icall_Long_RID(bodyGetShapeCountMethodBind, this.rawMemory, body)
        }


        private val bodyGetShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_get_shape") }
        fun bodyGetShape(body: RID, shapeIdx: Long): RID {
            return _icall_RID_RID_Long(bodyGetShapeMethodBind, this.rawMemory, body, shapeIdx)
        }


        private val bodyGetShapeTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_get_shape_transform") }
        fun bodyGetShapeTransform(body: RID, shapeIdx: Long): Transform {
            return _icall_Transform_RID_Long(bodyGetShapeTransformMethodBind, this.rawMemory, body, shapeIdx)
        }


        private val bodyRemoveShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_remove_shape") }
        fun bodyRemoveShape(body: RID, shapeIdx: Long) {
            _icall_Unit_RID_Long(bodyRemoveShapeMethodBind, this.rawMemory, body, shapeIdx)
        }


        private val bodyClearShapesMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_clear_shapes") }
        fun bodyClearShapes(body: RID) {
            _icall_Unit_RID(bodyClearShapesMethodBind, this.rawMemory, body)
        }


        private val bodyAttachObjectInstanceIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_attach_object_instance_id") }
        fun bodyAttachObjectInstanceId(body: RID, id: Long) {
            _icall_Unit_RID_Long(bodyAttachObjectInstanceIdMethodBind, this.rawMemory, body, id)
        }


        private val bodyGetObjectInstanceIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_get_object_instance_id") }
        fun bodyGetObjectInstanceId(body: RID): Long {
            return _icall_Long_RID(bodyGetObjectInstanceIdMethodBind, this.rawMemory, body)
        }


        private val bodySetEnableContinuousCollisionDetectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_set_enable_continuous_collision_detection") }
        fun bodySetEnableContinuousCollisionDetection(body: RID, enable: Boolean) {
            _icall_Unit_RID_Boolean(bodySetEnableContinuousCollisionDetectionMethodBind, this.rawMemory, body, enable)
        }


        private val bodyIsContinuousCollisionDetectionEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_is_continuous_collision_detection_enabled") }
        fun bodyIsContinuousCollisionDetectionEnabled(body: RID): Boolean {
            return _icall_Boolean_RID(bodyIsContinuousCollisionDetectionEnabledMethodBind, this.rawMemory, body)
        }


        private val bodySetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_set_param") }
        fun bodySetParam(body: RID, param: Long, value: Double) {
            _icall_Unit_RID_Long_Double(bodySetParamMethodBind, this.rawMemory, body, param, value)
        }


        private val bodyGetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_get_param") }
        fun bodyGetParam(body: RID, param: Long): Double {
            return _icall_Double_RID_Long(bodyGetParamMethodBind, this.rawMemory, body, param)
        }


        private val bodySetKinematicSafeMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_set_kinematic_safe_margin") }
        fun bodySetKinematicSafeMargin(body: RID, margin: Double) {
            _icall_Unit_RID_Double(bodySetKinematicSafeMarginMethodBind, this.rawMemory, body, margin)
        }


        private val bodyGetKinematicSafeMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_get_kinematic_safe_margin") }
        fun bodyGetKinematicSafeMargin(body: RID): Double {
            return _icall_Double_RID(bodyGetKinematicSafeMarginMethodBind, this.rawMemory, body)
        }


        private val bodySetStateMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_set_state") }
        fun bodySetState(body: RID, state: Long, value: Variant) {
            _icall_Unit_RID_Long_Variant(bodySetStateMethodBind, this.rawMemory, body, state, value)
        }


        private val bodyGetStateMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_get_state") }
        fun bodyGetState(body: RID, state: Long): Variant {
            return _icall_Variant_RID_Long(bodyGetStateMethodBind, this.rawMemory, body, state)
        }


        private val bodyApplyImpulseMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_apply_impulse") }
        fun bodyApplyImpulse(body: RID, position: Vector3, impulse: Vector3) {
            _icall_Unit_RID_Vector3_Vector3(bodyApplyImpulseMethodBind, this.rawMemory, body, position, impulse)
        }


        private val bodyApplyTorqueImpulseMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_apply_torque_impulse") }
        fun bodyApplyTorqueImpulse(body: RID, impulse: Vector3) {
            _icall_Unit_RID_Vector3(bodyApplyTorqueImpulseMethodBind, this.rawMemory, body, impulse)
        }


        private val bodySetAxisVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_set_axis_velocity") }
        fun bodySetAxisVelocity(body: RID, axisVelocity: Vector3) {
            _icall_Unit_RID_Vector3(bodySetAxisVelocityMethodBind, this.rawMemory, body, axisVelocity)
        }


        private val bodySetAxisLockMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_set_axis_lock") }
        fun bodySetAxisLock(body: RID, axis: Long, lock: Boolean) {
            _icall_Unit_RID_Long_Boolean(bodySetAxisLockMethodBind, this.rawMemory, body, axis, lock)
        }


        private val bodyIsAxisLockedMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_is_axis_locked") }
        fun bodyIsAxisLocked(body: RID, axis: Long): Boolean {
            return _icall_Boolean_RID_Long(bodyIsAxisLockedMethodBind, this.rawMemory, body, axis)
        }


        private val bodyAddCollisionExceptionMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_add_collision_exception") }
        fun bodyAddCollisionException(body: RID, exceptedBody: RID) {
            _icall_Unit_RID_RID(bodyAddCollisionExceptionMethodBind, this.rawMemory, body, exceptedBody)
        }


        private val bodyRemoveCollisionExceptionMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_remove_collision_exception") }
        fun bodyRemoveCollisionException(body: RID, exceptedBody: RID) {
            _icall_Unit_RID_RID(bodyRemoveCollisionExceptionMethodBind, this.rawMemory, body, exceptedBody)
        }


        private val bodySetMaxContactsReportedMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_set_max_contacts_reported") }
        fun bodySetMaxContactsReported(body: RID, amount: Long) {
            _icall_Unit_RID_Long(bodySetMaxContactsReportedMethodBind, this.rawMemory, body, amount)
        }


        private val bodyGetMaxContactsReportedMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_get_max_contacts_reported") }
        fun bodyGetMaxContactsReported(body: RID): Long {
            return _icall_Long_RID(bodyGetMaxContactsReportedMethodBind, this.rawMemory, body)
        }


        private val bodySetOmitForceIntegrationMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_set_omit_force_integration") }
        fun bodySetOmitForceIntegration(body: RID, enable: Boolean) {
            _icall_Unit_RID_Boolean(bodySetOmitForceIntegrationMethodBind, this.rawMemory, body, enable)
        }


        private val bodyIsOmittingForceIntegrationMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_is_omitting_force_integration") }
        fun bodyIsOmittingForceIntegration(body: RID): Boolean {
            return _icall_Boolean_RID(bodyIsOmittingForceIntegrationMethodBind, this.rawMemory, body)
        }


        private val bodySetForceIntegrationCallbackMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_set_force_integration_callback") }
        fun bodySetForceIntegrationCallback(body: RID, receiver: Object, method: String, userdata: Variant? = null) {
            _icall_Unit_RID_Object_String_nVariant(bodySetForceIntegrationCallbackMethodBind, this.rawMemory, body, receiver, method, userdata)
        }


        private val bodySetRayPickableMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_set_ray_pickable") }
        fun bodySetRayPickable(body: RID, enable: Boolean) {
            _icall_Unit_RID_Boolean(bodySetRayPickableMethodBind, this.rawMemory, body, enable)
        }


        private val bodyIsRayPickableMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_is_ray_pickable") }
        fun bodyIsRayPickable(body: RID): Boolean {
            return _icall_Boolean_RID(bodyIsRayPickableMethodBind, this.rawMemory, body)
        }


        private val bodyGetDirectStateMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_get_direct_state") }
        fun bodyGetDirectState(body: RID): PhysicsDirectBodyState {
            return _icall_PhysicsDirectBodyState_RID(bodyGetDirectStateMethodBind, this.rawMemory, body)
        }


        private val jointCreatePinMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "joint_create_pin") }
        fun jointCreatePin(bodyA: RID, localA: Vector3, bodyB: RID, localB: Vector3): RID {
            return _icall_RID_RID_Vector3_RID_Vector3(jointCreatePinMethodBind, this.rawMemory, bodyA, localA, bodyB, localB)
        }


        private val pinJointSetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "pin_joint_set_param") }
        fun pinJointSetParam(joint: RID, param: Long, value: Double) {
            _icall_Unit_RID_Long_Double(pinJointSetParamMethodBind, this.rawMemory, joint, param, value)
        }


        private val pinJointGetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "pin_joint_get_param") }
        fun pinJointGetParam(joint: RID, param: Long): Double {
            return _icall_Double_RID_Long(pinJointGetParamMethodBind, this.rawMemory, joint, param)
        }


        private val pinJointSetLocalAMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "pin_joint_set_local_a") }
        fun pinJointSetLocalA(joint: RID, localA: Vector3) {
            _icall_Unit_RID_Vector3(pinJointSetLocalAMethodBind, this.rawMemory, joint, localA)
        }


        private val pinJointGetLocalAMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "pin_joint_get_local_a") }
        fun pinJointGetLocalA(joint: RID): Vector3 {
            return _icall_Vector3_RID(pinJointGetLocalAMethodBind, this.rawMemory, joint)
        }


        private val pinJointSetLocalBMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "pin_joint_set_local_b") }
        fun pinJointSetLocalB(joint: RID, localB: Vector3) {
            _icall_Unit_RID_Vector3(pinJointSetLocalBMethodBind, this.rawMemory, joint, localB)
        }


        private val pinJointGetLocalBMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "pin_joint_get_local_b") }
        fun pinJointGetLocalB(joint: RID): Vector3 {
            return _icall_Vector3_RID(pinJointGetLocalBMethodBind, this.rawMemory, joint)
        }


        private val jointCreateHingeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "joint_create_hinge") }
        fun jointCreateHinge(bodyA: RID, hingeA: Transform, bodyB: RID, hingeB: Transform): RID {
            return _icall_RID_RID_Transform_RID_Transform(jointCreateHingeMethodBind, this.rawMemory, bodyA, hingeA, bodyB, hingeB)
        }


        private val hingeJointSetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "hinge_joint_set_param") }
        fun hingeJointSetParam(joint: RID, param: Long, value: Double) {
            _icall_Unit_RID_Long_Double(hingeJointSetParamMethodBind, this.rawMemory, joint, param, value)
        }


        private val hingeJointGetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "hinge_joint_get_param") }
        fun hingeJointGetParam(joint: RID, param: Long): Double {
            return _icall_Double_RID_Long(hingeJointGetParamMethodBind, this.rawMemory, joint, param)
        }


        private val hingeJointSetFlagMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "hinge_joint_set_flag") }
        fun hingeJointSetFlag(joint: RID, flag: Long, enabled: Boolean) {
            _icall_Unit_RID_Long_Boolean(hingeJointSetFlagMethodBind, this.rawMemory, joint, flag, enabled)
        }


        private val hingeJointGetFlagMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "hinge_joint_get_flag") }
        fun hingeJointGetFlag(joint: RID, flag: Long): Boolean {
            return _icall_Boolean_RID_Long(hingeJointGetFlagMethodBind, this.rawMemory, joint, flag)
        }


        private val jointCreateSliderMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "joint_create_slider") }
        fun jointCreateSlider(bodyA: RID, localRefA: Transform, bodyB: RID, localRefB: Transform): RID {
            return _icall_RID_RID_Transform_RID_Transform(jointCreateSliderMethodBind, this.rawMemory, bodyA, localRefA, bodyB, localRefB)
        }


        private val sliderJointSetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "slider_joint_set_param") }
        fun sliderJointSetParam(joint: RID, param: Long, value: Double) {
            _icall_Unit_RID_Long_Double(sliderJointSetParamMethodBind, this.rawMemory, joint, param, value)
        }


        private val sliderJointGetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "slider_joint_get_param") }
        fun sliderJointGetParam(joint: RID, param: Long): Double {
            return _icall_Double_RID_Long(sliderJointGetParamMethodBind, this.rawMemory, joint, param)
        }


        private val jointCreateConeTwistMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "joint_create_cone_twist") }
        fun jointCreateConeTwist(bodyA: RID, localRefA: Transform, bodyB: RID, localRefB: Transform): RID {
            return _icall_RID_RID_Transform_RID_Transform(jointCreateConeTwistMethodBind, this.rawMemory, bodyA, localRefA, bodyB, localRefB)
        }


        private val coneTwistJointSetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "cone_twist_joint_set_param") }
        fun coneTwistJointSetParam(joint: RID, param: Long, value: Double) {
            _icall_Unit_RID_Long_Double(coneTwistJointSetParamMethodBind, this.rawMemory, joint, param, value)
        }


        private val coneTwistJointGetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "cone_twist_joint_get_param") }
        fun coneTwistJointGetParam(joint: RID, param: Long): Double {
            return _icall_Double_RID_Long(coneTwistJointGetParamMethodBind, this.rawMemory, joint, param)
        }


        private val jointGetTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "joint_get_type") }
        fun jointGetType(joint: RID): PhysicsServer.JointType {
            return PhysicsServer.JointType.fromInt(_icall_Long_RID(jointGetTypeMethodBind, this.rawMemory, joint))
        }


        private val jointSetSolverPriorityMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "joint_set_solver_priority") }
        fun jointSetSolverPriority(joint: RID, priority: Long) {
            _icall_Unit_RID_Long(jointSetSolverPriorityMethodBind, this.rawMemory, joint, priority)
        }


        private val jointGetSolverPriorityMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "joint_get_solver_priority") }
        fun jointGetSolverPriority(joint: RID): Long {
            return _icall_Long_RID(jointGetSolverPriorityMethodBind, this.rawMemory, joint)
        }


        private val jointCreateGeneric6dofMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "joint_create_generic_6dof") }
        fun jointCreateGeneric6dof(bodyA: RID, localRefA: Transform, bodyB: RID, localRefB: Transform): RID {
            return _icall_RID_RID_Transform_RID_Transform(jointCreateGeneric6dofMethodBind, this.rawMemory, bodyA, localRefA, bodyB, localRefB)
        }


        private val generic6dofJointSetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "generic_6dof_joint_set_param") }
        fun generic6dofJointSetParam(joint: RID, axis: Long, param: Long, value: Double) {
            _icall_Unit_RID_Long_Long_Double(generic6dofJointSetParamMethodBind, this.rawMemory, joint, axis, param, value)
        }


        private val generic6dofJointGetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "generic_6dof_joint_get_param") }
        fun generic6dofJointGetParam(joint: RID, axis: Long, param: Long): Double {
            return _icall_Double_RID_Long_Long(generic6dofJointGetParamMethodBind, this.rawMemory, joint, axis, param)
        }


        private val generic6dofJointSetFlagMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "generic_6dof_joint_set_flag") }
        fun generic6dofJointSetFlag(joint: RID, axis: Long, flag: Long, enable: Boolean) {
            _icall_Unit_RID_Long_Long_Boolean(generic6dofJointSetFlagMethodBind, this.rawMemory, joint, axis, flag, enable)
        }


        private val generic6dofJointGetFlagMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "generic_6dof_joint_get_flag") }
        fun generic6dofJointGetFlag(joint: RID, axis: Long, flag: Long): Boolean {
            return _icall_Boolean_RID_Long_Long(generic6dofJointGetFlagMethodBind, this.rawMemory, joint, axis, flag)
        }


        private val freeRidMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "free_rid") }
        fun freeRid(rid: RID) {
            _icall_Unit_RID(freeRidMethodBind, this.rawMemory, rid)
        }


        private val setActiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "set_active") }
        fun setActive(active: Boolean) {
            _icall_Unit_Boolean(setActiveMethodBind, this.rawMemory, active)
        }


        private val getProcessInfoMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "get_process_info") }
        fun getProcessInfo(processInfo: Long): Long {
            return _icall_Long_Long(getProcessInfoMethodBind, this.rawMemory, processInfo)
        }


    }
}
