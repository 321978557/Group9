package SEP_PROJECT;

public class Industrial extends Project
{

  private String constructionType;
  public Industrial(String name,double budgetRangeMin,double budgetRangeMax,int timeline,int size,String constructionType){
    super(name,budgetRangeMin,budgetRangeMax,timeline,size);
    this.constructionType = constructionType;
  }

  public boolean equals(Object obj){
    if(obj==null||getClass()!=obj.getClass())
    {return false;
    }
    Industrial other=(Industrial)obj;
    return constructionType==other.constructionType;
  }
  public String getProjectType(){//这里直接就type?
     return constructionType;
  }
}
