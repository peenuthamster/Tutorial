package LovePercentage;

public class LoveCalculator {
    public double calculateLovePercentage(int totalNameLength) {
        double lovePercentage = ((totalNameLength*10)%51)+50;
        return lovePercentage;
    }
}
