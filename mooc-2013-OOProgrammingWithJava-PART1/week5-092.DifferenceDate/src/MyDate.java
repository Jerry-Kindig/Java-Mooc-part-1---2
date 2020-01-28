public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int differenceInYears(MyDate comparedDate){
        int dif = 0;
        if(this.earlier(comparedDate)){
            dif += comparedDate.year - this.year;
            if((comparedDate.month < this.month) || (comparedDate.month <= this.month && comparedDate.day < this.day)){
                dif--;
            }
        } else if(comparedDate.earlier(this)){
            dif += this.year - comparedDate.year;
            if((comparedDate.month > this.month) || (comparedDate.month >= this.month && comparedDate.day > this.day)){
                dif--;
            }
        }
        return dif;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

}
