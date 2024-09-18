public class TestTime {

    public static void main(String[] args) {
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);


        System.out.println();
        System.out.println("Old Time 1: " + t1);
        System.out.println("Old Time 2: " + t2);

        t1.setHour(21);
        t1.setMinute(10);
        t1.setSecond(15);
        t1.nextSecond();

        t2.setHour(10);
        t2.setMinute(20);
        t2.setSecond(25);
        t2.previousSecond();

        System.out.println();
        System.out.println("New Time 1: " + t1.toString());
        System.out.println("New Time 2: " + t2.toString());
    }
}
