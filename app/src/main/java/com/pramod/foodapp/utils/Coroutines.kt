package com.pramod.foodapp.utils

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.concurrent.ForkJoinWorkerThread

object Coroutines {
    fun main(work: suspend (()-> Unit))=
        CoroutineScope(Dispatchers.Main).launch {
            work()
        }





}