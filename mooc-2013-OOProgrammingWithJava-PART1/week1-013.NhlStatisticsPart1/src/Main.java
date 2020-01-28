
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        NHLStatistics.sortByPenalties(); 
        NHLStatistics.top(25);
        NHLStatistics.searchByPlayer("Sidey Crosby");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}


//System.out.println("Top ten by points");
 //       NHLStatistics.sortByPoints();
//        NHLStatistics.top(10);
//NHLStatistics.sortByPoints();     // orders the players by points
//NHLStatistics.sortByGoals();      // orders the players by goals
//NHLStatistics.sortByAssists();    // orders the players by assists
//NHLStatistics.sortByPenalties();  // orders the players by penalty minutes
//NHLStatistics.searchByPlayer("Jaromir Jagr");  // prints stats of Jaromir Jagr
//NHLStatistics.searchByPlayer("Koivu");         // prints stats of Mikko Koivu and Saku Koivu
//NHLStatistics.searchByPlayer("Teemu");
//NHLStatistics.teamStatistics("NYR")
        
