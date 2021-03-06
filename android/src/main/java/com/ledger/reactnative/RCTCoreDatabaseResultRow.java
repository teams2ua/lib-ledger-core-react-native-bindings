// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from database.djinni

package com.ledger.reactnative;

import co.ledger.core.DatabaseBlob;
import co.ledger.core.DatabaseResultRow;
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

/**
 * A table of data representing a database query result, which is usually generated by executing a statement that queries the database.
 * DatabaseResultRow instances are not expected to live once DatabaseResultSet::next has been called on its parent result set.
 */
public class RCTCoreDatabaseResultRow extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, DatabaseResultRowImpl> javaObjects;
    public Map<String, DatabaseResultRowImpl> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreDatabaseResultRow(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, DatabaseResultRowImpl>();
        WritableNativeMap.setUseNativeAccessor(true);
    }

    @Override
    public String getName()
    {
        return "RCTCoreDatabaseResultRow";
    }
    @ReactMethod
    public void newInstance(Promise promise)
    {
        DatabaseResultRowImpl newInstance = new DatabaseResultRowImpl(this.reactContext);
        String uuid = UUID.randomUUID().toString();
        this.javaObjects.put(uuid, newInstance);
        WritableNativeMap finalResult = new WritableNativeMap();
        finalResult.putString("type","RCTCoreDatabaseResultRow");
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
            promise.reject("Failed to release instance of RCTCoreDatabaseResultRow", "First parameter of RCTCoreDatabaseResultRow::release should be an instance of RCTCoreDatabaseResultRow");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, DatabaseResultRowImpl> elem : this.javaObjects.entrySet())
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

    /**
     * Check if the value is NULL at the given position.
     * @return true if the value is NULL, false otherwise.
     */
    @ReactMethod
    public void isNullAtPos(ReadableMap currentInstance, int pos, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DatabaseResultRowImpl currentInstanceObj = this.javaObjects.get(sUid);

            boolean javaResult = currentInstanceObj.isNullAtPos(pos);
            WritableNativeMap result = new WritableNativeMap();
            result.putBoolean("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get the column name at the given position.
     * @return the column name.
     */
    @ReactMethod
    public void getColumnName(ReadableMap currentInstance, int pos, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DatabaseResultRowImpl currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.getColumnName(pos);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get the value at the given position. The underneath value has to be an 16bit integer otherwise this call will fail.
     * @return the value at the given position.
     */
    @ReactMethod
    public void getShortByPos(ReadableMap currentInstance, int pos, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DatabaseResultRowImpl currentInstanceObj = this.javaObjects.get(sUid);

            short javaResult = currentInstanceObj.getShortByPos(pos);
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
     * Get the value at the given position. The underneath value has to be an 16bit integer otherwise this call will fail.
     * @return the value at the given position.
     */
    @ReactMethod
    public void getIntByPos(ReadableMap currentInstance, int pos, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DatabaseResultRowImpl currentInstanceObj = this.javaObjects.get(sUid);

            int javaResult = currentInstanceObj.getIntByPos(pos);
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
     * Get the value at the given position. The underneath value has to be an 16bit integer otherwise this call will fail.
     * @return the value at the given position.
     */
    @ReactMethod
    public void getFloatByPos(ReadableMap currentInstance, int pos, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DatabaseResultRowImpl currentInstanceObj = this.javaObjects.get(sUid);

            float javaResult = currentInstanceObj.getFloatByPos(pos);
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
     * Get the value at the given position. The underneath value has to be an 16bit integer otherwise this call will fail.
     * @return the value at the given position.
     */
    @ReactMethod
    public void getDoubleByPos(ReadableMap currentInstance, int pos, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DatabaseResultRowImpl currentInstanceObj = this.javaObjects.get(sUid);

            double javaResult = currentInstanceObj.getDoubleByPos(pos);
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
     * Get the value at the given position. The underneath value has to be an 16bit integer otherwise this call will fail.
     * @return the value at the given position.
     */
    @ReactMethod
    public void getLongByPos(ReadableMap currentInstance, int pos, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DatabaseResultRowImpl currentInstanceObj = this.javaObjects.get(sUid);

            long javaResult = currentInstanceObj.getLongByPos(pos);
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
     * Get the value at the given position. The underneath value has to be an 16bit integer otherwise this call will fail.
     * @return the value at the given position.
     */
    @ReactMethod
    public void getStringByPos(ReadableMap currentInstance, int pos, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DatabaseResultRowImpl currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.getStringByPos(pos);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get the value at the given position. The underneath value has to be an 16bit integer otherwise this call will fail.
     * @return the value at the given position.
     */
    @ReactMethod
    public void getBlobByPos(ReadableMap currentInstance, int pos, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DatabaseResultRowImpl currentInstanceObj = this.javaObjects.get(sUid);

            DatabaseBlob javaResult = currentInstanceObj.getBlobByPos(pos);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreDatabaseBlob rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDatabaseBlob.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, (DatabaseBlobImpl)javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreDatabaseBlob");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
