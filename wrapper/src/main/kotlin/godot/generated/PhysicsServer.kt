@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PhysicsServer : Object {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class BodyAxis(val id: Int) {
        BODY_AXIS_LINEAR_X(1),
        BODY_AXIS_LINEAR_Y(2),
        BODY_AXIS_LINEAR_Z(4),
        BODY_AXIS_ANGULAR_X(8),
        BODY_AXIS_ANGULAR_Y(16),
        BODY_AXIS_ANGULAR_Z(32),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class ProcessInfo(val id: Int) {
        INFO_ACTIVE_OBJECTS(0),
        INFO_COLLISION_PAIRS(1),
        INFO_ISLAND_COUNT(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class AreaBodyStatus(val id: Int) {
        AREA_BODY_ADDED(0),
        AREA_BODY_REMOVED(1),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class BodyMode(val id: Int) {
        BODY_MODE_STATIC(0),
        BODY_MODE_KINEMATIC(1),
        BODY_MODE_RIGID(2),
        BODY_MODE_SOFT(3),
        BODY_MODE_CHARACTER(4),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class ShapeType(val id: Int) {
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
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class PinJointParam(val id: Int) {
        PIN_JOINT_BIAS(0),
        PIN_JOINT_DAMPING(1),
        PIN_JOINT_IMPULSE_CLAMP(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class SpaceParameter(val id: Int) {
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
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class ConeTwistJointParam(val id: Int) {
        CONE_TWIST_JOINT_SWING_SPAN(0),
        CONE_TWIST_JOINT_TWIST_SPAN(1),
        CONE_TWIST_JOINT_BIAS(2),
        CONE_TWIST_JOINT_SOFTNESS(3),
        CONE_TWIST_JOINT_RELAXATION(4),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class JointType(val id: Int) {
        JOINT_PIN(0),
        JOINT_HINGE(1),
        JOINT_SLIDER(2),
        JOINT_CONE_TWIST(3),
        JOINT_6DOF(4),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class BodyState(val id: Int) {
        BODY_STATE_TRANSFORM(0),
        BODY_STATE_LINEAR_VELOCITY(1),
        BODY_STATE_ANGULAR_VELOCITY(2),
        BODY_STATE_SLEEPING(3),
        BODY_STATE_CAN_SLEEP(4),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class BodyParameter(val id: Int) {
        BODY_PARAM_BOUNCE(0),
        BODY_PARAM_FRICTION(1),
        BODY_PARAM_MASS(2),
        BODY_PARAM_GRAVITY_SCALE(3),
        BODY_PARAM_LINEAR_DAMP(4),
        BODY_PARAM_ANGULAR_DAMP(5),
        BODY_PARAM_MAX(6),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class G6DOFJointAxisParam(val id: Int) {
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
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class SliderJointParam(val id: Int) {
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
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class HingeJointParam(val id: Int) {
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
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class G6DOFJointAxisFlag(val id: Int) {
        G6DOF_JOINT_FLAG_ENABLE_LINEAR_LIMIT(0),
        G6DOF_JOINT_FLAG_ENABLE_ANGULAR_LIMIT(1),
        G6DOF_JOINT_FLAG_ENABLE_MOTOR(2),
        G6DOF_JOINT_FLAG_ENABLE_LINEAR_MOTOR(3),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class HingeJointFlag(val id: Int) {
        HINGE_JOINT_FLAG_USE_LIMIT(0),
        HINGE_JOINT_FLAG_ENABLE_MOTOR(1),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class AreaSpaceOverrideMode(val id: Int) {
        AREA_SPACE_OVERRIDE_DISABLED(0),
        AREA_SPACE_OVERRIDE_COMBINE(1),
        AREA_SPACE_OVERRIDE_COMBINE_REPLACE(2),
        AREA_SPACE_OVERRIDE_REPLACE(3),
        AREA_SPACE_OVERRIDE_REPLACE_COMBINE(4),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class AreaParameter(val id: Int) {
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
            fun fromInt(value: Int) = values().single { it.id == value }
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
        const val JOINT_PIN: Int = 0
        const val JOINT_HINGE: Int = 1
        const val JOINT_SLIDER: Int = 2
        const val JOINT_CONE_TWIST: Int = 3
        const val JOINT_6DOF: Int = 4
        const val PIN_JOINT_BIAS: Int = 0
        const val PIN_JOINT_DAMPING: Int = 1
        const val PIN_JOINT_IMPULSE_CLAMP: Int = 2
        const val HINGE_JOINT_BIAS: Int = 0
        const val HINGE_JOINT_LIMIT_UPPER: Int = 1
        const val HINGE_JOINT_LIMIT_LOWER: Int = 2
        const val HINGE_JOINT_LIMIT_BIAS: Int = 3
        const val HINGE_JOINT_LIMIT_SOFTNESS: Int = 4
        const val HINGE_JOINT_LIMIT_RELAXATION: Int = 5
        const val HINGE_JOINT_MOTOR_TARGET_VELOCITY: Int = 6
        const val HINGE_JOINT_MOTOR_MAX_IMPULSE: Int = 7
        const val HINGE_JOINT_FLAG_USE_LIMIT: Int = 0
        const val HINGE_JOINT_FLAG_ENABLE_MOTOR: Int = 1
        const val SLIDER_JOINT_LINEAR_LIMIT_UPPER: Int = 0
        const val SLIDER_JOINT_LINEAR_LIMIT_LOWER: Int = 1
        const val SLIDER_JOINT_LINEAR_LIMIT_SOFTNESS: Int = 2
        const val SLIDER_JOINT_LINEAR_LIMIT_RESTITUTION: Int = 3
        const val SLIDER_JOINT_LINEAR_LIMIT_DAMPING: Int = 4
        const val SLIDER_JOINT_LINEAR_MOTION_SOFTNESS: Int = 5
        const val SLIDER_JOINT_LINEAR_MOTION_RESTITUTION: Int = 6
        const val SLIDER_JOINT_LINEAR_MOTION_DAMPING: Int = 7
        const val SLIDER_JOINT_LINEAR_ORTHOGONAL_SOFTNESS: Int = 8
        const val SLIDER_JOINT_LINEAR_ORTHOGONAL_RESTITUTION: Int = 9
        const val SLIDER_JOINT_LINEAR_ORTHOGONAL_DAMPING: Int = 10
        const val SLIDER_JOINT_ANGULAR_LIMIT_UPPER: Int = 11
        const val SLIDER_JOINT_ANGULAR_LIMIT_LOWER: Int = 12
        const val SLIDER_JOINT_ANGULAR_LIMIT_SOFTNESS: Int = 13
        const val SLIDER_JOINT_ANGULAR_LIMIT_RESTITUTION: Int = 14
        const val SLIDER_JOINT_ANGULAR_LIMIT_DAMPING: Int = 15
        const val SLIDER_JOINT_ANGULAR_MOTION_SOFTNESS: Int = 16
        const val SLIDER_JOINT_ANGULAR_MOTION_RESTITUTION: Int = 17
        const val SLIDER_JOINT_ANGULAR_MOTION_DAMPING: Int = 18
        const val SLIDER_JOINT_ANGULAR_ORTHOGONAL_SOFTNESS: Int = 19
        const val SLIDER_JOINT_ANGULAR_ORTHOGONAL_RESTITUTION: Int = 20
        const val SLIDER_JOINT_ANGULAR_ORTHOGONAL_DAMPING: Int = 21
        const val SLIDER_JOINT_MAX: Int = 22
        const val CONE_TWIST_JOINT_SWING_SPAN: Int = 0
        const val CONE_TWIST_JOINT_TWIST_SPAN: Int = 1
        const val CONE_TWIST_JOINT_BIAS: Int = 2
        const val CONE_TWIST_JOINT_SOFTNESS: Int = 3
        const val CONE_TWIST_JOINT_RELAXATION: Int = 4
        const val G6DOF_JOINT_LINEAR_LOWER_LIMIT: Int = 0
        const val G6DOF_JOINT_LINEAR_UPPER_LIMIT: Int = 1
        const val G6DOF_JOINT_LINEAR_LIMIT_SOFTNESS: Int = 2
        const val G6DOF_JOINT_LINEAR_RESTITUTION: Int = 3
        const val G6DOF_JOINT_LINEAR_DAMPING: Int = 4
        const val G6DOF_JOINT_LINEAR_MOTOR_TARGET_VELOCITY: Int = 5
        const val G6DOF_JOINT_LINEAR_MOTOR_FORCE_LIMIT: Int = 6
        const val G6DOF_JOINT_ANGULAR_LOWER_LIMIT: Int = 7
        const val G6DOF_JOINT_ANGULAR_UPPER_LIMIT: Int = 8
        const val G6DOF_JOINT_ANGULAR_LIMIT_SOFTNESS: Int = 9
        const val G6DOF_JOINT_ANGULAR_DAMPING: Int = 10
        const val G6DOF_JOINT_ANGULAR_RESTITUTION: Int = 11
        const val G6DOF_JOINT_ANGULAR_FORCE_LIMIT: Int = 12
        const val G6DOF_JOINT_ANGULAR_ERP: Int = 13
        const val G6DOF_JOINT_ANGULAR_MOTOR_TARGET_VELOCITY: Int = 14
        const val G6DOF_JOINT_ANGULAR_MOTOR_FORCE_LIMIT: Int = 15
        const val G6DOF_JOINT_FLAG_ENABLE_LINEAR_LIMIT: Int = 0
        const val G6DOF_JOINT_FLAG_ENABLE_ANGULAR_LIMIT: Int = 1
        const val G6DOF_JOINT_FLAG_ENABLE_MOTOR: Int = 2
        const val G6DOF_JOINT_FLAG_ENABLE_LINEAR_MOTOR: Int = 3
        const val SHAPE_PLANE: Int = 0
        const val SHAPE_RAY: Int = 1
        const val SHAPE_SPHERE: Int = 2
        const val SHAPE_BOX: Int = 3
        const val SHAPE_CAPSULE: Int = 4
        const val SHAPE_CYLINDER: Int = 5
        const val SHAPE_CONVEX_POLYGON: Int = 6
        const val SHAPE_CONCAVE_POLYGON: Int = 7
        const val SHAPE_HEIGHTMAP: Int = 8
        const val SHAPE_CUSTOM: Int = 9
        const val AREA_PARAM_GRAVITY: Int = 0
        const val AREA_PARAM_GRAVITY_VECTOR: Int = 1
        const val AREA_PARAM_GRAVITY_IS_POINT: Int = 2
        const val AREA_PARAM_GRAVITY_DISTANCE_SCALE: Int = 3
        const val AREA_PARAM_GRAVITY_POINT_ATTENUATION: Int = 4
        const val AREA_PARAM_LINEAR_DAMP: Int = 5
        const val AREA_PARAM_ANGULAR_DAMP: Int = 6
        const val AREA_PARAM_PRIORITY: Int = 7
        const val AREA_SPACE_OVERRIDE_DISABLED: Int = 0
        const val AREA_SPACE_OVERRIDE_COMBINE: Int = 1
        const val AREA_SPACE_OVERRIDE_COMBINE_REPLACE: Int = 2
        const val AREA_SPACE_OVERRIDE_REPLACE: Int = 3
        const val AREA_SPACE_OVERRIDE_REPLACE_COMBINE: Int = 4
        const val BODY_MODE_STATIC: Int = 0
        const val BODY_MODE_KINEMATIC: Int = 1
        const val BODY_MODE_RIGID: Int = 2
        const val BODY_MODE_SOFT: Int = 3
        const val BODY_MODE_CHARACTER: Int = 4
        const val BODY_PARAM_BOUNCE: Int = 0
        const val BODY_PARAM_FRICTION: Int = 1
        const val BODY_PARAM_MASS: Int = 2
        const val BODY_PARAM_GRAVITY_SCALE: Int = 3
        const val BODY_PARAM_LINEAR_DAMP: Int = 4
        const val BODY_PARAM_ANGULAR_DAMP: Int = 5
        const val BODY_PARAM_MAX: Int = 6
        const val BODY_STATE_TRANSFORM: Int = 0
        const val BODY_STATE_LINEAR_VELOCITY: Int = 1
        const val BODY_STATE_ANGULAR_VELOCITY: Int = 2
        const val BODY_STATE_SLEEPING: Int = 3
        const val BODY_STATE_CAN_SLEEP: Int = 4
        const val AREA_BODY_ADDED: Int = 0
        const val AREA_BODY_REMOVED: Int = 1
        const val INFO_ACTIVE_OBJECTS: Int = 0
        const val INFO_COLLISION_PAIRS: Int = 1
        const val INFO_ISLAND_COUNT: Int = 2
        const val SPACE_PARAM_CONTACT_RECYCLE_RADIUS: Int = 0
        const val SPACE_PARAM_CONTACT_MAX_SEPARATION: Int = 1
        const val SPACE_PARAM_BODY_MAX_ALLOWED_PENETRATION: Int = 2
        const val SPACE_PARAM_BODY_LINEAR_VELOCITY_SLEEP_THRESHOLD: Int = 3
        const val SPACE_PARAM_BODY_ANGULAR_VELOCITY_SLEEP_THRESHOLD: Int = 4
        const val SPACE_PARAM_BODY_TIME_TO_SLEEP: Int = 5
        const val SPACE_PARAM_BODY_ANGULAR_VELOCITY_DAMP_RATIO: Int = 6
        const val SPACE_PARAM_CONSTRAINT_DEFAULT_BIAS: Int = 7
        const val BODY_AXIS_LINEAR_X: Int = 1
        const val BODY_AXIS_LINEAR_Y: Int = 2
        const val BODY_AXIS_LINEAR_Z: Int = 4
        const val BODY_AXIS_ANGULAR_X: Int = 8
        const val BODY_AXIS_ANGULAR_Y: Int = 16
        const val BODY_AXIS_ANGULAR_Z: Int = 32


        private val rawMemory: COpaquePointer by lazy { getSingleton("PhysicsServer", "PhysicsServer") }


        // Properties


        // Methods
        private val shapeCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "shape_create") }
        fun shapeCreate(type: Int): RID {
            return _icall_RID_Int(shapeCreateMethodBind, this.rawMemory, type)
        }


        private val shapeSetDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "shape_set_data") }
        fun shapeSetData(shape: RID, data: Variant) {
            _icall_Unit_RID_Variant(shapeSetDataMethodBind, this.rawMemory, shape, data)
        }


        private val shapeGetTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "shape_get_type") }
        fun shapeGetType(shape: RID): PhysicsServer.ShapeType {
            return PhysicsServer.ShapeType.fromInt(_icall_Int_RID(shapeGetTypeMethodBind, this.rawMemory, shape))
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
        fun spaceSetParam(space: RID, param: Int, value: Float) {
            _icall_Unit_RID_Int_Float(spaceSetParamMethodBind, this.rawMemory, space, param, value)
        }


        private val spaceGetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "space_get_param") }
        fun spaceGetParam(space: RID, param: Int): Float {
            return _icall_Float_RID_Int(spaceGetParamMethodBind, this.rawMemory, space, param)
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
        fun areaSetSpaceOverrideMode(area: RID, mode: Int) {
            _icall_Unit_RID_Int(areaSetSpaceOverrideModeMethodBind, this.rawMemory, area, mode)
        }


        private val areaGetSpaceOverrideModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_get_space_override_mode") }
        fun areaGetSpaceOverrideMode(area: RID): PhysicsServer.AreaSpaceOverrideMode {
            return PhysicsServer.AreaSpaceOverrideMode.fromInt(_icall_Int_RID(areaGetSpaceOverrideModeMethodBind, this.rawMemory, area))
        }


        private val areaAddShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_add_shape") }
        fun areaAddShape(area: RID, shape: RID, transform: Transform = Transform()) {
            _icall_Unit_RID_RID_Transform(areaAddShapeMethodBind, this.rawMemory, area, shape, transform)
        }


        private val areaSetShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_set_shape") }
        fun areaSetShape(area: RID, shapeIdx: Int, shape: RID) {
            _icall_Unit_RID_Int_RID(areaSetShapeMethodBind, this.rawMemory, area, shapeIdx, shape)
        }


        private val areaSetShapeTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_set_shape_transform") }
        fun areaSetShapeTransform(area: RID, shapeIdx: Int, transform: Transform) {
            _icall_Unit_RID_Int_Transform(areaSetShapeTransformMethodBind, this.rawMemory, area, shapeIdx, transform)
        }


        private val areaGetShapeCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_get_shape_count") }
        fun areaGetShapeCount(area: RID): Int {
            return _icall_Int_RID(areaGetShapeCountMethodBind, this.rawMemory, area)
        }


        private val areaGetShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_get_shape") }
        fun areaGetShape(area: RID, shapeIdx: Int): RID {
            return _icall_RID_RID_Int(areaGetShapeMethodBind, this.rawMemory, area, shapeIdx)
        }


        private val areaGetShapeTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_get_shape_transform") }
        fun areaGetShapeTransform(area: RID, shapeIdx: Int): Transform {
            return _icall_Transform_RID_Int(areaGetShapeTransformMethodBind, this.rawMemory, area, shapeIdx)
        }


        private val areaRemoveShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_remove_shape") }
        fun areaRemoveShape(area: RID, shapeIdx: Int) {
            _icall_Unit_RID_Int(areaRemoveShapeMethodBind, this.rawMemory, area, shapeIdx)
        }


        private val areaClearShapesMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_clear_shapes") }
        fun areaClearShapes(area: RID) {
            _icall_Unit_RID(areaClearShapesMethodBind, this.rawMemory, area)
        }


        private val areaSetCollisionLayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_set_collision_layer") }
        fun areaSetCollisionLayer(area: RID, layer: Int) {
            _icall_Unit_RID_Int(areaSetCollisionLayerMethodBind, this.rawMemory, area, layer)
        }


        private val areaSetCollisionMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_set_collision_mask") }
        fun areaSetCollisionMask(area: RID, mask: Int) {
            _icall_Unit_RID_Int(areaSetCollisionMaskMethodBind, this.rawMemory, area, mask)
        }


        private val areaSetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_set_param") }
        fun areaSetParam(area: RID, param: Int, value: Variant) {
            _icall_Unit_RID_Int_Variant(areaSetParamMethodBind, this.rawMemory, area, param, value)
        }


        private val areaSetTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_set_transform") }
        fun areaSetTransform(area: RID, transform: Transform) {
            _icall_Unit_RID_Transform(areaSetTransformMethodBind, this.rawMemory, area, transform)
        }


        private val areaGetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_get_param") }
        fun areaGetParam(area: RID, param: Int): Variant {
            return _icall_Variant_RID_Int(areaGetParamMethodBind, this.rawMemory, area, param)
        }


        private val areaGetTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_get_transform") }
        fun areaGetTransform(area: RID): Transform {
            return _icall_Transform_RID(areaGetTransformMethodBind, this.rawMemory, area)
        }


        private val areaAttachObjectInstanceIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_attach_object_instance_id") }
        fun areaAttachObjectInstanceId(area: RID, id: Int) {
            _icall_Unit_RID_Int(areaAttachObjectInstanceIdMethodBind, this.rawMemory, area, id)
        }


        private val areaGetObjectInstanceIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "area_get_object_instance_id") }
        fun areaGetObjectInstanceId(area: RID): Int {
            return _icall_Int_RID(areaGetObjectInstanceIdMethodBind, this.rawMemory, area)
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
        fun bodyCreate(mode: Int = 2, initSleeping: Boolean = false): RID {
            return _icall_RID_Int_Boolean(bodyCreateMethodBind, this.rawMemory, mode, initSleeping)
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
        fun bodySetMode(body: RID, mode: Int) {
            _icall_Unit_RID_Int(bodySetModeMethodBind, this.rawMemory, body, mode)
        }


        private val bodyGetModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_get_mode") }
        fun bodyGetMode(body: RID): PhysicsServer.BodyMode {
            return PhysicsServer.BodyMode.fromInt(_icall_Int_RID(bodyGetModeMethodBind, this.rawMemory, body))
        }


        private val bodySetCollisionLayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_set_collision_layer") }
        fun bodySetCollisionLayer(body: RID, layer: Int) {
            _icall_Unit_RID_Int(bodySetCollisionLayerMethodBind, this.rawMemory, body, layer)
        }


        private val bodyGetCollisionLayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_get_collision_layer") }
        fun bodyGetCollisionLayer(body: RID): Int {
            return _icall_Int_RID(bodyGetCollisionLayerMethodBind, this.rawMemory, body)
        }


        private val bodySetCollisionMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_set_collision_mask") }
        fun bodySetCollisionMask(body: RID, mask: Int) {
            _icall_Unit_RID_Int(bodySetCollisionMaskMethodBind, this.rawMemory, body, mask)
        }


        private val bodyGetCollisionMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_get_collision_mask") }
        fun bodyGetCollisionMask(body: RID): Int {
            return _icall_Int_RID(bodyGetCollisionMaskMethodBind, this.rawMemory, body)
        }


        private val bodyAddShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_add_shape") }
        fun bodyAddShape(body: RID, shape: RID, transform: Transform = Transform()) {
            _icall_Unit_RID_RID_Transform(bodyAddShapeMethodBind, this.rawMemory, body, shape, transform)
        }


        private val bodySetShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_set_shape") }
        fun bodySetShape(body: RID, shapeIdx: Int, shape: RID) {
            _icall_Unit_RID_Int_RID(bodySetShapeMethodBind, this.rawMemory, body, shapeIdx, shape)
        }


        private val bodySetShapeTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_set_shape_transform") }
        fun bodySetShapeTransform(body: RID, shapeIdx: Int, transform: Transform) {
            _icall_Unit_RID_Int_Transform(bodySetShapeTransformMethodBind, this.rawMemory, body, shapeIdx, transform)
        }


        private val bodyGetShapeCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_get_shape_count") }
        fun bodyGetShapeCount(body: RID): Int {
            return _icall_Int_RID(bodyGetShapeCountMethodBind, this.rawMemory, body)
        }


        private val bodyGetShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_get_shape") }
        fun bodyGetShape(body: RID, shapeIdx: Int): RID {
            return _icall_RID_RID_Int(bodyGetShapeMethodBind, this.rawMemory, body, shapeIdx)
        }


        private val bodyGetShapeTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_get_shape_transform") }
        fun bodyGetShapeTransform(body: RID, shapeIdx: Int): Transform {
            return _icall_Transform_RID_Int(bodyGetShapeTransformMethodBind, this.rawMemory, body, shapeIdx)
        }


        private val bodyRemoveShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_remove_shape") }
        fun bodyRemoveShape(body: RID, shapeIdx: Int) {
            _icall_Unit_RID_Int(bodyRemoveShapeMethodBind, this.rawMemory, body, shapeIdx)
        }


        private val bodyClearShapesMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_clear_shapes") }
        fun bodyClearShapes(body: RID) {
            _icall_Unit_RID(bodyClearShapesMethodBind, this.rawMemory, body)
        }


        private val bodyAttachObjectInstanceIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_attach_object_instance_id") }
        fun bodyAttachObjectInstanceId(body: RID, id: Int) {
            _icall_Unit_RID_Int(bodyAttachObjectInstanceIdMethodBind, this.rawMemory, body, id)
        }


        private val bodyGetObjectInstanceIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_get_object_instance_id") }
        fun bodyGetObjectInstanceId(body: RID): Int {
            return _icall_Int_RID(bodyGetObjectInstanceIdMethodBind, this.rawMemory, body)
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
        fun bodySetParam(body: RID, param: Int, value: Float) {
            _icall_Unit_RID_Int_Float(bodySetParamMethodBind, this.rawMemory, body, param, value)
        }


        private val bodyGetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_get_param") }
        fun bodyGetParam(body: RID, param: Int): Float {
            return _icall_Float_RID_Int(bodyGetParamMethodBind, this.rawMemory, body, param)
        }


        private val bodySetKinematicSafeMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_set_kinematic_safe_margin") }
        fun bodySetKinematicSafeMargin(body: RID, margin: Float) {
            _icall_Unit_RID_Float(bodySetKinematicSafeMarginMethodBind, this.rawMemory, body, margin)
        }


        private val bodyGetKinematicSafeMarginMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_get_kinematic_safe_margin") }
        fun bodyGetKinematicSafeMargin(body: RID): Float {
            return _icall_Float_RID(bodyGetKinematicSafeMarginMethodBind, this.rawMemory, body)
        }


        private val bodySetStateMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_set_state") }
        fun bodySetState(body: RID, state: Int, value: Variant) {
            _icall_Unit_RID_Int_Variant(bodySetStateMethodBind, this.rawMemory, body, state, value)
        }


        private val bodyGetStateMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_get_state") }
        fun bodyGetState(body: RID, state: Int): Variant {
            return _icall_Variant_RID_Int(bodyGetStateMethodBind, this.rawMemory, body, state)
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
        fun bodySetAxisLock(body: RID, axis: Int, lock: Boolean) {
            _icall_Unit_RID_Int_Boolean(bodySetAxisLockMethodBind, this.rawMemory, body, axis, lock)
        }


        private val bodyIsAxisLockedMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_is_axis_locked") }
        fun bodyIsAxisLocked(body: RID, axis: Int): Boolean {
            return _icall_Boolean_RID_Int(bodyIsAxisLockedMethodBind, this.rawMemory, body, axis)
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
        fun bodySetMaxContactsReported(body: RID, amount: Int) {
            _icall_Unit_RID_Int(bodySetMaxContactsReportedMethodBind, this.rawMemory, body, amount)
        }


        private val bodyGetMaxContactsReportedMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "body_get_max_contacts_reported") }
        fun bodyGetMaxContactsReported(body: RID): Int {
            return _icall_Int_RID(bodyGetMaxContactsReportedMethodBind, this.rawMemory, body)
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
        fun bodySetForceIntegrationCallback(body: RID, receiver: Object, method: String, userdata: Variant) {
            _icall_Unit_RID_Object_String_Variant(bodySetForceIntegrationCallbackMethodBind, this.rawMemory, body, receiver, method, userdata)
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
        fun pinJointSetParam(joint: RID, param: Int, value: Float) {
            _icall_Unit_RID_Int_Float(pinJointSetParamMethodBind, this.rawMemory, joint, param, value)
        }


        private val pinJointGetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "pin_joint_get_param") }
        fun pinJointGetParam(joint: RID, param: Int): Float {
            return _icall_Float_RID_Int(pinJointGetParamMethodBind, this.rawMemory, joint, param)
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
        fun hingeJointSetParam(joint: RID, param: Int, value: Float) {
            _icall_Unit_RID_Int_Float(hingeJointSetParamMethodBind, this.rawMemory, joint, param, value)
        }


        private val hingeJointGetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "hinge_joint_get_param") }
        fun hingeJointGetParam(joint: RID, param: Int): Float {
            return _icall_Float_RID_Int(hingeJointGetParamMethodBind, this.rawMemory, joint, param)
        }


        private val hingeJointSetFlagMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "hinge_joint_set_flag") }
        fun hingeJointSetFlag(joint: RID, flag: Int, enabled: Boolean) {
            _icall_Unit_RID_Int_Boolean(hingeJointSetFlagMethodBind, this.rawMemory, joint, flag, enabled)
        }


        private val hingeJointGetFlagMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "hinge_joint_get_flag") }
        fun hingeJointGetFlag(joint: RID, flag: Int): Boolean {
            return _icall_Boolean_RID_Int(hingeJointGetFlagMethodBind, this.rawMemory, joint, flag)
        }


        private val jointCreateSliderMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "joint_create_slider") }
        fun jointCreateSlider(bodyA: RID, localRefA: Transform, bodyB: RID, localRefB: Transform): RID {
            return _icall_RID_RID_Transform_RID_Transform(jointCreateSliderMethodBind, this.rawMemory, bodyA, localRefA, bodyB, localRefB)
        }


        private val sliderJointSetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "slider_joint_set_param") }
        fun sliderJointSetParam(joint: RID, param: Int, value: Float) {
            _icall_Unit_RID_Int_Float(sliderJointSetParamMethodBind, this.rawMemory, joint, param, value)
        }


        private val sliderJointGetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "slider_joint_get_param") }
        fun sliderJointGetParam(joint: RID, param: Int): Float {
            return _icall_Float_RID_Int(sliderJointGetParamMethodBind, this.rawMemory, joint, param)
        }


        private val jointCreateConeTwistMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "joint_create_cone_twist") }
        fun jointCreateConeTwist(bodyA: RID, localRefA: Transform, bodyB: RID, localRefB: Transform): RID {
            return _icall_RID_RID_Transform_RID_Transform(jointCreateConeTwistMethodBind, this.rawMemory, bodyA, localRefA, bodyB, localRefB)
        }


        private val coneTwistJointSetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "cone_twist_joint_set_param") }
        fun coneTwistJointSetParam(joint: RID, param: Int, value: Float) {
            _icall_Unit_RID_Int_Float(coneTwistJointSetParamMethodBind, this.rawMemory, joint, param, value)
        }


        private val coneTwistJointGetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "cone_twist_joint_get_param") }
        fun coneTwistJointGetParam(joint: RID, param: Int): Float {
            return _icall_Float_RID_Int(coneTwistJointGetParamMethodBind, this.rawMemory, joint, param)
        }


        private val jointGetTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "joint_get_type") }
        fun jointGetType(joint: RID): PhysicsServer.JointType {
            return PhysicsServer.JointType.fromInt(_icall_Int_RID(jointGetTypeMethodBind, this.rawMemory, joint))
        }


        private val jointSetSolverPriorityMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "joint_set_solver_priority") }
        fun jointSetSolverPriority(joint: RID, priority: Int) {
            _icall_Unit_RID_Int(jointSetSolverPriorityMethodBind, this.rawMemory, joint, priority)
        }


        private val jointGetSolverPriorityMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "joint_get_solver_priority") }
        fun jointGetSolverPriority(joint: RID): Int {
            return _icall_Int_RID(jointGetSolverPriorityMethodBind, this.rawMemory, joint)
        }


        private val jointCreateGeneric6dofMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "joint_create_generic_6dof") }
        fun jointCreateGeneric6dof(bodyA: RID, localRefA: Transform, bodyB: RID, localRefB: Transform): RID {
            return _icall_RID_RID_Transform_RID_Transform(jointCreateGeneric6dofMethodBind, this.rawMemory, bodyA, localRefA, bodyB, localRefB)
        }


        private val generic6dofJointSetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "generic_6dof_joint_set_param") }
        fun generic6dofJointSetParam(joint: RID, axis: Int, param: Int, value: Float) {
            _icall_Unit_RID_Int_Int_Float(generic6dofJointSetParamMethodBind, this.rawMemory, joint, axis, param, value)
        }


        private val generic6dofJointGetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "generic_6dof_joint_get_param") }
        fun generic6dofJointGetParam(joint: RID, axis: Int, param: Int): Float {
            return _icall_Float_RID_Int_Int(generic6dofJointGetParamMethodBind, this.rawMemory, joint, axis, param)
        }


        private val generic6dofJointSetFlagMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "generic_6dof_joint_set_flag") }
        fun generic6dofJointSetFlag(joint: RID, axis: Int, flag: Int, enable: Boolean) {
            _icall_Unit_RID_Int_Int_Boolean(generic6dofJointSetFlagMethodBind, this.rawMemory, joint, axis, flag, enable)
        }


        private val generic6dofJointGetFlagMethodBind: CPointer<godot_method_bind> by lazy { getMB("PhysicsServer", "generic_6dof_joint_get_flag") }
        fun generic6dofJointGetFlag(joint: RID, axis: Int, flag: Int): Boolean {
            return _icall_Boolean_RID_Int_Int(generic6dofJointGetFlagMethodBind, this.rawMemory, joint, axis, flag)
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
        fun getProcessInfo(processInfo: Int): Int {
            return _icall_Int_Int(getProcessInfoMethodBind, this.rawMemory, processInfo)
        }


    }
}
