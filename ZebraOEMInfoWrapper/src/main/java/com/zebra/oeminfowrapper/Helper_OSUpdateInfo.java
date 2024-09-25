package com.zebra.oeminfowrapper;

import android.content.Context;
import android.net.Uri;

public class Helper_OSUpdateInfo {

    protected static String sStatus = null;
    protected static String sDetail = null;
    protected static String sTs = null;

    public static void resetCachedValues()
    {
        String sStatus = null;
        String sDetail = null;
        String sTs = null;
    }


    public static void getStatus(Context context, IResultCallbacks callbackInterface)
    {
        if(sStatus != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("OS Update Status already in cache.");
            }
            callbackInterface.onSuccess(sStatus);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sStatus = message;
                callbackInterface.onSuccess(message);
            }

            @Override
            public void onError(String message) {
                callbackInterface.onError(message);
            }

            @Override
            public void onDebugStatus(String message) {
                callbackInterface.onDebugStatus(message);
            }
        };

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://oem_info/oem.zebra.osupdate/status"),
                tempCallbackInterface);

    }


    public static void getDetail(Context context, IResultCallbacks callbackInterface)
    {
        if(sDetail != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("OS Update Detail already in cache.");
            }
            callbackInterface.onSuccess(sDetail);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sDetail = message;
                callbackInterface.onSuccess(message);
            }

            @Override
            public void onError(String message) {
                callbackInterface.onError(message);
            }

            @Override
            public void onDebugStatus(String message) {
                callbackInterface.onDebugStatus(message);
            }
        };

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://oem_info/oem.zebra.osupdate/detail"),
                tempCallbackInterface);

    }


    public static void getTimeStamp(Context context, IResultCallbacks callbackInterface)
    {
        if(sTs != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("OS Update TimeStamp already in cache.");
            }
            callbackInterface.onSuccess(sTs);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sTs = message;
                callbackInterface.onSuccess(message);
            }

            @Override
            public void onError(String message) {
                callbackInterface.onError(message);
            }

            @Override
            public void onDebugStatus(String message) {
                callbackInterface.onDebugStatus(message);
            }
        };

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://oem_info/oem.zebra.osupdate/ts"),
                tempCallbackInterface);

    }
}
