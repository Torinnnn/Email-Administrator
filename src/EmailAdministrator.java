
import java.util.Scanner;

public class EmailAdministrator {
   private String firstname;
    private String lastname;
    private String password;
   private String department;
    private int mailboxCapacity;
   private String alternateEmail;
   private String companySuffix;
    String email;
//   private int defaultPasswordLength;

   //constructor
   public EmailAdministrator(String lastname, String firstname, String companySuffix){
       this.lastname = lastname;
       this.firstname = firstname;
       this.companySuffix = companySuffix;
       System.out.println("EMAIL CREATED: " + this.firstname + " " +this.lastname);

       //call a method asking for the department and also return the department
   this.department = askDept();
       System.out.println("Department : " + this.department);
// call a method that returns the password
       this.password = generatePassword(10) ;
       System.out.println("password: " + this.password);

       //combine elements to generate email
        email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + companySuffix;
       System.out.println("your email is " + email);

   }
private String askDept() {
    System.out.println("Department codes\n1 for sales\n2 for development\n3 for accounting\n0 for none\nEnter department code: ");
    Scanner input = new Scanner(System.in);
    int depChoice = input.nextInt();
    if (depChoice == 1) {
        return "Sales";
    } else if (depChoice == 2) {
        return "development";
    } else if (depChoice == 3) {
        return "accounting";
    } else {
        return "";
    }
}
// generate a random password
private String generatePassword(int length){
       String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%";
char[] password = new char[length];
for (int i = 0; i < length; i++){
    int rand = (int) (Math.random() * passwordSet.length());
    password[i] = passwordSet.charAt(rand);}
return new String(password);
}

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo(){
       return "Name: " + firstname + " " + lastname + "COMPANY EMAIL: " + email + "MAILBOX CAPACITY: " + getMailboxCapacity() +
   }
}
