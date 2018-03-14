package com.kakao_bank.kotlin.generics.inout

import org.junit.Test

/**
 * Created by ohyowan on 2018. 3. 15..
 */
class StarProjections {
    private fun printArrayList(list: List<*>) {
        list.forEach {
            println("it $it")
        }
    }

    @Test
    fun test() {
        printArrayList(mutableListOf("AA", "BB", "CC"))
        printArrayList(mutableListOf(1, 2, 3))
        printArrayList(mutableListOf(true, false, true))
    }
}