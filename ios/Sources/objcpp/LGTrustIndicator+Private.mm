// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

#import "LGTrustIndicator+Private.h"
#import "LGTrustIndicator.h"
#import "DJICppWrapperCache+Private.h"
#import "DJIError.h"
#import "DJIMarshal+Private.h"
#import "LGTrustLevel+Private.h"
#include <exception>
#include <stdexcept>
#include <utility>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@interface LGTrustIndicator ()

- (id)initWithCpp:(const std::shared_ptr<::ledger::core::api::TrustIndicator>&)cppRef;

@end

@implementation LGTrustIndicator {
    ::djinni::CppProxyCache::Handle<std::shared_ptr<::ledger::core::api::TrustIndicator>> _cppRefHandle;
}

- (id)initWithCpp:(const std::shared_ptr<::ledger::core::api::TrustIndicator>&)cppRef
{
    if (self = [super init]) {
        _cppRefHandle.assign(cppRef);
    }
    return self;
}

- (int32_t)getTrustWeight {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getTrustWeight();
        return ::djinni::I32::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (LGTrustLevel)getTrustLevel {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getTrustLevel();
        return ::djinni::Enum<::ledger::core::api::TrustLevel, LGTrustLevel>::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nonnull NSArray<NSString *> *)getConflictingOperationUids {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getConflictingOperationUids();
        return ::djinni::List<::djinni::String>::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nonnull NSString *)getOrigin {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getOrigin();
        return ::djinni::String::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

namespace djinni_generated {

auto TrustIndicator::toCpp(ObjcType objc) -> CppType
{
    if (!objc) {
        return nullptr;
    }
    return objc->_cppRefHandle.get();
}

auto TrustIndicator::fromCppOpt(const CppOptType& cpp) -> ObjcType
{
    if (!cpp) {
        return nil;
    }
    return ::djinni::get_cpp_proxy<LGTrustIndicator>(cpp);
}

}  // namespace djinni_generated

@end
