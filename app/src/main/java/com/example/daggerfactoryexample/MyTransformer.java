package com.example.daggerfactoryexample;

import androidx.annotation.NonNull;

import com.example.mylibrary.MyBiggerDependency;
import com.example.mylibrary.MyDependency;

import javax.inject.Inject;

public class MyTransformer {
    @Inject
    public MyTransformer(@NonNull MyBiggerDependency myBiggerDependency) {

    }
}
