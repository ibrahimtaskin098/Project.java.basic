package emailApplication;
// Creating email accounts for new hires.
//Application do the following task.
//1)Generate an email with the following syntax:firstname.lastname@department.company.com
//2)Determine the department(sales, development,accounting) if none leave blank.
//3)Generate a random string for a password.
//4)Have set method to change the passwod, set the mailbox capacity, and define an alternate email address.
//5)Have get methods to display the name, email, and mail capacity.


import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String depertment;
    private String password;
    private String email;
    private int defaulfPasswordLength = 10;
    private String companySuffix = "xyzcomapy.com";
    private int mailboxCapacity = 500;
    private String alternateEmail;

    //Constructor to receive first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
        //call a method asking for the department - return a department
        this.depertment = this.setDepartment();
      //  System.out.println("Department: " + this.depertment);
        //call a method that return a random password
       this.password = this.randomPassword(defaulfPasswordLength);
       // System.out.println("Your password is:" + this.password);
        //combine elements to generate a email
        email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.depertment + "." + this.companySuffix;
       // System.out.println("Email: " + email);
        
    }

    //Ask for the department
    private String setDepartment() {
        System.out.println("New worker: "+this.firstName+"\nPlease enter department code:\n 1 for sales\n 2 for development \n 3 for account \n 0 for none\n Enter Code:");
        Scanner in = new Scanner(System.in);
        int depChoise = in.nextInt();
        if (depChoise == 1) {
            return "sales";
        } else if (depChoise == 2) {
            return "development";
        } else if (depChoise == 3) {
            return "accounting";
        } else {
            return "";
        }
    }

    //Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTWXYZ1234567890@#$%&";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int ran = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(ran);
        }
        return new String(password);
    }

    //Set mailbox capacity
    public void setMailbox(int capacity) {
        this.mailboxCapacity = capacity;

    }

    //Set the alternate email
    public void setAlternateEmail(String alternateMail) {
        this.alternateEmail = alternateMail;
    }

    //change the password
    public void setPassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return this.mailboxCapacity;
    }

    public String getAlternateEmail() {
        return this.alternateEmail;
    }

    public String getPassword() {
        return this.password;
    }
    public String showInfo(){
    return "DISPLAY NAME: "+this.firstName+" "+this.lastName+
           "\nCOMPANY EMAIL: "+this.email+
            "\nMAILBOX CAPACITY: "+this.mailboxCapacity;
    }
}
