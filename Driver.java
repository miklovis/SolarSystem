public class Driver {
    public static void main(String[] args)
    {

        SolarSystem ss = new SolarSystem(500, 500);
        
        ss.drawSolarObject(0, 0, 25, "YELLOW");

        while(1 > 0){
            ss.drawSolarObjectAbout(50, 350, 10, "BLUE", 50, 350);
            ss.finishedDrawing();
        }
    }
}
