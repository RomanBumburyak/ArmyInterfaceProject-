public class Army extends Soldier implements ArmyFighting {

    @Override
    public String speak() {
        return "ARMY YELL";
    }

    @Override
    public String stabTorso() {
        return " Bleedin' out of my Chest! ";
    }
}


