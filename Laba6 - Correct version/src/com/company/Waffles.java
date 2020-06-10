package com.company;

public class Waffles extends Sweets{
    int max_value = 50;

    boolean setSweet(String name, int mass, int cont_ch) {
        if (cont_ch < max_value) {
            it_is(name, mass, max_value);
            return true;
        } else {
            System.out.println("Вміст шоколаду у вафлі не може бути більше 50%\"");
            return false;
        }
    }
}
