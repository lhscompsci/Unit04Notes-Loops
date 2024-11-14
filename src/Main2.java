import java.util.Scanner;

import static java.lang.System.out;

public class Main2 {
    public static void main(String[] args) {

        int total = 0;
        //      init    cond    update
        for( int i = 0; i < 10; i+=3 ) {
            out.println(i);
            total += i;
        }
        out.println(total);

        String s = "compsci";
        for(int i = 0; i< s.length(); i++){
            out.println(s.charAt(i));
            out.println(s.substring(i));
        }

        //BAD CODE COMING
        // MAJOR POOP
        String ans="";
        Scanner sc = new Scanner(System.in);
        out.print("enter code:");

        for(ans = sc.nextLine();!ans.equals("end"); ans = sc.nextLine()) {

        }

    }
}
