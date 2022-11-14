package com.example.clientapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mButton;
    private GreenPanda mGreenPanda = new GreenPanda();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.button);
        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.button:
                mGreenPanda.verifyPhone(
                        this,
                        () -> Log.d("FromMain", "Finish with Success"),
                        (message) -> Log.d("FromMain", "Error: " + message)
                );
        }
    }
}