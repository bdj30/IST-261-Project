import static java.lang.Math.pow;

public class FindBMI implements impCon {
    private double weight;
    private int option;
    private double bmi;
    private int age;
    private double height;

    public FindBMI(double weight, int option) {
        this.weight = weight;
        this.option = option;
        this.age = age;
        this.height = height;

    }
    public double checkConvertion(){
        if(option == 0){
            bmi =calBMIMeters(height, weight);
        }
        if(option == 1){
           bmi = calBmiUsa(height, weight);
        }
        return bmi;
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
