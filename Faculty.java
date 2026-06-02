import java.util.Scanner;// IMPORT STATEMENTS
public class Faculty { //FACULTY CLASS DECLARATION
public static void main(String args[])  { // MAIN CLASS METHOD
int faculty_ID;
String faculty_name;
			Scanner sc= new Scanner(System.in); //User Input using Scanner class
			System.out.print("Enter facultyid: ");
			faculty_ID=sc.nextInt();
			
System.out.print("Enter facultyname: ");
faculty_name = sc.next();


 System.out.println("facultyid: " + faculty_ID);
        System.out.println("FacultyName: " + faculty_name);

        sc.close();
			


}

}
