// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from erc20.djinni

package com.ledger.reactnative;

import co.ledger.core.ERC20Token;
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

/** Representation of ERC20Tokens. */
@ReactModule(name = "RCTCoreERC20Token")
public class RCTCoreERC20Token extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;
    private Map<String, ERC20Token> javaObjects;
    public Map<String, ERC20Token> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreERC20Token(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, ERC20Token>();
        WritableNativeMap.setUseNativeAccessor(true);
    }

    @Override
    public String getName()
    {
        return "RCTCoreERC20Token";
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
            promise.reject("Failed to release instance of RCTCoreERC20Token", "First parameter of RCTCoreERC20Token::release should be an instance of RCTCoreERC20Token");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, ERC20Token> elem : this.javaObjects.entrySet())
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
    public void init(String name, String symbol, String contractAddress, int numberOfDecimal, Promise promise) {
        ERC20Token javaResult = new ERC20Token(name, symbol, contractAddress, numberOfDecimal);

        String uuid = UUID.randomUUID().toString();
        this.javaObjects.put(uuid, javaResult);
        WritableNativeMap finalResult = new WritableNativeMap();
        finalResult.putString("type","RCTCoreERC20Token");
        finalResult.putString("uid",uuid);
        promise.resolve(finalResult);
    }
    @ReactMethod
    public void getName(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            ERC20Token javaObj = this.javaObjects.get(uid);
            String result = javaObj.getName();
            WritableNativeMap resultMap = new WritableNativeMap();
            resultMap.putString("value", result);
            promise.resolve(resultMap);
        }
        else
        {
            promise.reject("Failed to call RCTCoreERC20Token::getName", "First parameter of RCTCoreERC20Token::getName should be an instance of RCTCoreERC20Token");
        }
    }

    @ReactMethod
    public void getSymbol(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            ERC20Token javaObj = this.javaObjects.get(uid);
            String result = javaObj.getSymbol();
            WritableNativeMap resultMap = new WritableNativeMap();
            resultMap.putString("value", result);
            promise.resolve(resultMap);
        }
        else
        {
            promise.reject("Failed to call RCTCoreERC20Token::getSymbol", "First parameter of RCTCoreERC20Token::getSymbol should be an instance of RCTCoreERC20Token");
        }
    }

    @ReactMethod
    public void getContractAddress(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            ERC20Token javaObj = this.javaObjects.get(uid);
            String result = javaObj.getContractAddress();
            WritableNativeMap resultMap = new WritableNativeMap();
            resultMap.putString("value", result);
            promise.resolve(resultMap);
        }
        else
        {
            promise.reject("Failed to call RCTCoreERC20Token::getContractAddress", "First parameter of RCTCoreERC20Token::getContractAddress should be an instance of RCTCoreERC20Token");
        }
    }

    @ReactMethod
    public void getNumberOfDecimal(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            ERC20Token javaObj = this.javaObjects.get(uid);
            int result = javaObj.getNumberOfDecimal();
            WritableNativeMap resultMap = new WritableNativeMap();
            resultMap.putInt("value", result);
            promise.resolve(resultMap);
        }
        else
        {
            promise.reject("Failed to call RCTCoreERC20Token::getNumberOfDecimal", "First parameter of RCTCoreERC20Token::getNumberOfDecimal should be an instance of RCTCoreERC20Token");
        }
    }

}
