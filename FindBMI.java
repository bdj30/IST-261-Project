import static java.lang.Math.pow;

public class FindBMI implements impBMI {
    private double weight;
    private int option;
    private double bmi;
    private int age;

    public FindBMI(double weight, int option, int age) {
        this.weight = weight;
        this.option = option;
        this.age = age;
    }

    public void calBMIMeters(double height, double weight) {

    }
    public void calBmiUsa(double height, double weight) {

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
