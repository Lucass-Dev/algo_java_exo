package com.company;

public class Main {

    public static void main(String[] args) {
        int score[] = {24, 15, 78, 54, 34, 90, 2};
        int moyenne = 0;
        int total = score.length;

        for (int i = 0; i < score.length; i++){
            System.out.println(score[i]);
        }


        for (int i = 0; i < score.length; i++){
            moyenne = moyenne + score[i];
        }

        System.out.println(moyenne/total);
    }
}
