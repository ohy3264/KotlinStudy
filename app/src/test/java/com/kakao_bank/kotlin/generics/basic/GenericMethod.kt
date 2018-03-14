package com.kakao_bank.kotlin.generic

import java.util.ArrayList

object GenericMethod {

    fun <T> findItme(list: ArrayList<T>, item: T): Boolean {
        for (t in list) {
            if (item === t) {
                 return true
            }
        }
        return false
    }
}
