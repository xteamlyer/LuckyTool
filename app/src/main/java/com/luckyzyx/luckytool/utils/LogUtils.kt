package com.luckyzyx.luckytool.utils

import android.util.Log
import com.luckyzyx.luckytool.BuildConfig
import org.lsposed.lsparanoid.Obfuscate

@Suppress("MemberVisibilityCanBePrivate")
@Obfuscate
object LogUtils {
    const val globalTag = "LuckyTool"
    var enable = BuildConfig.DEBUG

    // Keep only warnings and errors in module/runtime logs.
    fun d(tag: String, method: String, msg: String, send: Boolean = enable) = Unit

    fun e(tag: String, method: String, msg: String, send: Boolean = enable) {
        if (send) Log.e(globalTag, "$tag: $method -> $msg")
    }

    fun i(tag: String, method: String, msg: String, send: Boolean = enable) = Unit

    fun v(tag: String, method: String, msg: String, send: Boolean = enable) = Unit

    fun w(tag: String, method: String, msg: String, send: Boolean = enable) {
        if (send) Log.w(globalTag, "$tag: $method -> $msg")
    }
}
