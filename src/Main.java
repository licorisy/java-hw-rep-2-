public class Main {
    public static void main(String[] args) {

        int money = 100;
        int replenishment = 1100;
        int percent;
        if (replenishment > 1000) {
            percent = 1;
        } else {
            percent = 0;
        }
        int cash = replenishment / 100 * percent + money + replenishment;
        System.out.println(cash);
    }
}
