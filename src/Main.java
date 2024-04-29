//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Declare instances of the supercalss, substituted by subclasses
        Monster m1 = new FireMonster("r2u2");
        Monster m2 = new WaterMonster("u2r2");
        Monster m3 = new StoneMonster("r2r2");

        //invoke the actual implementation
        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());

        //m1 dies, generates a mew instance and re-assign to m1
        m1 = new StoneMonster("a2b2");
        System.out.println(m1.attack());

        //We have a problem here
        Monster m4 = new Monster("u2u2");
        System.out.println(m4.attack());
    }
}