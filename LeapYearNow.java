import java.time.Year; 
public class LeapYearNow {
    public static void main(String[] args) {
        
      
        int year = Year.now().getValue(); 
        
        String category = "Leap Year";
        
        boolean confirm = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
        
        String result = confirm ? "" : "NOT ";
        
       
        System.out.println(year + " is " + result + "a " + category + ".");
    }
}