import java.util.Scanner;

public interface Taxable {
    double salesTax=0.07;
    double incomeTax=0.105;
   abstract void calcTax();

}

class Employee implements Taxable{

      int empId;
       String name;
      double salary;

    @Override
    public void calcTax() {

        System.out.println("Income tax of employee on yearly salary by applying 10.5% of tax " + salary * incomeTax);

    }
}


class Product implements Taxable{
      int pid;
     double price;
    int quantity;

    @Override
    public void calcTax() {
        System.out.println("Sales tax on unit price of product by applying 7% of tax : " + (quantity*price) * salesTax);
    }
}

class DriverMain{

    public static void main(String[] args) {


        Employee employee = new Employee();
        Product product = new Product();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Employee details");
        System.out.println("Enter the Employee Id:");
        employee.empId = scanner.nextInt();
        System.out.println("Enter the Employee name:");
        employee.name = scanner.next();

        System.out.println("Enter the salary:");
        employee.salary = scanner.nextDouble();

        System.out.println("Enter the product details:");
        System.out.println("Enter the product Id:");
        product.pid = scanner.nextInt();
        System.out.println("Enter the product price:");
        product.price = scanner.nextDouble();
        System.out.println("Enter the quantity of product:");
        product.quantity = scanner.nextInt();

        employee.calcTax();
        product.calcTax();

    }
}