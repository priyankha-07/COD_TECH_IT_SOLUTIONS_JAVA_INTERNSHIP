package Student_Grade_Management_System;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Add_the_Student {
	
	public void addStudent(Connection con) {
		
		Scanner sc = new Scanner(System.in);
		
		//Step3 issue the query
		
		System.out.print("Enter the student roll_number:");int roll_number = sc.nextInt();
		
		System.out.print("Enter the Student Name:");String name = sc.next();
		
		System.out.print("Enter the Dept :");String d = sc.next();
		
		System.out.print("Enter the Sub1 Mark:");int s1 = sc.nextInt();
		
		System.out.print("Enter the Sub2 Mark:");int s2 = sc.nextInt();
		
		System.out.print("Enter the Sub3 Mark:");int s3 = sc.nextInt();
		
		int tot = s1+s2+s3;
		
		int avg = tot/3;
		
		String grade ;
		
		if (avg >= 90) {
	        grade = "A";
	    } else if (avg >= 80) {
	        grade = "B";
	    } else if (avg >= 70) {
	        grade = "C";
	    } else if (avg >= 60) {
	        grade = "D";
	    } else {
	        grade = "F";
	    }
		
		
		//Step3------- Issue the Query
		String query1 = "insert into stu_details values(?,?,?,?,?,?,?,?)";
		
		//Step4------- Create a Statement
		PreparedStatement psmt;
		try {
			psmt = con.prepareStatement(query1);
			psmt.setInt(1,roll_number);
			psmt.setString(2,name);
			psmt.setString(3,d);
			psmt.setInt(4,s1);
			psmt.setInt(5,s2);
			psmt.setInt(6,s3);
			psmt.setInt(7,tot);
			psmt.setString(8,grade);
			
			//Step5&6----- Execute & Process the query
			int count = psmt.executeUpdate();
			

			if(count!=0)
			{
				System.out.println("--------------------------------");
				System.out.println("Data Insertion Done Successfully");
				System.out.println("--------------------------------");
			}
			else
			{
				System.out.println("--------------------- ");
				System.err.println("Data Insertion Failure");
				System.out.println("----------------------");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}

}
