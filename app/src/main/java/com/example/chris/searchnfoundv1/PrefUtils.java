package com.example.chris.searchnfoundv1;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by #Chris on 26.04.2016.
 */
public class PrefUtils {

    public static final String CURRENT_USER_EMAIL = "CURRENT_USER_EMAIL";
    public static final String USER_PASSWORD = "USER_PASSWORD";

    public static String getFromPrefs(Context context, String email, String key, String defaultValue) {

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);

        if(email != null){

        }

        return null;
    }

}
