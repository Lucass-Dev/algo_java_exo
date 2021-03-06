package com.company;

public class Main {
    /**
     * Permet de retrouver l'index d'un élément recherché appartenant à une liste triée
     * @param sortedArray Un tableau triée de INT
     * @param search La valeur de l'élément recherché
     * @return Lindex de l'élément recherché
     */

    public static int getIndex(int sortedArray[],  int search){
        int index = -1;
        int low = 0;
        int max = sortedArray.length-1;

        while (low<= max){
            int mid = (low + max)/2;
            if (sortedArray[mid]<search){
                low = mid+1;
            }else if (sortedArray[mid]>search){
                max = mid-1;
            }else if (sortedArray[mid]==search){
              index = mid;
              break;
            }
        }
    return index;}

    /**
     * Permet de retrouver l'index d'un élément recherché appartenant à une liste de INT triée recursivement
     * @param sortedArray La liste d'INT triée
     * @param search La valeur que l'oon cherche
     * @param low index minimum du tableau
     * @param high index maximum du tableau
     * @return La valeur de l'index de la valeur demandée, -1 si aucune compatibilité
     */

    public  static int getIndexRecursive (int sortedArray[], int search, int low,  int high){
        int mid = (low+high)/2;

        if (high< low){
            return -1;
        }
        if (sortedArray[mid]==search){
            return mid;
        }
        if (sortedArray[mid]<search){
            return getIndexRecursive(sortedArray, search, mid+1, high);
        }else{
            return getIndexRecursive(sortedArray, search, low, mid-1);
        }

    }



    /**
     * Print les differents éléments de la liste
     * @param score tableau de int
     */
    public static void printScore(int score[]){
        for (int i = 0; i < score.length; i++){
            System.out.println(score[i]);
        }

    }

    /**
     * permet de connaitre le highscore
     * @param score
     * @return le highscore
     */
    public static int highScore(int score[]){
        int highScore = 0;
        for (int i = 0; i < score.length; i++){
            if (score[i]>highScore){
                highScore = score[i];
            }
        }

    return highScore;}

    /**
     * permetde savoir si au moins 1 nombre est supérieur à 10
     * @param score
     * @return etat du boolean isSuperior
     */

    public static boolean isSuperiorTen(int score[]){
        int a = 10;
        boolean isSuperior = false;
        for (int i = 0; i<score.length; i++){
            if(score[i]>=a){
                isSuperior = true;
            }
        }
    return isSuperior;}


    public static void main(String[] args) {
        int score[] = {12, 13, 16, 23, 34, 90, 112};

        printScore(score);
        System.out.println("La valeur la plus grande est : " + highScore(score));
        isSuperiorTen(score);
        System.out.println("Y'a-t-il une valeur supérieur à 10 ? : "+isSuperiorTen(score));
        System.out.println(getIndex(score, -12));
        System.out.println(getIndexRecursive(score, 16, 0, score.length-1));
    }
}
