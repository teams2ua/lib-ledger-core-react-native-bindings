// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from networks.djinni

#ifndef DJINNI_GENERATED_NETWORKS_HPP
#define DJINNI_GENERATED_NETWORKS_HPP

namespace ledger { namespace core { namespace api {

struct BitcoinLikeNetworkParameters;
struct EthereumLikeNetworkParameters;
struct RippleLikeNetworkParameters;

/** All available blockchain networks parameters. */
class Networks {
public:
    virtual ~Networks() {}

    /** The Bitcoin network parameters. */
    static BitcoinLikeNetworkParameters bitcoin();

    /** The Ethereum network parameters. */
    static EthereumLikeNetworkParameters ethereum();

    /** The Ripple network parameters. */
    static RippleLikeNetworkParameters ripple();
};

} } }  // namespace ledger::core::api
#endif //DJINNI_GENERATED_NETWORKS_HPP
