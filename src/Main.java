public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketCost = 990;
        int bonusCost = 20;
        int bonusMiles = service.calculate(ticketCost, bonusCost);

        System.out.println("Ваши бонусные мили " + bonusMiles);
    }
}