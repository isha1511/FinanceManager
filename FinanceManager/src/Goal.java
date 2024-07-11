public class Goal {

    private String goalName;
    private double goalAmount;

    public Goal(String goalName, double goalAmount) {

        this.goalName = goalName;
        this.goalAmount = goalAmount;
    }

    public String getGoalName() {

        return goalName;
    }

    public void setGoalName(String goalName) {

        this.goalName = goalName;
    }

    public double getGoalAmount() {
        return goalAmount;
    }

    public void setGoalAmount(double goalAmount) {

        this.goalAmount = goalAmount;
    }

    @Override

    public String toString() {

        return "Goal{ goalName = " + goalName + ", goalAmount = " + goalAmount + " }";
    }
}
