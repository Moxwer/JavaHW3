public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int miles = service.calculate(10_000, 2 );
        System.out.println("ОР: 1_000, ФР: " + miles);
    }
}
