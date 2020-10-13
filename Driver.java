public class Driver {
    static SolarSystem ss;
    static final int earthToSun = 100;
    static final int moonToEarth = 20;
    
    public static void main(String[] args)
    {
        ss = new SolarSystem(500, 500);
        
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
        ss.drawSolarObjectAbout(moonToEarth, angle, 5, "WHITE", moonToEarth, angle);
    }
}
