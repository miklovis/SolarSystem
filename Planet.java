import java.util.Random;

public class Planet extends SpaceBody{

    Random rand = new Random();


    private int distance;
    private int daysPassed = 0;
    private int daysToOrbitSun;
    private double angle;



    public Planet(SolarSystem solarSys, int distanceFromSun, int orbitLength, int diameter, String colour){
        setDiameter(diameter);
        setColour(colour);


        daysToOrbitSun = orbitLength;
        daysPassed = rand.nextInt(daysToOrbitSun);
        distance = distanceFromSun;
        angle = daysPassed / daysToOrbitSun * 360;
        

        solarSys.drawSolarObject(distanceFromSun, angle, getDiameter(), getColour());
    }

    public void setDistance(int distance)
    {
        this.distance = distance;
    }

    public int getDistance()
    {
        return distance;
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

    public void dayPassed(SolarSystem solarSys)
    {
        if(didPlanetOrbit()){
            daysPassed = 0;
        }
        else daysPassed++;

        double daysPassedDbl = daysPassed;
        double daysToOrbitSunDbl = daysToOrbitSun;
        angle = daysPassedDbl / daysToOrbitSunDbl * 360;


        solarSys.drawSolarObject(distance, angle, getDiameter(), getColour());
    }

    public double getAngle()
    {
        return angle;
    }

    public void setAngle(double angle)
    {
        this.angle = angle;
    }
}