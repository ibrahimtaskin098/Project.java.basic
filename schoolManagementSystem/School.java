package schoolManagementSystem;

import java.util.List;

/**
 * This is the school class. It is calculating all the students, teachers, and
 * teachers salary. It is also calculating earned salary from student fess.
 *
 * @author Ibrahim098
 */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    /**
     *
     * @return Return the List of teachers.
     */

    public List<Teacher> getTeachers() {
        return this.teachers;
    }

    /**
     *
     * @param teacher Add new teacher in the teacher list.
     */
    public void updateTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return return the list of student.
     */
    public List<Student> getStudents() {
        return this.students;
    }

    /**
     *
     * @param student Add new student in the student list.
     */
    public void upDateStuents(Student student) {
        students.add(student);
    }

    /**
     *
     * @return Return the total money school earned.
     */
    public int getTotalMoneyEarned() {
        return this.totalMoneyEarned;
    }

    /**
     *
     * @param moneyEarned Update total money.
     */
    public static  void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    /**
     *
     * @return return total money spent.
     */
    public  int getTotalMoneySpent() {
        return this.totalMoneySpent;
    }

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }

    @Override
    public String toString() {
        return "School{" + "teachers=" + teachers +"\n"+ ", students=" + students + '}';
    }
    

}
