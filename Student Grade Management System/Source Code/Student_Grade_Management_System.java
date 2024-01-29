package Student_Grade_Management_System;

public class Student_Grade_Management_System {
	
	public static void main(String[] args) {
		
		
		System.out.println("Welcome to Student Grade Management System!!");
		System.out.println("============================================");
		
		StudentDatabaseLogic sdl = new StudentDatabaseLogic();
		
		sdl.executeLogic();
	}

}
