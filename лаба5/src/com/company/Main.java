package com.company;

public class Main {

    public static void main(String[] args) {
        int max_value = 0;
        int flag = 0;
        for_laba5_p_two p_two = new for_laba5_p_two();
        words wordsM = new words();
        sentences sentencesM = new sentences();
        String text = " Yesterday." + " All my troubles seemed so far away."
                + " Now it looks as though       they`re here     to stay." +
                " Oh, I believe in yesterday. ";
        text = text.trim();
        if (!text.isEmpty()) {
            if (sentencesM.do_sentenses(text).length != 1) {
                for (String i:wordsM.do_words(text)) {
                    for (String j:sentencesM.do_sentenses(text)){
                        if (j.toLowerCase().contains(i.toLowerCase())){
                            flag +=1;
                        }
                    }
                    if (flag > max_value) {
                        max_value = flag;
                    }
                    flag=0;

                }
                System.out.printf("Знайдено %d речень з однаковими словами \n", max_value);
            }
            else {
                System.out.println("Ви ввели тільки одне речення ");
            }
        }
        else {
            System.out.println("Текст відсутній");
        }
        System.out.println("Редагований текст:");
        System.out.println(p_two.tru_text(text));

    }
}