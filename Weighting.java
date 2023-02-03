public class Weighting {
    private double weight;
    public Weighting(double weight) {
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
