public class Navy extends Soldier implements NavyFighting {

    @Override
    public String speak() {
        return "NAVY YELL";
    }


    @Override
    public String kickChest() {
        return " You kicked me in the chest!!!, summon the 32nd brigade and call the Chief!";
    }



}
