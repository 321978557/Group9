public class Commercial
{
  private int budgetRange;
  private int timelineRange;
  private int floorsNo;
  private String usage;
  public Commercial(int floorsNo,String use){
    this.floorsNo = floorsNo;
    //use?
  }
  public void setDefault(int floorsNo,int timelineRange,int budgetRange){
    this.floorsNo = floorsNo;
    this.timelineRange = timelineRange;
    this.budgetRange = budgetRange;
  }
  public int getFloorsNo(){
    return floorsNo;
  }
  public String getUsage(){

  }
  public boolean equals(Object obj){

  }
}
