package SEP_PROJECT;
//this is Corina s commentgdfgs

public class Commercial extends Project
{
  private int floorsNo;
  private String intendedUse;

  public Commercial(String name,int timeLine, int size, int floorsNo, String intendedUse)
  {
    super(name,500000, 2000000, timeLine, size);
    this.floorsNo = floorsNo;
    this.intendedUse = intendedUse;
  }

  public Commercial(String name,int size, String intendedUse, int timeLine)
  {
    super(name, 500000, 2000000,timeLine,size);
    this.intendedUse = intendedUse;
  }

  public int getFloorsNo()
  {
    return floorsNo;
  }

  public void setFloorsNo(int floorsNo)
  {
    this.floorsNo = floorsNo;
  }

  public String getIntendedUse()
  {
    return intendedUse;
  }

  public void setIntendedUse(String intendedUse)
  {
    this.intendedUse = intendedUse;
  }

  @Override
  public String getProjectType()
  {
    return "Commercial";
  }
}
