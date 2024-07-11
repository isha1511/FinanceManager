public class Budget {

    private double totalBudget;

    public Budget(double totalBudget) {

        this.totalBudget = totalBudget;
    }

    public double getBudget() {

        return totalBudget;
    }

    public void setBudget(double totalBudget) {

        this.totalBudget = totalBudget;
    }

    @Override

    public String toString() {

        return "Budget{" + "totalBudget =" + totalBudget + " }";
    }

}
