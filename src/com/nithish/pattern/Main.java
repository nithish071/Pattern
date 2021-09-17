package com.nithish.pattern;

public class Main {

    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
          /*  * * * *
              * * *
              * *
              *

               Here n=4
               row --> 1 ===> we need 4 column so we need to find relation between row and column
                                n-row+1 --> 4-1+1=4.
                                n-row+1 --> 4-2+1=3.
                                *
                                *
                                *
                    */
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
                        /*
                         *
                         * *
                         * * *
                         * * * *
                         */
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
                    /*
                     ****
                     ****
                     ****
                     ****
                    */
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
                            /*
                            1
                            1 2
                            1 2 3
                            1 2 3 4
                            */
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
                        /*
                         *
                         * *
                         * * *
                         * * * *
                         * * *
                         * *
                         *
                         */
        for (int row = 1; row < 2*n; row++) {
            int totalColumn = row >= n ? 2*n - row : row;
            for (int col = 1; col <= totalColumn; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
                        /*
                         *
                        * *
                       * * *
                      * * * *
                       * * *
                        * *
                         *
                         */
        for (int row = 1; row < 2*n; row++) {
            int totalColumn = row >= n ? 2*n - row : row;
            int noOfSpace = n-totalColumn;
            for (int s = 1; s <= noOfSpace ; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColumn; col++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
                            /*
                                1
                              2 1 2
                            3 2 1 2 3
                          4 3 2 1 2 3 4
                            */
        for (int row = 1; row <= n; row++) {
            for (int space  = 1;space  <= n-row; space ++) {
                System.out.print("  ");
            }
            for (int col = row; col>= 1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col =2; col <= row ; col++) {
                System.out.print(col +" ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
                    /*   1
                       2 1 2
                     3 2 1 2 3
                   4 3 2 1 2 3 4
                     3 2 1 2 3
                       2 1 2
                         1
                    */

        for (int row = 1; row < 2* n; row++) {
            int colNo = row>n ? 2*n-row : row;
            for (int space  = 1;space  <= n-colNo; space ++) {
                System.out.print("  ");
            }
            for (int col = colNo; col>= 1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col =2; col <= colNo ; col++) {
                System.out.print(col +" ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        /*  4 4 4 4 4 4 4
            4 3 3 3 3 3 4
            4 3 2 2 2 3 4
            4 3 2 1 2 3 4
            4 3 2 2 2 3 4
            4 3 3 3 3 3 4
            4 4 4 4 4 4 4 */
        for (int row = 1; row < 2*n; row++) {
            for (int col = 1; col < 2*n; col++) {

                int atEveryIndex =n-Math.min(Math.min(row,col),Math.min(2*n-row,2*n-col))+1;

                //int atEveryIndex = smallest distance from 4 side of the element;
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }

    static void pattern10(int n){
                    /*

                     *
                    **
                   ***
                  ****
                 *****

                    */
        for (int row = 0; row < n; row++) {
            for (int space = 0; space < n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern11(int n){
        /*
            *
           ***
          *****
         *******
        *********

         */
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2*n -((n-row)*2 +1); col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern12(int n){
        /*
         *********
          *******
           *****
            ***
             *
         */
        for (int row = 1; row <= n; row++) {
            int TotalSpace = 2*n-((n+(n-row))+1);
            for (int space = 1; space <= TotalSpace ; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*n-(TotalSpace+row); col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        pattern12(5);
    }
}
