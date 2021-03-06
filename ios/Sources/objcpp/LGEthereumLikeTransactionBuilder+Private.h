// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from ethereum_like_wallet.djinni

#include "EthereumLikeTransactionBuilder.hpp"
#include <memory>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@class LGEthereumLikeTransactionBuilder;

namespace djinni_generated {

class EthereumLikeTransactionBuilder
{
public:
    using CppType = std::shared_ptr<::ledger::core::api::EthereumLikeTransactionBuilder>;
    using CppOptType = std::shared_ptr<::ledger::core::api::EthereumLikeTransactionBuilder>;
    using ObjcType = LGEthereumLikeTransactionBuilder*;

    using Boxed = EthereumLikeTransactionBuilder;

    static CppType toCpp(ObjcType objc);
    static ObjcType fromCppOpt(const CppOptType& cpp);
    static ObjcType fromCpp(const CppType& cpp) { return fromCppOpt(cpp); }

private:
    class ObjcProxy;
};

}  // namespace djinni_generated

