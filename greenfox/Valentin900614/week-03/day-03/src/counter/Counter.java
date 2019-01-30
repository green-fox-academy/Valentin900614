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
        start = this.number;
    }

    public void add() {
        this.number++;
    }

    public void add(int num) {
        this.number += num;
    }

    public void get() {
        System.out.println(this.number);
    }

    public void reset() {
        this.number = start;
    }

}
