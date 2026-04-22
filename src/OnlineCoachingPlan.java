public class OnlineCoachingPlan extends MembershipPlan implements RemoteAccess {
    public int videoConsultations;
    public boolean mealPlanIncluded;
    public boolean recordedLibraryAccess;
    public OnlineCoachingPlan(String planCode, String clientName, int months,
                              double baseMonthlyFee, boolean autoRenew, int videoConsultations, boolean mealPlanIncluded, boolean recordedLibraryAccess) {
        super(planCode, clientName, months, baseMonthlyFee, autoRenew);
        this.videoConsultations = videoConsultations;
        this.mealPlanIncluded = mealPlanIncluded;
        this.recordedLibraryAccess = recordedLibraryAccess;
    }

    @Override
    public String getPlanType() {
        return "Coaching online.";
    }

    @Override
    public double calculateMonthlyNetPrice() {
        double price = baseMonthlyFee + videoConsultations * 45;
        if (mealPlanIncluded) price += 60;
        if (recordedLibraryAccess) price += 20;
        if (autoRenew) price -= 12;

        return price;
    }

    @Override
    public boolean hasOnlineAccess() {
        return true;
    }
}
