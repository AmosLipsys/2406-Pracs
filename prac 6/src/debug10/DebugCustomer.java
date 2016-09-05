package debug10;

public class DebugCustomer
{
    int idNumber;
    String name;
    double creditLimit;
    public void DebugCustomer(int id, String name, double credit){
       idNumber = id;
       this.name = name;
       this.creditLimit = credit;
    }
    public void display()
    {
       System.out.println("Customer #" + idNumber + " Name: " +  name + "\nCredit limit $" + creditLimit);
    }
}
