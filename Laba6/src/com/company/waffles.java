package com.company;

public class waffles {
    String name;
    int mass,cont_ch;
    boolean it_is(String name, int mass, int cont_ch) {
        if (cont_ch > 100) {
            System.out.println("Вміст шоколаду у вафлі не може бути більше 50%");
            return false;
        }
        this.name = name;
        this.mass = mass;
        this.cont_ch = cont_ch;

        return true;

    }
}
