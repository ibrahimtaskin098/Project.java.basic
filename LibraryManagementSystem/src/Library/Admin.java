package Library;

public class Admin extends User {
    public Admin(String name) {
        super(name);
    }

    public Admin(String name, String email, String phoneNumber) {
        super(name, email, phoneNumber);
    }

    public void menu() {
        System.out.println("1 View Books");
        System.out.println("2 Add Books");
        System.out.println("3 Delete Books");
        System.out.println("4 Search Books");
        System.out.println("5 Delete all Books");
        System.out.println("6 View order");
        System.out.println("7 Exit");


    }
}
