package SEP_PROJECT;



public abstract class Project
{
  private double budgetRangeMin;
  private double budgetRangeMax;
  private int timeLine;
  private int size;
  private String projectName;
  private boolean isCompleted = false;

  public Project(String name,double budgetRangeMin, double budgetRangeMax, int timeLine,
      int size)
  {
    this.budgetRangeMin = budgetRangeMin;
    this.budgetRangeMax = budgetRangeMax;
    this.timeLine = timeLine;
    this.size = size;
    this.projectName = name;
  }


  public String getProjectName()
  {
    return projectName;
  }

  public void setProjectName(String projectName)
  {
    this.projectName = projectName;
  }

  public double getBudgetRangeMin()
  {
    return budgetRangeMin;
  }

  public void setBudgetRangeMin(double budgetRangeMin)
  {
    this.budgetRangeMin = budgetRangeMin;
  }


  public double getBudgetRangeMax()
  {
    return budgetRangeMax;
  }

  public void setBudgetRangeMax(double budgetRangeMax)
  {
    this.budgetRangeMax = budgetRangeMax;
  }

  public int getTimeLine()
  {
    return timeLine;
  }

  public void setTimeLine(int timeLine)
  {
    this.timeLine = timeLine;
  }


  public int getSize()
  {
    return size;
  }

  public void setSize(int size)
  {
    this.size = size;
  }


  public boolean isCompleted()
  {
    return isCompleted;
  }

  public void setIsCompleted(boolean completed) {
    this.isCompleted = completed;
  }
  public abstract String getProjectType();


}
