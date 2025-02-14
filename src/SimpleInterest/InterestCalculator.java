package SimpleInterest;

public class InterestCalculator {

    public double calculateSimpleInterest(double principle, double rate, double time) {
        double simpleInterest = (principle * time * rate) / 100;
        return simpleInterest;
    }

    public double calculateCompoundInterest(double principle, double rate, double time) {
        double compoundInterest = principle * Math.pow ((1 + (rate/100)),time);
        return compoundInterest;
    }
}
