package com.kakao_bank.kotlin.generics

import com.kakao_bank.kotlin.generic.GenericClass
import com.kakao_bank.kotlin.generic.GenericMethod
import com.kakao_bank.kotlin.generics.basic.GenericInterfaceClass
import org.junit.Test
import java.util.*

class KotlinGenericTest {
    @Test
    fun classGenericType() {
        System.out.println(GenericClass<String>("사자").t)
        System.out.println(GenericClass("고양이").t) //타입추론 가능시 생략가능
    }

    @Test
    fun interfaceGenericType() {
        val interfaceGenericType = GenericInterfaceClass()
        System.out.println(interfaceGenericType.doSomething(1))
        System.out.println(interfaceGenericType.doSomething2("2"))
    }

    @Test
    fun methodGenericType() {
        val animalList = ArrayList<String>()
        animalList.add("개")
        animalList.add("고양이")
        animalList.add("사자")
        System.out.println(GenericMethod.findItme(animalList, "사자"))
    }

    @Test
    fun methodGenericType2() {
       // val list = createArrayList() //타입을 명시하지 않으면 에러
        val stringList = createArrayList<String>()
    }

    private fun <T> createArrayList(): List<T> {
        return ArrayList()
    }
}