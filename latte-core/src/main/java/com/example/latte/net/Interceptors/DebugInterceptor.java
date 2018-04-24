package com.example.latte.net.Interceptors;

import java.io.IOException;
import okhttp3.Response;

/**
 * Created by CYT on 2018/4/24.
 */

public class DebugInterceptor extends BaseInterceptor {

    private final String DEBUG_URL;
    

    @Override
    public Response intercept(Chain chain) throws IOException {
        return null;
    }
}
