// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from logger.djinni

package com.ledger.reactnative;

import co.ledger.core.ExecutionContext;
import co.ledger.core.LogPrinter;
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
 *Class representing a printer of errors, warnings, infos ... (at runtime)
 *Printed logs are stored in path set by PathResolver::resolveLogFilePath
 */
public class RCTCoreLogPrinter extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, LogPrinterImpl> javaObjects;
    public Map<String, LogPrinterImpl> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreLogPrinter(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, LogPrinterImpl>();
        WritableNativeMap.setUseNativeAccessor(true);
    }

    @Override
    public String getName()
    {
        return "RCTCoreLogPrinter";
    }
    @ReactMethod
    public void newInstance(Promise promise)
    {
        LogPrinterImpl newInstance = new LogPrinterImpl(this.reactContext);
        String uuid = UUID.randomUUID().toString();
        this.javaObjects.put(uuid, newInstance);
        WritableNativeMap finalResult = new WritableNativeMap();
        finalResult.putString("type","RCTCoreLogPrinter");
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
            promise.reject("Failed to release instance of RCTCoreLogPrinter", "First parameter of RCTCoreLogPrinter::release should be an instance of RCTCoreLogPrinter");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, LogPrinterImpl> elem : this.javaObjects.entrySet())
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
     *Print different encountered errors
     *@param message, string
     */
    @ReactMethod
    public void printError(ReadableMap currentInstance, String message, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            LogPrinterImpl currentInstanceObj = this.javaObjects.get(sUid);

            currentInstanceObj.printError(message);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Print useful information messages
     *@param message, string
     */
    @ReactMethod
    public void printInfo(ReadableMap currentInstance, String message, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            LogPrinterImpl currentInstanceObj = this.javaObjects.get(sUid);

            currentInstanceObj.printInfo(message);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Print debug messages
     *@param message string
     */
    @ReactMethod
    public void printDebug(ReadableMap currentInstance, String message, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            LogPrinterImpl currentInstanceObj = this.javaObjects.get(sUid);

            currentInstanceObj.printDebug(message);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Print warning messages
     *@param message, string
     */
    @ReactMethod
    public void printWarning(ReadableMap currentInstance, String message, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            LogPrinterImpl currentInstanceObj = this.javaObjects.get(sUid);

            currentInstanceObj.printWarning(message);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Print messages from APDU comand interpretation loop
     *@param message, string
     */
    @ReactMethod
    public void printApdu(ReadableMap currentInstance, String message, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            LogPrinterImpl currentInstanceObj = this.javaObjects.get(sUid);

            currentInstanceObj.printApdu(message);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Print critical errors causing a core dump or error from which recovery is impossible
     *@param message, string
     */
    @ReactMethod
    public void printCriticalError(ReadableMap currentInstance, String message, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            LogPrinterImpl currentInstanceObj = this.javaObjects.get(sUid);

            currentInstanceObj.printCriticalError(message);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get context in which printer is executed (print)
     *@return ExecutionContext object
     */
    @ReactMethod
    public void getContext(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            LogPrinterImpl currentInstanceObj = this.javaObjects.get(sUid);

            ExecutionContext javaResult = currentInstanceObj.getContext();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreExecutionContext rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreExecutionContext.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, (ExecutionContextImpl)javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreExecutionContext");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
