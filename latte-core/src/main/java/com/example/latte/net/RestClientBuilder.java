package com.example.latte.net;

import com.example.latte.net.callback.IError;
import com.example.latte.net.callback.IFailure;
import com.example.latte.net.callback.IRequest;
import com.example.latte.net.callback.ISuccess;

import java.util.Map;
import java.util.WeakHashMap;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/**
 * Created by CYT on 2018/4/20.
 */

public class RestClientBuilder {

    private  String mUrl;
    private  static final WeakHashMap<String,Object> PARAMS = RestCreator.getParams();
    private  IRequest mIRequest;
    private  ISuccess mISuccess;
    private  IError mIError;
    private  IFailure mIFailure;
    private  RequestBody mBody;

    RestClientBuilder(){
    }

    public final RestClientBuilder url(String url){
        this.mUrl = url;
        return this;
    }

    public final RestClientBuilder params(WeakHashMap<String,Object> params){
        PARAMS.putAll(params);
        return this;
    }

    public final RestClientBuilder params(String key,Object value){
        PARAMS.put(key,value);
        return this;
    }

    public final RestClientBuilder raw(String raw){
        this.mBody = RequestBody.create(MediaType.parse("application/json;charset=UTF-8"),raw);
        return this;
    }

    public final RestClientBuilder onRequest(IRequest request){
        this.mIRequest = request;
        return this;
    }

    public final RestClientBuilder success(ISuccess success){
        this.mISuccess = success;
        return this;
    }

    public final RestClientBuilder failure(IFailure failure){
        this.mIFailure = failure;
        return this;
    }

    public final RestClientBuilder error(IError error){
        this.mIError = error;
        return this;
    }


    public final RestClient build(){
        return new RestClient(mUrl,PARAMS,mIRequest,mISuccess,mIError,mIFailure,mBody);
    }
}
