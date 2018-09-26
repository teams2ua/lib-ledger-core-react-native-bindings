// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from ethereum_like_wallet.djinni

#import "RCTCoreLGGetEthreumLikeWalletCallback.h"


@implementation RCTCoreLGGetEthreumLikeWalletCallback
//Export module
RCT_EXPORT_MODULE(RCTCoreLGGetEthreumLikeWalletCallback)

@synthesize bridge = _bridge;

-(instancetype)init
{
    self = [super init];
    //Init Objc implementation
    if(self)
    {
        self.objcImplementations = [[NSMutableDictionary alloc] init];
    }
    return self;
}

+ (BOOL)requiresMainQueueSetup
{
    return NO;
}
RCT_REMAP_METHOD(release, release:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGGetEthreumLikeWalletCallback::release, first argument should be an instance of LGGetEthreumLikeWalletCallback", nil);
    }
    [self.objcImplementations removeObjectForKey:currentInstance[@"uid"]];
    resolve(@(YES));
}
RCT_REMAP_METHOD(log, logWithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    NSMutableArray *uuids = [[NSMutableArray alloc] init];
    for (id key in self.objcImplementations)
    {
        [uuids addObject:key];
    }
    NSDictionary *result = @{@"value" : uuids};
    resolve(result);
}
RCT_REMAP_METHOD(flush, flushWithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    [self.objcImplementations removeAllObjects];
    resolve(@(YES));
}

RCT_REMAP_METHOD(onSuccess,onSuccess:(NSDictionary *)currentInstance withParams:(NSDictionary *)wallet
                                                                      isCreated:(BOOL)isCreated withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGGetEthreumLikeWalletCallback::onSuccess, first argument should be an instance of LGGetEthreumLikeWalletCallbackImpl", nil);
    }
    LGGetEthreumLikeWalletCallbackImpl *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGGetEthreumLikeWalletCallbackImpl::onSuccess, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    RCTCoreLGEthereumLikeWallet *rctParam_wallet = (RCTCoreLGEthereumLikeWallet *)[self.bridge moduleForName:@"CoreLGEthereumLikeWallet"];
    LGEthereumLikeWallet *objcParam_0 = (LGEthereumLikeWallet *)[rctParam_wallet.objcImplementations objectForKey:wallet[@"uid"]];
    [currentInstanceObj onSuccess:objcParam_0 isCreated:isCreated];

}

RCT_REMAP_METHOD(onError,onError:(NSDictionary *)currentInstance withParams:(NSDictionary *)error withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGGetEthreumLikeWalletCallback::onError, first argument should be an instance of LGGetEthreumLikeWalletCallbackImpl", nil);
    }
    LGGetEthreumLikeWalletCallbackImpl *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGGetEthreumLikeWalletCallbackImpl::onError, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    RCTCoreLGError *rctParam_error = (RCTCoreLGError *)[self.bridge moduleForName:@"CoreLGError"];
    LGError *objcParam_0 = (LGError *)[rctParam_error.objcImplementations objectForKey:error[@"uid"]];
    [currentInstanceObj onError:objcParam_0];

}
RCT_REMAP_METHOD(newInstance, newInstanceWithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    LGGetEthreumLikeWalletCallbackImpl *objcResult = [[LGGetEthreumLikeWalletCallbackImpl alloc] init];
    NSString *uuid = [[NSUUID UUID] UUIDString];
    [self.objcImplementations setObject:objcResult forKey:uuid];
    NSDictionary *result = @{@"type" : @"CoreLGGetEthreumLikeWalletCallbackImpl", @"uid" : uuid };
    if (!objcResult || !result)
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGGetEthreumLikeWalletCallbackImpl::init", nil);
    }
    resolve(result);
}
@end
