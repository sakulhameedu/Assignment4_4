import java.util.Scanner;  

class Employees      //parent class employee
{
    int age;
    String name, address, gender;
    Scanner get = new Scanner(System.in);  //Common employee details 
    Employees()
    {
        System.out.println("Enter Name of the Employee:");
        name = get.next();  
        System.out.println("Enter Gender of the Employee:");
        gender = get.next();  
        System.out.println("Enter Address of the Employee:");
        address = get.next(); 
        System.out.println("Enter Age:");
        age = get.nextInt();  
    }

    void display()               //printing common details
    {
        System.out.println("Employee Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Address: "+address);
    }
}

class Manager extends Employees    //subclass manager
{
    float salary;
    float bas;
    String des;

    Manager()         //manager details 
    {
        System.out.println("Enter Designation:");
        des = get.next(); 
        System.out.println("Enter basic:");
        bas = get.nextInt();  
        salary = bas +((bas/100)*15)+10000;
        
    }
    void display()    //manager salary calculation 
    {
        System.out.println("================================");
        System.out.println("Manager Details");
        System.out.println("================================");
        super.display();
        System.out.println("Salary calculation bas+((bas/100)*15)+100  for "+bas+" salary: Rs."+salary);
        System.out.println("Designation: "+des);
    }
}

class Trainee extends Employees  //subclass trainee
{
    double salary, bas;           //get details 
    Trainee()
    {    System.out.println("basci");
        bas = get.nextDouble();  
        
    }
    void calculatepay()   //calculating trainee salary
    {
            salary = bas+((bas/100)*10)+100;
    }

    void display()  //displaying  trainee details 
    {
        System.out.println("==============================");
        System.out.println("trainee Details");
        System.out.println("==============================");
        super.display();  //calling basic employee details 
        calculatepay();   //calculate function 
        System.out.println("designation: "+des);
        System.out.println("Salary calculation bas+((bas/100)*10)+100  for "+bas+" salary: Rs."+salary);
    }
}


