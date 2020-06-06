package com.company;

public class sentences {
    String[] do_sentenses(String text){
        String[] sentense = text.split("\\s*(!|\\.|\\?)\\s*");
        return sentense;

    }

}
