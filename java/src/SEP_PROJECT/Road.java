package SEP_PROJECT;

public class Road extends Project
{
  private int floors;
  private String usage;
  private String challenges;
  private int otherConstructions;
  private int length;
  private int width;
  public Road(String name,int budget,int timeline,int size,int floors,String usage,int otherConstructions,int length,int width){
    super(name,budget,timeline,size);
    this.floors=floors;
    this.usage=usage;
    this.otherConstructions=otherConstructions;
    this.length=length;
    this.width=width;

  }
  public int getFloors(){
    return floors;
  }
  public String getUsage(){
    return usage;
  }
  public boolean equals(Object obj){
    if(obj==null|| getClass()!=obj.getClass()){
      return false;
    }
    Road other=(Road)obj;
    return floors==other.floors&&
           usage==other.usage&&
           challenges==other.challenges&&
           otherConstructions==other.otherConstructions&&
            length==other.length&&
            width==other.width;

  }

  public void setDefault(int timeRange,int otherConstructions,String challenges){//diagrame中这里是int
    this.otherConstructions = otherConstructions;
    this.challenges = challenges;
  }
}
