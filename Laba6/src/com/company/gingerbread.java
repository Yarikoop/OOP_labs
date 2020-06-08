package com.company;

public class gingerbread extends chocolate_sweets {
    String name;
    int mass,cont_ch;
    boolean it_is(String name, int mass, int cont_ch) {
        if (cont_ch > 70) {
            System.out.println("Вміст шоколаду у прянику не може бути більше 70%");
            return false;
        }
        this.name = name;
        this.mass = mass;
        this.cont_ch = cont_ch;
        return true;

    }
}
