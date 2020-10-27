import java.util.Random;

public class Moon extends SpaceBody{
    double centreOfRotationDistance, maxAngle;
    int planetIndex;

    Random rand = new Random();

    public Moon(SolarSystem solarSys, Planet[] planets, double distance, int planetIndex)
    {
        setDiameter(2);
        setColour("WHITE");


        this.planetIndex = planetIndex;
        setDistance(distance);

        if(planetIndex < 4){
            this.centreOfRotationDistance = planets[planetIndex].getDiameter() / 2 + 2;
        }
        else this.centreOfRotationDistance = planets[planetIndex].getDiameter() / 2 + 5;

        maxAngle = planets[planetIndex].getDiameter() * 4;
        setAngle(rand.nextInt((int)maxAngle));

        solarSys.drawSolarObjectAbout(getDistance(), planets[planetIndex].getAngle(), getDiameter(), getColour(), centreOfRotationDistance, getAngle() / maxAngle * 360);

        checkAngle();
    }

    public void move(SolarSystem solarSys, Planet[] planets)
    {
        solarSys.drawSolarObjectAbout(getDistance(), planets[planetIndex].getAngle(), getDiameter(), getColour(), centreOfRotationDistance, getAngle() / maxAngle * 360);

        checkAngle();
    }

    public void checkAngle(){
        if(getAngle() != maxAngle){
            incrementAngle();
        }
        else setAngle(0);
    }
}