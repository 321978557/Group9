package SEP_PROJECT;

public class Road extends Project
{
  private int floors;
  private String usage;
  private String challenges;
  private int otherConstructions;
  private int length;
  private int width;
  public Road(String name, String challenges,int budget,int timeline,int size,int floors,String usage,int otherConstructions,int length,int width){
    super(name,1000000,5000000,timeline,size);
    this.floors=floors;
    this.usage=usage;
    this.otherConstructions=otherConstructions;
    this.length=length;
    this.width=width;
    this.challenges=challenges;

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

  @Override public String getProjectType()
  {
    return "Road";
  }
}
