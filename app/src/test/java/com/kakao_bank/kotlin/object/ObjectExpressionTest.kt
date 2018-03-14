package com.kakao_bank.kotlin.`object`

import org.junit.Test

class ObjectExpressionTest{
    @Test
    fun test() {
        // object expression
        setOnClickListener(object : OnClickListener {
            override fun onClicked() {
                TODO("not implemented")
            }
        })
    }

    fun setOnClickListener(listener: OnClickListener) {

    }

    interface OnClickListener {
        fun onClicked()
    }
}
