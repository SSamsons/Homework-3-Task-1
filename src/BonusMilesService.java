public class BonusMilesService {

int bonus = 20;
    public int calculate (int amount) {
        int price = (amount / bonus);
        return price;
    }
}