// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from random.djinni

package com.ledger.reactnative;

import co.ledger.core.RandomNumberGenerator;
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

/** Class to generate random numbers. */
public class RCTCoreRandomNumberGenerator extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, RandomNumberGeneratorImpl> javaObjects;
    public Map<String, RandomNumberGeneratorImpl> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreRandomNumberGenerator(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, RandomNumberGeneratorImpl>();
        WritableNativeMap.setUseNativeAccessor(true);
    }

    @Override
    public String getName()
    {
        return "RCTCoreRandomNumberGenerator";
    }
    @ReactMethod
    public void newInstance(Promise promise)
    {
        RandomNumberGeneratorImpl newInstance = new RandomNumberGeneratorImpl(this.reactContext);
        String uuid = UUID.randomUUID().toString();
        this.javaObjects.put(uuid, newInstance);
        WritableNativeMap finalResult = new WritableNativeMap();
        finalResult.putString("type","RCTCoreRandomNumberGenerator");
        finalResult.putString("uid",uuid);
        promise.resolve(finalResult);
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
            promise.reject("Failed to release instance of RCTCoreRandomNumberGenerator", "First parameter of RCTCoreRandomNumberGenerator::release should be an instance of RCTCoreRandomNumberGenerator");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, RandomNumberGeneratorImpl> elem : this.javaObjects.entrySet())
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

    /**
     * Generates random bytes.
     * @params size number of bytes to generate
     * @return 'size' random bytes
     */
    @ReactMethod
    public void getRandomBytes(ReadableMap currentInstance, int size, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            RandomNumberGeneratorImpl currentInstanceObj = this.javaObjects.get(sUid);

            byte[] javaResult = currentInstanceObj.getRandomBytes(size);
            WritableNativeMap result = new WritableNativeMap();
            String finalJavaResult = byteArrayToHexString(javaResult);
            result.putString("value", finalJavaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Generates random 32 bits integer.
     * @return random 32 bits integer
     */
    @ReactMethod
    public void getRandomInt(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            RandomNumberGeneratorImpl currentInstanceObj = this.javaObjects.get(sUid);

            int javaResult = currentInstanceObj.getRandomInt();
            WritableNativeMap result = new WritableNativeMap();
            result.putInt("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Generates random 64 bits integer.
     * @return random 64 bits integer
     */
    @ReactMethod
    public void getRandomLong(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            RandomNumberGeneratorImpl currentInstanceObj = this.javaObjects.get(sUid);

            long javaResult = currentInstanceObj.getRandomLong();
            WritableNativeMap result = new WritableNativeMap();
            result.putDouble("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Generates random byte.
     * @return random byte
     */
    @ReactMethod
    public void getRandomByte(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            RandomNumberGeneratorImpl currentInstanceObj = this.javaObjects.get(sUid);

            byte javaResult = currentInstanceObj.getRandomByte();
            WritableNativeMap result = new WritableNativeMap();
            result.putInt("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
