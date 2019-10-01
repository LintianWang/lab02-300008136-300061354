package design3;
import design2.Design2;
//This file contains material supporting section 2.9 of the textbook:
//"Object Oriented Software Engineering" and is issued under the open-source
//license found at www.lloseng.com

/**
* This class contains instances of coordinates in either polar or
* cartesian format.  It also provides the utilities to convert
* them into the other type. It is not an optimal design, it is used
* only to illustrate some design issues.
*
* @author Fran&ccedil;ois B&eacute;langer
* @author Dr Timothy C. Lethbridge
* @version July 2000
*/
public class Design3
{
 //Instance variables ************************************************

 /**
  * Contains C(artesian) or P(olar) to identify the type of
  * coordinates that are being dealt with.
  */
 private char typeCoord;

 /**
  * Contains the current value of X or RHO depending on the type
  * of coordinates.
  */
 private double rho;

 /**
  * Contains the current value of Y or THETA value depending on the
  * type of coordinates.
  */
 private double theta;
 private double x;
 private double y;


 //Constructors ******************************************************
 /**
  * Constructs a coordinate object, with a type identifier.
  */
 public Design3(char type, double xOrRho, double yOrTheta)
 {
     if(type != 'C' && type != 'P')
         throw new IllegalArgumentException();
     if(type == 'C'){
         this.x = xOrRho;
         this.y = yOrTheta;
         this.rho = (Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2)));
         this.theta = Math.toDegrees(Math.atan2(yOrTheta, xOrRho));
     }else{
         this.rho = xOrRho;
         this.theta = yOrTheta;
         this.x = (Math.cos(Math.toRadians(yOrTheta)) * xOrRho);
         this.y = (Math.sin(Math.toRadians(yOrTheta)) * xOrRho);
     }

     typeCoord = type;
 }


 public double getX ()
 {
     return x;
 }


 public double getY ()
 {
     return y;
 }


 public double getRho ()
 {
     return rho;
 }


 public double getTheta ()
 {
     return theta;
 }


 public Design2 convertStorageToPolar ()
 {
     return (new Design2 (typeCoord, rho, theta));
 }


 public Design3 convertStorageToCartesian ()
 {
     if (typeCoord != 'C')
     {
         //Calculate X and Y
         double temp = getX ();
         y = getY ();
         x = temp;

         typeCoord = 'C'; //Change coord type identifier
     }
	return (new Design3 (typeCoord, x ,y));
 }


 /**
  * Calculates the distance in between two points using the Pythagorean
  * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
  *
  * @param pointA The first point.
  * @param pointB The second point.
  * @return The distance between the two points.
  */
 public double getDistance (Design3 pointB)
 {
     // Obtain differences in X and Y, sign is not important as these values
     // will be squared later.
     double deltaX = getX () - pointB.getX ();
     double deltaY = getY () - pointB.getY ();

     return Math.sqrt ((Math.pow (deltaX, 2) + Math.pow (deltaY, 2)));
 }


 /**
  * Rotates the specified point by the specified number of degrees.
  * Not required until E2.30
  *
  * @param point The point to rotate
  * @param rotation The number of degrees to rotate the point.
  * @return The rotated image of the original point.
  */
 public Design3 rotatePoint (double rotation)
 {
     double radRotation = Math.toRadians (rotation);
     double X = getX ();
     double Y = getY ();

     return new Design3 ('C',
             (Math.cos (radRotation) * X) - (Math.sin (radRotation) * Y),
             (Math.sin (radRotation) * X) + (Math.cos (radRotation) * Y));
 }


 /**
  * Returns information about the coordinates.
  *
  * @return A String containing information about the coordinates.
  */
 public String toString ()
 {
	 return "Stored as Cartesian  (" + getX() + "," + getY() + ")\n" +
	    		"Computed Polar as (" + getRho() + "," + getTheta() + ")";
	  
 }
}

