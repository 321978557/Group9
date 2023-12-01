package SEP_PROJECT;

public class Commercial extends Project
{
  private int floorsNo;
  private String usage;
  public Commercial(String name,int budget,int timeline,int size,int floorsNo,String usage){
    super(name,500000, 2000000, timeline, size);
    this.usage=usage;
    this.floorsNo = floorsNo;
    this.usage = usage;
  }
  public void setDefault(int floorsNo,int timelineRange,int budgetRange){
    this.floorsNo = floorsNo;
  }
  public int getFloorsNo(){
    return floorsNo;
  }
  public String getUsage(){

    return usage;

  }
  public boolean equals(Object obj){
    if(obj==null||getClass()!=obj.getClass()){
      return false;
    }
    Commercial other=(Commercial)obj;
    return usage==other.usage;
  }
  public String getProjectType(){
    return "Commercial";
  }
}
