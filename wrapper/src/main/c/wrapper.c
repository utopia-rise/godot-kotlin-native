#include <gdnative_api_struct.gen.h>

#include <libgodot_wrapper_api_api.h>


const godot_gdnative_core_api_struct *api = NULL;
const godot_gdnative_ext_nativescript_api_struct *nativescript_api = NULL;


GDCALLINGCONV void *simple_constructor(godot_object *p_instance, void *p_method_data);
GDCALLINGCONV void simple_destructor(godot_object *p_instance, void *p_method_data, void *p_user_data);
godot_variant entry(godot_object *p_instance, void *p_method_data, void *p_user_data, int p_num_args, godot_variant **p_args);


void GDN_EXPORT godot_gdnative_init(godot_gdnative_init_options *p_options) {
    api = p_options->api_struct;

    // now find our extensions
    for (int i = 0; i < api-> num_extensions; i++) {
        switch (api->extensions[i]->type) {
            case GDNATIVE_EXT_NATIVESCRIPT: {
                nativescript_api = (godot_gdnative_ext_nativescript_api_struct *) api->extensions[i];
            };
                break;
            default:
                break;
        };
    };
}

void GDN_EXPORT godot_gdnative_terminate(godot_gdnative_terminate_options *p_options) {
    api = NULL;
    nativescript_api = NULL;
}

void GDN_EXPORT godot_nativescript_init(void *p_handle) {
    godot_instance_create_func create = {NULL, NULL, NULL};
    create.create_func = &simple_constructor;

    godot_instance_destroy_func destroy = {NULL, NULL, NULL};
    destroy.destroy_func = &simple_destructor;

    nativescript_api->godot_nativescript_register_class(p_handle, "SIMPLE", "Reference", create, destroy);

    godot_instance_method method = {NULL, NULL, NULL};
    method.method = &entry;

    godot_method_attributes attributes = {GODOT_METHOD_RPC_MODE_DISABLED};

    nativescript_api->godot_nativescript_register_method(p_handle, "SIMPLE", "get_data", attributes, method);
}


GDCALLINGCONV void *simple_constructor(godot_object *p_instance, void *p_method_data) {
    return NULL;
}

GDCALLINGCONV void simple_destructor(godot_object *p_instance, void *p_method_data, void *p_user_data) {

}


godot_variant entry(godot_object *p_instance, void *p_method_data, void *p_user_data, int p_num_args, godot_variant **p_args) {
    libgodot_wrapper_api_symbols()->kotlin.root.kotlin.godot.godot_wrapper_entry((void *) api, (void *) nativescript_api);

    godot_variant ret;
    api->godot_variant_new_bool(&ret, 1);
    return ret;
}