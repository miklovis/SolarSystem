public class Driver {
    static final int distanceToMercury = 40;
    static final int distanceToVenus = 70;
    static final int distanceToEarth = 110;
    static final int distanceToMars = 150;
    static final int distanceToJupiter = 210;
    static final int distanceToSaturn = 305;
    static final int distanceToUranus = 390;
    static final int distanceToNeptune = 425;


    static SolarSystem ss;
    static Planet[] systemPlanets = new Planet[8];
    static Moon[] systemMoons = new Moon[176];
    static Sun sun;
    
    public static void main(String[] args)
    {
        ss = new SolarSystem(1000, 1000);      
        createPlanets();
        createMoons();

        sun = new Sun(ss, 50, "YELLOW");

        while(true){
            sun.updateSun(ss);
            
            for(int i = 0; i < 8; i++){
                systemPlanets[i].move(ss);
            }
            for(int i = 0; i < 176; i++){
                systemMoons[i].move(ss, systemPlanets);
            }

            ss.finishedDrawing();
        }
    }

    public static void createPlanets(){
        systemPlanets[0] = new Planet(ss, distanceToMercury, 88, 10, "WHITE");
        systemPlanets[1] = new Planet(ss, distanceToVenus, 225, 20, "YELLOW");
        systemPlanets[2] = new Planet(ss, distanceToEarth, 365, 25, "BLUE");
        systemPlanets[3] = new Planet(ss, distanceToMars, 687, 20, "RED");
        systemPlanets[4] = new Planet(ss, distanceToJupiter, 4333, 55, "ORANGE");
        systemPlanets[5] = new Planet(ss, distanceToSaturn, 10759, 80, "YELLOW");
        systemPlanets[6] = new Planet(ss, distanceToUranus, 30687, 30, "CYAN");
        systemPlanets[7] = new Planet(ss, distanceToNeptune, 60190, 20, "BLUE");  
    }

    public static void createMoons(){
        int moonCounter = 0;
        systemMoons[moonCounter] = new Moon(ss, systemPlanets, distanceToEarth, 2); moonCounter++;  //Moon
        systemMoons[moonCounter] = new Moon(ss, systemPlanets, distanceToMars, 3); moonCounter++;   //Phobos
        systemMoons[moonCounter] = new Moon(ss, systemPlanets, distanceToMars, 3); moonCounter++;   //Deimos

        for(; moonCounter < 82; moonCounter++){
            systemMoons[moonCounter] = new Moon(ss, systemPlanets, distanceToJupiter, 4);           //79 of Jupiter's moons
        }

        for(; moonCounter < 135; moonCounter++){
            systemMoons[moonCounter] = new Moon(ss, systemPlanets, distanceToSaturn, 5);            //53 of Saturn's moons
        }

        for(; moonCounter < 162; moonCounter++){
            systemMoons[moonCounter] = new Moon(ss, systemPlanets, distanceToUranus, 6);            //27 of Uranus's moons
        }

        for(; moonCounter < 176; moonCounter++){
            systemMoons[moonCounter] = new Moon(ss, systemPlanets, distanceToNeptune, 7);           //14 of Neptune's moons
        }
    }
}
