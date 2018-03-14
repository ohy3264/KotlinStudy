package com.kakao_bank.kotlin.generics.inout;


import java.util.ArrayList;

/*      T : read/write 모두 가능
        ? extends T : read만 가능한 서브타입 와일드카드
        ? super T : write만 가능한 슈퍼 타입 와일드카드*/

public class WildcardGeneric {
    private void printAll(ArrayList<? extends Output<String>> items) {
        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).isArgment("")){
                System.out.println("item : " + items.get(i).isArgment(""));
            }
        }

       /* items.add(new Output<String>() {
            @Override
            public boolean isArgment(String name) {
                return false;
            }
        });*/
    }

    private void addItem(ArrayList<? super Output<String>> items) {
        /*for (int i = 0; i < items.size(); i++) {
            if(items.get(i).isArgment("")){
                System.out.println("item : " + items.get(i).isArgment(""));
            }
        }*/

        items.add(new Output<String>() {
            @Override
            public boolean isArgment(String name) {
                return false;
            }
        });
    }

    interface Output<T> {
        boolean isArgment(T name);
    }
}
