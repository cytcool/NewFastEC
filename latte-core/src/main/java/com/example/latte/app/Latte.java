package com.example.latte.app;

import android.content.Context;

import java.util.WeakHashMap;

/**
 * 工具类
 * 所以所有方法都应该是静态方法
 * Created by CYT on 2018/4/18.
 */

public final class Latte {

    public static Configurator init(Context context){
        getConfiguration().put(ConfigType.APPLICATTION_CONTEXT.name(),context.getApplicationContext());
        return Configurator.getInstance();
    }

    private static WeakHashMap<String,Object> getConfiguration(){
        return Configurator.getInstance().getLatteConfigs();
    }
}
