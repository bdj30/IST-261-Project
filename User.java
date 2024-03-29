
public class User extends Login{
    private String name;
    private int age;
    private double weight;
    private double height;


    public User(String name, int age, double weight, double height, String uName, String pWord) {
        super(uName, pWord);
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override//override for assignment
    public void setpWord(String pWord) {
        this.pWord = pWord + "YeeHa";
    }

    @Override
    public String toString() {
        return "user{" +"name='" + name + '\'' + ", age=" + age +", weight=" + weight + ", height=" + height +'}';
    }
}
