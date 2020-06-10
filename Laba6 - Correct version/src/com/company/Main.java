package com.company;

public class Main {

    public static void main(String[] args) {
        Waffles waf = new Waffles();
        ChocolateSweets sweets = new ChocolateSweets();
        Gingerbread ging = new Gingerbread();
        Present pres = new Present();
        if(sweets.setSweet("Romashka",15,50)){
            pres.add_to_present("Romashka",15,50);
        }

        if(ging.setSweet("Chocolate Bum",25,65)){
            pres.add_to_present("Chocolate Bum",25,65);
        }

        if(ging.setSweet("Zebra",8,15)){
            pres.add_to_present("Zebra",8,15);
        }



        pres.cont_of_present();
        pres.sort_names();
        //sort.finder();
    }
}
