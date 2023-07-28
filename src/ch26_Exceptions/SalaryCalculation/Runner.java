package ch26_Exceptions.SalaryCalculation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {


        Employee employee =
                new Employee(
                        "iclal hanim", 125000, 60, 2020);


        System.out.println("employee.getName() = " + employee.getName());
        System.out.println("employee.getSalary() = " + employee.getSalary());
        System.out.println("employee.tax() = " + employee.tax());
        System.out.println("employee.bonus() = " + employee.bonus());
        System.out.println("employee.raiseSalary() = " + employee.raiseSalary());

        System.out.println("employee = " + employee);

        salaryCalculate();


    }

    private static void salaryCalculate() {
        Scanner input = new Scanner(System.in);
        System.out.println("ismini gir");
        String name = input.nextLine().trim();

        System.out.println("maasini gir");
        int salary = 0;
        int workHours = 0;
        int year = 0;
        try {
            salary = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("hatali giriş yaptınız");
            salaryCalculate();
        }

        System.out.println("çalışma saati gir");
        try {
            workHours = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("hatali giriş yaptınız");
            salaryCalculate();
        }

        System.out.println("çalışam yılını gir");
        try {
            year = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("hatali giriş yaptınız");
            salaryCalculate();
        }

        Employee employee = new Employee(name,salary,workHours,year);

        System.out.println("employee.getName() = " + employee.getName());
        System.out.println("employee.getSalary() = " + employee.getSalary());
        System.out.println("employee.tax() = " + employee.tax());
        System.out.println("employee.bonus() = " + employee.bonus());
        System.out.println("employee.raiseSalary() = " + employee.raiseSalary());

        System.out.println("employee = " + employee);
    }
}

