
public class TrackData extends Convert{
    int day;
    String month;
    int year;

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

    @Override
    public String toString() {
        return "TrackData{" +
                "day=" + day +
                ", month='" + month + '\'' +
                ", year=" + year +
                '}';
    }
}
