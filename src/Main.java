//        MIELI BŁĄD W TREŚCI ZADANIA, WYKRYŁEM I POPRAWIŁEM :)

//        Napisz program, który będzie się składał z kilku klas.
//        Employee - reprezentuje pracownika, powinna posiadać co najmniej pola do przechowywania imienia, nazwiska i miesięcznej pensji
//        PaymentCalculator - kalkulator płac, który posiada metodę nettoYearPayment i bruttoYearPayment. Obie metody powinny przyjmować jako argument obiekt typu Employee. Pierwsza zwraca roczną sumę wypłat danego pracownika, natomiast druga zwraca roczną sumę wypłat wraz z dodatkowymi podatkami (ZUS, podatki do urzędu skarbowego). Dla uproszczenia przyjmujemy, że miesięczny koszt ZUS to 1000zł a podatek dochodowy wynosi 20%.
//        W klasie testowej utwórz przynajmniej jednego pracownika i oblicz jego roczną wypłatę oraz roczny całkowity koszt pracodawcy.
//
//        Przykładowo dla pracownika zarabiającego miesięcznie 3000zł powinniśmy otrzymać:
//
//        36000zł - bo 3000 * 12 = 36000
//
//        57000zł - bo 12*1000 + 12*3750 = 57000, gdzie 3750 to wypłata brutto, a 1000 to koszt zus.
// ~ot i nasz kwiatek. powinno być: 55200zł - bo 12*1000 + 12*(3000 + 0,2*3000) = 55200, gdzie 3000 to wypłata netto, a 1000 to koszt zus.
//
//        Zagadnienia przydatne do rozwiązania: definiowanie klas, metod i obiektów.

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Robert", "Pierwszyński", 3000);

        double nettoYearPayment = PaymentCalculator.nettoYearPayment(employee);
        double bruttoYearPayment = PaymentCalculator.bruttoYearPayment(employee);
        System.out.println("Roczna płaca netto to: "+nettoYearPayment);
        System.out.println("Roczna płaca brutto to: "+bruttoYearPayment);
    }
}
