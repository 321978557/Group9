public class ${NAME}
{
  private String lastName;
  private String firstName;
  private String ID;
  public ${NAME}(String firstName, String lastName, String ID)
  {
    this.firstName=firstName;
    this.lastName=lastName;
    this.ID=ID;
  }
  public String Customer(String ID, String firstName, String lastName)
  {
    return "First name: " + firstName+";" +"Last name: "+ lastName+";" +"ID: " + ID;
  }
}
