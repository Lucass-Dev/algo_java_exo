package com.company;

public class Main {

    static void printScore(int score[]){
        for (int i = 0; i < score.length; i++){
            System.out.println(score[i]);
        }

    }

    static int highScore(int score[]){
        int highScore = 0;
        for (int i = 0; i < score.length; i++){
            if (score[i]>highScore){
                highScore = score[i];
            }
        }

    return highScore;}

    static boolean isSuperiorTen(int score[]){
        int a = 10;
        boolean isSuperior = false;
        for (int i = 0; i<score.length; i++){
            if(score[i]>=a){
                isSuperior = true;
                System.out.println(score[i] + " est supérieur à 10");
            }
        }
    return isSuperior;}


    public static void main(String[] args) {
        int score[] = {24, 101, 1234, 544, 102, 90, 2};

        printScore(score);
        System.out.println(highScore(score));
        isSuperiorTen(score);
    }
}
