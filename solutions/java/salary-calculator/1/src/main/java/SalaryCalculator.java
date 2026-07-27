public class SalaryCalculator {
    
    public double salaryMultiplier(int daysSkipped) {
    double salaryMult = daysSkipped < 5 ? 1: 0.85;
        return salaryMult;
    }

    public int bonusMultiplier(int productsSold) {
        int soldMult = productsSold < 20 ? 10: 13;
        return soldMult;
    }

    public double bonusForProductsSold(int productsSold) {
    double bonusForProductsSold= productsSold * bonusMultiplier(productsSold);
        return bonusForProductsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double finalSalary= 1000*salaryMultiplier(daysSkipped)+bonusForProductsSold( productsSold);
        finalSalary = finalSalary > 2000 ? 2000 : finalSalary;
        return finalSalary;
    } 
}
