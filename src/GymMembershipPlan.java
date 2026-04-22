public class GymMembershipPlan extends MembershipPlan implements Freezable{
    public int entriesPerMonth;
    public boolean saunaAccess;

    public GymMembershipPlan(String planCode, String clientName, int months, double baseMonthlyFee,
                             boolean autoRenew, int entriesPerMonth, boolean saunaAccess) {
        super(planCode, clientName, months, baseMonthlyFee, autoRenew);
        this.entriesPerMonth = entriesPerMonth;
        this.saunaAccess = saunaAccess;
    }

    @Override
    public String getPlanType() {
        return "Siłownia.";
    }

    @Override
    public double calculateMonthlyNetPrice() {
       double price =  baseMonthlyFee + entriesPerMonth * 4;
       if (saunaAccess) price += 25;
       if (autoRenew) price -= 10;
       return price;
    }

    @Override
    public boolean canFreeze() {
        return months >= 3;
    }
}
