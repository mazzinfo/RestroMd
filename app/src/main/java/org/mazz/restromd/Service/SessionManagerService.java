package org.mazz.restromd.Service;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashMap;

public class SessionManagerService {


    // Shared Preferences reference
    SharedPreferences pref;

    // Editor reference for Shared preferences
    SharedPreferences.Editor editor;

    // Context
    Context _context;

    // Shared pref mode
    int PRIVATE_MODE = 0;

    // Sharedpref file name
    private static final String PREFER_NAME = "restromd";

    // All Shared Preferences Keys
    private static final String IS_USER_LOGIN = "IsUserLoggedIn";

    // User name (make variable public to access from outside)
    public static final String KEY_NAME = "name";

    // Email address (make variable public to access from outside)
    public static final String KEY_EMAIL = "email";

    public static final String KEY_REST_API_URL = "rest_api_url";

    // Constructor
    public SessionManagerService(Context context){
        this._context = context;
        pref = _context.getSharedPreferences(PREFER_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    //Create login session
    public void createUserLoginSession(String name, String email){
        // Storing login value as TRUE
        editor.putBoolean(IS_USER_LOGIN, true);

        // Storing name in pref
        editor.putString(KEY_NAME, name);

        // Storing email in pref
        editor.putString(KEY_EMAIL, email);

        // commit changes
        editor.commit();
    }




    public void setRestApiUrlSession(String url){
        // Storing rest api url in pref
        editor.putString(KEY_REST_API_URL, url);

        // commit changes
        editor.commit();
    }


    public HashMap<String, String> getRestApiUrl(){

        //Use hashmap to store url
        HashMap<String, String> url = new HashMap<String, String>();

        // rest api url
        url.put(KEY_REST_API_URL, pref.getString(KEY_REST_API_URL, ""));

        // return url
        return url;
    }



    /**
     * Check login method will check user login status
     * If false it will redirect user to login page
     * Else do anything
     * */
//    public boolean checkLogin(){
//        // Check login status
//        if(!this.isUserLoggedIn()){
//
//            // user is not logged in redirect him to Login Activity
//            Intent i = new Intent(_context, LoginActivity.class);
//
//            // Closing all the Activities from stack
//            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//
//            // Add new Flag to start new Activity
//            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//
//            // Staring Login Activity
//            _context.startActivity(i);
//
//            return true;
//        }
//        return false;
//    }



    /**
     * Get stored session data
     * */
    public HashMap<String, String> getUserDetails(){

        //Use hashmap to store user credentials
        HashMap<String, String> user = new HashMap<String, String>();

        // user name
        user.put(KEY_NAME, pref.getString(KEY_NAME, null));

        // user email id
        user.put(KEY_EMAIL, pref.getString(KEY_EMAIL, null));

        // return user
        return user;
    }

    /**
     * Clear session details
     * */
//    public void logoutUser(){
//
//        // Clearing all user data from Shared Preferences
//        editor.clear();
//        editor.commit();
//
//        // After logout redirect user to Login Activity
//        Intent i = new Intent(_context, LoginActivity.class);
//
//        // Closing all the Activities
//        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//
//        // Add new Flag to start new Activity
//        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//
//        // Staring Login Activity
//        _context.startActivity(i);
//    }


    // Check for login
    public boolean isUserLoggedIn(){
        return pref.getBoolean(IS_USER_LOGIN, false);
    }
}
