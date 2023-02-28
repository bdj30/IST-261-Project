public class Convert implements impCon {
    //for now 0 = convert to kg, 1 = convert to lbs
    private int option;
    private double initialWeight;
    protected double convertedWeight;
    private final double kg  = 2.2046226218; // 1 kg per lbs
    private static final double lbs = 0.45359237; // 1 lbs per kilo


    public Convert(int option, double initialWeight) {
        this.option = option;
        this.initialWeight = initialWeight;
        convertedWeight = convertion(option);
    }

    //check to see what conversion were doing and do it
    public double convertion(int op){
        if (op == 0) {
            convertedWeight = kgCon();
            this.convertedWeight = convertedWeight;
            return convertedWeight;
        }
        if(op == 1){
            convertedWeight = lbsCon();
            this.convertedWeight = convertedWeight;
            return convertedWeight;
        }
        else return 0.0;
    }

    //convertion methods


    public double kgCon() {
        double convertedWeight = initialWeight * lbs;
        return convertedWeight;
    }

    public double lbsCon() {
        double convertedWeight = initialWeight * kg;
        return convertedWeight;
    }

    //getters
    public int getOption() {
        return option;
    }

    public double getInitialWeight() {
        return initialWeight;
    }

    @Override
    public double getConvertion() {
        return convertedWeight;
    }

    //setters

    public void setOption(int option) {
        this.option = option;
    }

    public void setInitialWeight(double initialWeight) {
        this.initialWeight = initialWeight;
    }

    public double getKg() {
        return kg;
    }

    public static double getLbs() {
        return lbs;
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
