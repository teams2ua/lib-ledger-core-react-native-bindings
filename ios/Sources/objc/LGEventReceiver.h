// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from emitter.djinni

#import <Foundation/Foundation.h>
@class LGEvent;


/** Class respresenting an event receiver. */
@protocol LGEventReceiver

/**
 * Method triggered when an event occurs.
 * @param event, Event object that triggers this method
 */
- (void)onEvent:(nullable LGEvent *)event;

@end
