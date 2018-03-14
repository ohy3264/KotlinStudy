package com.kakao_bank.kotlin.generics.basic

import com.kakao_bank.kotlin.generic.GenericInterface


class GenericInterfaceClass : GenericInterface<String, Int> {
    override fun doSomething(t: Int): String {
        return t.toString()
    }

    override fun doSomething2(t: String): Int {
        return t.toInt()
    }
}
