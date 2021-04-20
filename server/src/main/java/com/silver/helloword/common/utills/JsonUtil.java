package com.silver.helloword.common.utills;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;

/**
 * @ClassName JsonUtil
 * @Description TODO
 * @Author Tsui
 * @Date 2021/4/20 16:56
 * @Version 1.0
 **/

public class JsonUtil {
    private JsonUtil() {
    }

    /**
     * 避免指令重排序导致拿到半初始化的对象，保证线程可见性
     */
    private static volatile Gson gson;

    private static Gson getGson() {
        if (gson == null) {
            synchronized (JsonUtil.class) {
                if (gson == null) {
                    gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
                }
            }
        }
        return gson;
    }

    public static <T> String toJson(T object) {
        return getGson().toJson(object);
    }


    public static <T> T fromJson(String json, Type type) {
        return getGson().fromJson(json, type);
    }

    public static <T> T fromJson(String json, Class<T> clazz) {
        return getGson().fromJson(json, clazz);
    }
}
