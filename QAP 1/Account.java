public class Account {
    // attributes
    private String id;
    private String name;
    private int balance = 0;

    // constructor
    public Account(String id, String name) {
        this.id = "1";
        this.name = "Garrett Baliey";
        this.balance = 3000;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // methods
    public String getId() {
        return this.id;
}

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            this.balance -= amount;
            return this.balance;
        } else {
            System.out.println("Amount exceeded balance");
            return this.balance;
        }
    }

    public int transferTo(Account account, int amount) {
        if (amount <= balance) {
            this.balance -= amount;
            account.balance += amount;
            return this.balance;
        } else {
            System.out.println("Amount exceeded balance");
            return this.balance;
        }
    }

    public String toString() {
        return ("Account = (" + this.id + ", " + this.name + ", " + "$" + this.balance + ")");
    }
}