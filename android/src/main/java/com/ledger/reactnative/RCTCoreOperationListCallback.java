// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from callback.djinni

package com.ledger.reactnative;

import co.ledger.core.Error;
import co.ledger.core.Operation;
import co.ledger.core.OperationListCallback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**
 *Callback triggered by main completed task,
 *returns optional result as list of template type T
 */
public class RCTCoreOperationListCallback extends OperationListCallback {
    public Promise promise;
    public ReactApplicationContext reactContext;
    public static RCTCoreOperationListCallback initWithPromise(Promise promise, ReactApplicationContext reactContext)
    {
        RCTCoreOperationListCallback callback = new RCTCoreOperationListCallback();
        callback.promise = promise;
        callback.reactContext = reactContext;
        return callback;
    }
    /**
     * Method triggered when main task complete
     * @params result optional of type list<T>, non null if main task failed
     * @params error optional of type Error, non null if main task succeeded
     */
    public void onCallback(ArrayList<Operation> result, Error error) {
        try
        {
            if (error != null && error.getMessage().length() > 0)
            {
                this.promise.reject(error.toString(), error.getMessage());
            }
            WritableNativeArray converted_result = new WritableNativeArray();
            for (Operation result_elem : result)
            {
                String uuid = UUID.randomUUID().toString();
                RCTCoreOperation rctImpl_result_elem = this.reactContext.getNativeModule(RCTCoreOperation.class);
                rctImpl_result_elem.getJavaObjects().put(uuid, result_elem);
                WritableNativeMap converted_result_elem = new WritableNativeMap();
                converted_result_elem.putString("type","RCTCoreOperation");
                converted_result_elem.putString("uid",uuid);
                converted_result.pushMap(converted_result_elem);
            }

            this.promise.resolve(converted_result);
        }
        catch(Exception e)
        {
            this.promise.reject(e.toString(), e.getMessage());
        }
    }
}
