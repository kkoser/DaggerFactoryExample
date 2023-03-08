package com.example.mylibrary

import javax.inject.Inject

class MyBiggerDependency @Inject constructor(private val myDependency: MyDependency) {
}
