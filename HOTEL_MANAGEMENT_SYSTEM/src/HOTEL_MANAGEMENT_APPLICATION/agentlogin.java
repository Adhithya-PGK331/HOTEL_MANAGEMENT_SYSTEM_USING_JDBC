package HOTEL_MANAGEMENT_APPLICATION;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class agentlogin {
	Scanner s=new Scanner(System.in);

	ConnectionManager con=new ConnectionManager();

	public void login() throws ClassNotFoundException, SQLException {
		System.out.println("\n\t1.New Customer\n\t2.Already registered\n\t3.Back to homepage\n");
		int n=s.nextInt();
		if(n==1) {
			userinsert us=new userinsert();
			us.insertData();
		}
		if(n==2) {
			System.out.println("Enter the username");
			String name=s.next();
			System.out.println("Enter the password");
			String pass=s.next();
			int flag=0;
			Statement st=con.getConnection().createStatement();
			ResultSet set=st.executeQuery("select * from agentlogin"); 
			while(set.next()) {
				//to display the values
				String name1=set.getString(1);
				String pw1=set.getString(2);
			
			if(name1.contentEquals(name)&& pass.contentEquals(pw1)) 
				flag=1;
			}
			if(flag==1) {
				
				System.out.println("Agent login successful");		
				agentlogin ag=new agentlogin();
				ag.option();
			}
			else {
				System.out.println("Details are incorrect");
			}
			
			
		}
		else {
			Hotelmanagement first=new Hotelmanagement();
			first.choice();
			}
		
	}

	public void option() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("\nEnter your choice\n\t1)Buy an item\n\t2)View items\n\t3)Back to homepage");
		int num=s.nextInt();
		if(num==1)
		{
			Statement st=con.getConnection().createStatement();

			ResultSet r=st.executeQuery("select * from addproduct");

			while(r.next())//iterating the values of result
			{
				System.out.println("Product id\t-->\t"+r.getInt(1)+"\n"+"Product name\t-->\t"+r.getString(2)+"\n"+"Quantity\t-->\t"+r.getInt(3)+"\n"+"Price\t\t-->\t"+r.getInt(4)+" \n");
			}
			System.out.println("*******************************");

			
			System.out.println("Enter the Product id you want to buy");
			int buy =s.nextInt();
			System.out.println("Quantity");
			int quan=s.nextInt();
			int pri,tot,qa;
			ResultSet resu=st.executeQuery("select * from addproduct");
			while(resu.next()) {
				int id=resu.getInt(1);
				if(id==buy) {
					pri=resu.getInt(4);//price
					qa=resu.getInt(3);//quantity
					tot=pri*quan;
					System.out.println("Please select the option you want to continue with ");
					System.out.println("\n1.Take away\n2.Home delivery\n3.Table reservation\n");
					int ch=s.nextInt();
					if(ch==1) {
						System.out.println("Cost-->"+tot);
					}
					else if(ch==2) {
						tot=tot+50;
						System.out.println("Cost-->"+tot);

					}
					else if(ch==3) {
						tot=tot+100;
						System.out.println("Cost-->"+tot);
					}
					System.out.println("Enter 1 if you want to continue");
					int enter=s.nextInt();
					if(enter==1) {
						//System.out.println("Booking confirmed");

						//System.out.println("*******************************");
						System.out.println("Your Bill");
						System.out.println("***********************************************");
						System.out.println("Productid:  "+id+" Quantity:  "+quan+" Price:  "+tot);						
						System.out.println("***********************************************");
						int ta=qa-quan;
						PreparedStatement sta=con.getConnection().prepareStatement("update addproduct set quantity=? where productid=?");
						sta.setInt(1, ta);
						sta.setInt(2,buy);
						sta.executeUpdate();
					}
					
				}
			}
			con.getConnection().close();//5) Closing the connection
		}
		if(num==2) {
			ConnectionManager con=new ConnectionManager();
			Hotelmanagement first=new Hotelmanagement();
			int i=1;
			System.out.println("List of products--->>");
			System.out.println("*******************************");
			Statement st=con.getConnection().createStatement();

			ResultSet r=st.executeQuery("select * from addproduct");//query to select the details of all students
			//objects returned from the query by repeatedly calling Statement
			System.out.println("Details-->");
			while(r.next())//iterating the values of result
			{
				System.out.println("Product details "+i);
				System.out.println("Product id\t-->\t"+r.getInt(1)+"\n"+"Product name\t-->\t"+r.getString(2)+"\n"+"Quantity\t-->\t"+r.getInt(3)+"\n"+"Price\t\t-->\t"+r.getInt(4)+" \n");
				i++;
			}
			System.out.println("*******************************");

			
			}
			if(num==3) {
				System.out.println("\nRedirecting to homepage shortly......\n");
				Hotelmanagement first=new Hotelmanagement();
				first.choice();
			}
			agentlogin ag=new agentlogin();
			ag.option();
		}
	}
