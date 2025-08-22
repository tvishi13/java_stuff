class Employee {
    int id;
    String name;
    double[] salaries;   
  Employee(int id, String name, double[] salaries) {
        this.id = id;
        this.name = name;
        this.salaries = salaries;
    }
    double getTotalSalary() {
        double sum = 0;
        for (double s : salaries) {
            sum += s; }
        return sum;
    }}
public class EmployeeM {
    public static void main(String[] args) { 
        Employee[] employees = new Employee[3];
        employees[0] = new Employee(101, "Ram", new double[]{50000, 52000, 51000, 53000, 55000, 54000});
        employees[1] = new Employee(102, "Shayam", new double[]{45000, 47000, 46000, 48000, 49000, 50000});
        employees[2] = new Employee(103, "Khushi", new double[]{60000, 62000, 61000, 63000, 64000, 65000});
        Employee topEarner = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getTotalSalary() > topEarner.getTotalSalary()) {
                topEarner = employees[i];
            }
        }
        System.out.println("Employee with the highest total salary in 6 months:");
        System.out.println("ID: " + topEarner.id);
        System.out.println("Name: " + topEarner.name);
        System.out.println("Total Salary: " + topEarner.getTotalSalary());
    }
}
