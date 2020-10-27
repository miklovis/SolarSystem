import java.util.Random;

public class Planet extends SpaceBody{

    Random rand = new Random();


    private double distance;
    private int daysPassed = 0;
    private int daysToOrbitSun;



    public Planet(SolarSystem solarSys, int distanceFromSun, int orbitLength, int diameter, String colour){
        setDiameter(diameter);
        setColour(colour);


        daysToOrbitSun = orbitLength;
        daysPassed = rand.nextInt(daysToOrbitSun);
        distance = distanceFromSun;
        setAngle(daysPassed / daysToOrbitSun * 360);


        solarSys.drawSolarObject(distanceFromSun, getAngle(), getDiameter(), getColour());
    }

    public void setDaysPassed(int daysPassed)
    {
        this.daysPassed = daysPassed;
    }

    public int getDaysPassed()
    {
        return daysPassed;
    }

    public void setDaysToOrbitSun(int daysToOrbitSun)
    {
        this.daysToOrbitSun = daysToOrbitSun;
    }

    public int getDaysToOrbitSun()
    {
        return daysToOrbitSun;
    }

    public boolean didPlanetOrbit()
    {
        if(daysToOrbitSun == daysPassed){
            return true;
        }
        else return false;
    }

    public void move(SolarSystem solarSys)
    {
        if(didPlanetOrbit()){
            daysPassed = 0;
        }
        else daysPassed++;

        double daysPassedDbl = daysPassed;
        double daysToOrbitSunDbl = daysToOrbitSun;
        setAngle(daysPassedDbl / daysToOrbitSunDbl * 360);


        solarSys.drawSolarObject(distance, getAngle(), getDiameter(), getColour());
    }

}