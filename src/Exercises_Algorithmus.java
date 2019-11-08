import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class Exercises_Algorithmus {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("please write a number for how many lines u need");
        int i = input.nextInt();
        int j =input.nextInt();
//        System.out.println( addNumbers(i));
//        Draw2(i);
        /*System.out.println( addNumbers(i));*/
//        System.out.println(muNumbers(i));
    calc( i , j);
    }

    public static void Draw(int userInput) {
        String s = "*";
        String sum = "";
        if (userInput > 0) {
            for (int i = userInput; i >= 1; i--) {
                sum += s;
                System.out.println(sum);
            }
        }
    }

    public static int addNumbers2(int i) {
        double n = 0;
        int s = 0;
        while (i != 0) {


        }
        return s;
    }

    public static void Draw2(int number) {

        if (number > 0) {

        for(int i = 1; i<=number ; i++){
            for (int s= i ;s<= number ; s++ ){
                System.out.print("*");
            }
            System.out.println("");
        }
        }

    }

public static int addNumbers (int p){
        int sum=0;
     for (int i = 0; i<=p ; i++){
         sum+=i;
     }


    return sum;}
    public static int muNumbers(int h ){
        int sum = 1;
        for(int i = 1; i<=h;i++ ){
            sum*=i;
        }
   return sum ;  }
   public static  void calc(int i , int k){
       int sum;
   sum = i + k;
       System.out.println( sum);
   sum = i - k;
       System.out.println(sum);
   sum = i * k;
       System.out.println(sum);
   sum  =i / k;
       System.out.println(sum);

   }
}
