
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String valueEntered = scanner.nextLine();
            if (valueEntered.equals("end")) {
                System.out.println("end");
                break;
            } else {
                int intEntered = Integer.valueOf(valueEntered);
                int cubedValue = intEntered * intEntered * intEntered;
                System.out.println(cubedValue);
            }
        }
    }
}
