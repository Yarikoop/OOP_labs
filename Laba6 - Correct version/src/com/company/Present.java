package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Present{

    ArrayList<String> all_names = new ArrayList<String>();
    ArrayList<Integer> all_masses = new ArrayList<Integer>();


    int present_mass,o = 0;
    //int low_border=40;
    //int up_border=70;


    void add_to_present(String name, int mass, int cont_ch){
        if (o>9){
            System.out.println("Ви добавили останні солодощі в подарунок, якщо спробуєте додати ще, ваш подарунок взірветься і" +
                    "викличе неприємності");
        }
        all_names.add(name);
        all_masses.add(mass);
        o++;

    }
    void sort_names(){
        Collections.sort(all_names);
        System.out.println("\nСортування за іменами:");
        for (String name: all_names){
            System.out.println(name);
        }

    }
    void cont_of_present(){
        System.out.println("Вміст подарунку:");
        for (int i: all_masses){
            present_mass += i;
        }
        for (int i=0; i < all_names.size(); i++){
            System.out.printf("\"%s\"\n", all_names.get(i));
        }
        System.out.printf("Маса подарунку: %d\n", present_mass);
    }
   /* void finder(){
        System.out.println("\nРезультат пошуку:");
        for (int i=0; i<all_names.size(); i++){
            if (int_data_names[i][1]>low_border && int_data_names[i][1]<up_border){
                System.out.printf("\"%s\" відповідає заданому діапазону\n", all_names[i]);
                l=1;
            }
        }
        if (l==0){
            System.out.println("Пошук не дав результатів");
        }
    }*/

}
