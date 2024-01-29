package Student_Grade_Management_System;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update_the_Mark {
	
	Scanner sc = new Scanner(System.in);
	
	public void updateMark(Connection con) {
		
		
		System.out.print("Enter the student roll_number:");
		int rollno = sc.nextInt();
	
		System.out.print("Enter the Sub1 Mark:");
		int s1 = sc.nextInt();
		
		System.out.print("Enter the Sub2 Mark:");
		int s2 = sc.nextInt();
		
		System.out.print("Enter the Sub3 Mark:");
		int s3 = sc.nextInt();
		
		//Step3------- Issue the Query
		String query2 = "update stu_details set Sub1_Mark =?,Sub2_Mark =?,Sub3_Mark =?, Total = ? ,Grade= ?where Roll_No =? ;";
		
		//Step4------- Create a Statement
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(query2);
			
			int total = s1+s2+s3;
			
			int avg = total/3;
			
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
			
			pst.setInt(1,s1);
			pst.setInt(2,s2);
			pst.setInt(3,s3);
			pst.setInt(4, total);
			pst.setString(5, grade);
			pst.setInt(6,rollno);
			
			
			
			//Step5&6----- Execute & Process the query
			int c1 = pst.executeUpdate();
			
			if(c1!=0)
			{ 
				System.out.println("--------------------------------");
				System.out.println("Data Insertion Done Successfully");
				System.out.println("--------------------------------");
			}
			else
			{
				System.out.println("----------------------");
				System.err.println("Data Insertion Failure");
				System.out.println("----------------------");
			}
			
			
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}

}
