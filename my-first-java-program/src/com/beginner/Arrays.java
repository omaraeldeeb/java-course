package com.beginner;

public class Arrays {

    public static void main(String[] args) {

        int[] lotteryNumbers = new int[5];
        lotteryNumbers[0] = 96;
        lotteryNumbers[1] = 58;
        lotteryNumbers[2] = 28;
        lotteryNumbers[3] = 20;
        lotteryNumbers[4] = 99;


        for (int lotteryNumber : lotteryNumbers) {
            System.out.println(lotteryNumber);
        }

        int[][] weeklyLotteryNumbers= {{1,2,3,4},
                {5,6,7,8},
                {11,12,13,10},
                {14,15,16,17},
                {18,19,20,21}};
        for (int i = 0; i < weeklyLotteryNumbers.length; i++) {
            for (int j = 0; j < weeklyLotteryNumbers[i].length; j++) {
                System.out.print(weeklyLotteryNumbers[i][j]+ " ");
            }
            System.out.println();
        }
    }

}
