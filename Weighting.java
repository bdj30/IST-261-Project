public class InsertWeight {
    private double weight;
    public InsertWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Weighting{" +
                "weight=" + weight +
                '}';
    }
}
