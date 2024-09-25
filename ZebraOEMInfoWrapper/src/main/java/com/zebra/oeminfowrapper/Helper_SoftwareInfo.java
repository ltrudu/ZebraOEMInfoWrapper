package com.zebra.oeminfowrapper;

import android.Manifest.permission;
import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;

import androidx.core.content.ContextCompat;

public class Helper_SoftwareInfo {

    protected static String sOs_Delta_Support_Version = null;
    protected static String sBuild_Fingerprint = null;
    protected static String sBuild_Base_Fingerprint = null;
    protected static String sBuild_Baseline = null;
    protected static String sBuild_Version_Security_Patch = null;
    protected static String sBuild_Security_Critical = null;
    protected static String sDevice_Patch_Version = null;
    protected static String sSys_Cfe_Patch_Version = null;
    protected static String sCrypto_Type = null;
    protected static String sZDM_Version = null;
    protected static String sMX_Version = null;


    public static void resetCachedValues()
    {
        sOs_Delta_Support_Version = null;
        sBuild_Fingerprint = null;
        sBuild_Base_Fingerprint = null;
        sBuild_Baseline = null;
        sBuild_Version_Security_Patch = null;
        sBuild_Security_Critical = null;
        sDevice_Patch_Version = null;
        sSys_Cfe_Patch_Version = null;
        sCrypto_Type = null;
        sZDM_Version = null;
        sMX_Version = null;
    }

    public static void getOs_Delta_Support_Version(Context context, IResultCallbacks callbackInterface)
    {
        if(sOs_Delta_Support_Version != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("Os_Delta_Support_Version already in cache.");
            }
            callbackInterface.onSuccess(sOs_Delta_Support_Version);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sOs_Delta_Support_Version = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://oem_info/oem.zebra.software/ro.os.delta.support.version"),
                tempCallbackInterface);

    }

    public static void getBuild_Fingerprint(Context context, IResultCallbacks callbackInterface)
    {
        if(sBuild_Fingerprint != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("Build_Fingerprint already in cache.");
            }
            callbackInterface.onSuccess(sBuild_Fingerprint);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sBuild_Fingerprint = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://oem_info/oem.zebra.software/ro.build.fingerprint"),
                tempCallbackInterface);

    }

    public static void getBuild_Base_Fingerprint(Context context, IResultCallbacks callbackInterface)
    {
        if(sBuild_Base_Fingerprint != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("Build_Base_Fingerprint already in cache.");
            }
            callbackInterface.onSuccess(sBuild_Base_Fingerprint);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sBuild_Base_Fingerprint = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://oem_info/oem.zebra.software/ro.build.base.fingerprint"),
                tempCallbackInterface);

    }

    public static void getBuild_Baseline(Context context, IResultCallbacks callbackInterface)
    {
        if(sBuild_Baseline != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("Build_Baseline already in cache.");
            }
            callbackInterface.onSuccess(sBuild_Baseline);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sBuild_Baseline = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://oem_info/oem.zebra.software/ro.build.baseline"),
                tempCallbackInterface);

    }

    public static void getBuild_Version_Security_Patch(Context context, IResultCallbacks callbackInterface)
    {
        if(sBuild_Version_Security_Patch != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("Build_Version_Security_Patch already in cache.");
            }
            callbackInterface.onSuccess(sBuild_Version_Security_Patch);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sBuild_Version_Security_Patch = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://oem_info/oem.zebra.software/ro.build.version.security.patch"),
                tempCallbackInterface);

    }

    public static void getBuild_Security_Critical(Context context, IResultCallbacks callbackInterface)
    {
        if(sBuild_Security_Critical != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("Build_Security_Critical already in cache.");
            }
            callbackInterface.onSuccess(sBuild_Security_Critical);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sBuild_Security_Critical = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://oem_info/oem.zebra.software/ro.build.security.critical"),
                tempCallbackInterface);

    }

    public static void getDevice_Patch_Version(Context context, IResultCallbacks callbackInterface)
    {
        if(sDevice_Patch_Version != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("Device_Patch_Version already in cache.");
            }
            callbackInterface.onSuccess(sDevice_Patch_Version);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sDevice_Patch_Version = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://oem_info/oem.zebra.software/ro.device.patch.version"),
                tempCallbackInterface);

    }


    public static void getSys_Cfe_Patch_Version(Context context, IResultCallbacks callbackInterface)
    {
        if(sSys_Cfe_Patch_Version != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("Sys_Cfe_Patch_Version already in cache.");
            }
            callbackInterface.onSuccess(sSys_Cfe_Patch_Version);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sSys_Cfe_Patch_Version = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://oem_info/oem.zebra.software/persist.sys.cfe.patchver"),
                tempCallbackInterface);

    }


    public static void getCrypto_Type(Context context, IResultCallbacks callbackInterface)
    {
        if(sCrypto_Type != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("Crypto_Type already in cache.");
            }
            callbackInterface.onSuccess(sCrypto_Type);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sCrypto_Type = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://oem_info/oem.zebra.software/ro.crypto.type"),
                tempCallbackInterface);

    }


    public static void getZDM_Version(Context context, IResultCallbacks callbackInterface)
    {
        if(sZDM_Version != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("ZDM_Version already in cache.");
            }
            callbackInterface.onSuccess(sZDM_Version);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sZDM_Version = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://oem_info/oem.zebra.software/zdm_version"),
                tempCallbackInterface);

    }


    public static void getMX_Version(Context context, IResultCallbacks callbackInterface)
    {
        if(sMX_Version != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("MX_Version already in cache.");
            }
            callbackInterface.onSuccess(sMX_Version);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sMX_Version = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://oem_info/oem.zebra.software/mx_version"),
                tempCallbackInterface);

    }



}
