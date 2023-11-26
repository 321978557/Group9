public class Residential extends Project
{
  private int bathroomsNo;
  private int kitchensNo;
  private int otherRoomsNo;
  private String constructionType;
  private boolean isNewBuild;
  public Residential( String name,int budget,int timeline,int size,int bathroomsNo,int kitchensNo,int otherRoomsNo,String constructionType,boolean isNewBuild){
    super(name,budget,timeline,size);
    this.bathroomsNo=bathroomsNo;
    this.kitchensNo=kitchensNo;
    this.otherRoomsNo=otherRoomsNo;
    this.constructionType=constructionType;
    this.isNewBuild=isNewBuild;

    //use是什么，是user还是什么其他东西
  }
  public void setDefault(int timeRange,int bathroomsNo,int kitchensNo,int otherRoomsNo){

    this.bathroomsNo = bathroomsNo;
    this.kitchensNo = kitchensNo;
    this.otherRoomsNo = otherRoomsNo;
  }

  public void setConstructionType(){
    this.constructionType = constructionType;
  }
  public int getBathrooms(){
    return bathroomsNo;
  }
  public int getKitchens(){
    return kitchensNo;
  }
  public int getOtherRoomsNo(){//为什么这里有No其他没有
    return otherRoomsNo;
  }
  public int getDefault(){//返回int?疯了吗？

  }
  public boolean equals(Object obj){
    if(obj==null||getClass()!=obj.getClass()){
      return false;
    }
    Residential other=(Residential)obj;
    return constructionType==other.constructionType&&
            bathroomsNo==other.bathroomsNo&&
            kitchensNo==other.kitchensNo&&
            otherRoomsNo==other.otherRoomsNo;

  }

}
