package com.example.latte.ec.sign;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.latte.ec.database.DatabaseManager;
import com.example.latte.ec.database.UserProfile;

/**
 * Created by CYT on 2018/5/2.
 */

public class SignHandler {

    public static void onSignUp(String response){
        final JSONObject profileJson = JSON.parseObject(response).getJSONObject("data");
        final long useId = profileJson.getLong("userId");
        final String name = profileJson.getString("name");
        final String avatar = profileJson.getString("avatar");
        final String gender = profileJson.getString("gender");
        final String address = profileJson.getString("address");

        final UserProfile profile = new UserProfile(useId,name,avatar,gender,address);
        DatabaseManager.getInstance().getDao().insert(profile);
    }
}