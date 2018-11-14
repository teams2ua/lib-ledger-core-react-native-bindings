// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

#import "RCTCoreLGAccountCreationInfo.h"
#import "LGAccountCreationInfo.h"

@implementation RCTCoreLGAccountCreationInfo

//Export module
RCT_EXPORT_MODULE(RCTCoreLGAccountCreationInfo)

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
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAccountCreationInfo::release, first argument should be an instance of LGAccountCreationInfo", nil);
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
-(NSData *) hexStringToData: (NSString *)hexString 
{
    NSMutableData *data= [[NSMutableData alloc] init];
    unsigned char byte;
    char byteChars[3] = {'\0','\0','\0'};
    for (int i = 0; i < ([hexString length] / 2); i++)
    {
        byteChars[0] = [hexString characterAtIndex: i*2];
        byteChars[1] = [hexString characterAtIndex: i*2 + 1];
        byte = strtol(byteChars, NULL, 16);
        [data appendBytes:&byte length:1];
    }
    return data;
}
RCT_REMAP_METHOD(init, initWithIndex:(int)index
                              owners:(nonnull NSArray<NSString *> *)owners
                         derivations:(nonnull NSArray<NSString *> *)derivations
                          publicKeys:(NSArray<NSString *> *)publicKeys
                          chainCodes:(NSArray<NSString *> *)chainCodes withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    NSMutableArray *field_3 = [[NSMutableArray alloc] init];

    for (id publicKeys_elem in publicKeys)
    {
        NSData *field_3_elem = [self hexStringToData:publicKeys_elem];

        [field_3 addObject:field_3_elem];

    }
    NSMutableArray *field_4 = [[NSMutableArray alloc] init];

    for (id chainCodes_elem in chainCodes)
    {
        NSData *field_4_elem = [self hexStringToData:chainCodes_elem];

        [field_4 addObject:field_4_elem];

    }


    LGAccountCreationInfo * finalResult = [[LGAccountCreationInfo alloc] initWithIndex:index owners:owners derivations:derivations publicKeys:field_3 chainCodes:field_4];
    NSString *uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGAccountCreationInfo *rctImpl = (RCTCoreLGAccountCreationInfo *)[self.bridge moduleForName:@"CoreLGAccountCreationInfo"];
    [rctImpl.objcImplementations setObject:finalResult forKey:uuid];
    NSDictionary *result = @{@"type" : @"CoreLGAccountCreationInfo", @"uid" : uuid };
    if (result)
    {
        resolve(result);
    }
}

RCT_REMAP_METHOD(getIndex, getIndex:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)rejecter)
{
    LGAccountCreationInfo *objcImpl = (LGAccountCreationInfo *)[self.objcImplementations objectForKey:currentInstance[@"uid"]];
    NSDictionary *result = @{@"value" : @((int)objcImpl.index)};
    resolve(result);
}

RCT_REMAP_METHOD(getOwners, getOwners:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)rejecter)
{
    LGAccountCreationInfo *objcImpl = (LGAccountCreationInfo *)[self.objcImplementations objectForKey:currentInstance[@"uid"]];
    NSDictionary *result = @{@"value" : objcImpl.owners};
    resolve(result);
}

RCT_REMAP_METHOD(getDerivations, getDerivations:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)rejecter)
{
    LGAccountCreationInfo *objcImpl = (LGAccountCreationInfo *)[self.objcImplementations objectForKey:currentInstance[@"uid"]];
    NSDictionary *result = @{@"value" : objcImpl.derivations};
    resolve(result);
}

RCT_REMAP_METHOD(getPublicKeys, getPublicKeys:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)rejecter)
{
    LGAccountCreationInfo *objcImpl = (LGAccountCreationInfo *)[self.objcImplementations objectForKey:currentInstance[@"uid"]];
    NSDictionary *result = @{@"value" : objcImpl.publicKeys};
    resolve(result);
}

RCT_REMAP_METHOD(getChainCodes, getChainCodes:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)rejecter)
{
    LGAccountCreationInfo *objcImpl = (LGAccountCreationInfo *)[self.objcImplementations objectForKey:currentInstance[@"uid"]];
    NSDictionary *result = @{@"value" : objcImpl.chainCodes};
    resolve(result);
}

@end
