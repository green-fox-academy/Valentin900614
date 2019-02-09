package counter;
public class Counter {

    int number;
    static int start;

    public Counter(){
        number = 0;
        start = number;
    }

    public Counter(int number){
        this.number = number;
        start = number;
    }

    public void add() {
        this.number++;
    }

    public void add(int num) {
        number += num;
    }

    public void get() {
        System.out.println(number);
    }

    public void reset() {
        number = start;
    }

}
