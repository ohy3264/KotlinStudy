package com.kakao_bank.kotlin.`object`

import org.junit.Test


class KotlinObjectTest {

    @Test
    fun test() {
        Payroll.allEmployees.add(Person("noah"))
        Payroll.calculateSalary()
        Singleton.getInstance("")
    }

    // object는 class 를 정의하고 instance 를 만드는 것을 동시에 한다
    // but 생성자를 가질수 없음
    object Payroll {
        val allEmployees = arrayListOf<Person>()
        fun calculateSalary() {
            for (person in allEmployees) {
            }
        }
    }

    data class Person(var name: String)

    // 생성자를 가지려면 아래와 같이 생성
    class Singleton private constructor(val name: String) {
        companion object {
            @Volatile
            private var INSTANCE: Singleton? = null

            fun getInstance(name: String): Singleton = INSTANCE ?: synchronized(this) {
                INSTANCE ?: Singleton(name).also { INSTANCE = it }
            }
        }
    }
}