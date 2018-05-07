package com.example.latte.app;

import com.example.latte.utils.storage.LattePreference;

/**
 * Created by CYT on 2018/5/2.
 */

public class AccountManager {

    private enum SignTag{
        SIGN_TAG
    }

    public static void setSignState(){
        LattePreference.setAppFlag(SignTag.SIGN_TAG.name(), true);
    }

    private static boolean isSignIn(){
        return LattePreference.getAppFlag(SignTag.SIGN_TAG.name());
    }

    public static void checkAccount(IUserChecker checker){
        if (isSignIn()){
            checker.onSignIn();
        }else {
            checker.onNotSignIn();
        }
    }
}
