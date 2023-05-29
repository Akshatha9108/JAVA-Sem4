package student;

import java.util.Scanner;

public class synch {
	 public static void main(String[] args)
	 {
		 Scanner s =new Scanner(System.in);
		 System.out.println("ENter name,roll number and marks in 3 subjects");
		 
		 String name=s.nextLine();
		 int rno= s.nextInt();
		 int sub1= s.nextInt();
		 int sub2= s.nextInt();
		 int sub3= s.nextInt();
		 result res =new result(name,rno,sub1,sub2,sub3);
		 res.display();
		 res.show_sportswt();
	 }
	 
}