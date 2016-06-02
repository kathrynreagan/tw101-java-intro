package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        System.out.println();
        drawADiamond(8);
        System.out.println();
        drawADiamondWithYourName(4);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        drawTopHalfOfDiamond(n);
        printNTimes('*', formulaForNumberOfStarsOnLine(n));
        System.out.println();
    }

    private static int formulaForNumberOfStarsOnLine(int n){
        return (2*n)-1;
    }

    private static void printNTimes(char c, int n){
        for(int i = 0; i < n; i++){
            System.out.print(c);
        }
    }

    private static void drawTopHalfOfDiamond(int n){
        int lineWidth = formulaForNumberOfStarsOnLine(n);
        int stars;
        int spaces;

        for(int i = 1; i <= n-1; i++) {
            stars = formulaForNumberOfStarsOnLine(i);
            spaces = (lineWidth - stars) / 2;
            printNTimes(' ', spaces);
            printNTimes('*', stars);
            printNTimes(' ', spaces);
            System.out.println();
        }
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {

        drawTopHalfOfDiamond(n);
        printNTimes('*', formulaForNumberOfStarsOnLine(n));
        System.out.println();
        drawBottomHalfOfDiamond(n);

    }

    /* draws bottom half of the diamond, i.e. the upside
     * down isosceles triangle with n-1 lines, since the
     * middle line has been drawn in the top half of the
     * diamond, using drawAnIsoscelesTriangle
    */
    private static void drawBottomHalfOfDiamond(int n){
        int lineWidth = formulaForNumberOfStarsOnLine(n);
        int stars;
        int spaces;
        for(int j = n-1; j >= 1; j--){
            stars = formulaForNumberOfStarsOnLine(j);
            spaces = (lineWidth - stars) / 2;
            printNTimes(' ', spaces);
            printNTimes('*', stars);
            printNTimes(' ', spaces);
            System.out.println();
        }
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
       drawTopHalfOfDiamond(n);
        System.out.println("Kathryn");
        drawBottomHalfOfDiamond(n);
    }
}
