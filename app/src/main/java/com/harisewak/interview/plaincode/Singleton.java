package com.harisewak.interview.plaincode;

import kotlin.jvm.JvmField;

object Singleton private constructor() {

    private var single_instance: Singleton? = null

    lateinit var s: String

    // Constructor
    init
    {
        s = "Hello I am a string part of Singleton class"
    }

    //@JvmField
    fun getInstance() : Singleton
    {
        if (single_instance == null)
            single_instance = Singleton()

        return single_instance
    }
}
