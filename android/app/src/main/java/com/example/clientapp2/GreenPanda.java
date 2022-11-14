package com.example.clientapp2;

import android.app.Activity;
import android.content.Intent;

import java.util.function.Consumer;

public class GreenPanda {

    public void verifyPhone(Activity currentActivity, Runnable onSuccess, Consumer<String> onError) {
        SuccessErrorModule.onSuccess = onSuccess;
        SuccessErrorModule.onError = onError;

        Intent reactIntent = new Intent(currentActivity, ReactActivity.class);
        currentActivity.startActivity(reactIntent);
    }
}
