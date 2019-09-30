package design6;

public abstract class PointCP
{
    public char typeCoord;
    public double xOrRho;
    public double yOrTheta;
    public PointCP (char type, double xOrRho, double yOrTheta)
    {
        if (type != 'C' && type != 'P')
            throw new IllegalArgumentException ();
        this.xOrRho = xOrRho;
        this.yOrTheta = yOrTheta;
        this.typeCoord = type;
    }

    public abstract double getX ();
    public abstract double getY ();
    public abstract double getRho ();
    public abstract double getTheta ();
    public abstract PointCP convertStorageToCartesian ();
    public abstract PointCP convertStorageToPolar ();
    
    public double getDistance (PointCP pointB)
    {
        double deltaX = getX () - pointB.getX ();
        double deltaY = getY () - pointB.getY ();
        return Math.sqrt ((Math.pow (deltaX, 2) + Math.pow (deltaY, 2)));
    }

    public Design3 rotatePoint (double rotation)
    {
        double radRotation = Math.toRadians (rotation);
        double X = getX ();
        double Y = getY ();
        return new Design3 ('C',
                (Math.cos (radRotation) * X) - (Math.sin (radRotation) * Y),
                (Math.sin (radRotation) * X) + (Math.cos (radRotation) * Y));
    }


    public String toString ()
    {
        return "Stored as " + (typeCoord == 'C'
                ? "Cartesian  (" + getX () + "," + getY () + ")"
                :
        "Polar [" + getRho () + "," + getTheta () + "]") + "\n";
    }
}
