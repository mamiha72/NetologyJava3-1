public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketCost = 990;
        int bonusMiles = service.calculate(ticketCost);

        System.out.println("Ваши бонусные мили " + bonusMiles);
    }
}