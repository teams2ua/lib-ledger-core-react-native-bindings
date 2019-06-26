package com.ledger.reactnative;

import android.support.annotation.Nullable;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.ubinder.Ubinder;

import android.util.Base64;

import java.util.function.BiConsumer;
import java.util.function.Consumer;


public class RCTUbinder extends ReactContextBaseJavaModule {

    private Ubinder _ubinder;

    public RCTUbinder(ReactApplicationContext reactContext)
    {
        super(reactContext);
        _ubinder = new Ubinder(
                new BiConsumer<Long, byte[]>() {
                    @Override
                    public void accept(final Long req, byte[] arr) {
                        WritableMap params = Arguments.createMap();
                        sendEvent("onRequest", params);
                    }
                },
                new BiConsumer<Long, byte[]>() {
                    @Override
                    public void accept(final Long req, byte[] arr) {
                        WritableMap params = Arguments.createMap();
                        sendEvent("onResponse", params);
                    }
                },
                new Consumer<byte[]>() {
                    @Override
                    public void accept(byte[] arr) {
                        WritableMap params = Arguments.createMap();
                        sendEvent("onNotification", params);
                    }
                });
    }

    private void sendEvent(String eventName,
                           @Nullable WritableMap params) {
        getReactApplicationContext()
                .getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)
                .emit(eventName, params);
    }

    @Override
    public String getName()
    {
        return "RCTUbinder";
    }

    @ReactMethod
    public void SendRequest(String reqId, String data)
    {
        byte[] decodedData = Base64.decode(data, Base64.DEFAULT);
        _ubinder.SendRequest(Long.parseLong(reqId), decodedData);
    }

    @ReactMethod
    public void SendResponse(String reqId, String data)
    {
        byte[] decodedData = Base64.decode(data, Base64.DEFAULT);
        _ubinder.SendResponse(Long.parseLong(reqId), decodedData);
    }

    @ReactMethod
    public void SendNotification(String data)
    {
        byte[] decodedData = Base64.decode(data, Base64.DEFAULT);
        _ubinder.SendNotification(decodedData);
    }
}
