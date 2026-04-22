public class CorporateWellnessPlan extends MembershipPlan implements  RemoteAccess, Freezable{
    public int employeeCount;
    public int workshopsPerMonth;
    public boolean onlineDashboard;

    public CorporateWellnessPlan(String planCode, String clientName, int months,
                                 double baseMonthlyFee, boolean autoRenew, int employeeCount,
                                 int workshopsPerMonth, boolean onlineDashboard) {
        super(planCode, clientName, months, baseMonthlyFee, autoRenew);
        this.employeeCount = employeeCount;
        this.workshopsPerMonth = workshopsPerMonth;
        this.onlineDashboard = onlineDashboard;
    }

    @Override
    public String getPlanType() {
        return "";
    }

    @Override
    public double calculateMonthlyNetPrice() {
        double price = baseMonthlyFee + employeeCount * 18 + workshopsPerMonth * 220;
        if (employeeCount >= 20) price *= 0.88;
        if (onlineDashboard) price += 80;
        return price;
    }

    @Override
    public boolean canFreeze() {
        return false;
    }

    @Override
    public boolean hasOnlineAccess() {
        return onlineDashboard;
    }
}
