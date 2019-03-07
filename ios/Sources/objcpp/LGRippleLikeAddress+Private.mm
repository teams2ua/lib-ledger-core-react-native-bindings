// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from addresses.djinni

#import "LGRippleLikeAddress+Private.h"
#import "LGRippleLikeAddress.h"
#import "DJICppWrapperCache+Private.h"
#import "DJIError.h"
#import "DJIMarshal+Private.h"
#import "LGRippleLikeNetworkParameters+Private.h"
#include <exception>
#include <stdexcept>
#include <utility>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@interface LGRippleLikeAddress ()

- (id)initWithCpp:(const std::shared_ptr<::ledger::core::api::RippleLikeAddress>&)cppRef;

@end

@implementation LGRippleLikeAddress {
    ::djinni::CppProxyCache::Handle<std::shared_ptr<::ledger::core::api::RippleLikeAddress>> _cppRefHandle;
}

- (id)initWithCpp:(const std::shared_ptr<::ledger::core::api::RippleLikeAddress>&)cppRef
{
    if (self = [super init]) {
        _cppRefHandle.assign(cppRef);
    }
    return self;
}

- (nonnull NSData *)getVersion {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getVersion();
        return ::djinni::Binary::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nonnull NSData *)getHash160 {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getHash160();
        return ::djinni::Binary::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nonnull LGRippleLikeNetworkParameters *)getNetworkParameters {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getNetworkParameters();
        return ::djinni_generated::RippleLikeNetworkParameters::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nonnull NSString *)toBase58 {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->toBase58();
        return ::djinni::String::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

namespace djinni_generated {

auto RippleLikeAddress::toCpp(ObjcType objc) -> CppType
{
    if (!objc) {
        return nullptr;
    }
    return objc->_cppRefHandle.get();
}

auto RippleLikeAddress::fromCppOpt(const CppOptType& cpp) -> ObjcType
{
    if (!cpp) {
        return nil;
    }
    return ::djinni::get_cpp_proxy<LGRippleLikeAddress>(cpp);
}

}  // namespace djinni_generated

@end
