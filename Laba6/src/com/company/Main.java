package com.company;

public class Main {

    public static void main(String[] args) {
        chocolate_sweets sweets = new chocolate_sweets();
        gingerbread pranik = new gingerbread();
        waffles wafle = new waffles();
        to_sort sort = new to_sort();
        sweets.it_is("Romashka",15,50);
        sort.add_to_present(sweets.name,sweets.mass,sweets.cont_ch);

        pranik.it_is("Chocolate Bum",25,65);
        sort.add_to_present(pranik.name,pranik.mass,pranik.cont_ch);

        wafle.it_is("Zebra",8,15);
        sort.add_to_present(wafle.name,wafle.mass,wafle.cont_ch);

        sort.cont_of_present();
        sort.sort_names();
        sort.finder();
    }
}
