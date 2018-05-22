package com.dolxegod.codefights.Intro.EdgeoftheOcean;

public class ShapeArea {
    public static void main(String[] args){
        shapeArea(2);
        shapeArea(3);
        shapeArea(4);
    }
    private static int shapeArea(int n) {
        int result = 0;
        int param = 0;
        int cnt = 1;
        if(n >= 1 && n <= Math.pow(10, 4)){
            result += 1;
            if(n >= 2){
                for(int i=1;i<n;i++){
                    result += 4*i;
                }
                return result;
            }
            return result;
        }
        return 0;
    }
}
