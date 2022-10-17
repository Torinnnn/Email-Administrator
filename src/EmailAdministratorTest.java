public class EmailAdministratorTest {
    public static void main(String[] args) {
        EmailAdministrator email1 = new EmailAdministrator("harrison","luke", "amazon.com");
        email1.setAlternateEmail("lukeharrison@gmail.com");
        System.out.println(email1.getAlternateEmail());

    }


}
