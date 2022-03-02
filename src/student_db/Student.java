package student_database_app;
import java.util.*;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradYear;
	private String studentID;
	private String courses="";
	private int tuitionBalance=0;
	//static as we want to associate class with all the courses and hence it is associated with class and not instance
	private static int costOfCourse=600;
	private static int id=1000;
	
	
    // : prompt user to enter students
	public Student() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Student's First Name : ");
		this.firstName=in.nextLine();
		
		System.out.println("Enter Student's Last Name : ");
		this.lastName=in.nextLine();
		
		System.out.println("Enter 1 - for Freshmen \nEnter 2 - for Sophmore \nEnter 3 - for junior \nEnter 4 - for Senior \n Enter the student Class Level: ");		
		this.gradYear =in.nextInt();
		
		
		setStudentID();
	}
	
	//generate id
	private void setStudentID() {
		//Grade level+ID
		id++;
		this.studentID= gradYear+""+id;
	}
	
	//enroll in courses
	public void enroll() {
		//get inside a loop .,user hits 0
		do {
			System.out.print("Enter Course to enroll (Q to quit): ");
			Scanner in =new Scanner(System.in);
			String course= in.nextLine();
			if(!course.equals("Q")) {
				courses=courses+"\n"+course;
				tuitionBalance=tuitionBalance+costOfCourse;
			}
			else {
				
				break;
				}}
		while(1!=0);
		
		System.out.println("TUITION BALANCE : "+tuitionBalance);
		}

	
	
	//view balance 
	public void viewBalance() {
		System.out.println("Your Balance is : Rs "+tuitionBalance);
	}

	
	//pay tuition
	public void payTuition() {
		viewBalance();
		System.out.println("Enter your payment: Rs");
		Scanner in= new Scanner(System.in);
		int payment=in.nextInt();
		tuitionBalance=tuitionBalance-payment;
		System.out.println("Thank you for your payment of Rs "+payment);
		viewBalance();
	}
	
	//show status
	public String toString() {
		return "Name : " + firstName +" "+lastName+
				"\nGrade Level : "+gradYear+
				"\nStudentID : "+ studentID+
				"\nCourses Enrolled: " + courses +"\nBalance : Rs "+ tuitionBalance;
	}
}

