import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        int runval =20;
        int total = 0;
        while(runval>10) {

            runval-=3;
            total += runval;
            out.println("Hello world! "+runval);

        }
        out.println(total);

        int original = 9876;
        int number = original;
        while(number>0) {
            int digits = number%10;
            number /= 10;
            out.println(digits);
        }
        String val = "";
        Scanner kb = new Scanner(System.in);
        do{
            out.print("enter the code: ");
            val = kb.nextLine();
        }while(!val.equals("zz"));
    }
}