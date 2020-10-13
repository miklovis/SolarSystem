public class Driver {
    static SolarSystem ss;
    static final int earthToSun = 100;
    static final int moonToEarth = 20;
    
    public static void main(String[] args)
    {
        ss = new SolarSystem(1000, 1000);
        int j = 10;
        
        while(true){
            for(int i = 0; i < 360; i++){
                ss.drawSolarObject(0, 0, 25, "YELLOW");
                drawEarth(i);
                drawMoon(i);
                ss.finishedDrawing();
            }
        }
    }

    public static void drawEarth(int angle){
        ss.drawSolarObject(earthToSun, angle, 10, "BLUE");
    }

    public static void drawMoon(int angle){
        ss.drawSolarObjectAbout(earthToSun, angle, 2, "WHITE", 10, angle * 4);
    }
}
