package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class to_sort {
    ArrayList<String> names = new ArrayList<String>();
    ArrayList<Integer> masses = new ArrayList<Integer>();
    ArrayList<Integer> cont_chs = new ArrayList<Integer>();
    int pres_mass = 0;
    String[] all_names = new String[10];
    int[][] int_data_names = new int[10][2];
    int o,l = 0;
    int low_border=40;
    int up_border=70;


    void add_to_present(String name, int mass, int cont_ch){
        if (o>=10){
            System.out.println("Ви добавили останні солодощі в подарунок, якщо спробуєте додати ще, ваш подарунок взірветься і" +
                    "викличе неприємності");
        }
        names.add(name);
        masses.add(mass);
        cont_chs.add(cont_ch);
        all_names[o]=name;
        int_data_names[o][0]=mass;
        int_data_names[o][1]=cont_ch;
        o++;

    }
    void sort_names(){
        Collections.sort(names);
        System.out.println("\nСортування за іменами:");
        for (String name: names){
            System.out.println(name);
        }

    }
    void cont_of_present(){
        for (int i: masses){
            pres_mass += i;
        }
        for (int i=0; i < names.size(); i++){
            System.out.printf("\"%s\":\tмаса: %d г;\tвміст шоколаду: %d %%\n", names.get(i),masses.get(i),cont_chs.get(i));
        }
        System.out.printf("Маса подарунку: %d\n", pres_mass);
    }
    void finder(){
        System.out.println("\nРезультат пошуку:");
        for (int i=0; i<names.size(); i++){
            if (int_data_names[i][1]>low_border && int_data_names[i][1]<up_border){
                System.out.printf("\"%s\" відповідає заданому діапазону\n", all_names[i]);
                l=1;
            }
        }
        if (l==0){
            System.out.println("Пошук не дав результатів");
        }
    }

}
