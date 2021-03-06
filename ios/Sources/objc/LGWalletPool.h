// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet_pool.djinni

#import "LGCurrency.h"
#import <Foundation/Foundation.h>
@class LGDatabaseBackend;
@class LGDynamicObject;
@class LGEventBus;
@class LGLogger;
@class LGPreferences;
@class LGWalletPool;
@protocol LGBlockCallback;
@protocol LGCurrencyCallback;
@protocol LGCurrencyListCallback;
@protocol LGErrorCodeCallback;
@protocol LGHttpClient;
@protocol LGI32Callback;
@protocol LGLogPrinter;
@protocol LGPathResolver;
@protocol LGRandomNumberGenerator;
@protocol LGThreadDispatcher;
@protocol LGWalletCallback;
@protocol LGWalletListCallback;
@protocol LGWebSocketClient;


/** Class respresenting a pool of wallets. */
@interface LGWalletPool : NSObject

/**
 * Create a new instance of WalletPool object.
 * @param name, string, name of the wallet pool
 * @param password, optional string, password to lock wallet pool
 * @param http, HttpClient object, http client used for all calls made by wallet pool (and aggregated wallets)
 * @param webSocketClient, WebSocketClient object, socket through which wallet pool observe and get notified (explorer, DBs ...)
 * @param pathResolver, PathResolver Object, resolve paths to logs, databases, preferences ...
 * @param logPrinter, LogPrinter object, used to dump/log for debug purpose
 * @param dispatcher, ThreadDispatcher object, responsable of dispatching task through available threads
 * @param rng, RandomNumberGenerator object, needed for generating random numbers (for seeds, salts ...)
 * @param backend, DatabseBackend object, DB in which wallet pool store all required infos (created wallets, their options, their accounts ...)
 * @param configuration, DynamicObject object, desired configuration for this wallet pool
 * @return WalletPool object, instance of WalletPool
 */
+ (nullable LGWalletPool *)newInstance:(nonnull NSString *)name
                              password:(nullable NSString *)password
                            httpClient:(nullable id<LGHttpClient>)httpClient
                       webSocketClient:(nullable id<LGWebSocketClient>)webSocketClient
                          pathResolver:(nullable id<LGPathResolver>)pathResolver
                            logPrinter:(nullable id<LGLogPrinter>)logPrinter
                            dispatcher:(nullable id<LGThreadDispatcher>)dispatcher
                                   rng:(nullable id<LGRandomNumberGenerator>)rng
                               backend:(nullable LGDatabaseBackend *)backend
                         configuration:(nullable LGDynamicObject *)configuration;

/**
 * Return used logger to dump logs in defined log path by PathResolver.
 * @return Logger object
 */
- (nullable LGLogger *)getLogger;

/**
 * Return the name of the wallet pool.
 * @return string
 */
- (nonnull NSString *)getName;

/**
 * Return preferences of wallet pool (deduced from configuration).
 * @return Preferences object
 */
- (nullable LGPreferences *)getPreferences;

/**
 * Return number of wallets instanciated under wallet pool.
 * @param callback, Callback object returns a 32 bits integer, count of wallets
 */
- (void)getWalletCount:(nullable id<LGI32Callback>)callback;

/**
 * Get instanciated wallets having index in a given range.
 * @param from, 32 bits integer, lower bound of indices to pick
 * @param to, 32 bits integer, upper bound of indices to pick
 * @param callback, ListCallback object returns a list of Wallet objects
 */
- (void)getWallets:(int32_t)from
              size:(int32_t)size
          callback:(nullable id<LGWalletListCallback>)callback;

/**
 * Get wallet with a giver name.
 * @param name, string, name of wallet to look for
 * @param callback, Callback object returns a Wallet object
 */
- (void)getWallet:(nonnull NSString *)name
         callback:(nullable id<LGWalletCallback>)callback;

/**
 * Instanciate a new wallet under wallet pool.
 * @param name, string, name of newly created wallet
 * @param currency, Currency object, currency of the wallet
 * @param configuration, DynamicObject object, configuration of wallet (preferences)
 * @param callback, Callback object returning a Wallet object
 */
- (void)createWallet:(nonnull NSString *)name
            currency:(nonnull LGCurrency *)currency
       configuration:(nullable LGDynamicObject *)configuration
            callback:(nullable id<LGWalletCallback>)callback;

/**
 * Return all supported currencies by wallet pool, at least one wallet support one of returned currencies.
 * @param callback, ListCallback object, returns a list of Currency objects
 */
- (void)getCurrencies:(nullable id<LGCurrencyListCallback>)callback;

/**
 * Return currency of a specific wallet.
 * @param name, wallet's name to look for
 * @param callback, Callback object returning a Currency object
 */
- (void)getCurrency:(nonnull NSString *)name
           callback:(nullable id<LGCurrencyCallback>)callback;

/**
 * Return last block of blockchain of a given currency (if it is supported by the wallet pool).
 * @param name, string, name of currency we are interested into getting it's blockchain's last block
 * @param callback, Callback object returns a Block object
 */
- (void)getLastBlock:(nonnull NSString *)currencyName
            callback:(nullable id<LGBlockCallback>)callback;

/**
 * Get event bus (handler) through which wallet pool observe and gets notified (explorers, DBs ...).
 * @param EventBus object
 */
- (nullable LGEventBus *)getEventBus;

/**
 * Erase data (in user's DB) relative to wallet since given date.
 * @param date, start date of data deletion
 */
- (void)eraseDataSince:(nonnull NSDate *)date
              callback:(nullable id<LGErrorCodeCallback>)callback;

/**
 * Reset wallet pool.
 *
 * Resetting the wallet pool is an irreversible fresh reset of the whole wallet pool
 * and all of its created (sub-)objects (wallets, accounts, transactions, etc.). Please
 * consider a less destructive option before opting to use this. However, if you’re
 * looking for a way to end up as if you were in a “fresh install” situation, this is
 * the function to go to.
 *
 * Final warning: this function effectively swipes off everything. You’ve been warned.
 *
 * > Note: when calling that function, you must re-create a WalletPool as all objects
 * > got destroyed. Consider restarting / exiting your application right after calling
 * > that function. You are also highly advised to run that function on a code path
 * > that doesn’t include having lots of objects in memory.
 *
 * The return value is always true and doesn’t convey any useful information for now.
 */
- (void)freshResetAll:(nullable id<LGErrorCodeCallback>)callback;

/**
 * Change Database password.
 *
 * Allow to change password of database holding all informations about
 * accounts, wallets, transactions etc. and the wallet pool preferences.
 *
 * WARNING: be careful to have no other instances of WalletPool using
 * same database / preferences.
 */
- (void)changePassword:(nonnull NSString *)oldPassword
           newPassword:(nonnull NSString *)newPassword
              callback:(nullable id<LGErrorCodeCallback>)callback;

@end
