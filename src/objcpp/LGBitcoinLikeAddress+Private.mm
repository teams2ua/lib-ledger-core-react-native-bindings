// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from addresses.djinni

#import "LGBitcoinLikeAddress+Private.h"
#import "LGBitcoinLikeAddress.h"
#import "DJICppWrapperCache+Private.h"
#import "DJIError.h"
#import "DJIMarshal+Private.h"
#import "LGBitcoinLikeNetworkParameters+Private.h"
#include <exception>
#include <stdexcept>
#include <utility>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@interface LGBitcoinLikeAddress ()

- (id)initWithCpp:(const std::shared_ptr<::ledger::core::api::BitcoinLikeAddress>&)cppRef;

@end

@implementation LGBitcoinLikeAddress {
    ::djinni::CppProxyCache::Handle<std::shared_ptr<::ledger::core::api::BitcoinLikeAddress>> _cppRefHandle;
}

- (id)initWithCpp:(const std::shared_ptr<::ledger::core::api::BitcoinLikeAddress>&)cppRef
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

- (nonnull LGBitcoinLikeNetworkParameters *)getNetworkParameters {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getNetworkParameters();
        return ::djinni_generated::BitcoinLikeNetworkParameters::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nonnull NSString *)toBase58 {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->toBase58();
        return ::djinni::String::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (BOOL)isP2SH {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->isP2SH();
        return ::djinni::Bool::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (BOOL)isP2PKH {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->isP2PKH();
        return ::djinni::Bool::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

namespace djinni_generated {

auto BitcoinLikeAddress::toCpp(ObjcType objc) -> CppType
{
    if (!objc) {
        return nullptr;
    }
    return objc->_cppRefHandle.get();
}

auto BitcoinLikeAddress::fromCppOpt(const CppOptType& cpp) -> ObjcType
{
    if (!cpp) {
        return nil;
    }
    return ::djinni::get_cpp_proxy<LGBitcoinLikeAddress>(cpp);
}

}  // namespace djinni_generated

@end