#ifndef WRAPPER_REGISTRATIONS_H
#define WRAPPER_REGISTRATIONS_H


#include <gdnative_api_struct.gen.h>
#include <string.h>


const godot_gdnative_core_api_struct *api = NULL;
const godot_gdnative_ext_nativescript_api_struct *nativescript_api = NULL;
void *nativescript_handle = NULL;



static void godot_wrapper_gdnative_init(godot_gdnative_init_options *p_options) {
    api = p_options->api_struct;

    for (int i = 0; i < api-> num_extensions; i++) {
        switch (api->extensions[i]->type) {
            case GDNATIVE_EXT_NATIVESCRIPT: {
                nativescript_api = (godot_gdnative_ext_nativescript_api_struct *) api->extensions[i];
            };  break;
            default:
                break;
        };
    };
}

static void godot_wrapper_gdnative_terminate(godot_gdnative_terminate_options *p_options) {
    api = NULL;
    nativescript_api = NULL;
}

static void godot_wrapper_nativescript_init(void *handle) {
    nativescript_handle = handle;
}





godot_variant ___godot_wrapper_call_and_get(godot_object *o, void *method_data, void *user_data, int num_args, godot_variant **args) {
    typedef void (*ptr)(void*, void*, int, void*);

    ptr method = *((ptr *) method_data);
    godot_variant ret;
    godot_variant_new_nil(&ret);
    method((void*) (&ret), user_data, num_args, (void *) args);

    return ret;
}

void godot_wrapper_register_method(const char *class_name,
        const char *name,
        void (*method_ptr)(void*, void*, int, void*),
        godot_method_rpc_mode rpc_type)
{
    godot_instance_method method = {};

    typedef void (*ptr)(void*, void*, int, void*);
    ptr *mem = (ptr *) godot_alloc(sizeof(ptr));
    (*mem) = method_ptr;

    method.method_data = (void *) mem;
    method.free_func = godot_free;
    method.method = ___godot_wrapper_call_and_get;

    godot_method_attributes attr = {};
    attr.rpc_type = rpc_type;

    nativescript_api->godot_nativescript_register_method(nativescript_handle, class_name, name, attr, method);
}





godot_variant ___godot_wrapper_property_get_func(godot_object *object, void *method_data, void *user_data) {
    typedef void (*ptr)(void*, void*);

    ptr method = *((ptr*) method_data);

    godot_variant var;
    api->godot_variant_new_nil(&var);
    method(user_data, (void *) &var);

    return var;
}

void ___godot_wrapper_property_set_func(godot_object *object, void *method_data, void *user_data, godot_variant *value) {
    typedef void (*ptr)(void*, void*);

    ptr method = *((ptr*) method_data);
    method(user_data, (void *) value);
}

void godot_wrapper_register_property(const char *class_name,
        const char *name,
        void (*getter)(void*, void*),
        void (*setter)(void*, void*),
        godot_variant default_value,
        int default_value_type,
        godot_method_rpc_mode rpc_mode,
        godot_property_usage_flags usage,
        godot_property_hint hint,
        godot_string hint_string)
{
    godot_property_attributes attr = {};
    attr.type = default_value_type;
    attr.default_value = default_value;
    attr.hint = hint;
    attr.rset_type = rpc_mode;
    attr.usage = usage;
    attr.hint_string = hint_string;



    typedef void (*ptr)(void*, void*);

    godot_property_set_func set_func = {};
    ptr *s = (ptr *) godot_alloc(sizeof(ptr));
    (*s) = setter;
    set_func.method_data = (void *) s;
    set_func.free_func   = api->godot_free;
    set_func.set_func    = ___godot_wrapper_property_set_func;

    godot_property_get_func get_func = {};
    ptr *g = (ptr *) godot_alloc(sizeof(ptr));
    (*g) = getter;
    get_func.method_data = (void *) g;
    get_func.free_func   = api->godot_free;
    get_func.get_func    = ___godot_wrapper_property_get_func;

    nativescript_api->godot_nativescript_register_property(nativescript_handle, class_name, name, &attr, set_func, get_func);
}





void godot_wrapper_register_signal(const char *class_name,
        godot_string name,
        int num_args,
        godot_signal_argument *args,
        int num_default_args,
        godot_variant *default_args)
{
    godot_signal signal = {};
    signal.name = name;
    signal.num_args = num_args;
    signal.num_default_args = num_default_args;

    if (num_args != 0) {
        signal.args = (godot_signal_argument*) api->godot_alloc(sizeof(godot_signal_argument) * num_args);
        memcpy((void *) signal.args, (void *) args, sizeof(godot_signal_argument) * num_args);
    }
    if (num_default_args != 0) {
        signal.default_args = (godot_variant*) api->godot_alloc(sizeof(godot_variant) * num_default_args);
        memcpy((void *) signal.default_args, (void *) default_args, sizeof(godot_variant) * num_default_args);
    }

    nativescript_api->godot_nativescript_register_signal(nativescript_handle, class_name, &signal);

    if(signal.args)
        api->godot_free(signal.args);
    if(signal.default_args)
        api->godot_free(signal.default_args);
}





void *___godot_wrapper_class_instance_func(godot_object *p, void *method_data) {
    typedef void* (*ptr)(void*);

    ptr method = (ptr) method_data;
    void *mem = method(p);

    if (mem == NULL)
        return p;
    return mem;
}

void ___godot_wrapper_class_destroy_func(godot_object *p, void *method_data, void *data) {
    typedef void (*ptr)(void*);

    ptr method = (ptr) method_data;
    method(data);
}

void godot_wrapper_register_class(const char *class_name,
        const char *base_class_name,
        void* (*constructor)(void*),
        void (*destructor)(void*))
{
    godot_instance_create_func create;
    create.create_func = ___godot_wrapper_class_instance_func;
    create.method_data = (void *) constructor;
    create.free_func = NULL;

    godot_instance_destroy_func destroy;
    destroy.destroy_func = ___godot_wrapper_class_destroy_func;
    destroy.method_data = (void *) destructor;
    destroy.free_func = NULL;

    nativescript_api->godot_nativescript_register_class(nativescript_handle, class_name, base_class_name, create, destroy);
}


#endif //WRAPPER_REGISTRATIONS_H
