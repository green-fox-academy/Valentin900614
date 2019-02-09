package counter;

public class Main {
    public static void main(String[] args) {

        Counter num = new Counter(20);
        num.get();
        num.add();
        num.get();
        num.add(5);
        num.get();
        num.reset();
        num.get();

    }
}
