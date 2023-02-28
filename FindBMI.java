import static java.lang.Math.pow;

public class FindBMI implements impBMI {
    private double weight;
    private int option;
    private double bmi;
    private int age;
    private double height;

    public FindBMI(double weight, int option, int age, double height) {
        this.weight = weight;
        this.option = option;
        this.age = age;
        this.height = height;
    }

    public void calBMIMeters(double height, double weight) {
        double tHeight = pow(height, 2);
        double BMI = weight/tHeight;
        this.bmi = bmi;
    }
    public void calBmiUsa(double height, double weight) {
        double tHeight = pow(height, 2);
        double BMI = weight/tHeight;
        this.bmi = bmi;
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

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }


}
