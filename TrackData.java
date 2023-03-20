import java.time.LocalDate;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class TrackData extends FindBMI{
    protected LocalDate date;
    protected int option;
    protected double initialWeight;
    protected double BMI;
    Map<LocalDate,Double> usersList = new TreeMap<>();

    public TrackData(int option, double initialWeight, LocalDate day) {
        super(initialWeight, option);
        this.date = day;
        this.initialWeight = initialWeight;
        BMI = checkConvertion();
    }


    //override for assignment
//    public double convertion(int op){
//        if (op == 0) {
//            convertedWeight = kgCon();
//            this.convertedWeight = convertedWeight * 5;
//            return convertedWeight;
//        }
//        if(op == 1){
//            convertedWeight = lbsCon();
//            this.convertedWeight = convertedWeight * 5;
//            return convertedWeight;
//        }
//        else return 0.69;
//    }

    //collections methods
    public String findEntry(LocalDate date){
        String entry = usersList.containsKey(date) ? "It Exists": "it dose NOT Exists";
        return entry;
    }
    public double findBmiOnDate(LocalDate day){
        if(usersList.containsKey(day) && usersList != null) return usersList.get(day);
        else {
            System.out.println("Entry either dose not exsist or list is null");
            return -1;
        }
    }
    public void displayData(){
        System.out.println(usersList);
    }

    public void addEntry(LocalDate today, Double bmi){
        if(!usersList.containsKey(today)){
            usersList.put(today,bmi);
        }
        if(usersList.containsKey(today)){
            if(usersList.containsValue(bmi)){
                System.out.println("Data entry already exist");
            }else usersList.replace(today,bmi);

        }
    }

    public void removeEntry(LocalDate date){
        if(usersList.containsKey(date)) usersList.remove(date);
        else System.out.println("Data entry dose not exist");
    }

    //getters and setters
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getInitialWeight() {
        return initialWeight;
    }

    public void setInitialWeight(double initialWeight) {
        this.initialWeight = initialWeight;
    }

    public double getBMI() {
        return BMI;
    }

    public void setBMI(double BMI) {
        this.BMI = BMI;
    }

    @Override
    public String toString() {
        return "TrackData{" + "date=" +date +
                '}';
    }
}
