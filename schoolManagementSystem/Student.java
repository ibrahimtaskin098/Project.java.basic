package schoolManagementSystem;

/**
 *
 * This is the class of students. It is basically showing us student's name, id,
 * grade, and the amount of money they pay.
 *
 * @author Ibrahim098
 */
public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    /**
     * Keep updating the student's grade.
     *
     * @param grade new grade of the student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Keep updating the student's fees.
     *
     * @param fees The fees that has paid student.
     */
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return the Student id.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return the student name.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return The student grade.
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return The student fees.
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return The total amount of student fees.
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return Return the total remaining fees.
     */
    public int getRemaining() {
        return this.feesTotal - this.feesPaid;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name
                + ", grade=" + grade + ", feesPaid=" + feesPaid + '}'+"\n";
    }

}
