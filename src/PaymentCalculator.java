public class PaymentCalculator {

    private final static double ZUS = 1000;

    public static double nettoYearPayment(Employee employee) {
        double nYP = employee.getSalary()*12;

        return nYP;
    }

    public static double bruttoYearPayment(Employee employee) {
        double kwotaBrutto = employee.getSalary()*0.2;
        double bYP = 12* (ZUS + kwotaBrutto + employee.getSalary());

        return bYP;
    }
}
