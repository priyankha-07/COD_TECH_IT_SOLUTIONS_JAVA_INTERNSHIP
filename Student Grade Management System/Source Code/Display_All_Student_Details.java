package Student_Grade_Management_System;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Display_All_Student_Details {
	
	
	public void displayDetails(Connection con) {
		
		//Step3-issue the query
		
		String query = "Select * from stu_details";
		
		try {
			//Step-4 Create a statement 
			Statement stmt = con.createStatement();
			
			//Step-5 Execute the Query
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("Roll_Number\tStudent_Name \tDept \t Sub1_Mark \tSub2_Mark \tSub3_Mark \tTotal \tGrade");
			System.out.println("-------------------------------------------------------------------------------------------------------");
			
			//Step6-----Process the query
			while(rs.next()) 
			{
				int roll_Number = rs.getInt(1);
				String student_Name = rs.getString(2);
				String dept = rs.getString(3);
				int sub1 = rs.getInt(4);
				int sub2 = rs.getInt(5);
				int sub3 = rs.getInt(6);
				int total = rs.getInt(7);
				String grade = rs.getString(8);
				
				System.out.println(roll_Number+"\t\t "+student_Name+"\t\t"+dept+"\t " +sub1+"\t\t"+ sub2+ "\t\t" + sub3+ "\t\t" + total + " \t" +grade);
				System.out.println("  ");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
