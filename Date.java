import java.io.*;

public class Date implements Serializable{
  private String day;
  private String month;
  private String year;
  private boolean hasYear = false;
  
  Date(int d, int m, int y) throws Exception{
    setDay(d);
    setMonth(m);
    setYear(y);
  }
  Date(int d, int m){
    setDay(d);
    setMonth(m);
  }
  Date(){
    day = "00";
    month = "00";
  }
  void setDay(int d){
    if(d<=0 || d>31) throw new IllegalArgumentException("Invalid day input.");
    if(d<10) day = "0"+d;
    else day = ""+d;
  }
  void setMonth(int m){
    if(m<=0 || m>12) throw new IllegalArgumentException("Invalid month input.");
    String monthString;
    switch (m) {
      case 1:  monthString = "January"; break;
      case 2:  monthString = "February"; break;
      case 3:  monthString = "March"; break;
      case 4:  monthString = "April"; break;
      case 5:  monthString = "May"; break;
      case 6:  monthString = "June"; break;
      case 7:  monthString = "July"; break;
      case 8:  monthString = "August"; break;
      case 9:  monthString = "September"; break;
      case 10: monthString = "October"; break;
      case 11: monthString = "November"; break;
      case 12: monthString = "December"; break;
      default: monthString = "N/A";
      break;
        }
    month = monthString;
  }
  void setYear(int y){
    year = ""+y;
    hasYear = true;
  }
  
  public String toString(){
    if(hasYear) return day+"/"+month+"/"+year;
    else return day+"/"+month;
  }
}