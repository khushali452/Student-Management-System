package student_database_app;
import java.util.*;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		System.out.println("Enter number of new students to enroll : ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		
		Student[] students =new Student[numOfStudents];
		
		
		
		// Ask how many students we want to add
		
		//Create n number of new students
		for(int n=0;n<numOfStudents;n++) {
			students[n]=new Student();
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].toString());
		}

	}

}
