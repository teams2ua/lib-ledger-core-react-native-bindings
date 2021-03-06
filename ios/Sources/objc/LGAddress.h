// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

#import "LGCurrency.h"
#import <Foundation/Foundation.h>
@class LGAddress;
@class LGBitcoinLikeAddress;


@interface LGAddress : NSObject

/**
 * Gets an optional derivation path (if the address is owned by an account).
 * @return The derivation path of the address
 */
- (nullable NSString *)getDerivationPath;

/**
 * Serialize the address to a string. The serialization method depends of the underlying currency and
 * format (Base58, Bech32, Ethereum...).
 */
- (nonnull NSString *)toString;

- (nullable LGBitcoinLikeAddress *)asBitcoinLikeAddress;

- (BOOL)isInstanceOfBitcoinLikeAddress;

- (nonnull LGCurrency *)getCurrency;

/**
 * Attempt to parse a string address. If the address can be parse return it otherwise return a NONE
 * (depending on you host this may be a null, nil, None...).
 * @param address The string to parse
 * @param currency The currency used to parse the address
 * @return If successful returns the address object otherwise null.
 */
+ (nullable LGAddress *)parse:(nonnull NSString *)address
                     currency:(nonnull LGCurrency *)currency;

/**
 * Checks if the given string formatted address is valid or not.
 * @param address The string to parse
 * @param currency The currency used to parse the address
 * @return If successful returns true, false otherwise.
 */
+ (BOOL)isValid:(nonnull NSString *)address
       currency:(nonnull LGCurrency *)currency;

@end
