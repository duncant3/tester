package com.company;

import java.util.Arrays;

public class Main {

        public static String concatenateSequences(String[] seqOne, String[] seqTwo){
            int seqOneLength = seqOne.length;
            int seqTwoLength = seqTwo.length;
            int newSeqLength = seqOneLength + seqTwoLength + 1;
            int counter = 0;

            String[] combinedArray = new String[newSeqLength];
            for (int i = 0; i < seqOneLength; i++){
                combinedArray[i] = seqOne[i];
            }
            combinedArray[seqOneLength] = "N";
            for (int j = seqOneLength+1; j < newSeqLength; j++){
                combinedArray[j] = seqTwo[counter];
                counter++;
            }

            return Arrays.toString(combinedArray);

        }


    public static void main(String[] args) {
        String[] testerOne = {"D", "U", "N", "C", "A", "N"};
        String[] testerTwo = {"T", "R", "U", "O", "N", "G"};

        System.out.println(concatenateSequences(testerOne, testerTwo));

    }
}
