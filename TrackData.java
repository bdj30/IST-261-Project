
public class TrackData extends Convert{
    int day;
    String month;
    int year;
    int option;
    double initialWeight;

    public TrackData(int option, double initialWeight, int day, String month, int year) {
        super(option, initialWeight);
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //override for assignment
    public double convertion(int op){
        if (op == 0) {
            convertedWeight = kgCon();
            this.convertedWeight = convertedWeight * 5;
            return convertedWeight;
        }
        if(op == 1){
            convertedWeight = lbsCon();
            this.convertedWeight = convertedWeight * 5;
            return convertedWeight;
        }
        else return 0.69;
    }

    @Override
    public String toString() {
        return "TrackData{" +
                "day=" + day +
                ", month='" + month + '\'' +
                ", year=" + year +
                '}';
    }
}
