public class Main {
    public static void main(String[] args) {

    Army armySoldier = new Army();
    Navy navySoldier  = new Navy();
    Marines marinesSoldier  = new Marines();



    //////calling the methods
    System.out.println(armySoldier.stabTorso());
    System.out.println(navySoldier.kickChest());
    System.out.println(marinesSoldier.grabNeck());

    }
}
