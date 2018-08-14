// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from websocket_client.djinni

#import <Foundation/Foundation.h>
@class LGWebSocketConnection;


@protocol LGWebSocketClient

- (void)connect:(nonnull NSString *)url
     connection:(nullable LGWebSocketConnection *)connection;

- (void)send:(nullable LGWebSocketConnection *)connection
        data:(nonnull NSString *)data;

- (void)disconnect:(nullable LGWebSocketConnection *)connection;

@end