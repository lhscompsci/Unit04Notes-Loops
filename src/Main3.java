import static java.lang.System.*;

public class Main3 {
    public static void main(String[] args) {
        String triangle = "";
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                triangle += " ";
            }
            for (int j = 0; j < i; j++) {
                triangle += "*";
            }
            triangle += "\n";
        }
        out.println(triangle);
    }
}
