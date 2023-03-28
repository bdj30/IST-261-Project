import static java.lang.Math.pow;

public class FindBMI implements impCon {
    private double weight;
    private int option;
    private double bmi;
    private int age;
    private double height;

    public FindBMI(double weight, int option, double height) {
        this.weight = weight;
        this.option = option;
        this.height = height;

    }
    public double checkConvertion(){
        double tempBMI = 0;
        if(option == 0){
            tempBMI =calBMIMeters(height, weight);
        }
        if(option == 1){
           tempBMI = calBmiUsa(height, weight);
        }
        return tempBMI;
    }

    public double calBMIMeters(double height, double weight) {
        double tHeight = pow(height, 2);
        double BMI = weight/tHeight;
        return BMI;
    }
    public double calBmiUsa(double height, double weight) {
        double tHeight = pow(height, 2);
        double BMI = weight/tHeight;
        return BMI;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    @Override
    public double getConvertion() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "FindBMI{" +
                "weight=" + weight +
                ", option=" + option +
                ", bmi=" + bmi +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
