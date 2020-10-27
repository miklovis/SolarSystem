import java.util.Random;

public class Moon extends SpaceBody{
    double distance, centreOfRotationDistance, angle, maxAngle;
    int planetIndex;

    Random rand = new Random();

    public Moon(SolarSystem solarSys, Planet[] planets, double distance, int planetIndex)
    {
        setDiameter(2);
        setColour("WHITE");


        this.planetIndex = planetIndex;
        this.distance = distance;
        if(planetIndex < 4){
            this.centreOfRotationDistance = planets[planetIndex].getDiameter() / 2 + 2;
        }
        else this.centreOfRotationDistance = planets[planetIndex].getDiameter() / 2 + 5;
        maxAngle = planets[planetIndex].getDiameter() * 4;

        angle = rand.nextInt((int)maxAngle);


        solarSys.drawSolarObjectAbout(distance, planets[planetIndex].getAngle(), getDiameter(), getColour(), centreOfRotationDistance, angle / maxAngle * 360);

        checkAngle();
    }

    public void dayPassed(SolarSystem solarSys, Planet[] planets)
    {
        solarSys.drawSolarObjectAbout(distance, planets[planetIndex].getAngle(), getDiameter(), getColour(), centreOfRotationDistance, angle / maxAngle * 360);

        checkAngle();
    }

    public void checkAngle(){
        if(angle != maxAngle){
            angle++;
        }
        else angle = 0;
    }
}