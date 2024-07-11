import java.util.*;

public class FinanceManager {
    private static ArrayList<Transaction> transactions = new ArrayList<>();
    private static Budget budget;
    private static ArrayList<Goal> goals = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Welcome to Personal Finance Manager");
            System.out.println("1. Add Transaction");
            System.out.println("2. View Transactions");
            System.out.println("3. Manage Budget");
            System.out.println("4. Set Goals");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addTransaction(scanner);
                    break;
                case 2:
                    viewTransactions();
                    break;
                case 3:
                    manageBudget(scanner);
                    break;
                case 4:
                    setGoals(scanner);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    private static void addTransaction(Scanner scanner) {
        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        double amount;
        while (true) {
            System.out.print("Enter amount: ");
            amount = scanner.nextDouble();
            if (amount >= 0) {
                break;
            } else {
                System.out.println("Amount must be non-negative. Please try again.");
            }
        }

        scanner.nextLine();
        System.out.print("Enter date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        Transaction transaction = new Transaction(description, amount, date);
        transactions.add(transaction);
        System.out.println("Transaction added: " + transaction);
    }

    private static void viewTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions available.");
        } else {
            for (Transaction transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }

    private static void manageBudget(Scanner scanner) {
        System.out.print("Enter total budget: ");
        double totalBudget = scanner.nextDouble();

        budget = new Budget(totalBudget);
        System.out.println("Budget set: " + budget);
    }

    private static void setGoals(Scanner scanner) {
        System.out.print("Enter goal name: ");
        String goalName = scanner.nextLine();

        double goalAmount;
        while (true) {
            System.out.print("Enter goal amount: ");
            goalAmount = scanner.nextDouble();
            if (goalAmount >= 0) {
                break;
            } else {
                System.out.println("Goal amount must be non-negative. Please try again.");
            }
        }

        Goal goal = new Goal(goalName, goalAmount);
        goals.add(goal);
        System.out.println("Goal set: " + goal);
    }
}