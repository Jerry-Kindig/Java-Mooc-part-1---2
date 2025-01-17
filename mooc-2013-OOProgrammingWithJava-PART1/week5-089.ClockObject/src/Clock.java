public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        hours = new BoundedCounter(23);
        minutes = new BoundedCounter(59);
        seconds = new BoundedCounter(59);
        hours.setValue(hoursAtBeginning);
        minutes.setValue(minutesAtBeginning);
        seconds.setValue(secondsAtBeginning);
        
        
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
    }
    
    public void tick() {
        seconds.next();
        if(seconds.getValue() == 0){
            minutes.next();
        }
        if(minutes.getValue() == 0 && seconds.getValue() == 0){
            hours.next();
        }
    }
    
    public String toString() {
        // returns the string representation
        return hours + ":" + minutes + ":" + seconds;
    }
}
