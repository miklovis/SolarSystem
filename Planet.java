import java.util.Random;

public class Planet extends SpaceBody{

    Random rand = new Random();


    private int distance;
    private int daysPassed = 0;
    private int daysToOrbitSun;



    public Planet(SolarSystem solarSys, int distanceFromSun, int orbitLength, int diameter, String colour){
        setDiameter(diameter);
        daysToOrbitSun = orbitLength;
        daysPassed = rand.nextInt(daysToOrbitSun);
        setColour(colour);
        distance = distanceFromSun;

        solarSys.drawSolarObject(distanceFromSun, daysPassed, getDiameter(), getColour());
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

        solarSys.drawSolarObject(distance, daysPassedDbl / daysToOrbitSunDbl * 360, getDiameter(), getColour());
    }
}