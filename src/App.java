public class App {
    public static void main(String[] args) throws Exception {
        Monoposto monoposto1 = new Monoposto("Hamilton", "Mercedes");
        Monoposto monoposto2 = new Monoposto("Vestrappen", "BMW");
        Monoposto monoposto3 = new Monoposto("Elon", "Tesla");

        monoposto1.start();
        monoposto2.start();
        monoposto3.start();

        monoposto1.join();
        monoposto2.join();
        monoposto3.join();
        System.out.println("Fine gara");
    }
}
