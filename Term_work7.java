//importing the File Class
import java.io.File;

// importing the Scanner class
import java.util.Scanner;
import java.util.*;

public class Term_work7 {

    public static void main(String[] args) {
        try {
            File Obj = new File(args[0]);
            System.out.println("File Name :" + Obj.getName());
            Scanner sc = new Scanner(Obj);

            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                System.out.println(str);
                StringTokenizer token = new StringTokenizer(str);
                String name = token.nextToken();
                System.out.println("String = " + name);
                System.out.println("String Length =" + name.length());

                for (int i = 0; i < name.length(); i++) {
                    if (name.charAt(i) == 'a' || name.charAt(i) == 'A') {
                        System.out.println("Position of a is " + i + " index");
                    }
                }

                System.out.println("\n\n");
            }
            sc.close();
        } 
        
        catch (Exception e) {
            System.out.println("pass the file name as commandline argument");

        }

    }
}
