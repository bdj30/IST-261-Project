public class Convert {
    //for now 0 = convert to kg, 1 = convert to lbs
    private int option;
    private double initialWeight;
    private double convertedWeight;
    private final double kg  = 2.2046226218; // 1 kg per lbs
    private final double lbs = 0.45359237; // 1 lbs per kilo


    public Convert(int option, double initialWeight) {
        this.option = option;
        this.initialWeight = initialWeight;
        convertedWeight = convertion(option);
    }

    //check to see what convertion were doing and do it
    public double convertion(int op){
        if (op == 0) {
            convertedWeight = lbsToKg();
            return convertedWeight;
        }
        if(op == 1){
            convertedWeight = kgToLbs();
            return convertedWeight;
        }
        else return 0.0;
    }

    //convertion methods
    public double lbsToKg(){
        double convertedWeight = initialWeight * lbs;
        return convertedWeight;
    }

    public double kgToLbs(){
        double convertedWeight = initialWeight * kg;
        return  convertedWeight;
    }

    //getters


    public int getOption() {
        return option;
    }

    public double getInitialWeight() {
        return initialWeight;
    }

    public double getConvertedWeight() {
        return convertedWeight;
    }
    //setters

    public void setOption(int option) {
        this.option = option;
    }

    public void setInitialWeight(double initialWeight) {
        this.initialWeight = initialWeight;
    }

    @Override
    public String toString() {
        return "Convert{" +
                "option=" + option +
                ", initialWeight=" + initialWeight +
                ", convertedWeight=" + convertedWeight+
                '}';
    }
}
