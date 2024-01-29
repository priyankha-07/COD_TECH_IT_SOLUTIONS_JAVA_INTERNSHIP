package Student_Grade_Management_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentDatabaseLogic {

	public void executeLogic() {
		
		Scanner sc = new Scanner(System.in);
		//Display all student details
		Display_All_Student_Details dasd =new Display_All_Student_Details();
		//add student
		Add_the_Student as = new Add_the_Student();
		//delete student
		Delete_the_Student_Details dsd = new Delete_the_Student_Details();
		//update the mark
		Update_the_Mark um = new Update_the_Mark();
		//View _the details
		View_the_Details vd = new View_the_Details();
		//grade
		Grade g = new Grade();
		
		try {
			
			//Step1:loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step2:create connection
			String dburl ="jdbc:mysql://localhost:3306/student_detail?user=root&password=root";
			Connection con = DriverManager.getConnection(dburl);
			
			while(true) {
				System.out.println("Please Make a choice:\n---------------------");
				System.out.println("1.Teacher Login👩‍🏫\n2.Student Login👨‍\n3.Exit");
				int choice = sc.nextInt();
				
				switch(choice) 
				{
				case 1:
					System.out.println("============================================");
					System.out.println("Teacher's Login Portal");
					System.out.println("----------------------");
					String username = "abc";
					String password = "abc";
					
					
					System.out.print("Enter username:");String name = sc.next();
					System.out.print("Enter Password:");String psd = sc.next();
					System.out.println("============================================");
					
					if(username.equals(name) && password.equals(psd)) {
						
						
						
						System.out.println("Teacher Portal: Welcome!");
						System.out.println("------------------------");

							
							
							while(true) {
								System.out.println("\nPlease choose an option to proceed:");
								System.out.println("-----------------------------------");
								System.out.println("1.Display all student details\n2.Add the Student\n3.Update the Mark\n4.Delete the Student Details\n5.Exit");
								int option = sc.nextInt();
								switch(option) {
								case 1:
									System.out.println("-------------------------------------------------------------------------------------------------------");
									dasd.displayDetails(con);
									System.out.println("=======================================================================================================");
									break;
								case 2:
									System.out.println("-------------------------------");
									as.addStudent(con);
									break;
								case 3:
									um.updateMark(con);
									break;
								case 4:
									dsd.deleteStudentDetails(con);
									break;
								case 5:
									System.out.println("--------------------------------------------");
									System.out.println("Thank you");
									System.out.println("============================================");
									break;
								default:System.err.println("---------------------------------------------");
										System.err.println("Invalid option please make a Correct Choice!!");
										System.err.println("---------------------------------------------");
								break;
									
				
								}
								if(option == 5) {
									break;
								}
							}	
						
					}
					else {
						System.err.println("Invalid Username and Password!!");
					}
					break;
				case 2:
					System.out.println("============================================");
					System.out.println("Student Login Portal");
					System.out.println("----------------------");
					
					System.out.print("Enter the RollNumber:");int rollnumber = sc.nextInt();
					System.out.print("Enter your Name:");String stuname = sc.next();
					System.out.println("============================================");
					
					System.out.println("\nStudent Portal!! Welcome " + stuname);
					System.out.println("-------------------------------------");
					while(true) 
					{
						System.out.println("Please Make a choice:\n---------------------");
						System.out.println("1.View the Details\n2.Grade\n3.Exit");
						int option = sc.nextInt();
						
						switch(option) 
						{
						case 1:
							System.out.println("-------------------------------------------------------------------------------------------------------");
							vd.viewDetails(con,rollnumber);
							System.out.println("=======================================================================================================");
							break;
						case 2:
							System.out.println("----------");
							g.grade(con,rollnumber);
							System.out.println("============================================");
							break;
						case 3:
							System.out.println("---------------------");
							System.out.println("Thank you " + stuname);
							System.out.println("============================================");
							break;
							
						default:System.out.println("Invalid Option Please make a correct option");
						break;
						}
						
						if(option == 3) {
							break;
						}
					}
					
					
					
					
					
					break;
				
				case 3:
					System.out.println("============================================");
					System.out.println("Thank you");
					break;
				default:
						System.err.println("Invalid option please make a correct Choice!!");
						
				break;
					
				}
				if(choice == 3) {
					break;
				}
				
			}	
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		
	}
}
