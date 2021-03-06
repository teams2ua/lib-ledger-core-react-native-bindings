// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from erc20.djinni

#import "LGERC20Token.h"
#import "LGTimePeriod.h"
#import <Foundation/Foundation.h>
@class LGBigInt;
@class LGERC20LikeOperation;
@class LGOperationQuery;


/** ERC20-like accounts class. */
@interface LGERC20LikeAccount : NSObject

/** Get an ERC20 token. */
- (nonnull LGERC20Token *)getToken;

/** Get the address of this ERC20 account. */
- (nonnull NSString *)getAddress;

/** Get the current balance of this ERC20 account. */
- (nullable LGBigInt *)getBalance;

/**
 * Get the balance history of this ERC20 account from a starting date (included) to an ending
 * date (included).
 */
- (nonnull NSArray<LGBigInt *> *)getBalanceHistoryFor:(nonnull NSDate *)start
                                                  end:(nonnull NSDate *)end
                                               period:(LGTimePeriod)period;

/** Get the list of operations performed on this ERC20 account. */
- (nonnull NSArray<LGERC20LikeOperation *> *)getOperations;

/** Retrieve raw data concerning a transaction of a given amount to a given address. */
- (nonnull NSData *)getTransferToAddressData:(nullable LGBigInt *)amount
                                     address:(nonnull NSString *)address;

- (nullable LGOperationQuery *)queryOperations;

@end
