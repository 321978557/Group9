package SEP_PROJECT;

public class Resources
{
  private double expenses;
  private double hours;
  private double totalHours;
  private double totalExpenses;

  public Resources(double expenses, double hours, double totalHours,
      double totalExpenses)
  {
    this.expenses = expenses;
    this.hours = hours;
    this.totalHours = totalHours;
    this.totalExpenses = totalExpenses;
  }

  public double getExpenses()
  {
    return expenses;
  }

  public void setExpenses(double expenses)
  {
    this.expenses = expenses;
  }

  public double getHours()
  {
    return hours;
  }

  public void setHours(double hours)
  {
    this.hours = hours;
  }

  public double getTotalHours()
  {
    return totalHours;
  }

  public void setTotalHours(double totalHours)
  {
    this.totalHours = totalHours;
  }

  public double getTotalExpenses()
  {
    return totalExpenses;
  }

  public void setTotalExpenses(double totalExpenses)
  {
    this.totalExpenses = totalExpenses;
  }

  public double getRemainingHours()
  {
    return totalHours - hours;
  }

  public double getRemainingExpenses()
  {
    return totalExpenses - expenses;
  }
}
