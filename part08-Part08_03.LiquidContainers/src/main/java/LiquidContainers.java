import java.util.Scanner;
public class LiquidContainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;
        int containerMaximum = 100;
        int containerMinimum = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/" + String.valueOf(containerMaximum));
            System.out.println("Second: " + secondContainer + "/" + String.valueOf(containerMaximum));
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            } else {

                String[] parts = input.split(" ");
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);

                if (command.equals("add") && amount >= 0) {
                    if ((firstContainer + amount) <= containerMaximum) {
                        firstContainer += amount;
                    } else if ((firstContainer + amount) >= containerMaximum) {
                        firstContainer = containerMaximum;
                    } else {
                        continue;
                    }
                }
                if (command.equals("move") && amount >= containerMinimum) {
                    if (firstContainer >= amount) {
                        if ((secondContainer + amount) <= containerMaximum) {
                            secondContainer += amount;
                            firstContainer -= amount;
                        } else if ((secondContainer + amount) >= containerMaximum) {
                            secondContainer = containerMaximum;
                            firstContainer -= amount;
                        } else {
                            continue;
                        }
                        if (firstContainer < containerMinimum) {
                            firstContainer = containerMinimum;
                        }
                    } else {
                        secondContainer += firstContainer;
                    }
                }
                if (command.equals("remove") && amount >= containerMinimum) {
                    if ((secondContainer - amount) >= containerMinimum) {
                        secondContainer -= amount;
                    } else if ((secondContainer - amount) < containerMinimum) {
                        secondContainer = containerMinimum;
                    } else {
                        continue;
                    }
                }
            }
        }
    }
}
