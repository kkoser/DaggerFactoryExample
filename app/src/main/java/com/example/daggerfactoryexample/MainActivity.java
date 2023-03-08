package com.example.daggerfactoryexample;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

import javax.inject.Inject;

public class MainActivity extends Activity {

    @Inject
    MyTransformer myTransformer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        DaggerActivityComponent.create().inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (myTransformer == null) {
            throw new IllegalArgumentException("asdf");
        }
    }
}
