import sun.jvm.hotspot.gc.shared.Space;

public class Sun extends SpaceBody{


    public Sun(SolarSystem solarSys, int diameter, String colour){
        setDiameter(diameter);
        setColour(colour);
        solarSys.drawSolarObject(0, 0, getDiameter(), getColour());
    }

    public void updateSun(SolarSystem solarSys)
    {
        solarSys.drawSolarObject(0, 0, getDiameter(), getColour());
    }
}