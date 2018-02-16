/*
Adam Hereth
CSC 205
02/15/2018
Professor K
*/
import java.util.Scanner;
public class ConversionsForIEEE754 
{
     public static void main(String[]args)
     {
        Scanner keyboard = new Scanner(System.in);
        double decimalNum;
        double signBit;
        int valueBit;
        String stringOfBits;
              
        System.out.println("Please enter the decimal that needs to convert in single precision floating point");
        decimalNum = keyboard.nextDouble();
        if(decimalNum < 0)
        {
           System.out.print("1 ");
        }
        else System.out.print("0 ");

        float f = (float)decimalNum;
        valueBit = Float.floatToIntBits(f);
        stringOfBits = Integer.toBinaryString(valueBit);
        System.out.println(stringOfBits + " the IEEE Single Precison Representation");
        System.out.println("The value " + Float.intBitsToFloat(valueBit) + " is the floating point number");
        
        
        System.out.println("Please enter the decimal that needs to convert in double precision floating point");
        double decN;
        int valB;

        decN = keyboard.nextDouble();
        if(decN < 0)
        {
           System.out.print("1 ");
        }
        else System.out.print("0 ");
        
        double d = decN;
        long l = (new Double(d)).longValue();
        System.out.println(Long.toBinaryString(Double.doubleToRawLongBits(l)) + " the");
        System.out.println("IEEE Double Precision Representation");  
        float fl = (float)decN;
        valB = Float.floatToIntBits(fl);
        stringOfBits = Integer.toBinaryString(valueBit);
        System.out.println("The value " + Float.intBitsToFloat(valueBit)  + " is the floating point number");
     }
}
