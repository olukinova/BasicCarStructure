public class Main {
    public static void main(String[] args) {

        BasicStructure audi = new BasicStructure();
        audi.color = "Black";
        audi.model = "A5";
        audi.power = "500cc";


        Engine x = new Engine();
        x.cylinders = "8";
        x.size = "1234cc";
        x.weight = "6435k";


        Color color = new Color();
        color.colorLights = "True";
        color.colorType = "False";
        color.colorWindows = "True";

        Lights neon = new Lights();
        neon.color = "red";
        neon.size = "15cm";
        neon.intensity = "7675lumin";

    }
}