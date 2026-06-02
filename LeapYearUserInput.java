import java.util.Scanner;
public class LeapYearUserInput {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter a year: ");
        int year = input.nextInt(); 
        
        String category = "Leap Year";
     
boolean confirm = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? true : false;
       
        
        String result = confirm ? "" : "NOT ";
        
        System.out.println(year + " is " + result + "a " + category + ".");
        
        
        input.close();
    }
}