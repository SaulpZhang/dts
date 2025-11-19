package com.cityu.dts.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * Json utility class
 */
public final class JsonUtils {
    private static final Gson gson = new Gson();

    private JsonUtils() {
    }

    public static <T> T fromJson(String json, Class<T> clazz) {
        return gson.fromJson(json, clazz);
    }

    public static <T> T fromJson(String json, TypeToken<T> typeToken) {
        return gson.fromJson(json, typeToken.getType());
    }

    public static String toJson(Object obj) {
        return gson.toJson(obj);
    }
}
