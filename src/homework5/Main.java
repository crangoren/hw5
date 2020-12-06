package homework5;

public class Main {


    public static void main(String[] args) {
        Employee vasya = new Employee("Vasya Vasin","worker","1@yy.com","897879678578",10100, 25);

//        System.out.println(vasya.toString());
        vasya.info();

        Employee[] employees = {
                new Employee("Kesha Vasin","worker","2@yy.com","564851684",10100, 50),
                new Employee("Petya Petin","driver","3@yy.com","654165498",13100, 44),
                new Employee("Ivan Ivanov","engineer","4@yy.com","849848589",33000, 41),
                new Employee("Fillip Andreevich","manager","5@yy.com","513218",21100, 29),
                new Employee("Aleksandr Sergeevich","administrator","6@yy.com","88984561",20000, 40)
        };
        System.out.println("\nСотрудники старше 40: \n");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                System.out.println(employees[i].toString());
            }
        }

    }

}

