public class Marines extends Soldier implements MarinesFighting {

    @Override
    public String speak() {
        return "MARINE CHANT";
    }

    @Override
    public String grabNeck() {
        return "Grab his neck and choke the Shit out of him! ";
    }
}
