package com.example.daggerfactoryexample;

import dagger.Component;

@Component
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
}
