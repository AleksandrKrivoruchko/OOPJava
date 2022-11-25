package personalData;

public class Birthday {
    private int day;
    private int month;
    private int year;
    public Birthday(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%d.%d.%d", day, month, year);
    }
}
