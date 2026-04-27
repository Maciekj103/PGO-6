public abstract class MembershipPlan implements Billable {
    private String planCode;
    private String clientName;
    private int months;
    private double baseMonthlyFee;
    private boolean autoRenew;

    public MembershipPlan(String planCode, String clientName, int months, double baseMonthlyFee, boolean autoRenew) {
        this.planCode = planCode;
        this.clientName = clientName;
        this.months = months;
        this.baseMonthlyFee = baseMonthlyFee;
        this.autoRenew = autoRenew;
    }

    public abstract String getPlanType();
    public abstract double calculateMonthlyNetPrice();

    final void printSummary(){
        System.out.println("Plan type: " + getPlanType());
        System.out.println("Code: " + planCode);
        System.out.println("Client: " + clientName);
        System.out.println("Months: " + months);
        System.out.println("Monthly net: " + calculateMonthlyNetPrice());
        System.out.println("Monthly gross: " + calculateMonthlyGrossPrice());
        System.out.println("Total net: " + calculateTotalNetPrice());
        System.out.println();
    }

    public double calculateTotalNetPrice() {
        return calculateMonthlyNetPrice() * months;
    }

    @Override
    public double calculateMonthlyGrossPrice() {
        return calculateMonthlyNetPrice() * 1.23;
    }

    @Override
    public String toString() {
        return "MembershipPlan{" +
                "planCode=" + planCode +
                ", clientName='" + clientName + '\'' +
                ", months=" + months +
                ", baseMonthlyFee=" + baseMonthlyFee +
                ", autoRenew=" + autoRenew +
                '}';
    }

    public String getPlanCode() {
        return planCode;
    }

    public void setPlanCode(String planCode) {
        this.planCode = planCode;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public double getBaseMonthlyFee() {
        return baseMonthlyFee;
    }

    public void setBaseMonthlyFee(double baseMonthlyFee) {
        this.baseMonthlyFee = baseMonthlyFee;
    }

    public boolean isAutoRenew() {
        return autoRenew;
    }

    public void setAutoRenew(boolean autoRenew) {
        this.autoRenew = autoRenew;
    }
}