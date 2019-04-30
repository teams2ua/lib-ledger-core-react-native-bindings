// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

package com.ledger.reactnative;

import co.ledger.core.TrustIndicator;
import co.ledger.core.TrustLevel;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/** The trust indicator of an operation. */
@ReactModule(name = "RCTCoreTrustIndicator")
public class RCTCoreTrustIndicator extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, TrustIndicator> javaObjects;
    public Map<String, TrustIndicator> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreTrustIndicator(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, TrustIndicator>();
        WritableNativeMap.setUseNativeAccessor(true);
    }

    @Override
    public String getName()
    {
        return "RCTCoreTrustIndicator";
    }
    @ReactMethod
    public void release(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            this.javaObjects.remove(uid);
            promise.resolve(0);
        }
        else
        {
            promise.reject("Failed to release instance of RCTCoreTrustIndicator", "First parameter of RCTCoreTrustIndicator::release should be an instance of RCTCoreTrustIndicator");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, TrustIndicator> elem : this.javaObjects.entrySet())
        {
            result.pushString(elem.getKey());
        }
        promise.resolve(result);
    }
    @ReactMethod
    public void flush(Promise promise)
    {
        this.javaObjects.clear();
        promise.resolve(0);
    }
    @ReactMethod
    public void isNull(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            if (this.javaObjects.get(uid) == null)
            {
                promise.resolve(true);
                return;
            }
            else
            {
                promise.resolve(false);
                return;
            }
        }
        promise.resolve(true);
    }

    @ReactMethod
    public void getTrustWeight(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            TrustIndicator currentInstanceObj = this.javaObjects.get(sUid);

            int javaResult = currentInstanceObj.getTrustWeight();
            WritableNativeMap result = new WritableNativeMap();
            result.putInt("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void getTrustLevel(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            TrustIndicator currentInstanceObj = this.javaObjects.get(sUid);

            TrustLevel javaResult = currentInstanceObj.getTrustLevel();
            WritableNativeMap result = new WritableNativeMap();
            int finalJavaResult = javaResult.ordinal();
            result.putInt("value", finalJavaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void getConflictingOperationUids(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            TrustIndicator currentInstanceObj = this.javaObjects.get(sUid);

            ArrayList<String> javaResult = currentInstanceObj.getConflictingOperationUids();
            WritableNativeMap result = new WritableNativeMap();
            WritableNativeArray javaResult_list = new WritableNativeArray();
            for(String javaResult_elem : javaResult)
            {
                javaResult_list.pushString(javaResult_elem);
            }
            result.putArray("value", javaResult_list);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void getOrigin(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            TrustIndicator currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.getOrigin();
            WritableNativeMap result = new WritableNativeMap();
            result.putString("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
