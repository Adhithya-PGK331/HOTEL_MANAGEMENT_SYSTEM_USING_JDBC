package HOTEL_MANAGEMENT_APPLICATION;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class adminlogin {
	public void login() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		ConnectionManager con=new ConnectionManager();//connection manager
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the username");
		String name=s.next();
		System.out.println("Enter the password");
		String pass=s.next();
		int flag=0;
		Statement st=con.getConnection().createStatement();
		ResultSet set=st.executeQuery("select * from adminlogin"); 
		while(set.next()) {
			//to display the values
			String name1=set.getString(1);
			String pw1=set.getString(2);
		
		if(name1.contentEquals(name)&& pass.contentEquals(pw1)) 
			flag=1;
		}
		if(flag==1) {

			System.out.println("Admin login successful");
			adminlogin ad=new adminlogin();
			ad.option();
		}
		else {
			System.out.println("Sorry..!! Incorrect details.\nLogin again\n");
		}
			
		Hotelmanagement first=new Hotelmanagement();
		first.choice();
	}

	public void option() throws ClassNotFoundException, SQLException {
		Scanner s=new Scanner(System.in);
		ConnectionManager con=new ConnectionManager();

		System.out.println("\nEnter your choice\n\t1.Add new product\n\t2.Display products\n\t3.Update products\n\t4.Remove products\n\t5.Back to homepage");
		int num=s.nextInt();
		if(num==1)
		{
			System.out.println("Enter the Product id");
			int pid=s.nextInt();
			System.out.println("Enter the Product name");
			String pname=s.next();
			System.out.println("Enter the stock availability of product");
			int minq=s.nextInt();
			System.out.println("Enter the Price");
			int price=s.nextInt();
			
			PreparedStatement sta=con.getConnection().prepareStatement("insert into addproduct(productid,productname,quantity,price) values(?,?,?,?)");
			//prepare statement
			//we are passing parameter (?) for the values. 
			//Its value will be set by calling the setter methods of PreparedStatement.
			sta.setInt(1,pid);
			sta.setString(2,pname);
			sta.setInt(3,minq);
			sta.setInt(4,price);
			
			sta.executeUpdate();//value will be updated to the database
			//Returns an integer representing the number of rows affected by the SQL statement.
			System.out.println("Details of new product inserted successfully..!!");
			con.getConnection().close();//5) Closing the connection
	
		}
		if(num==2) {
			Statement st=con.getConnection().createStatement();

			ResultSet r=st.executeQuery("select * from addproduct");//query to select the details of all students
			//objects returned from the query by repeatedly calling Statement
			System.out.println("************MENU************");
			while(r.next())//iterating the values of result
			{
				System.out.println("Product id\t-->\t"+r.getInt(1)+"\n"+"Product name\t-->\t"+r.getString(2)+"\n"+"Quantity\t-->\t"+r.getInt(3)+"\n"+"Price\t\t-->\t"+r.getInt(4)+" \n");
			}
			System.out.println("*******************************");

		}
		if(num==3) {
			int i=1,okk=0;
			java.sql.Statement s11=con.getConnection().createStatement();
			ResultSet r1=s11.executeQuery("select * from addproduct");

			System.out.println("\n");
			System.out.println("************MENU************");
			while(r1.next())
			{
			
			System.out.printf("***FOOD %d***\n",i);
			System.out.println("Product id\t-->\t"+r1.getInt(1)+"\n"+"Product name\t-->\t"+r1.getString(2)+"\n"+"Quantity\t-->\t"+r1.getInt(3)+"\n"+"Price\t\t-->\t"+r1.getInt(4)+" \n");
			i++;
			
			}		
			System.out.println("*******************************");

			System.out.println("\nEnter the id of product to update:");
			int id1=s.nextInt();
			ResultSet r12=s11.executeQuery("select * from addproduct");
			while(r12.next())
			{
				
				if(r12.getInt(1)==id1) {
					okk=1;
					break;
					
				}
					
				}
			if(okk==1)
			{
			System.out.println("1.Name  (2)\n2.Quantity(3)\n3.Price  (4)\nEnter number of fields you want to update:");
			  int c=s.nextInt();
			  System.out.println("Enter the field numbers to update");
			 int a[]=new int[c];
			  int j,up=0;
			  up=0;
			  for(j=0;j<c;j++)
			 {
			a[j]=s.nextInt();
			  }
			  for(j=0;j<c;j++)
			  {
				 
			  if(a[j]==2)
			 {
			  System.out.println("Enter the new name");
				String name1=s.next();
				
			  ResultSet r11=s11.executeQuery("select * from addproduct");
				int q=0,na=0;
				String na1="";
				while(r11.next())
				{
					
					if(r11.getInt(1)==id1) {
						 na1=r11.getString(2);
					na=1;
					break;
				}
				}
				if(na==1)
				{
				PreparedStatement p1r=(PreparedStatement) con.getConnection().prepareStatement("update addproduct set ProductName=? where Productid=?");
				p1r.setString(1,name1);
				p1r.setInt(2,id1);
				if(name1.equals(na1))
				up=0;
				p1r.executeUpdate();
				
				}
				else
				System.out.println("Not present");
				}
				if(a[j]==4)
			  {
			  System.out.println("Enter the new price");
				int price=s.nextInt();
			 ResultSet r11=s11.executeQuery("select * from addproduct");
				int p=1;
				while(r11.next())
				{
					
					if(r11.getInt(1)==id1) {
					p=1;
					break;
				}
				}
				if(p==1)
				{
				PreparedStatement p1r=(PreparedStatement) con.getConnection().prepareStatement("update addproduct set Price=? where Productid=?");
				p1r.setInt(1,price);
				p1r.setInt(2,id1);
				p1r.executeUpdate();
				}
				else
				System.out.println("Not present");
				}
				if(a[j]==3)
				{
			int total=0;
				System.out.println("Enter the new quantity");
				int qnt=s.nextInt();
				int q=0;
				if(up==0)
				{
				ResultSet r11=s11.executeQuery("select * from addproduct");
				while(r11.next())
				{
					
					if(r11.getInt(1)==id1) {
						q=r11.getInt(3);
						break;
				}}
				}
				else
					q=0;
					total=qnt+q;
					
					
					PreparedStatement p1r=(PreparedStatement) con.getConnection().prepareStatement("update addproduct set quantity=? where productid=?");
					p1r.setInt(1,total);
					p1r.setInt(2,id1);
					p1r.executeUpdate();
					}}
				con.getConnection().close();
				
				
				}
		
			System.out.println("Product details updated successfully..!!");
		}
		
		if(num==4) {
			System.out.println("Enter the id to remove the product :");
			int id=s.nextInt();
			PreparedStatement sta=con.getConnection().prepareStatement("delete from addproduct where productid=?");
			sta.setInt(1, id);
			sta.executeUpdate();
			System.out.println("\nProduct removed successfully..!!");
			
		}
		if(num==5) {
			System.out.println("\nRedirecting to homepage shortly......\n");
			return;
		}
		adminlogin ad=new adminlogin();
		ad.option();
	}

}
