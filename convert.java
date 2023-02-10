public class convert {
    private int option;
    private double weight;
    private final double kg  = 2.2046226218; // 1 kg per lbs
    private final double lbs = 0.45359237; // 1 lbs per kilo

    public convert(int option, double weight) {
        this.option = option;
        this.weight = weight;
    }

    public double lbsToKg(){
        double convertedWeight = weight * lbs;
        return convertedWeight;
    }

    public double kgToLbs(){
        double convertedWeight = weight * kg;
        return  convertedWeight;
    }
}
