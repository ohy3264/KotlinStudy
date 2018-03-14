package com.kakao_bank.kotlin.object;

import org.junit.Test;

public class JavaObjectTest {
    @Test
    public void test() {
        KotlinObjectTest.Payroll.INSTANCE.getAllEmployees().add(new KotlinObjectTest.Person("noah"));
        KotlinObjectTest.Payroll.INSTANCE.calculateSalary();
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClicked() {

            }
        });
    }

    public  void setOnClickListener(OnClickListener listener) {

    }

    public interface OnClickListener {
        void onClicked();
    }
}

