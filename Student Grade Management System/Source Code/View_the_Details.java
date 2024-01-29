package Student_Grade_Management_System;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class View_the_Details {

    public void viewDetails(Connection con, int rollnumber) {

        // Step3 - issue the query
        String query = "SELECT * FROM stu_details WHERE Roll_No = ?";

        try {
            // Step-4 Create a prepared statement
            PreparedStatement pstmt = con.prepareStatement(query);

            // Step-5 Set the parameter for the query
            pstmt.setInt(1, rollnumber);

            // Step-6 Execute the Query
            ResultSet rs = pstmt.executeQuery();
            System.out.println("Roll_Number\tStudent_Name \tDept \t Sub1_Mark \tSub2_Mark \tSub3_Mark \tTotal \tGrade");
			System.out.println("-------------------------------------------------------------------------------------------------------");
            // Step-7 Process the query
            while (rs.next()) {
                int rollNumber = rs.getInt(1);
                String student_Name = rs.getString(2);
                String dept = rs.getString(3);
                int sub1 = rs.getInt(4);
                int sub2 = rs.getInt(5);
                int sub3 = rs.getInt(6);
                int total = rs.getInt(7);
                String grade = rs.getString(8);

               
                System.out.println(rollNumber+"\t\t "+student_Name+"\t\t"+dept+"\t " +sub1+"\t\t"+ sub2+ "\t\t" + sub3+ "\t\t" + total + " \t" +grade);
				System.out.println("  ");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
