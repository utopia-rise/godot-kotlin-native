@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core


enum class GodotError(val id: Long) {
    OK(0),
    FAILED(1), ///< Generic fail error
    ERR_UNAVAILABLE(2), ///< What is requested is unsupported/unavailable
    ERR_UNCONFIGURED(3), ///< The object being used hasnt been properly set up yet
    ERR_UNAUTHORIZED(4), ///< Missing credentials for requested resource
    ERR_PARAMETER_RANGE_ERROR(5), ///< Parameter given out of range (5)
    ERR_OUT_OF_MEMORY(6), ///< Out of memory
    ERR_FILE_NOT_FOUND(7),
    ERR_FILE_BAD_DRIVE(8),
    ERR_FILE_BAD_PATH(9),
    ERR_FILE_NO_PERMISSION(10),	// (10)
    ERR_FILE_ALREADY_IN_USE(11),
    ERR_FILE_CANT_OPEN(12),
    ERR_FILE_CANT_WRITE(13),
    ERR_FILE_CANT_READ(14),
    ERR_FILE_UNRECOGNIZED(15), // (15)
    ERR_FILE_CORRUPT(16),
    ERR_FILE_MISSING_DEPENDENCIES(17),
    ERR_FILE_EOF(18),
    ERR_CANT_OPEN(19), ///< Can't open a resource/socket/file
    ERR_CANT_CREATE(20),		// (20)
    ERR_QUERY_FAILED(21),
    ERR_ALREADY_IN_USE(22),
    ERR_LOCKED(23), ///< resource is locked
    ERR_TIMEOUT(24),
    ERR_CANT_CONNECT(25),		// (25)
    ERR_CANT_RESOLVE(26),
    ERR_CONNECTION_ERROR(27),
    ERR_CANT_AQUIRE_RESOURCE(28),
    ERR_CANT_FORK(29),
    ERR_INVALID_DATA(30), ///< Data passed is invalid	(30)
    ERR_INVALID_PARAMETER(31), ///< Parameter passed is invalid
    ERR_ALREADY_EXISTS(32), ///< When adding(), item already exists
    ERR_DOES_NOT_EXIST(33), ///< When retrieving/erasing(), it item does not exist
    ERR_DATABASE_CANT_READ(34), ///< database is full
    ERR_DATABASE_CANT_WRITE(35), ///< database is full	(35)
    ERR_COMPILATION_FAILED(36),
    ERR_METHOD_NOT_FOUND(37),
    ERR_LINK_FAILED(38),
    ERR_SCRIPT_FAILED(39),
    ERR_CYCLIC_LINK(40),		// (40)
    ERR_INVALID_DECLARATION(41),
    ERR_DUPLICATE_SYMBOL(42),
    ERR_PARSE_ERROR(43),
    ERR_BUSY(44),
    ERR_SKIP(45),			// (45)
    ERR_HELP(46), ///< user requested help!!
    ERR_BUG(47), ///< a bug in the software certainly happened(), due to a double check failing or unexpected behavior.
    ERR_PRINTER_ON_FIRE(48), /// the parallel port printer is engulfed in flames
    ERR_OMFG_THIS_IS_VERY_VERY_BAD(49), ///< shit happens, has never been used, though
    //ERR_WTF = ERR_OMFG_THIS_IS_VERY_VERY_BAD ///< short version of the above
    ;

    companion object {
        fun fromInt(value: Long) = values().single { it.id == value }
    }
}


const val CMP_EPSILON = 0.00001
const val CMP_EPSILON2 = CMP_EPSILON * CMP_EPSILON
const val Math_PI = 3.14159265358979323846

const val PLANE_EQ_DOT_EPSILON = 0.999
const val PLANE_EQ_D_EPSILON = 0.0001
