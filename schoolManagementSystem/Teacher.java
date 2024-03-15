package schoolManagementSystem;

/**
 * This the Teacher class. It is basically helping to control teacher id, name,
 * and salary.
 *
 * @author Ibrahim098
 */
public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     *
     * @param salary Teacher's salary.
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     *
     * @return Teacher's id.
     */
    public int getId() {
        return this.id;
    }

    /**
     *
     * @return Teacher;s name.
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @return Teacher's salary
     */
    public int getSalary() {
        return this.salary;
    }

    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher{" + "id=" + id + ", name=" + name
                + ", salary=" + salary + ", salaryEarned=" + salaryEarned + '}'+"\n";
    }

}
