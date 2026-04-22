public class CorporateWellnessPlan extends MembershipPlan{
    public CorporateWellnessPlan(int planCode, String clientName, int months, double baseMonthlyFee, boolean autoRenew) {
        super(planCode, clientName, months, baseMonthlyFee, autoRenew);
    }

    @Override
    public String getPlanType() {
        return "";
    }

    @Override
    public double calculateMonthlyNetPrice() {
        return 0;
    }
}
