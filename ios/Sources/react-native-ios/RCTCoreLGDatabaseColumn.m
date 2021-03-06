// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from database.djinni

#import "RCTCoreLGDatabaseColumn.h"


@implementation RCTCoreLGDatabaseColumn
//Export module
RCT_EXPORT_MODULE(RCTCoreLGDatabaseColumn)

@synthesize bridge = _bridge;


+ (BOOL)requiresMainQueueSetup
{
    return NO;
}
RCT_REMAP_METHOD(release, release:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    [self baseRelease:currentInstance withResolver: resolve rejecter:reject];
}
RCT_REMAP_METHOD(log, logWithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    [self baseLogWithResolver:resolve rejecter:reject];
}
RCT_REMAP_METHOD(flush, flushWithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    [self baseFlushWithResolver:resolve rejecter:reject];
}
RCT_REMAP_METHOD(isNull, isNull:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    [self baseIsNull:currentInstance withResolver:resolve rejecter:reject];
}

/**
 * Get the type of the underlying SQL value.
 * @return The type of th
 */
RCT_REMAP_METHOD(getType,getType:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGDatabaseColumn::getType, first argument should be an instance of LGDatabaseColumnImpl", nil);
        return;
    }
    LGDatabaseColumnImpl *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGDatabaseColumnImpl::getType, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGDatabaseValueType objcResult = [currentInstanceObj getType];
    NSDictionary *result = @{@"value" : @(objcResult)};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGDatabaseColumnImpl::getType", nil);
        return;
    }

}

RCT_REMAP_METHOD(getName,getName:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGDatabaseColumn::getName, first argument should be an instance of LGDatabaseColumnImpl", nil);
        return;
    }
    LGDatabaseColumnImpl *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGDatabaseColumnImpl::getName, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    NSString * objcResult = [currentInstanceObj getName];
    NSDictionary *result = @{@"value" : objcResult};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGDatabaseColumnImpl::getName", nil);
        return;
    }

}
RCT_REMAP_METHOD(newInstance, newInstanceWithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    LGDatabaseColumnImpl *objcResult = [[LGDatabaseColumnImpl alloc] init];
    NSString *uuid = [[NSUUID UUID] UUIDString];
    NSArray *resultArray = [[NSArray alloc] initWithObjects:objcResult, uuid, nil];
    [self baseSetObject:resultArray];
    NSDictionary *result = @{@"type" : @"CoreLGDatabaseColumnImpl", @"uid" : uuid };
    if (!objcResult || !result)
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGDatabaseColumnImpl::init", nil);
        return;
    }
    resolve(result);
}
@end
