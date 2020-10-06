package com.company;

public class TP_5 {
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
    
    public static void main(String[] args) {
        int score[] = {12, 13, 16, 23, 34, 90, 112};

        System.out.println(getIndexRecursive(score, 16, 0, score.length -1));
    }
}
