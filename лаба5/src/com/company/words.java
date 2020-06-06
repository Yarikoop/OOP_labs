package com.company;

public class words {
    String [] do_words(String text){
        String[] word_s = text.split("\\s*(\\s|,|!|\\.)\\s*");

        return word_s;

    }
}
