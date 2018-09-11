// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from currency.djinni

#ifndef DJINNI_GENERATED_WALLETTYPE_HPP
#define DJINNI_GENERATED_WALLETTYPE_HPP

#include <functional>
#include <iostream>
#include <string>

namespace ledger { namespace core { namespace api {

enum class WalletType : int {
    BITCOIN,
    ETHEREUM,
    RIPPLE,
    MONERO,
};
std::string to_string(const WalletType& walletType);
std::ostream &operator<<(std::ostream &os, const WalletType &o);

} } }  // namespace ledger::core::api

namespace std {

template <>
struct hash<::ledger::core::api::WalletType> {
    size_t operator()(::ledger::core::api::WalletType type) const {
        return std::hash<int>()(static_cast<int>(type));
    }
};

}  // namespace std
#endif //DJINNI_GENERATED_WALLETTYPE_HPP