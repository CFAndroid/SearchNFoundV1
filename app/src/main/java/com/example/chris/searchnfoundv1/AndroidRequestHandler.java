package com.example.chris.searchnfoundv1;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by #Chris on 10.04.2016.
 */
public class AndroidRequestHandler extends StringRequest {

    private Map<String, String> params;

    public AndroidRequestHandler(Map<String, String> params, Response.Listener<String> listener, Response.ErrorListener errorListener) {

        super(Method.POST, params.get("Url"), listener, errorListener);
        this.params = params;

    }

    @Override
    public Map<String, String> getParams(){

        return this.params;

    }

}