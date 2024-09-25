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

public class Helper_SecureInfo {

    protected static String sIMEI = null;
    protected static String sSerialNumber = null;
    protected static String sBtMacAddress = null;
    protected static String sProductModel = null;
    protected static String sIdentityDeviceID = null;
    protected static String sWifiMac = null;
    protected static String sWifiAPMac = null;
    protected static String sWifiSSID= null;
    protected static String sEthernetMac = null;


    public static void resetCachedValues()
    {
        sIMEI = null;
        sSerialNumber = null;
        sBtMacAddress = null;
        sProductModel = null;
        sIdentityDeviceID = null;
        sWifiMac = null;
        sWifiAPMac = null;
        sWifiSSID= null;
        sEthernetMac = null;
    }

    // This method will return the serial number in the string passed through the onSuccess method
    public static void getSerialNumber(Context context, IResultCallbacks callbackInterface)
    {
        if(sSerialNumber != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("Serial number already in cache.");
            }
            callbackInterface.onSuccess(sSerialNumber);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 29) {
            returnSerialUsingAndroidAPIs(context, callbackInterface);
        } else {
            returnSerialUsingZebraAPIs(context, callbackInterface);
        }
    }

    @SuppressLint({"MissingPermission", "ObsoleteSdkInt", "HardwareIds"})
    private static void returnSerialUsingAndroidAPIs(Context context, IResultCallbacks callbackInterface) {
        if (android.os.Build.VERSION.SDK_INT < 26) {
            sSerialNumber = Build.SERIAL;
            callbackInterface.onSuccess(Build.SERIAL);
        } else {
            if (ContextCompat.checkSelfPermission(context, permission.READ_PHONE_STATE) == PackageManager.PERMISSION_GRANTED) {
                sSerialNumber = Build.getSerial();
                callbackInterface.onSuccess(Build.getSerial());
            } else {
                callbackInterface.onError("Please grant READ_PHONE_STATE permission");
            }
        }
    }

    private static void returnSerialUsingZebraAPIs(Context context, final IResultCallbacks callbackInterface) {
        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sSerialNumber = message;
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

        new RetrieveOEMInfoTask()
            .executeAsync(context, Uri.parse("content://oem_info/oem.zebra.secure/build_serial"),
                    tempCallbackInterface);
    }

    // This method will return the imei number in the string passed through the onSuccess method
    public static void getIMEINumber(Context context, IResultCallbacks callbackInterface)
    {
        if(sIMEI != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("IMEI number already in cache.");
            }
            callbackInterface.onSuccess(sIMEI);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 29) {
            returnImeiUsingAndroidAPIs(context, callbackInterface);
        } else {
            returnImeiUsingZebraAPIs(context, callbackInterface);
        }
    }

    @SuppressLint({"MissingPermission", "ObsoleteSdkInt", "HardwareIds" })
    private static void returnImeiUsingAndroidAPIs(Context context, IResultCallbacks callbackInterface) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        if (android.os.Build.VERSION.SDK_INT < 26) {String imei = telephonyManager.getDeviceId();
            if (imei != null && !imei.isEmpty()) {
                sIMEI = imei;
                callbackInterface.onSuccess(imei);
            } else {
                callbackInterface.onError("Could not get IMEI number");
            }
        } else {
            if (ContextCompat.checkSelfPermission(context, permission.READ_PHONE_STATE) == PackageManager.PERMISSION_GRANTED) {
                String imei = telephonyManager.getImei();
                if (imei != null && !imei.isEmpty()) {
                    sIMEI = imei;
                    callbackInterface.onSuccess(imei);
                } else {
                    callbackInterface.onError("Could not get IMEI number");
                }
            } else {
                callbackInterface.onError("Please grant READ_PHONE_STATE permission");
            }
        }
    }

    private static void returnImeiUsingZebraAPIs(Context context, final IResultCallbacks callbackInterface) {
        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sIMEI = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://oem_info/wan/imei"),
            tempCallbackInterface);
    }

    public static void getBtMacAddress(Context context, IResultCallbacks callbackInterface)
    {
        if(sBtMacAddress != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("BT Mac address already in cache.");
            }
            callbackInterface.onSuccess(sBtMacAddress);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 23) {
            returnBtMacAddressUsingAndroidAPIs(context, callbackInterface);
        } else {
            returnBtMacAddressUsingZebraAPIs(context, callbackInterface);
        }
    }

    private static void returnBtMacAddressUsingZebraAPIs(Context context, IResultCallbacks callbackInterface) {
        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sBtMacAddress = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://oem_info/oem.zebra.secure/bt_mac"),
                tempCallbackInterface);
    }

    private static void returnBtMacAddressUsingAndroidAPIs(Context context, IResultCallbacks callbackInterface) {
        BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        String macAddress = mBluetoothAdapter.getAddress();
        if(callbackInterface != null)
        {
            callbackInterface.onSuccess(macAddress);
        }
    }

    public static void getProductModel(Context context, IResultCallbacks callbackInterface)
    {
        if(sProductModel != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("Product Model already in cache.");
            }
            callbackInterface.onSuccess(sProductModel);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sProductModel = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://oem_info/oem.zebra.secure/ro_product_model"),
                tempCallbackInterface);

    }

    public static void getIdentityDeviceID(Context context, IResultCallbacks callbackInterface)
    {
        if(sIdentityDeviceID != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("IdentityDeviceID already in cache.");
            }
            callbackInterface.onSuccess(sIdentityDeviceID);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sIdentityDeviceID = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://oem_info/oem.zebra.secure/identity_device_id"),
                tempCallbackInterface);

    }

    public static void getWifiMacAddress(Context context, IResultCallbacks callbackInterface)
    {
        if(sWifiMac != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("Wifi Mac Address already in cache.");
            }
            callbackInterface.onSuccess(sWifiMac);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sWifiMac = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://oem_info/oem.zebra.secure/wifi_mac"),
                tempCallbackInterface);

    }

    public static void getWifiAPMacAddress(Context context, IResultCallbacks callbackInterface)
    {
        if(sWifiAPMac != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("Wifi AP Mac Address already in cache.");
            }
            callbackInterface.onSuccess(sWifiAPMac);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sWifiAPMac = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://oem_info/oem.zebra.secure/wifi_ap_mac"),
                tempCallbackInterface);
    }

    public static void getWifiSSID(Context context, IResultCallbacks callbackInterface)
    {
        if(sWifiSSID != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("Wifi SSID already in cache.");
            }
            callbackInterface.onSuccess(sWifiSSID);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sWifiSSID = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://oem_info/oem.zebra.secure/wifi_ssid"),
                tempCallbackInterface);
    }

    public static void getEthernetMacAddress(Context context, IResultCallbacks callbackInterface)
    {
        if(sEthernetMac != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("Ethernet Mac Address already in cache.");
            }
            callbackInterface.onSuccess(sEthernetMac);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sEthernetMac = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://oem_info/oem.zebra.secure/ethernet_mac"),
                tempCallbackInterface);
    }


}
