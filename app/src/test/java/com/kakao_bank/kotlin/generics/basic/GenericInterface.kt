package com.kakao_bank.kotlin.generic

interface GenericInterface<T1, T2> {
    fun doSomething(t: T2): T1

    fun doSomething2(t: T1): T2
}
