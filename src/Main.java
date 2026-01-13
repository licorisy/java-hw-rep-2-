public class Main {
    public static void main(String[] args) {

        int money = 100;
        int x = 1100;
        int percent;
        if (x > 1000) {
            percent = 1;
        } else {
            percent = 0;
        }
        int cash = x / 100 * percent + money + x;
        System.out.println(cash);
    }
}
