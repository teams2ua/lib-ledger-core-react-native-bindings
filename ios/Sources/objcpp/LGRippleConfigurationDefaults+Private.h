// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from ripple_like_wallet.djinni

#include "RippleConfigurationDefaults.hpp"
#include <memory>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@class LGRippleConfigurationDefaults;

namespace djinni_generated {

class RippleConfigurationDefaults
{
public:
    using CppType = std::shared_ptr<::ledger::core::api::RippleConfigurationDefaults>;
    using CppOptType = std::shared_ptr<::ledger::core::api::RippleConfigurationDefaults>;
    using ObjcType = LGRippleConfigurationDefaults*;

    using Boxed = RippleConfigurationDefaults;

    static CppType toCpp(ObjcType objc);
    static ObjcType fromCppOpt(const CppOptType& cpp);
    static ObjcType fromCpp(const CppType& cpp) { return fromCppOpt(cpp); }

private:
    class ObjcProxy;
};

}  // namespace djinni_generated

