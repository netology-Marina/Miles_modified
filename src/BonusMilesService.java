public class BonusMilesService {
    public int calculate(int amount) {
        int bonusMile;
        int rubleForMile = 20; // рублей за 1 милю
        bonusMile = amount / rubleForMile;
        return bonusMile; // возвращаемрассчитанный bonus
    }
}
