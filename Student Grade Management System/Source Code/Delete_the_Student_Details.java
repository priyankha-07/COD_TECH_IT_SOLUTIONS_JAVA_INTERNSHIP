package Student_Grade_Management_System;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete_the_Student_Details {
	
	Scanner sc = new Scanner(System.in);
	
	
	public void deleteStudentDetails(Connection con)
	{
		System.out.print("Please input the RollNo of the student you wish to remove:");
		int roll_number  = sc.nextInt();
		
		String query = "DELETE FROM stu_details WHERE Roll_No = ?"; 
		//Step4------- Create a Statement
				PreparedStatement psmt;
				try {
					psmt = con.prepareStatement(query);
					
					psmt.setInt(1,roll_number);
					
					
					//Step5&6----- Execute & Process the query
					int count = psmt.executeUpdate();
					

					if(count!=0)
					{
						System.out.println("-------------------------------");
						System.out.println("Data Deletion Done Successfully");
						System.out.println("-------------------------------");
					}
					else
					{
						System.out.println("---------------------");
						System.out.println("Data Deletion Failure");
						System.out.println("---------------------");
					}
				}
				catch (SQLException e)
				{
					
					e.printStackTrace();
				}
	}
}
		
