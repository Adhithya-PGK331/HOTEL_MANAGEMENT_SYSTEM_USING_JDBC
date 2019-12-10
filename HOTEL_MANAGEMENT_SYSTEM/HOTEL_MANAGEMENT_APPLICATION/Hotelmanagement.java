package HOTEL_MANAGEMENT_APPLICATION;

import java.sql.SQLException;
import java.util.Scanner;


public class Hotelmanagement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("\n*************************************\n");
		System.out.println("	   Hotel Brewberrys		");
		System.out.println("\n*************************************\n");

		Hotelmanagement first=new Hotelmanagement();
		first.choice();//calling the method
	}

	public void choice() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);

		System.out.println("\t1.Admin login\n\t2.User login\n\t3.Exit");

		System.out.println("\nEnter your choice :\n");
		int n=s.nextInt();
		switch(n)
		{
		case 1:
			adminlogin ad=new adminlogin();
			ad.login();//login method
			ad.option();//method for doing processes inside admin login
			break;
		case 2:
			agentlogin ag=new agentlogin();
			userinsert us=new userinsert();
			ag.login();//agent login method
			ag.option();//method for doing processes inside agent login
			us.insertData();
			
			break;
		case 3:
			System.out.println("Logout Successfull..!!");
			System.exit(0);
		}

	}


}
