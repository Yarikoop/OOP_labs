package com.company;

import org.w3c.dom.ls.LSOutput;

public class chocolate_sweets {
    String name;
    int mass,cont_ch;
    boolean it_is(String name, int mass, int cont_ch ){
        if (cont_ch>100){
            System.out.println("Вміст шоколаду не може бути більше 100%");
            return false;
        }
        this.name = name;
        this.mass = mass;
        this.cont_ch = cont_ch;

        return true;

    }
}
