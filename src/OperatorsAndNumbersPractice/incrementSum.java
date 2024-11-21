package OperatorsAndNumbersPractice;

public class incrementSum {
    public static void main(String[] args) {
        int x=5;
        int y=8;
        int sum = ++x+y;
        System.out.println("x value after ++x initiated : " +x);
        System.out.println("y value after ++x initiated : "+y);
        System.out.println(" sum value after ++x initiated : " +sum);
        int sum1= x+++y;
        System.out.println("x value after x++ initiated : " +x);
        System.out.println("y value after x++ initiated : "+y);
        System.out.println(" sum value after x++ initiated : " +sum1);
    }
}
