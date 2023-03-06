public class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void getDay() {
        System.out.println("Day: " + this.day);
    }

    public void getMonth() {
        System.out.println("month: " + this.month);
    }

    public void getYear() {
        System.out.println("year: " + this.year);
    }


    public void setDay(int day) {
        System.out.println("Day: " + this.day);
    }

    public void setMonth(int month) {
        System.out.println("month: " + this.month);
    }

    public void setYear(int year) {
        System.out.println("year: " + this.year);
    }
    public void Date() {
        System.out.println("Date: "+this.day + "-" + this.month + "-" + this.year);
    }

}
