package Student_Grade_Management_System;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Grade {
	public void grade(Connection con,int rollnumber) 
	{
		// Step3 - issue the query
        String query = "SELECT Grade FROM stu_details WHERE Roll_No = ?";

        try {
            // Step-4 Create a prepared statement
            PreparedStatement pstmt = con.prepareStatement(query);

            // Step-5 Set the parameter for the query
            pstmt.setInt(1, rollnumber);

            // Step-6 Execute the Query
            ResultSet rs = pstmt.executeQuery();
            //System.out.println("Grade");
           

            // Step-7 Process the query
            
            while (rs.next()) {
                
                String grade = rs.getString(1);

                System.out.println( "Grade : " + grade);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

}
