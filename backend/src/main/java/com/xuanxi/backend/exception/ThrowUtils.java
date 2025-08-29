package com.xuanxi.backend.exception;

public class ThrowUtils {


    /**
     * 条件成立 抛出异常
     *
     * @param condition
     * @param runtimeException
     */
    public static void throwIf(boolean condition, RuntimeException runtimeException) {
        if (condition) {
            throw runtimeException;
        }
    }
}
