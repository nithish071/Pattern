package com.nithish.pattern;

public class Patterns1 {

    static void pattern13(int n){
                    /*
                         *
                        * *
                       * * *
                      * * * *
                     * * * * *
                     */
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern14(int n){
        /*
            * * * * *
             * * * *
              * * *
               * *
                *
                *
               * *
              * * *
             * * * *
            * * * * *
         */
        for (int row = 0; row < n; row++) {
            for (int space = 1; space <= (n+row)-n; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern15(int n){
        /*
             *
            * *
           *   *
          *     *
         *********
         */
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col < 2*row ; col++) {
                    if(row == n||col==1 || col== 2*row-1){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
            }
            System.out.println();
        }
    }

    static void pattern16(int n){
        /*
         *
         * *
         *   *
         *     *
         *********
         */
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row-1; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*(n-row)+1;col++) {
                if(row == 1||col==1 || col== (2*(n-row)+1)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern16(10);
    }
}
