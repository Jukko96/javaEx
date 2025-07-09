package mid1.lang.immutable.test;

public class ImmutableMyDate {
    final private int year;
    final private int month;
    final private int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public ImmutableMyDate withYear(int newYear){
        return new ImmutableMyDate(newYear, month, day);
    }
    public ImmutableMyDate withMonth(int newMonth){
        return new ImmutableMyDate(year, newMonth, day);
    }
    public ImmutableMyDate withDay(int newDay){
        return new ImmutableMyDate(year, month, newDay);
    }
    @Override
    public String toString() {
        return "ImmutableMyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

}
