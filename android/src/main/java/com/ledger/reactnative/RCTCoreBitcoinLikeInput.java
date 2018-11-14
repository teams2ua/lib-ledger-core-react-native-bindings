// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from bitcoin_like_wallet.djinni

package com.ledger.reactnative;

import co.ledger.core.Amount;
import co.ledger.core.BinaryCallback;
import co.ledger.core.BitcoinLikeInput;
import co.ledger.core.BitcoinLikeOutput;
import co.ledger.core.BitcoinLikeScript;
import co.ledger.core.DerivationPath;
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

/**Class representing Bitcoin inputs */
public class RCTCoreBitcoinLikeInput extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, BitcoinLikeInput> javaObjects;
    public Map<String, BitcoinLikeInput> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreBitcoinLikeInput(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, BitcoinLikeInput>();
        WritableNativeMap.setUseNativeAccessor(true);
    }

    @Override
    public String getName()
    {
        return "RCTCoreBitcoinLikeInput";
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
            promise.reject("Failed to release instance of RCTCoreBitcoinLikeInput", "First parameter of RCTCoreBitcoinLikeInput::release should be an instance of RCTCoreBitcoinLikeInput");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, BitcoinLikeInput> elem : this.javaObjects.entrySet())
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

    /** Returns the address of the input (if an address can be computed) */
    @ReactMethod
    public void getAddress(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeInput currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.getAddress();
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
     * Returns the public associated with the address. This value can be NULL if you are building a transaction with an
     * address which does not belong to your wallet.
     */
    @ReactMethod
    public void getPublicKeys(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeInput currentInstanceObj = this.javaObjects.get(sUid);

            ArrayList<byte[]> javaResult = currentInstanceObj.getPublicKeys();
            WritableNativeMap result = new WritableNativeMap();
            WritableNativeArray javaResult_list = new WritableNativeArray();
            for(byte[] javaResult_elem : javaResult)
            {
                String finalJavaResult = byteArrayToHexString(javaResult_elem);
                javaResult_list.pushString(finalJavaResult);
            }
            result.putArray("value", javaResult_list);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Returns the derivation path of this input if the address is owned by the wallet */
    @ReactMethod
    public void getDerivationPath(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeInput currentInstanceObj = this.javaObjects.get(sUid);

            ArrayList<DerivationPath> javaResult = currentInstanceObj.getDerivationPath();

            WritableNativeArray result = new WritableNativeArray();
            for (DerivationPath javaResult_elem : javaResult)
            {
                String javaResult_elem_uuid = UUID.randomUUID().toString();
                RCTCoreDerivationPath rctImpl_javaResult_elem = this.reactContext.getNativeModule(RCTCoreDerivationPath.class);
                rctImpl_javaResult_elem.getJavaObjects().put(javaResult_elem_uuid, javaResult_elem);
                WritableNativeMap result_elem = new WritableNativeMap();
                result_elem.putString("type","RCTCoreDerivationPath");
                result_elem.putString("uid",javaResult_elem_uuid);
                result.pushMap(result_elem);
            }

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Returns the value of the amount. Depending on the backend this value may not exist if the input is not owned by
     * the wallet.
     */
    @ReactMethod
    public void getValue(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeInput currentInstanceObj = this.javaObjects.get(sUid);

            Amount javaResult = currentInstanceObj.getValue();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreAmount rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreAmount.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreAmount");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get the transaction hash of the output spent by this input. The result can be NULL if the output is not owned by
     * the wallet
     */
    @ReactMethod
    public void getPreviousTxHash(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeInput currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.getPreviousTxHash();
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
     * Get the index at which the output is located in the transaction output spent by this input. The result can be
     * NULL if the input does not belong to the wallet
     *Check whether input
     *@return Boolean, true if input belongs to coinbase transaction (reward for mining a block)
     */
    @ReactMethod
    public void isCoinbase(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeInput currentInstanceObj = this.javaObjects.get(sUid);

            boolean javaResult = currentInstanceObj.isCoinbase();
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
     *Stored data cointained in coinbase
     *@return Optional String
     */
    @ReactMethod
    public void getCoinbase(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeInput currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.getCoinbase();
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
     *Get output index, it identifies which UTXO from tht transaction to spend
     *@return Optional 32 bits integer, index of previous transaction
     */
    @ReactMethod
    public void getPreviousOutputIndex(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeInput currentInstanceObj = this.javaObjects.get(sUid);

            Integer javaResult = currentInstanceObj.getPreviousOutputIndex();
            WritableNativeMap result = new WritableNativeMap();
            if (javaResult == null)
            {
                promise.resolve(javaResult);
                return;
            }
            result.putInt("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Retrieve the output spent by this input. Depending on the implementation this method may
     * use a lock to fetch data from a database. Therefore it may have poor performance, use with
     * caution.
     * @return The output spent by this input.
     */
    @ReactMethod
    public void getPreviousOuput(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeInput currentInstanceObj = this.javaObjects.get(sUid);

            BitcoinLikeOutput javaResult = currentInstanceObj.getPreviousOuput();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeOutput rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeOutput.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBitcoinLikeOutput");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Get ScriptSig of this input. The scriptsig is the first half of a script necessary to spend a previous output. */
    @ReactMethod
    public void getScriptSig(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeInput currentInstanceObj = this.javaObjects.get(sUid);

            byte[] javaResult = currentInstanceObj.getScriptSig();
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
    /** Parse the script sig to a [[BitcoinLikeScript]] */
    @ReactMethod
    public void parseScriptSig(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeInput currentInstanceObj = this.javaObjects.get(sUid);

            BitcoinLikeScript javaResult = currentInstanceObj.parseScriptSig();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeScript rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeScript.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBitcoinLikeScript");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Set the ScriptS to the given value
     * @param scriptSig The ScriptSig to use for this input
     */
    @ReactMethod
    public void setScriptSig(ReadableMap currentInstance, String scriptSig, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeInput currentInstanceObj = this.javaObjects.get(sUid);

            byte [] javaParam_0 = hexStringToByteArray(scriptSig);

            currentInstanceObj.setScriptSig(javaParam_0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Push data to the end of the current ScriptSig */
    @ReactMethod
    public void pushToScriptSig(ReadableMap currentInstance, String data, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeInput currentInstanceObj = this.javaObjects.get(sUid);

            byte [] javaParam_0 = hexStringToByteArray(data);

            currentInstanceObj.pushToScriptSig(javaParam_0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Set the sequence number of this input */
    @ReactMethod
    public void setSequence(ReadableMap currentInstance, int sequence, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeInput currentInstanceObj = this.javaObjects.get(sUid);

            currentInstanceObj.setSequence(sequence);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Get the sequence number of this input */
    @ReactMethod
    public void getSequence(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeInput currentInstanceObj = this.javaObjects.get(sUid);

            long javaResult = currentInstanceObj.getSequence();
            WritableNativeMap result = new WritableNativeMap();
            result.putDouble("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void getPreviousTransaction(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeInput currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreBinaryCallback javaParam_0 = RCTCoreBinaryCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.getPreviousTransaction(javaParam_0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Easy way to set the P2PKH script signature. Shorthand for input.pushToScriptSig(input.getPublicKeys()[0], signature) */
    @ReactMethod
    public void setP2PKHSigScript(ReadableMap currentInstance, String signature, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeInput currentInstanceObj = this.javaObjects.get(sUid);

            byte [] javaParam_0 = hexStringToByteArray(signature);

            currentInstanceObj.setP2PKHSigScript(javaParam_0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
