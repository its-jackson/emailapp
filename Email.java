import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String companySuffix = "georgiancollege.ca";
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;

    // Make full use of Constructor
    // Ultimately increase total efficiency
    public Email (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = findDepartment();
        this.password = randomPassword(defaultPasswordLength);
        email = firstName + "." + lastName + "@" + department + "." + companySuffix;
    }

    public String getFirstName () {
        return firstName;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword (String password) {
        this.password = password;
    }

    public String getDepartment () {
        return department;
    }

    public void setDepartment (String department) {
        this.department = department;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getCompanySuffix () {
        return companySuffix;
    }

    public void setCompanySuffix (String companySuffix) {
        this.companySuffix = companySuffix;
    }

    public int getMailboxCapacity () {
        return mailboxCapacity;
    }

    public void setMailboxCapacity (int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public int getDefaultPasswordLength () {
        return defaultPasswordLength;
    }

    public void setDefaultPasswordLength (int defaultPasswordLength) {
        this.defaultPasswordLength = defaultPasswordLength;
    }

    public String findDepartment () {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Department Code: ");
        System.out.println("Enter 1 for \"Sales\"");
        System.out.println("Enter 2 for \"Developer\"");
        System.out.println("Enter 3 for \"Accounting\"");
        int department = in.nextInt();
        switch (department) {
            case 1:
                return "sales";
            case 2:
                return "dev";
            case 3:
                return "accounting";
        }
        return "Please enter 1 for sales, 2 for development, 3 for accounting.";
    }

    // Generate a random password, limited to 10 characters only
    public String randomPassword(int passLength) {
        String passwordSet = "ABCDEFGHIJKMNLOPQRSTUVWXYZ123456789!@#$%";
        char[] randPass = new char[passLength];

        for (int i =  0; i < passLength; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            randPass[i] = passwordSet.charAt(random);
        }

        return new String (randPass);
    }

    // Return all state and behaviour
    public String showAll () {
        return "FIRST NAME: " + getFirstName() +
                "\nLAST NAME: " + getLastName() +
                "\nPASSWORD: " + getPassword() +
                "\nEMAIL: " + getEmail() +
                "\nDEPARTMENT: " + getDepartment() +
                "\nMAILBOX CAPACITY: " + getMailboxCapacity() + "mb";
    }

}
