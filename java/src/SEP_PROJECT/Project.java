package SEP_PROJECT;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public abstract class Project
{
  private double budgetRangeMin;
  private double budgetRangeMax;
  private int timeLine;
  private int size;
  public abstract String getProjectType();
  private String projectName;
  private boolean isCompleted = false;

  public Project(double budgetRangeMin, double budgetRangeMax, int timeLine,
      int size)
  {
    this.budgetRangeMin = budgetRangeMin;
    this.budgetRangeMax = budgetRangeMax;
    this.timeLine = timeLine;
    this.size = size;
  }

  @XmlElement
  public String getProjectName()
  {
    return projectName;
  }

  public void setProjectName(String projectName)
  {
    this.projectName = projectName;
  }

  @XmlElement
  public double getBudgetRangeMin()
  {
    return budgetRangeMin;
  }

  public void setBudgetRangeMin(double budgetRangeMin)
  {
    this.budgetRangeMin = budgetRangeMin;
  }

  @XmlElement
  public double getBudgetRangeMax()
  {
    return budgetRangeMax;
  }

  public void setBudgetRangeMax(double budgetRangeMax)
  {
    this.budgetRangeMax = budgetRangeMax;
  }

  @XmlElement
  public int getTimeLine()
  {
    return timeLine;
  }

  public void setTimeLine(int timeLine)
  {
    this.timeLine = timeLine;
  }

  @XmlElement
  public int getSize()
  {
    return size;
  }

  public void setSize(int size)
  {
    this.size = size;
  }

  @XmlElement
  public boolean isCompleted()
  {
    return isCompleted;
  }

  public void setIsCompleted(boolean completed) {
    this.isCompleted = completed;
  }


}
