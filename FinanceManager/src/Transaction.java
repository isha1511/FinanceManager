/*PROG : Personal Finance Manager
Basic Concepts:
Utilize basic Java constructs for user input validation, menu navigation, and data presentation.
Object-Oriented Programming (OOP):
Create classes for Transaction, Category, Budget, and Goal.
Implement encapsulation to protect sensitive financial data and ensure data integrity.
Utilize inheritance and polymorphism to model different types of transactions, categories, and goals. */

public class Transaction {
    private String description;
    private double amount;
    private String date;

    public Transaction(String description, double amount, String date) {
        this.description = description;
        this.amount = amount;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "description='" + description + '\'' +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                '}';
    }
}
