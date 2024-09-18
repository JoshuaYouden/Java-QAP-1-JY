public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account("1", "Peter Parker", 5000);
        Account acc2 = new Account("2", "Ryan Cage", 4000);

        System.out.println();
        System.out.println(acc1);
        System.out.println(acc2);

        System.out.println();
        System.out.println("Account 1 Balance: " + acc1.getBalance());
        System.out.println("Account 2 Balance: " + acc2.getBalance());

        System.out.println();
        System.out.println("Account 1 After Transfer: " + acc1.transferTo(acc2, 1000));
        System.out.println("Account 1 Balance: " + acc1.getBalance());
        System.out.println("Account 2 Balance: " + acc2.getBalance());
    }
}
