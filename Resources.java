public class ${NAME}
{
  private double expenses;
  private double hours;
  private double totalHours;
  private double totalExpenses;
  public ${NAME}(double expenses, double hours, double totalHours, double totalExpenses)
  {
    this.expenses=expenses;
    this.hours=hours;
    this.totalHours=totalHours;
    this.totalExpenses=totalExpenses;
  }
  public double countUsed()
  {
    return used${NAME}();
  }
  private double used${NAME}()
  {
    //return "Hours used: "+hours+" ;  " + "Expenses: " + expenses;
    return expenses+hours;
  }
  public double getCountUsed()
  {
    return countUsed();
  }
  public void updateUsed(double totalHours)
  {
  }
  public double getTotalHoursSubtractedFromUsedHours()
  {
    return hours-totalHours;
  }
  // private double calculateHourlyExpense() {
  //        return totalExpenses / totalHours;
  //    }
}
