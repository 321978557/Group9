public class Residential
{
  private int bathroomsNo;
  private int kitchensNo;
  private int otherRoomsNo;
  private String constructionType;
  private int budgetRange;
  private int timeRange;
  private boolean isNewBuild;
  public Residential(int bathroomsNo,int kitchensNo,int otherRoomsNo,String use){
    this.setDefault(0,bathroomsNo,kitchensNo,otherRoomsNo);
    //use是什么，是user还是什么其他东西
  }
  public void setDefault(int timeRange,int bathroomsNo,int kitchensNo,int otherRoomsNo){
    this.timeRange = timeRange;
    this.bathroomsNo = bathroomsNo;
    this.kitchensNo = kitchensNo;
    this.otherRoomsNo = otherRoomsNo;
  }
  public void setBudgetRange(int budgetRange){
    this.budgetRange = budgetRange;
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

  }

}
