package schoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Money Management system for school Keep track of students total fees Fees
 * already paid Teachers salary
 *
 * @author Ibrahim098
 */
public class Main {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher(1, "kamal", 100);
        Teacher teacher2 = new Teacher(2, "babul", 200);
        Teacher teacher3 = new Teacher(3, "akash", 300);
        List<Teacher> teachersList = new ArrayList<>();
        teachersList.add(teacher1);
        teachersList.add(teacher2);
        teachersList.add(teacher3);

        Student student1 = new Student(5, "akkash", 5);
        Student student2 = new Student(6, "Boby", 12);
        Student student3 = new Student(7, "tipu", 10);
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        School school1 = new School(teachersList, studentsList);

        student2.payFees(5000);
        student3.payFees(4000);
        System.out.println(school1.getTotalMoneyEarned());

        System.out.println("School spent money");
        teacher2.receiveSalary(teacher2.getSalary());
        System.out.println("School has given salary " + teacher2.getName()
                + " Now school has " + school1.getTotalMoneyEarned());
        teacher3.receiveSalary(teacher3.getSalary());
        System.out.println("School has given salary " + teacher3.getName()
                + " Now school has " + school1.getTotalMoneyEarned());
        System.out.println("Students details informations");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
          System.out.println("Teachers details informations");
        System.out.println(teacher1);
        System.out.println(teacher2);
        System.out.println(teacher3);
        System.out.println("School details informations");
        System.out.println(school1);
    }
}
