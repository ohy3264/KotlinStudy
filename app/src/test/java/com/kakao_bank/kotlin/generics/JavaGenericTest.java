package com.kakao_bank.kotlin.generics;

import com.kakao_bank.kotlin.generic.GenericClass;
import com.kakao_bank.kotlin.generics.basic.GenericInterfaceClass;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class JavaGenericTest {
    @Test
    public void classGenericType() {
        GenericClass<String> genericType = new GenericClass("사자");
        System.out.println(genericType.getT());
    }

    @Test
    public void interfaceGenericType() {
        GenericInterfaceClass interfaceGenericType = new GenericInterfaceClass();
        System.out.println(interfaceGenericType.doSomething(1));
        System.out.println(interfaceGenericType.doSomething2("2"));
    }

    @Test
    public void methodGenericType2() {
        List list = createArrayList();
        List<String> stringList = createArrayList();
    }

   private <T> List<T> createArrayList() {
        return new ArrayList<>();
    }
}
