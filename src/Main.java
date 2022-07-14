public class Main {
    public static void main(String[] args) {
        int check = 100;
        int refill = 1100;
        int bonus;
        int total;

        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);

        total = check + refill + bonus;

        System.out.println(total);
    }
}
