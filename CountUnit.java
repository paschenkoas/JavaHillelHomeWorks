package ua.hillel.pashchenko;
import java.util.Scanner;
public class CountUnit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in); //user inputs number;
        int n;
        System.out.println("введите целое число ");
        n=scanner.nextInt();
        int count1=0;
        String number_2 = Integer.toBinaryString(n);
        char[] strToArray =number_2.toCharArray();
        for (int i = 0; i < strToArray.length; i++) {
            if (strToArray[i]=='1')count1++;
        }
        System.out.println("введенное число - "+n+" в двоичной системе - "+number_2);
        System.out.println(count1+" единицы в двоичной системе счисления в числе "+n);

        binar(n);

       /* String number_3 = binar(n);
       int count2=0;
        char[] strToArray1 =number_3.toCharArray();
        for (int i = 0; i < strToArray1.length; i++) {
            if (strToArray1[i]=='1')count2++;
        }
        System.out.println(count2+" единицы в двоичной системе счисления в числе "+n);
    */
    }

    public static void binar(int a){  //перевод числа в двоичную систему счисления без использования Integer.toBinaryString
        int b;
        String temp = "";
        while(a !=0){
            b = a%2;
            temp = b + temp;
            a = a/2;
        }
        System.out.print(temp);
    }

}
