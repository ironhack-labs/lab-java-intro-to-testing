package org.example;

public class Main {
    public static void main(String[] args) {


    }

    public int[] myFirstTestedMethod(int num){
        int longitudArray = (num+1)/2;
        int [] arrayNums = new int[longitudArray];;
        int index = 1;

        for(int i = 0;index <= num;i++){
            arrayNums[i] = index;
            index = index+2;
        }
        return arrayNums;
    }

    public boolean stringToBoolean(String string){
        String[] listOfKeywords = {"abstract","continue","for","new","switch","assert","default","goto","package","synchronized","boolean","do","if","private","this","break","double","implements","protected","throw","byte","else","import","public","throws","case","enum","instanceof","return","transient","catch","extends","int","short","try","char","final","interface","static","void","class","finally","long","strictfp","volatile","const","float","native","super","while"};
        String[] wordsFromString = string.split(" ");;
        for(int i=0;i<=listOfKeywords.length-1;i++){
            for(int j=0;j<=wordsFromString.length-1;j++){
                if(listOfKeywords[i].equals(wordsFromString[j])){
                    return true;
                }
            }
        }
        return false;
    }
}