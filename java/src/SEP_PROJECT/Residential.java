package SEP_PROJECT;



public class Residential extends Project
{
  private int bathRoomsNo = 1;
  private int kitchensNo = 1;
  private int otherRoomsNo = 1;
  private boolean isNewBuild = true;


  public Residential(String name, int timeline, int size, int bathRoomsNo, int kitchensNo, int otherRoomsNo, boolean isNewBuild)
  {
    super(name, 10000,50000, timeline, size);
    this.bathRoomsNo = bathRoomsNo;
    this.kitchensNo = kitchensNo;
    this.otherRoomsNo = otherRoomsNo;
    this.isNewBuild=isNewBuild;
  }

  public Residential(int size)
  {
    super(" Man",100000,50000,9,size);
  }




  //  public void setDefault()
  //  {
  //    this.bathRoomsNo = 1;
  //    this.kitchensNo = 1;
  //    this.otherRoomsNo = 1;
  //  }


  public int getBathRoomsNo()
  {
    return bathRoomsNo;
  }

  public void setBathRoomsNo(int bathRoomsNo)
  {
    this.bathRoomsNo = bathRoomsNo;
  }

  public int getKitchensNo()
  {
    return kitchensNo;
  }

  public void setKitchensNo(int kitchensNo)
  {
    this.kitchensNo = kitchensNo;
  }


  public int getOtherRoomsNo()
  {
    return otherRoomsNo;
  }

  public void setOtherRoomsNo(int otherRoomsNo)
  {
    this.otherRoomsNo = otherRoomsNo;
  }


  public boolean isNewBuild()
  {
    return isNewBuild;
  }

  public void setNewBuild(boolean newBuild)
  {
    isNewBuild = newBuild;
  }

  @Override
  public String getProjectType()
  {
    return "Residential";
  }

  public String toString()
  {
    return this.getProjectName();
  }
}