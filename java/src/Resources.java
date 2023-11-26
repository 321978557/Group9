public class Resources
{
        private double expenses;
        private double hours;
        private double totalHours;
        private double totalExpenses;
        public Resources(double expenses, double hours, double totalHours, double totalExpenses) {
                this.expenses=expenses;
                this.hours=hours;
                this.totalHours=totalHours;
                this.totalExpenses=totalExpenses;
        }
        public double countUsed()//这东西我觉得不要用到

        {

        }
        private double usedResources() {
        //return "Hours used: "+hours+" ;  " + "Expenses: " + expenses;
                return expenses+hours;
        }
        public double getCountUsed()
        {
        return totalExpenses+totalHours;
        }
        public void updateUsed(double totalHours) {

        }
        public double getTotalHoursSubtractedFromUsedHours() {
                return hours-totalHours;
        }
        // private double calculateHourlyExpense() {
        //        return totalExpenses / totalHours;
        //    }
}
