import java.io.*;
import java.util.Scanner;

public class Files {

    public static void main(String[] args) {
//        try{
  File r = new File("newfile.txt");
//            if (r.createNewFile()){
//                System.out.println("new file was created ");
//            }else {
//                System.out.println("file is already exestit ");
//
//            }
//
//        }catch (IOException e){
//            System.out.println(e.getStackTrace());
//        }
        if(r.exists()){
            System.out.println("Name of the file : " + r.getName());
            System.out.println("the Path of the file : " + r.getAbsolutePath() );
            System.out.println("Readable : " +r.canRead() );
            System.out.println("Writeable: " +r.canWrite() );
            System.out.println("file size: " +r.length());
        }else{
            System.out.println("cant find the file ");
        }
    }
}
