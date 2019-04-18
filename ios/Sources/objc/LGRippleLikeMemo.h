// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from memo.djinni

#import <Foundation/Foundation.h>

/**
 * A ripple memo.
 *
 * <https://developers.ripple.com/transaction-common-fields.html#memos-field>
 */
@interface LGRippleLikeMemo : NSObject
- (nonnull instancetype)initWithData:(nonnull NSString *)data
                                 fmt:(nonnull NSString *)fmt
                                  ty:(nonnull NSString *)ty;
+ (nonnull instancetype)RippleLikeMemoWithData:(nonnull NSString *)data
                                           fmt:(nonnull NSString *)fmt
                                            ty:(nonnull NSString *)ty;

/** Data carried by the memo. */
@property (nonatomic, readonly, nonnull) NSString * data;

/** Format of the memo. */
@property (nonatomic, readonly, nonnull) NSString * fmt;

/** Type of the memo. */
@property (nonatomic, readonly, nonnull) NSString * ty;

@end
