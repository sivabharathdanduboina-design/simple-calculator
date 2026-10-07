import java.util.Scanner;

class SimpleCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        boolean running = true;

        while (running) {
            System.out.println("\n===== SIMPLE CALCULATOR =====");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Show Total");
            System.out.println("6. Reset Calculator");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter number: ");
                    double add = sc.nextDouble();
                    total = total + add;
					System.out.println("");
                    System.out.println("Total = " + total);
                    break;

                case 2:
                    System.out.print("Enter number: ");
                    double sub = sc.nextDouble();
                    total = total - sub;
					System.out.println("");
                    System.out.println("Total = " + total);
                    break;

                case 3:
                    System.out.print("Enter number: ");
                    double mul = sc.nextDouble();
                    total = total * mul;
					System.out.println("");
                    System.out.println("Total = " + total);
                    break;

                case 4:
                    System.out.print("Enter number: ");
                    double div = sc.nextDouble();

                    if (div == 0) {
                        System.out.println("Invalid! Cannot divide by zero.");
                    } else {
                        total = total / div;
						System.out.println("");
                        System.out.println("Total = " + total);
                    }
                    break;

                case 5:
				    System.out.println("");
                    System.out.println("Total = " + total);
                    break;

                case 6:
                    total = 0;
                    System.out.println("Calculator has been reset.");
					System.out.println("");
                    System.out.println("Total = " + total);
                    break;

                case 7:
                    running = false;
					System.out.println("");
                    System.out.println("Calculator closed.");
                    break;

                default:
                    System.out.println("Invalid choice! Please choose 1 to 7.");
            }
        }

        sc.close();
    }
}
