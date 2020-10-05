package com.company;

public class Main {
    /**
     * Print les differents éléments de la liste
     * @param score tableau de int
     */
    static void printScore(int score[]){
        for (int i = 0; i < score.length; i++){
            System.out.println(score[i]);
        }

    }

    /**
     * permet de connaitre le highscore
     * @param score
     * @return le highscore
     */
    static int highScore(int score[]){
        int highScore = 0;
        for (int i = 0; i < score.length; i++){
            if (score[i]>highScore){
                highScore = score[i];
            }
        }

    return highScore;}

    /**
     * permetde savoir quel nombre est superieur à 10
     * @param score
     * @return etat du boolean isSuperior
     */

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
