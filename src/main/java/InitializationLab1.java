
/**
 * Created by kurtmccann on 9/10/16.
 */
public class InitializationLab1 {
    public static void main(String[] args) {
        BoringThing bt1 = new BoringThing();
        BoringThing bt2 = new BoringThing();
        BoringThing bt3 = new BoringThing();
        BoringThing bt4 = new BoringThing();
        BoringThing bt5 = new BoringThing();

        ColorfulThing ct1 = new ColorfulThing("red");
        ColorfulThing ct2 = new ColorfulThing("orange");
        ColorfulThing ct3 = new ColorfulThing("yellow");
        ColorfulThing ct4 = new ColorfulThing("green");
        ColorfulThing ct5 = new ColorfulThing("blue");

        System.out.println(ct1.getColor());
        System.out.println(ct2.getColor());
        System.out.println(ct3.getColor());
        System.out.println(ct4.getColor());
        System.out.println(ct5.getColor());

        //ColorfulThing ct6 = new ColorfulThing();
    }
}
