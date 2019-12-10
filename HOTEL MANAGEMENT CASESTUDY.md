HOTEL MANAGEMENT SYSTEM

DATABASE	 & SERVER	:

	Database name:	Hotelmanagement

	Server		:	 localhost

TABLES  &  FIELDS 	:	

	Table1:	adminlogin(username, password)

	Table2:	userlogin   (username, password)

	Table3:	addproduct(productid, productname, quantity, price)

The above are the some of the things you need to notice while doing this case-study.

Step 1 :
	The program should display the menu as follows
	1. Admin Login (Fields : Username, Password)
	2. User Login 	(Fields : Username, Password)
	3. Exit
Step 2:
	 If 1 is pressed, get the admin login details and validate. On valid login, show the below menu
	1. Add Product (Fields : Product Id, Product Name, Quantity, Price)
	2. Display Products ( Product Id , Product Name, Quantity, Price)
	3. Update Products => While selecting this it should display the product details as well as ask for product id and number of fields you want to update and what are all the fields to be updated.
	4.Remove Products=> This will ask for the product id to delete the intended product. Just give the id and it should remove the product form entire menu.
	5. Back to homepage =>While selecting this option you show go back to the home page. And it must show the menu of home page as in Step1.
Step:3 :
If 2 is pressed(from Step 1 menu), it must shows another menu to get user login details.
	1. New Customer
	2. Already registered
	3. Back to homepage
If 1st Option is selected ask for new username and password to register and after that show the menu again for logging in.
If 2nd Option is chosen then ask for username and password. Enter the details. If the details are correct the user will be successfully logged in and he get options to view products and to buy them.
If 3rd Option is selected, it will redirect the user to home page.
Inside the user login page, the user will be able to view products and can buy products.
	1.Buy an item
	2.View items
	3.Back to homepage
While option 1 is chosen the user will be able to buy a product by entering the product id, quantity. Then he will be asked for whether he wants home delivery, table booking.
	1.Take away
	2.Home Delivery
	3.Table Reservation
If any of the options are chosen then it will calculate the cost corresponding to the selected option.Then booking confirmation will be asked and while confirmation the bill will be generated.
When option 2 is chosen the user may be able to view items. The displayed item’s quantity will be updated by reducing the quantity of items bought by any user.
While option 3 is chosen the user will be redirected to home page.
The message will be printed as “Logout Successfull”.
Step:4 :
While selecting this option it will exits the program.
OUTPUT:

*************************************

	   Hotel Brewberrys		

*************************************

	1.Admin login
	2.User login
	3.Exit

Enter your choice :

1
Enter the username
admin
Enter the password
admin123
Admin login successful

Enter your choice
	1.Add new product
	2.Display products
	3.Update products
	4.Remove products
	5.Back to homepage
1
Enter the Product id
7
Enter the Product name
CAKE
Enter the stock availability of product
5
Enter the Price
50
Details of new product inserted successfully..!!

Enter your choice
	1.Add new product
	2.Display products
	3.Update products
	4.Remove products
	5.Back to homepage
2
************MENU************
Product id	-->	1
Product name	-->	CHICKENFRY
Quantity	-->	91
Price		-->	150

Product id	-->	2
Product name	-->	PAROTTA
Quantity	-->	100
Price		-->	10

Product id	-->	3
Product name	-->	CHAPATHI
Quantity	-->	250
Price		-->	7

Product id	-->	4
Product name	-->	SHAWARMA
Quantity	-->	80
Price		-->	60

Product id	-->	5
Product name	-->	SHAWAYA
Quantity	-->	33
Price		-->	400

Product id	-->	7
Product name	-->	CAKE
Quantity	-->	5
Price		-->	50

*******************************

Enter your choice
	1.Add new product
	2.Display products
	3.Update products
	4.Remove products
	5.Back to homepage
3


************MENU************
***FOOD 1***
Product id	-->	1
Product name	-->	CHICKENFRY
Quantity	-->	91
Price		-->	150

***FOOD 2***
Product id	-->	2
Product name	-->	PAROTTA
Quantity	-->	100
Price		-->	10

***FOOD 3***
Product id	-->	3
Product name	-->	CHAPATHI
Quantity	-->	250
Price		-->	7

***FOOD 4***
Product id	-->	4
Product name	-->	SHAWARMA
Quantity	-->	80
Price		-->	60

***FOOD 5***
Product id	-->	5
Product name	-->	SHAWAYA
Quantity	-->	33
Price		-->	400

***FOOD 6***
Product id	-->	7
Product name	-->	CAKE
Quantity	-->	5
Price		-->	50

*******************************

Enter the id of product to update:
1
1.Name  (2)
2.Quantity(3)
3.Price  (4)
Enter number of fields you want to update:
3
Enter the field numbers to update
3
2
4
Enter the new quantity
58
Enter the new name
NOODLES
Enter the new price
120
Product details updated successfully..!!

Enter your choice
	1.Add new product
	2.Display products
	3.Update products
	4.Remove products
	5.Back to homepage
2
************MENU************
Product id	-->	1
Product name	-->	NOODLES
Quantity	-->	149
Price		-->	120

Product id	-->	2
Product name	-->	PAROTTA
Quantity	-->	100
Price		-->	10

Product id	-->	3
Product name	-->	CHAPATHI
Quantity	-->	250
Price		-->	7

Product id	-->	4
Product name	-->	SHAWARMA
Quantity	-->	80
Price		-->	60

Product id	-->	5
Product name	-->	SHAWAYA
Quantity	-->	33
Price		-->	400

Product id	-->	7
Product name	-->	CAKE
Quantity	-->	5
Price		-->	50

*******************************

Enter your choice
	1.Add new product
	2.Display products
	3.Update products
	4.Remove products
	5.Back to homepage
4
Enter the id to remove the product :
7

Product removed successfully..!!

Enter your choice
	1.Add new product
	2.Display products
	3.Update products
	4.Remove products
	5.Back to homepage
2
************MENU************
Product id	-->	1
Product name	-->	NOODLES
Quantity	-->	149
Price		-->	120

Product id	-->	2
Product name	-->	PAROTTA
Quantity	-->	100
Price		-->	10

Product id	-->	3
Product name	-->	CHAPATHI
Quantity	-->	250
Price		-->	7

Product id	-->	4
Product name	-->	SHAWARMA
Quantity	-->	80
Price		-->	60

Product id	-->	5
Product name	-->	SHAWAYA
Quantity	-->	33
Price		-->	400

*******************************

Enter your choice
	1.Add new product
	2.Display products
	3.Update products
	4.Remove products
	5.Back to homepage
5

Redirecting to homepage shortly......

	1.Admin login
	2.User login
	3.Exit

Enter your choice :

2

	1.New Customer
	2.Already registered
	3.Back to homepage

1
1
Enter the username you want to in correct format:
(only lowercase characters allowed)
pirate
Enter the password in correct format:
(only lowercase characters allowed)
johny
VALID USER NAME
VALID PASSWORD
Your account created successfully.

	1.New Customer
	2.Already registered
	3.Back to homepage
Enter your choice
2
Enter the username
pirate
Enter the password
Johny

Agent login successful

	1)Buy an item
	2)View items
	3)Back to homepage
2
List of products--->>
*******************************
Details-->
Product details 1
Product id	-->	1
Product name	-->	NOODLES
Quantity	-->	147
Price		-->	120

Product details 2
Product id	-->	2
Product name	-->	PAROTTA
Quantity	-->	100
Price		-->	10

Product details 3
Product id	-->	3
Product name	-->	CHAPATHI
Quantity	-->	250
Price		-->	7

Product details 4
Product id	-->	4
Product name	-->	SHAWARMA
Quantity	-->	80
Price		-->	60

Product details 5
Product id	-->	5
Product name	-->	SHAWAYA
Quantity	-->	33
Price		-->	400

*******************************

Enter your choice
	1)Buy an item
	2)View items
	3)Back to homepage
1
Product id	-->	1
Product name	-->	NOODLES
Quantity	-->	147
Price		-->	120

Product id	-->	2
Product name	-->	PAROTTA
Quantity	-->	100
Price		-->	10

Product id	-->	3
Product name	-->	CHAPATHI
Quantity	-->	250
Price		-->	7

Product id	-->	4
Product name	-->	SHAWARMA
Quantity	-->	80
Price		-->	60

Product id	-->	5
Product name	-->	SHAWAYA
Quantity	-->	33
Price		-->	400

*******************************
Enter the Product id you want to buy
1
Quantity
1
Please select the option you want to continue with

1.Take away
2.Home delivery
3.Table reservation

3
Cost-->220
Enter 1 if you want to continue
1
Your Bill
***********************************************
Productid:  1 Quantity:  1 Price:  120
***********************************************

Enter your choice
	1)Buy an item
	2)View items
	3)Back to homepage
2
List of products--->>
*******************************
Details-->
Product details 1
Product id	-->	1
Product name	-->	NOODLES
Quantity	-->	146
Price		-->	120

Product details 2
Product id	-->	2
Product name	-->	PAROTTA
Quantity	-->	100
Price		-->	10

Product details 3
Product id	-->	3
Product name	-->	CHAPATHI
Quantity	-->	250
Price		-->	7

Product details 4
Product id	-->	4
Product name	-->	SHAWARMA
Quantity	-->	80
Price		-->	60

Product details 5
Product id	-->	5
Product name	-->	SHAWAYA
Quantity	-->	33
Price		-->	400

*******************************

Enter your choice
	1)Buy an item
	2)View items
	3)Back to homepage
3

Redirecting to homepage shortly......

	1.Admin login
	2.User login
	3.Exit

Enter your choice :

3
Logout Successfull..!!
