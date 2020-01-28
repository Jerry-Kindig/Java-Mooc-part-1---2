
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
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

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
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
  
}
