public class Main {
    public static void main(String[] args) {
        int balance = 790_00; // копейки
        int refilling = 1853_00; // копейки
        int refillingLimit = 1000_00; // копейки
        if (refilling >= refillingLimit) {
            int bonus = (refilling / 100);
        } else {
            int bonus = (refilling / 1);
        }
        int ammount = balance + refilling;
            int bonus = refilling / 100;
            System.out.println(bonus); // копейки
    }
}
