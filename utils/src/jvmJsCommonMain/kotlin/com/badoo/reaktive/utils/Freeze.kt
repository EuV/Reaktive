package com.badoo.reaktive.utils

actual fun <T> T.freeze(): T = this

actual fun <T : Any> T.ensureNeverFrozen(): T = this