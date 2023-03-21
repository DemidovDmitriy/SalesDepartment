public class Main {
    public static void main(String[] args) {

        int[] seles = new int[] {40, 600};
        SalesManager salesManager = new SalesManager(seles);
        int max = salesManager.max();
        System.out.println(max);
    }
}