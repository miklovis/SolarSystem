public class Driver {
    static SolarSystem ss;
    static Planet[] systemPlanets = new Planet[8];
    
    public static void main(String[] args)
    {
        ss = new SolarSystem(1000, 1000);      
        createPlanets();

        while(true){
            ss.drawSolarObject(0, 0, 50, "YELLOW");
            for(int i = 0; i < 8; i++){
                systemPlanets[i].dayPassed(ss);
            }
            ss.finishedDrawing();
        }
    }

    public static void createPlanets(){
        systemPlanets[0] = new Planet(ss, 50, 88, 10, "WHITE");
        systemPlanets[1] = new Planet(ss, 90, 225, 20, "YELLOW");
        systemPlanets[2] = new Planet(ss, 140, 365, 25, "BLUE");
        systemPlanets[3] = new Planet(ss, 180, 687, 20, "RED");
        systemPlanets[4] = new Planet(ss, 250, 4333, 70, "ORANGE");
        systemPlanets[5] = new Planet(ss, 310, 10759, 100, "YELLOW");
        systemPlanets[6] = new Planet(ss, 380, 30687, 40, "CYAN");
        systemPlanets[7] = new Planet(ss, 420, 60190, 25, "BLUE");  
    }
}
