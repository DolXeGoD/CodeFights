package com.dolxegod.codefights;

public class CheckPalindrome {
    public static void main(String[] args){
        checkPalindrome("aabaa");
        checkPalindrome("abac");
        checkPalindrome("a");
        checkPalindrome("az");
        checkPalindrome("abacaba");
        checkPalindrome("z");
        checkPalindrome("aaabaaaa");
    }

    public static boolean checkPalindrome(String inputString) {
        int length = inputString.length();
        int j;

        if(length >= 1 && length <= Math.pow(10, 5)){
            j = 1;
            for(int i = 0; i<length/2 ;i++){
                if(inputString.charAt(i) != inputString.charAt(length-j)){
                    return false;
                }
                j++;
            }
            return true;
        }
        return false;
    }
}
