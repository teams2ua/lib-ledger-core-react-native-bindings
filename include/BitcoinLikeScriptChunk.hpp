// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from bitcoin_script.djinni

#ifndef DJINNI_GENERATED_BITCOINLIKESCRIPTCHUNK_HPP
#define DJINNI_GENERATED_BITCOINLIKESCRIPTCHUNK_HPP

#include "../utils/optional.hpp"
#include <cstdint>
#include <memory>
#include <vector>

namespace ledger { namespace core { namespace api {

struct BitcoinLikeOperator;

class BitcoinLikeScriptChunk {
public:
    virtual ~BitcoinLikeScriptChunk() {}

    virtual bool isOperator() = 0;

    virtual bool isPushedData() = 0;

    virtual std::experimental::optional<BitcoinLikeOperator> getOperator() = 0;

    virtual std::experimental::optional<std::vector<uint8_t>> getPushedData() = 0;

    virtual std::shared_ptr<BitcoinLikeScriptChunk> next() = 0;

    virtual bool hasNext() = 0;
};

} } }  // namespace ledger::core::api
#endif //DJINNI_GENERATED_BITCOINLIKESCRIPTCHUNK_HPP
