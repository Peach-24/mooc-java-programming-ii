
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> enteredPositives = new ArrayList<>();
        String errorMsg = "Cannot calculate the average";

        while(true) {
            int enteredValue = Integer.valueOf(scanner.nextLine());
            if (enteredValue == 0) {
                break;
            } else if (enteredValue > 0) {
                enteredPositives.add(enteredValue);
            }
        }

        if(enteredPositives.isEmpty()) {
            System.out.println(errorMsg);
        } else {
            System.out.println(calculateAverage(enteredPositives));
        }
    }

    private static double calculateAverage(ArrayList<Integer> array) {
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        return (double) sum / array.size();
    }

}
