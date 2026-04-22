public class PersonalTrainingPlan extends MembershipPlan {
    public int sessionsPerMonth;
    public int trainerLevel;
    public boolean dietConsultationIncluded;
    public PersonalTrainingPlan(String planCode, String clientName, int months,
                                double baseMonthlyFee, boolean autoRenew, int sessionsPerMonth, int trainerLevel, boolean dietConsultationIncluded) {
        super(planCode, clientName, months, baseMonthlyFee, autoRenew);
        this.sessionsPerMonth = sessionsPerMonth;
        this.trainerLevel = trainerLevel;
        this.dietConsultationIncluded = dietConsultationIncluded;
    }

    @Override
    public String getPlanType() {
        return "Trening personalny.";
    }

    @Override
    public double calculateMonthlyNetPrice() {
        double price = baseMonthlyFee + sessionsPerMonth * 70;
        if (trainerLevel == 2) price += 90;
        else if (trainerLevel == 3) price += 180;
        if (dietConsultationIncluded) price += 50;
        if (autoRenew) price -= 15;
        return price;
    }
}
