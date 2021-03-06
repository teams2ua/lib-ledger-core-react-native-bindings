// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from configuration.djinni

#import "LGConfigurationDefaults+Private.h"
#import "LGConfigurationDefaults.h"
#import "DJICppWrapperCache+Private.h"
#import "DJIError.h"
#import "DJIMarshal+Private.h"
#include <exception>
#include <stdexcept>
#include <utility>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@interface LGConfigurationDefaults ()

- (id)initWithCpp:(const std::shared_ptr<::ledger::core::api::ConfigurationDefaults>&)cppRef;

@end

@implementation LGConfigurationDefaults {
    ::djinni::CppProxyCache::Handle<std::shared_ptr<::ledger::core::api::ConfigurationDefaults>> _cppRefHandle;
}

- (id)initWithCpp:(const std::shared_ptr<::ledger::core::api::ConfigurationDefaults>&)cppRef
{
    if (self = [super init]) {
        _cppRefHandle.assign(cppRef);
    }
    return self;
}


namespace djinni_generated {

auto ConfigurationDefaults::toCpp(ObjcType objc) -> CppType
{
    if (!objc) {
        return nullptr;
    }
    return objc->_cppRefHandle.get();
}

auto ConfigurationDefaults::fromCppOpt(const CppOptType& cpp) -> ObjcType
{
    if (!cpp) {
        return nil;
    }
    return ::djinni::get_cpp_proxy<LGConfigurationDefaults>(cpp);
}

}  // namespace djinni_generated

@end
