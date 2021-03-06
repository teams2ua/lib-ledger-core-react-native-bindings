// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from ethereum_like_wallet.djinni

#import "LGEthereumLikeTransactionBuilder+Private.h"
#import "LGEthereumLikeTransactionBuilder.h"
#import "DJICppWrapperCache+Private.h"
#import "DJIError.h"
#import "DJIMarshal+Private.h"
#import "LGAmount+Private.h"
#import "LGCurrency+Private.h"
#import "LGEthereumLikeTransaction+Private.h"
#import "LGEthereumLikeTransactionCallback+Private.h"
#include <exception>
#include <stdexcept>
#include <utility>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@interface LGEthereumLikeTransactionBuilder ()

- (id)initWithCpp:(const std::shared_ptr<::ledger::core::api::EthereumLikeTransactionBuilder>&)cppRef;

@end

@implementation LGEthereumLikeTransactionBuilder {
    ::djinni::CppProxyCache::Handle<std::shared_ptr<::ledger::core::api::EthereumLikeTransactionBuilder>> _cppRefHandle;
}

- (id)initWithCpp:(const std::shared_ptr<::ledger::core::api::EthereumLikeTransactionBuilder>&)cppRef
{
    if (self = [super init]) {
        _cppRefHandle.assign(cppRef);
    }
    return self;
}

- (nullable LGEthereumLikeTransactionBuilder *)sendToAddress:(nullable LGAmount *)amount
                                                     address:(nonnull NSString *)address {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->sendToAddress(::djinni_generated::Amount::toCpp(amount),
                                                                 ::djinni::String::toCpp(address));
        return ::djinni_generated::EthereumLikeTransactionBuilder::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nullable LGEthereumLikeTransactionBuilder *)wipeToAddress:(nonnull NSString *)address {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->wipeToAddress(::djinni::String::toCpp(address));
        return ::djinni_generated::EthereumLikeTransactionBuilder::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nullable LGEthereumLikeTransactionBuilder *)setGasPrice:(nullable LGAmount *)gasPrice {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->setGasPrice(::djinni_generated::Amount::toCpp(gasPrice));
        return ::djinni_generated::EthereumLikeTransactionBuilder::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nullable LGEthereumLikeTransactionBuilder *)setGasLimit:(nullable LGAmount *)gasLimit {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->setGasLimit(::djinni_generated::Amount::toCpp(gasLimit));
        return ::djinni_generated::EthereumLikeTransactionBuilder::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nullable LGEthereumLikeTransactionBuilder *)setInputData:(nonnull NSData *)data {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->setInputData(::djinni::Binary::toCpp(data));
        return ::djinni_generated::EthereumLikeTransactionBuilder::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (void)build:(nullable id<LGEthereumLikeTransactionCallback>)callback {
    try {
        _cppRefHandle.get()->build(::djinni_generated::EthereumLikeTransactionCallback::toCpp(callback));
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nullable LGEthereumLikeTransactionBuilder *)clone {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->clone();
        return ::djinni_generated::EthereumLikeTransactionBuilder::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (void)reset {
    try {
        _cppRefHandle.get()->reset();
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGEthereumLikeTransaction *)parseRawUnsignedTransaction:(nonnull LGCurrency *)currency
                                                     rawTransaction:(nonnull NSData *)rawTransaction {
    try {
        auto objcpp_result_ = ::ledger::core::api::EthereumLikeTransactionBuilder::parseRawUnsignedTransaction(::djinni_generated::Currency::toCpp(currency),
                                                                                                               ::djinni::Binary::toCpp(rawTransaction));
        return ::djinni_generated::EthereumLikeTransaction::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGEthereumLikeTransaction *)parseRawSignedTransaction:(nonnull LGCurrency *)currency
                                                   rawTransaction:(nonnull NSData *)rawTransaction {
    try {
        auto objcpp_result_ = ::ledger::core::api::EthereumLikeTransactionBuilder::parseRawSignedTransaction(::djinni_generated::Currency::toCpp(currency),
                                                                                                             ::djinni::Binary::toCpp(rawTransaction));
        return ::djinni_generated::EthereumLikeTransaction::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

namespace djinni_generated {

auto EthereumLikeTransactionBuilder::toCpp(ObjcType objc) -> CppType
{
    if (!objc) {
        return nullptr;
    }
    return objc->_cppRefHandle.get();
}

auto EthereumLikeTransactionBuilder::fromCppOpt(const CppOptType& cpp) -> ObjcType
{
    if (!cpp) {
        return nil;
    }
    return ::djinni::get_cpp_proxy<LGEthereumLikeTransactionBuilder>(cpp);
}

}  // namespace djinni_generated

@end
