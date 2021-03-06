// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from addresses.djinni

package com.ledger.reactnative;

import co.ledger.core.EthereumLikeNetworkParameters;
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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class RCTCoreEthereumLikeNetworkParameters extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;
    private Map<String, EthereumLikeNetworkParameters> javaObjects;
    public Map<String, EthereumLikeNetworkParameters> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreEthereumLikeNetworkParameters(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, EthereumLikeNetworkParameters>();
        WritableNativeMap.setUseNativeAccessor(true);
    }

    @Override
    public String getName()
    {
        return "RCTCoreEthereumLikeNetworkParameters";
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
            promise.reject("Failed to release instance of RCTCoreEthereumLikeNetworkParameters", "First parameter of RCTCoreEthereumLikeNetworkParameters::release should be an instance of RCTCoreEthereumLikeNetworkParameters");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, EthereumLikeNetworkParameters> elem : this.javaObjects.entrySet())
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
    public static byte[] hexStringToByteArray(String hexString)
    {
        int hexStringLength = hexString.length();
        byte[] data = new byte[hexStringLength / 2];
        for (int i = 0; i < hexStringLength; i += 2)
        {
            data[i / 2] = (byte) ((Character.digit(hexString.charAt(i), 16) << 4) + Character.digit(hexString.charAt(i+1), 16));
        }
        return data;
    }
    static final String HEXES = "0123456789ABCDEF";
    public static String byteArrayToHexString( byte [] data)
    {
        if (data == null)
        {
            return null;
        }
        final StringBuilder hexStringBuilder = new StringBuilder( 2 * data.length );
        for ( final byte b : data )
        {
            hexStringBuilder.append(HEXES.charAt((b & 0xF0) >> 4)).append(HEXES.charAt((b & 0x0F)));
        }
        return hexStringBuilder.toString();
    }

    @ReactMethod
    public void init(String Identifier, String MessagePrefix, String ChainID, String XPUBVersion, ReadableArray AdditionalEIPs, long TimestampDelay, Promise promise) {
        byte [] javaParam_3 = hexStringToByteArray(XPUBVersion);

        ArrayList<String> javaParam_4 = new ArrayList<String>();
        for (int i = 0; i <  AdditionalEIPs.size(); i++)
        {
            String AdditionalEIPs_elem = AdditionalEIPs.getString(i);
            javaParam_4.add(AdditionalEIPs_elem);
        }
        EthereumLikeNetworkParameters javaResult = new EthereumLikeNetworkParameters(Identifier, MessagePrefix, ChainID, javaParam_3, javaParam_4, TimestampDelay);

        String uuid = UUID.randomUUID().toString();
        this.javaObjects.put(uuid, javaResult);
        WritableNativeMap finalResult = new WritableNativeMap();
        finalResult.putString("type","RCTCoreEthereumLikeNetworkParameters");
        finalResult.putString("uid",uuid);
        promise.resolve(finalResult);
    }
    @ReactMethod
    public void getIdentifier(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            EthereumLikeNetworkParameters javaObj = this.javaObjects.get(uid);
            String result = javaObj.getIdentifier();
            WritableNativeMap resultMap = new WritableNativeMap();
            resultMap.putString("value", result);
            promise.resolve(resultMap);
        }
        else
        {
            promise.reject("Failed to call RCTCoreEthereumLikeNetworkParameters::getIdentifier", "First parameter of RCTCoreEthereumLikeNetworkParameters::getIdentifier should be an instance of RCTCoreEthereumLikeNetworkParameters");
        }
    }

    @ReactMethod
    public void getMessagePrefix(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            EthereumLikeNetworkParameters javaObj = this.javaObjects.get(uid);
            String result = javaObj.getMessagePrefix();
            WritableNativeMap resultMap = new WritableNativeMap();
            resultMap.putString("value", result);
            promise.resolve(resultMap);
        }
        else
        {
            promise.reject("Failed to call RCTCoreEthereumLikeNetworkParameters::getMessagePrefix", "First parameter of RCTCoreEthereumLikeNetworkParameters::getMessagePrefix should be an instance of RCTCoreEthereumLikeNetworkParameters");
        }
    }

    @ReactMethod
    public void getChainID(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            EthereumLikeNetworkParameters javaObj = this.javaObjects.get(uid);
            String result = javaObj.getChainID();
            WritableNativeMap resultMap = new WritableNativeMap();
            resultMap.putString("value", result);
            promise.resolve(resultMap);
        }
        else
        {
            promise.reject("Failed to call RCTCoreEthereumLikeNetworkParameters::getChainID", "First parameter of RCTCoreEthereumLikeNetworkParameters::getChainID should be an instance of RCTCoreEthereumLikeNetworkParameters");
        }
    }

    @ReactMethod
    public void getXPUBVersion(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            EthereumLikeNetworkParameters javaObj = this.javaObjects.get(uid);
            byte[] result = javaObj.getXPUBVersion();
            String converted_result = byteArrayToHexString(result);
            WritableNativeMap resultMap = new WritableNativeMap();
            resultMap.putString("value", converted_result);
            promise.resolve(resultMap);
        }
        else
        {
            promise.reject("Failed to call RCTCoreEthereumLikeNetworkParameters::getXPUBVersion", "First parameter of RCTCoreEthereumLikeNetworkParameters::getXPUBVersion should be an instance of RCTCoreEthereumLikeNetworkParameters");
        }
    }

    @ReactMethod
    public void getAdditionalEIPs(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            EthereumLikeNetworkParameters javaObj = this.javaObjects.get(uid);
            ArrayList<String> result = javaObj.getAdditionalEIPs();
            WritableNativeArray converted_result = new WritableNativeArray();
            for (String result_elem : result)
            {
                converted_result.pushString(result_elem);
            }
            promise.resolve(converted_result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreEthereumLikeNetworkParameters::getAdditionalEIPs", "First parameter of RCTCoreEthereumLikeNetworkParameters::getAdditionalEIPs should be an instance of RCTCoreEthereumLikeNetworkParameters");
        }
    }

    @ReactMethod
    public void getTimestampDelay(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            EthereumLikeNetworkParameters javaObj = this.javaObjects.get(uid);
            double result = javaObj.getTimestampDelay();
            WritableNativeMap resultMap = new WritableNativeMap();
            resultMap.putDouble("value", result);
            promise.resolve(resultMap);
        }
        else
        {
            promise.reject("Failed to call RCTCoreEthereumLikeNetworkParameters::getTimestampDelay", "First parameter of RCTCoreEthereumLikeNetworkParameters::getTimestampDelay should be an instance of RCTCoreEthereumLikeNetworkParameters");
        }
    }

}
