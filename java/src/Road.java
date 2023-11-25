public class Road
{
  private int floors;
  private String usage;
  private int budgetRange;
  private int timeRange;
  private String challenges;
  private int otherConstructions;
  private int length;
  private int width;
  public Road(int floors,String use){

  }
  public int getFloors(){
    return floors;
  }
  public String getUsage(){
    return usage;
  }
  public boolean equals(Object obj){

  }
  
  public void setBudgetRange(){//diagrame????????

  }
  public void setTimeRange(int timeRange){//timelineRange?
    this.timeRange = timeRange;
  }

  public void setDefault(int timeRange,int otherConstructions,String challenges){//diagrame中这里是int
    this.timeRange = timeRange;
    this.otherConstructions = otherConstructions;
    this.challenges = challenges;
  }
}
