package com.zebra.oeminfowrapper;

import android.content.pm.Signature;

public class Constants {
    public static final long SEC_IN_MS = 1000;
    public static final long MIN_IN_MS = SEC_IN_MS * 60;
    public static long MAX_EMDK_TIMEOUT_IN_MS = 10 * MIN_IN_MS; // 10 minutes
    public static long WAIT_PERIOD_BEFORE_RETRY_EMDK_RETRIEVAL_IN_MS = 2 * SEC_IN_MS; // 2 seconds
}
