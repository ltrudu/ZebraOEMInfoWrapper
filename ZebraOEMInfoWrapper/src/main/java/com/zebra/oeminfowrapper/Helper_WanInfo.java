package com.zebra.oeminfowrapper;

import android.content.Context;
import android.net.Uri;

public class Helper_WanInfo {

    protected static String sEid  = null;
    protected static String sImei  = null;
    protected static String sTelephony_Sim_Operator  = null;
    protected static String sAllESIMProfilesInfo1  = null;
    protected static String sAllESIMProfilesInfo2  = null;
    protected static String sCarrierName1  = null;
    protected static String sCarrierName2 = null;
    protected static String sEid1  = null;
    protected static String sEid2  = null;
    protected static String sIccid1  = null;
    protected static String sIccid2 = null;
    protected static String sImei1  = null;
    protected static String sImei2  = null;
    protected static String sImsi1  = null;
    protected static String sImsi2  = null;
    protected static String sPreferredAPN    = null;
    protected static String sSimState1   = null;
    protected static String sSimState2   = null;


    public static void resetCachedValues()
    {
        sEid  = null;
        sImei  = null;
        sTelephony_Sim_Operator  = null;
        sAllESIMProfilesInfo1  = null;
        sAllESIMProfilesInfo2  = null;
        sCarrierName1  = null;
        sCarrierName2 = null;
        sEid1  = null;
        sEid2  = null;
        sIccid1  = null;
        sIccid2 = null;
        sImei1  = null;
        sImei2  = null;
        sImsi1  = null;
        sImsi2  = null;
        sPreferredAPN    = null;
        sSimState1   = null;
        sSimState2   = null;
    }

    public static void getEid(Context context, IResultCallbacks callbackInterface)
    {
        if(sEid != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("Eid already in cache.");
            }
            callbackInterface.onSuccess(sEid);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sEid = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://oem_info/wan/eid"),
                tempCallbackInterface);

    }


    public static void getImei(Context context, IResultCallbacks callbackInterface)
    {
        if(sImei != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("Imei already in cache.");
            }
            callbackInterface.onSuccess(sImei);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sImei = message;
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



    public static void getTelephony_Sim_Operator(Context context, IResultCallbacks callbackInterface)
    {
        if(sTelephony_Sim_Operator != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("Telephony_Sim_Operator already in cache.");
            }
            callbackInterface.onSuccess(sTelephony_Sim_Operator);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sTelephony_Sim_Operator = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://oem_info/wan/telephony_sim_operator"),
                tempCallbackInterface);

    }

    public static void getAllESIMProfilesInfo1(Context context, IResultCallbacks callbackInterface)
    {
        if(sAllESIMProfilesInfo1 != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("AllESIMProfilesInfo1 already in cache.");
            }
            callbackInterface.onSuccess(sAllESIMProfilesInfo1);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sAllESIMProfilesInfo1 = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://com.zebra.phone.provider/wan/AllESIMProfilesInfo1"),
                tempCallbackInterface);

    }

    public static void getAllESIMProfilesInfo2(Context context, IResultCallbacks callbackInterface)
    {
        if(sAllESIMProfilesInfo2 != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("AllESIMProfilesInfo2 already in cache.");
            }
            callbackInterface.onSuccess(sAllESIMProfilesInfo2);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sAllESIMProfilesInfo2 = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://com.zebra.phone.provider/wan/AllESIMProfilesInfo2"),
                tempCallbackInterface);

    }


    public static void getCarrierName1(Context context, IResultCallbacks callbackInterface)
    {
        if(sCarrierName1 != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("CarrierName1 already in cache.");
            }
            callbackInterface.onSuccess(sCarrierName1);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sCarrierName1 = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://com.zebra.phone.provider/wan/CarrierName1"),
                tempCallbackInterface);

    }

    public static void getCarrierName2(Context context, IResultCallbacks callbackInterface)
    {
        if(sCarrierName2 != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("CarrierName2 already in cache.");
            }
            callbackInterface.onSuccess(sCarrierName2);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sCarrierName2 = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://com.zebra.phone.provider/wan/CarrierName2"),
                tempCallbackInterface);

    }


    public static void getEid1(Context context, IResultCallbacks callbackInterface)
    {
        if(sEid1 != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("Eid1 already in cache.");
            }
            callbackInterface.onSuccess(sEid1);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sEid1 = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://com.zebra.phone.provider/wan/Eid1"),
                tempCallbackInterface);

    }


    public static void getEid2(Context context, IResultCallbacks callbackInterface)
    {
        if(sEid2 != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("Eid2 already in cache.");
            }
            callbackInterface.onSuccess(sEid2);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sEid2 = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://com.zebra.phone.provider/wan/Eid2"),
                tempCallbackInterface);

    }


    public static void getIccid1(Context context, IResultCallbacks callbackInterface)
    {
        if(sIccid1 != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("Iccid1 already in cache.");
            }
            callbackInterface.onSuccess(sIccid1);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sIccid1 = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://com.zebra.phone.provider/wan/Iccid1"),
                tempCallbackInterface);

    }



    public static void getIccid2(Context context, IResultCallbacks callbackInterface)
    {
        if(sIccid2 != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("Iccid2 already in cache.");
            }
            callbackInterface.onSuccess(sIccid2);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sIccid2 = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://com.zebra.phone.provider/wan/Iccid2"),
                tempCallbackInterface);

    }

    public static void getImei1(Context context, IResultCallbacks callbackInterface)
    {
        if(sImei1 != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("Imei1 already in cache.");
            }
            callbackInterface.onSuccess(sImei1);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sImei1 = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://com.zebra.phone.provider/wan/Imei1"),
                tempCallbackInterface);

    }


    public static void getImei2(Context context, IResultCallbacks callbackInterface)
    {
        if(sImei2 != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("Imei2 already in cache.");
            }
            callbackInterface.onSuccess(sImei2);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sImei2 = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://com.zebra.phone.provider/wan/Imei2"),
                tempCallbackInterface);

    }


    public static void getImsi1(Context context, IResultCallbacks callbackInterface)
    {
        if(sImsi1 != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("Imsi1 already in cache.");
            }
            callbackInterface.onSuccess(sImsi1);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sImsi1 = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://com.zebra.phone.provider/wan/Imsi1"),
                tempCallbackInterface);

    }


    public static void getImsi2(Context context, IResultCallbacks callbackInterface)
    {
        if(sImsi2 != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("Imsi2 already in cache.");
            }
            callbackInterface.onSuccess(sImsi2);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sImsi2 = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://com.zebra.phone.provider/wan/Imsi2"),
                tempCallbackInterface);

    }



    public static void getPreferredAPN(Context context, IResultCallbacks callbackInterface)
    {
        if(sPreferredAPN != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("PreferredAPN already in cache.");
            }
            callbackInterface.onSuccess(sPreferredAPN);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sPreferredAPN = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://com.zebra.phone.provider/wan/PreferredAPN"),
                tempCallbackInterface);

    }


    public static void getSimState1(Context context, IResultCallbacks callbackInterface)
    {
        if(sSimState1 != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("SimState1 already in cache.");
            }
            callbackInterface.onSuccess(sSimState1);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sSimState1 = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://com.zebra.phone.provider/wan/SimState1"),
                tempCallbackInterface);

    }


    public static void getSimState2(Context context, IResultCallbacks callbackInterface)
    {
        if(sSimState2 != null)
        {
            if(callbackInterface != null)
            {
                callbackInterface.onDebugStatus("SimState2 already in cache.");
            }
            callbackInterface.onSuccess(sSimState2);
            return;
        }

        IResultCallbacks tempCallbackInterface = new IResultCallbacks() {
            @Override
            public void onSuccess(String message) {
                sSimState2 = message;
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

        new RetrieveOEMInfoTask().executeAsync(context, Uri.parse("content://com.zebra.phone.provider/wan/SimState2"),
                tempCallbackInterface);

    }





}
