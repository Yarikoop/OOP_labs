package com.company;

public class ChocolateSweets extends Sweets {
    int max_value = 100;

    boolean setSweet(String name, int mass, int cont_ch) {
        if (cont_ch < max_value) {
            it_is(name, mass, max_value);
            return true;
        } else {
            System.out.println("Вміст шоколаду у цукерці не може бути більше 100%\"");
            return false;
        }

    }
}