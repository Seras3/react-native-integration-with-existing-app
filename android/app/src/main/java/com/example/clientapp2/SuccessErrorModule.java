package com.example.clientapp2;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.function.Consumer;


public class SuccessErrorModule extends ReactContextBaseJavaModule {
    SuccessErrorModule(ReactApplicationContext context) {
        super(context);
    }

    public static Runnable onSuccess = () -> {
        Log.d("SuccessErrorModule", "On Success Called");
    };

    public static  Consumer<String> onError = (message) -> {
        Log.d("SuccessErrorModule", "On Error Called with message: " + message);
    };

    @ReactMethod
    public void finish(Boolean success) {
        Log.d("SuccessErrorModule", "Finish status :" + (success ? "success" : "failed"));
        onSuccess.run();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @ReactMethod
    public void sendError(String message) {
        Log.d("SuccessErrorModule", "error message: " + message);
        onError.accept(message);
    }


    @NonNull
    @Override
    public String getName() {
        return "SuccessErrorModule";
    }
}
