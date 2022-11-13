package com.example.clientapp2;
import android.util.Log;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;

public class CustomModule extends ReactContextBaseJavaModule {
    CustomModule(ReactApplicationContext context) {
        super(context);
    }

    @ReactMethod
    public void sendMessage(String to, String message) {
        Log.d("CustomModule", "SendMessage event called to: " + to
                + " and message: " + message);
    }

    @NonNull
    @Override
    public String getName() {
        return "CustomModule";
    }
}
