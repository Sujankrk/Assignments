public class HiLowHomeWork {
    public static void main(String[] args) {
        Salary Employee1= new Salary();
        Salary Employee2= new Salary();
        Salary Employee3= new Salary();

        Employee1.setEmployee("Sujan Karki",4600 );
        Employee2.setEmployee("Subodh Shrestha", 3800);
        Employee3.setEmployee("Roman Shreshta", 2700);

        Employee1.calculateSalary();
        Employee2.calculateSalary();
        Employee3.calculateSalary();

        Employee1.printSalary();
        Employee2.printSalary();
        Employee3.printSalary();


    }
}
class Salary{

    String salaryGrade;
    String employeeName;
    int employeeSalary;

    void setEmployee (String name, int salary){
        System.out.println("Setting Employee Name and Salary");
    employeeName=name;
    employeeSalary=salary;

    }
    void calculateSalary() {
        if (employeeSalary >= 2500 && employeeSalary < 3500)
            salaryGrade = "lowSalary";
        if (employeeSalary >= 3500 && employeeSalary < 4500)
            salaryGrade = "mediumSalary";
        if (employeeSalary >= 4500 && employeeSalary<7000)
            salaryGrade = "highSalary";
    }
    void printSalary (){
        System.out.println (employeeName+ ",Your salary is " +employeeSalary+ " and you fall under  " +salaryGrade);

}
}