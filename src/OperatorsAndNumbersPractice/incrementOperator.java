package OperatorsAndNumbersPractice;

public class incrementOperator {
    public static void main(String[] args) {
        int number = 50;
        System.out.println("value is : " + number);

        number++;
        System.out.println("after postfix value is: " + number);

        ++number;
        System.out.println("after prefix value is: " + number);

        number += 1;
        System.out.println("after adding value is " +number);

        System.out.println("\nIncrementing multiple times: ");
        System.out.println("using postfix value is " + (number++));
        System.out.println("using prefix value is " + (++number));

        number += 1;
        System.out.println("using addition assignment value is: " + number);
    }
}
