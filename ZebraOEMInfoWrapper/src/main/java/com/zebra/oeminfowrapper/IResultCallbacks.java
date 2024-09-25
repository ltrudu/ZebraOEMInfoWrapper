package com.zebra.oeminfowrapper;

public interface IResultCallbacks {
    void onSuccess(final String message);
    void onError(final String message);
    void onDebugStatus(final String message);
}
