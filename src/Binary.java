import java.util.Scanner;
public class Binary {
    Scanner  input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("please enter a number to know it binary");
        Binary obj=new Binary();
        int i =obj.input.nextInt();
        binary(i);


    }
    public static void binary(int i ){
        String s = "";
        int sum;
        int rest;
        String f ="";
        while(i!=0){

            sum=i/2;
            rest=i%2;
            s=Integer.toString(rest);
            i=sum;
            f +=s;
            if (sum == 0){
                for (int j =0;j<f.length() ;j++){


                }
                System.out.println(f);

            }




        }



    }

}
