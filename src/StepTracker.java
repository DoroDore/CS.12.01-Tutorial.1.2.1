public class StepTracker {
    private final int activeThreshold;
    private int activeDays;
    private int totalDays;
    private int totalSteps;
    public StepTracker(int activeThreshold) {
        this.activeThreshold = activeThreshold;
        activeDays = 0;
        totalDays = 0;
        totalSteps = 0;
    }

    public double averageSteps() {
        if (totalDays == 0) {
            return 0.0;
        }
        return totalSteps/totalDays;
    }
    public int activeDays() {
        return activeDays;
    }
    public int getDays() {
        return totalDays;
    }
    public int getStepsForActiveDay() {
        return activeThreshold;
    }
    public void addDailySteps(int steps) {
        totalSteps += steps;
        totalDays++;
        if (steps >= activeThreshold) {
            activeDays++;
        }
    }
    public int getTotalSteps() {
        return totalSteps;
    }
    public int getActiveDays() {
        return activeDays;
    }

}
