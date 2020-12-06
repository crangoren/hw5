package homework5;

public class Employee {

   private String firstLastName;
   private String position;
   private String emailAddress;
   private String phoneNumber;
   private int salary;
   int age;

    @Override
    public String toString() {
        return "Сотрудник " +
                "ФИО - '" + firstLastName + '\'' +
                ", Должность - '" + position + '\'' +
                ", эл. почта - '" + emailAddress + '\'' +
                ", номер телефона - '" + phoneNumber + '\'' +
                ", зарплата - " + salary +
                ", возраст - " + age;
    }


    public Employee(String firstLastName, String position, String emailAddress, String phoneNumber, int salary, int age) {
        this.firstLastName = firstLastName;
        this.position = position;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;



    }
    void info() {
        System.out.printf("Employee %s, %s, %d \n", firstLastName, position, age);
    }

}





