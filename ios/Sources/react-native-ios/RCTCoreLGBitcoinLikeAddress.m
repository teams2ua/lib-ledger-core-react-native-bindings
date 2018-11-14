// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from addresses.djinni

#import "RCTCoreLGBitcoinLikeAddress.h"


@implementation RCTCoreLGBitcoinLikeAddress
//Export module
RCT_EXPORT_MODULE(RCTCoreLGBitcoinLikeAddress)

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
        reject(@"impl_call_error", @"Error while calling RCTCoreLGBitcoinLikeAddress::release, first argument should be an instance of LGBitcoinLikeAddress", nil);
        return;
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
RCT_REMAP_METHOD(isNull, isNull:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        resolve(@(YES));
        return;
    }
    [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if ([self.objcImplementations objectForKey:currentInstance[@"uid"]])
    {
        resolve(@(NO));
        return;
    }
    resolve(@(YES));
}

/**
 * Gets the version of the address (P2SH or P2PKH)
 * @return The version of the address
 */
RCT_REMAP_METHOD(getVersion,getVersion:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGBitcoinLikeAddress::getVersion, first argument should be an instance of LGBitcoinLikeAddress", nil);
        return;
    }
    LGBitcoinLikeAddress *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGBitcoinLikeAddress::getVersion, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    NSData * objcResult = [currentInstanceObj getVersion];
    NSDictionary *result = @{@"value" : objcResult.description};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGBitcoinLikeAddress::getVersion", nil);
        return;
    }

}

/**
 * Gets the raw hash160 of the public key
 * @return The 20 bytes of the public key hash160
 */
RCT_REMAP_METHOD(getHash160,getHash160:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGBitcoinLikeAddress::getHash160, first argument should be an instance of LGBitcoinLikeAddress", nil);
        return;
    }
    LGBitcoinLikeAddress *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGBitcoinLikeAddress::getHash160, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    NSData * objcResult = [currentInstanceObj getHash160];
    NSDictionary *result = @{@"value" : objcResult.description};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGBitcoinLikeAddress::getHash160", nil);
        return;
    }

}

/**
 * Gets the network parameters used for serializing the address
 * @return The network parameters of the address
 */
RCT_REMAP_METHOD(getNetworkParameters,getNetworkParameters:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGBitcoinLikeAddress::getNetworkParameters, first argument should be an instance of LGBitcoinLikeAddress", nil);
        return;
    }
    LGBitcoinLikeAddress *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGBitcoinLikeAddress::getNetworkParameters, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGBitcoinLikeNetworkParameters * objcResult = [currentInstanceObj getNetworkParameters];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGBitcoinLikeNetworkParameters *rctImpl_objcResult = (RCTCoreLGBitcoinLikeNetworkParameters *)[self.bridge moduleForName:@"CoreLGBitcoinLikeNetworkParameters"];
    [rctImpl_objcResult.objcImplementations setObject:objcResult forKey:objcResult_uuid];
    NSDictionary *result = @{@"type" : @"CoreLGBitcoinLikeNetworkParameters", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGBitcoinLikeAddress::getNetworkParameters", nil);
        return;
    }

}

/**
 * Serializes the hash160 into a Base58 encoded address (with checksum)
 * @return The Base58 serialization
 */
RCT_REMAP_METHOD(toBase58,toBase58:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGBitcoinLikeAddress::toBase58, first argument should be an instance of LGBitcoinLikeAddress", nil);
        return;
    }
    LGBitcoinLikeAddress *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGBitcoinLikeAddress::toBase58, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    NSString * objcResult = [currentInstanceObj toBase58];
    NSDictionary *result = @{@"value" : objcResult};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGBitcoinLikeAddress::toBase58", nil);
        return;
    }

}

/**
 * Serializes the hash160 to a payment uri (i.e bitcoin:16UwLL9Risc3QfPqBUvKofHmBQ7wMtjvM)
 * @return A payment uri to this address
 * toPaymentUri(): string;
 * Checks if the given address is a P2SH address
 * @return True if the version byte matches the P2SH byte version of the address network parameters
 */
RCT_REMAP_METHOD(isP2SH,isP2SH:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGBitcoinLikeAddress::isP2SH, first argument should be an instance of LGBitcoinLikeAddress", nil);
        return;
    }
    LGBitcoinLikeAddress *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGBitcoinLikeAddress::isP2SH, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    BOOL objcResult = [currentInstanceObj isP2SH];
    NSDictionary *result = @{@"value" : @(objcResult)};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGBitcoinLikeAddress::isP2SH", nil);
        return;
    }

}

/**
 * Checks if the given address is a P2PKH address
 * @return True if the version byte matches the P2PKH byte version of the address network parameters
 */
RCT_REMAP_METHOD(isP2PKH,isP2PKH:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGBitcoinLikeAddress::isP2PKH, first argument should be an instance of LGBitcoinLikeAddress", nil);
        return;
    }
    LGBitcoinLikeAddress *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGBitcoinLikeAddress::isP2PKH, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    BOOL objcResult = [currentInstanceObj isP2PKH];
    NSDictionary *result = @{@"value" : @(objcResult)};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGBitcoinLikeAddress::isP2PKH", nil);
        return;
    }

}
@end
