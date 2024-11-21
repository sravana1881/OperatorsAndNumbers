package OperatorsAndNumbersPractice;

public class secondexampleBinaryString {
    public static void main(String[] args) {

        int[] numbers = {150, 225, 1555, 32456};
        for (int number : numbers) {
            int x = number;
            System.out.print("number x  is " + x + "\n");
            //covert to binarystring
            String binaryString = Integer.toBinaryString(x);
            System.out.println("binarystring value for x : " + binaryString);
            //use the right shift operator ( ) to shift by 2 and assign that to x
            int shiftedNumber = x >> 2;
            x = shiftedNumber;
            System.out.println("Shifted Number : " +x);
            System.out.println("Decimal value of x is : " +(double)x);//convert to decimal
            System.out.println("binarystring  value of x is : " +Integer.toBinaryString(x));//convert to binarystring
            System.out.println("====================================");
        }
    }
}
