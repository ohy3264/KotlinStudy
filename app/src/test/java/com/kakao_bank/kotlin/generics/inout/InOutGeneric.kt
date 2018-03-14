package com.kakao_bank.kotlin.generics.inout

import org.junit.Test
import java.util.ArrayList


/*      T : read/write 모두 가능
        in T : Java의 ? super T와 같고 input의 약자이며 write only
        out T : Java의 ? extends T와 같고 output의 약자이며 read only
                                                                   */
class InOutGeneric {
    private fun printAll(items: ArrayList<out Output<String>>) {
        for (i in items.indices) {
            if (items[i].isArgment("")) {
                println("item : " + items[i].isArgment(""))
            }
        }
    }

    private fun addItem(items: ArrayList<in Output<String>>) {
        //object Expression
        items.add(object : Output<String> {
            override fun isArgment(name: String): Boolean {
                return false
            }
        })
    }

    @Test
    fun test() {
        val list = ArrayList<Output<String>>()
        list.add(object : Output<String> {
            override fun isArgment(name: String): Boolean {
                return true
            }
        })

        printAll(list)
    }

    interface Output<in T> {
        fun isArgment(name: T): Boolean
    }
}
