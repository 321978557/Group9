package SEP_PROJECT;

public class Customers
{
  private String firstName;
  private String lastName;
  private String ID;

  public Customers(String firstName, String lastName, String ID)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.ID = ID;
  }
  public String toString(){
    return "First Name: "+firstName+"Last Name: "+lastName+"ID: "+ID;
  }
}
