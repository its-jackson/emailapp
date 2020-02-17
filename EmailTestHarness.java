public class EmailTestHarness {
    public static void main(String[] args) {
        Email email1 = new Email("Jackson", "Johnson");
        Email email2 = new Email("Andrea", "Franco");

        System.out.println(email1.showAll());
        System.out.println("--------------------------");
        System.out.println(email2.showAll());
    }
}
