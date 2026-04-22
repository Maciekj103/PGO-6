public abstract class MembershipPlan implements Billable {
    public String planCode;
    public String clientName;
    public int months;
    public double baseMonthlyFee;
    public boolean autoRenew;

    public MembershipPlan(String planCode, String clientName, int months, double baseMonthlyFee, boolean autoRenew) {
        this.planCode = planCode;
        this.clientName = clientName;
        this.months = months;
        this.baseMonthlyFee = baseMonthlyFee;
        this.autoRenew = autoRenew;
    }

    public abstract String getPlanType();
    public abstract double calculateMonthlyNetPrice();

//    final void printSummary(){
//        System.out.println(" ");
//    }

    public double calculateTotalNetPrice(){
        return baseMonthlyFee * months;
    }

    @Override
    public double calculateMonthlyGrossPrice() {
        return baseMonthlyFee * 1.23;
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
}