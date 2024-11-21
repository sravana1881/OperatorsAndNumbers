package OperatorsAndNumbersPractice;

public class firstExampleBinaryString {
    public static void main (String[]args){

        int[] numbers = {2, 9, 17, 88};
        for (int number : numbers) {
            int x = number;
            System.out.print("number x  is " + x + "\n");
            //converting int to binaryString
            String binaryString = Integer.toBinaryString(x);
            System.out.println("BinaryString : " + binaryString);
            //use the left shift operator ( ) to shift by 1 and assign that to x
            int shiftedNumber = x << 1;
            x = shiftedNumber;
            System.out.println("Shifted Number : " +x);
            System.out.println("Decimal value of x is : " +(double)x);//convert to decimal
            System.out.println("binarystring  value of x is : " +Integer.toBinaryString(x));//convert to binarystring
            System.out.println("------------------------------------------");
        }
    }
}
