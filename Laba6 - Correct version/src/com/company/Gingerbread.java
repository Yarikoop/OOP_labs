package com.company;

public class Gingerbread extends Sweets {
    int max_value = 70;
    boolean setSweet(String name, int mass, int cont_ch){
        if (cont_ch<max_value){
            it_is(name,mass,max_value);
            return true;
        }
        else {
            System.out.println("Вміст шоколаду у прянику не може бути більше 70%\"");
            return false;
        }

    }
}
