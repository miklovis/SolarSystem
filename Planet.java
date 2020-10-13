import java.util.Random;

public class Planet{

    Random rand = new Random();


    private int distance;
    private int daysPassed = 0;
    private int daysToOrbitSun;
    private int diameter;
    private String col;


    public Planet(SolarSystem solarSys, int distanceFromSun, int orbitLength, int diameter, String colour){
        this.diameter = diameter;
        daysToOrbitSun = orbitLength;
        daysPassed = rand.nextInt(daysToOrbitSun);
        col = colour;
        distance = distanceFromSun;

        solarSys.drawSolarObject(distanceFromSun, daysPassed, diameter, colour);
    }

    boolean didPlanetOrbit()
    {
        if(daysToOrbitSun == daysPassed){
            return true;
        }
        else return false;
    }

    void dayPassed(SolarSystem solarSys)
    {
        if(didPlanetOrbit()){
            daysPassed = 0;
        }
        else daysPassed++;

        double daysPassedDbl = daysPassed;
        double daysToOrbitSunDbl = daysToOrbitSun;

        solarSys.drawSolarObject(distance, daysPassedDbl / daysToOrbitSunDbl * 360, diameter, col);
    }
}