package com.kakao_bank.kotlin.nested

import android.view.View

/**
 * Created by ohyowan on 2018. 3. 15..
 */
class OuterClass {
    private val bar: Int = 1

    class Nested { //default nested 이며 static으로 생성
        fun foo() = 2
    }

    inner class Inner {
        fun foo() = bar
    }

    //그 외 Anonymous inner classes == kotlin object expression
   /* button?.setOnClickListener(object : View.OnClickListener{
        override fun onClick(v: View?) {

        }
    })*/
}

val nested = OuterClass.Nested().foo()
val inner = OuterClass().Inner().foo()