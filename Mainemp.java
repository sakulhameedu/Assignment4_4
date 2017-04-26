
class Mainemp  //Main class 
{
    public static void main(String args[]) 
    {
        System.out.println("================================");
        System.out.println("Enter Manger Details");
        System.out.println("================================");
        Manager full = new Manager();       //calling manager subclass 
        System.out.println("================================");
        System.out.println("Enter Trainee Details");
        System.out.println("================================");
        Trainee part = new Trainee();     //calling trainee subclass 
        full.display();  //displaying manager details 
        part.display();  //displaying trainee details 
    }

}

