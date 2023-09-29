package Spotify;
public class Date {
    private int date;
    private int mon;
    private int year;
    Date(int date,int mon,int year){
        this.date=date;
        this.mon=mon;
        this.year=year;


    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getDate() {
        return date;
    }

    public void setMon(int mon) {
        this.mon = mon;
    }

    public int getMon() {
        return mon;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
    public String toString() {
        String D=String.format("%d/%d/%d",date,mon,year);
        return D;
    }
}
