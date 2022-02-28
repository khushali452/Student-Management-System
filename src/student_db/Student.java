package student_db;
import java.util.*;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradYear;
	private int studentID;
	private String courses;
	private String tuitionBalance;
	private int costOfCourse=600;
	
	
    // : prompt user to enter students
	public Student() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Student's First Name : ");
		this.firstName=in.nextLine();
		
		System.out.println("Enter Student's Last Name : ");
		this.lastName=in.nextLine();
		
		System.out.println("Enter 1 - for Freshmen \nEnter 2 - for Sophmore \nEnter 3 - for junior \nEnter 4 - for Senior \n Enter the student Class Level: ");		
		this.gradYear =in.nextInt();
		System.out.println(firstName + " "+ lastName+" "+gradYear);
	}
	
	//generate id
	
	//enroll in courses
	
	//view balance 
	
	//pay tuition
	
	//show status
	
}
