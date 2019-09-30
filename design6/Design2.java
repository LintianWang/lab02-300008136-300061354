package design6;

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
public class Design2 extends PointCP
{
 /**
 * Constructs a coordinate object, with a type identifier.
 */
 public Design2 (char type, double xOrRho, double yOrTheta)
 {
     super (type, xOrRho, yOrTheta);
 }


 public double getX ()
 {
     return (Math.cos (Math.toRadians (yOrTheta)) * xOrRho);
 }


 public double getY ()
 {
     return (Math.sin (Math.toRadians (yOrTheta)) * xOrRho);
 }


 public double getRho ()
 {
     return xOrRho;
 }


 public double getTheta ()
 {
     return yOrTheta;
 }


 public Design3 convertStorageToCartesian ()
 {
     return new Design3 ('C', getX (), getY ());
 }


 public Design2 convertStorageToPolar ()
 {
     return new Design2 ('P', getRho (), getTheta ());
 }
}
