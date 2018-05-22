package com.dolxegod.codefights.Intro.EdgeoftheOcean;

public class AdjacentElementsProduct {
    public static void main(String[] args){
        int[] a = new int[]{3, 6, -2, -5, 7, 3};
        adjacentElementsProduct(a);
    }

    private static int adjacentElementsProduct(int[] inputArray) {
        int length = inputArray.length;
        int result;
        int comp;

        result = inputArray[0] * inputArray[1];
        for(int i=1; i<length-1; i++){
            comp = inputArray[i] * inputArray[i+1];
            if(comp > result){
                result = comp;
            }
        }
        return result;
    }
}
