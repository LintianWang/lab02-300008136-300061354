package pointcp;
public class EfficiencyTest {

    /**
     * Find average time to get each Cartesian coordinate from getter method in PointCP
     * @param type char value of either C or P
     * @param testTimeSeconds time to run test in seconds
     * @return average operation time in nanoseconds
     */
    public static long getC_XPointCP(char type, long testTimeSeconds){
        long testTimeMillis = testTimeSeconds * 1000 * 1000;
        long count = 0;
        long start = System.currentTimeMillis();
        long limit = start + testTimeMillis;
        PointCP tmp = new PointCP(type, 10*Math.random(), 10*Math.random());
        while(System.currentTimeMillis() < limit){
            tmp.getX();
            count++;
        }
        long result = testTimeMillis/count;
        return result;
    }

    
    public static long getC_YPointCP(char type, long testTimeSeconds){
    	long testTimeMillis = testTimeSeconds * 1000 * 1000;
        long count = 0;
        long start = System.currentTimeMillis();
        long limit = start + testTimeMillis;
        PointCP tmp = new PointCP(type, 10*Math.random(), 10*Math.random());
        while(System.currentTimeMillis() < limit){
            tmp.getY();
            count++;
        }
        long result = testTimeMillis/count;
        return result;
    }
    /**
     * Find average time to get each Cartesian coordinate from getter method in PointCP Design 2
     * @param type char value of either C or P
     * @param testTimeSeconds time to run test in seconds
     * @return average operation time in nanoseconds
     */
    public static long getC_XDesign2(char type, long testTimeSeconds) {
        long testTimeMillis = testTimeSeconds * 1000 * 1000;
        long count = 0;
        long start = System.currentTimeMillis();
        long limit = start + testTimeMillis;
        Design2 tmp = new Design2(type, 10 * Math.random(), 10 * Math.random());
        while (System.currentTimeMillis() < limit) {
            tmp.getX();
            count++;
        }
        long result = testTimeMillis / count;
        return result;
    }
    
    public static long getC_YDesign2(char type, long testTimeSeconds) {
    	long testTimeMillis = testTimeSeconds * 1000 * 1000;
        long count = 0;
        long start = System.currentTimeMillis();
        long limit = start + testTimeMillis;
        Design2 tmp = new Design2(type, 10 * Math.random(), 10 * Math.random());
        while (System.currentTimeMillis() < limit) {
            tmp.getY();
            count++;
        }
        long result = testTimeMillis / count;
        return result;
    }

    /**
     * Find average time to get each Cartesian coordinate from getter method in PointCP Design 4
     * @param type char value of either C or P
     * @param testTimeSeconds time to run test in seconds
     * @return average operation time in nanoseconds
     */
    public static long getC_XDesign3(char type, long testTimeSeconds) {
        long testTimeMillis = testTimeSeconds * 1000 * 1000;
        long count = 0;
        long start = System.currentTimeMillis();
        long limit = start + testTimeMillis;
        Design3 tmp = new Design3(type, 10 * Math.random(), 10 * Math.random());
        while (System.currentTimeMillis() < limit) {
            tmp.getX();
            count++;
        }
        long result = testTimeMillis / count;
        return result;
    }

    
    public static long getC_YDesign3(char type, long testTimeSeconds) {
    	long testTimeMillis = testTimeSeconds * 1000 * 1000;
        long count = 0;
        long start = System.currentTimeMillis();
        long limit = start + testTimeMillis;
        Design3 tmp = new Design3(type, 10 * Math.random(), 10 * Math.random());
        while (System.currentTimeMillis() < limit) {
            tmp.getY();
            count++;
        }
        long result = testTimeMillis / count;
        return result;
    }
    
    
    public static long getC_XDesign6(char type, long testTimeSeconds) {
        long testTimeMillis = testTimeSeconds * 1000 * 1000;
        long count = 0;
        long start = System.currentTimeMillis();
        long limit = start + testTimeMillis;
        Design3 tmp = new Design3(type, 10 * Math.random(), 10 * Math.random());
        while (System.currentTimeMillis() < limit) {
            tmp.getX();
            count++;
        }
        long result = testTimeMillis / count;
        return result;
    }

    
    public static long getC_YDesign6(char type, long testTimeSeconds) {
    	long testTimeMillis = testTimeSeconds * 1000 * 1000;
        long count = 0;
        long start = System.currentTimeMillis();
        long limit = start + testTimeMillis;
        Design3 tmp = new Design3(type, 10 * Math.random(), 10 * Math.random());
        while (System.currentTimeMillis() < limit) {
            tmp.getY();
            count++;
        }
        long result = testTimeMillis / count;
        return result;
    }

    /**
     * Find average time to get each Polar  coordinate from getter method in PointCP
     * @param type char value of either C or P
     * @param testTimeSeconds time to run test in seconds
     * @return average operation time in nanoseconds
     */
    public static long getP_RhoPointCP(char type, long testTimeSeconds) {
        long testTimeMillis = testTimeSeconds * 1000 * 1000;
        long count = 0;
        long start = System.currentTimeMillis();
        long limit = start + testTimeMillis;
        PointCP tmp = new PointCP(type, 10 * Math.random(), 10 * Math.random());
        while (System.currentTimeMillis() < limit) {
            tmp.getRho();
            count++;
        }
        long result = testTimeMillis / count;
        return result;
    }
    
    public static long getP_ThetaPointCP(char type, long testTimeSeconds) {
    	long testTimeMillis = testTimeSeconds * 1000 * 1000;
        long count = 0;
        long start = System.currentTimeMillis();
        long limit = start + testTimeMillis;
        PointCP tmp = new PointCP(type, 10 * Math.random(), 10 * Math.random());
        while (System.currentTimeMillis() < limit) {
            tmp.getTheta();
            count++;
        }
        long result = testTimeMillis / count;
        return result;
    }

    /**
     * Find average time to get each Polar  coordinate from getter method in PointCP Design 2
     * @param type char value of either C or P
     * @param testTimeSeconds time to run test in seconds
     * @return average operation time in nanoseconds
     */
    public static long getP_RhoDesign2(char type, long testTimeSeconds) {
        long testTimeMillis = testTimeSeconds * 1000 * 1000;
        long count = 0;
        long start = System.currentTimeMillis();
        long limit = start + testTimeMillis;
        Design2 tmp = new Design2(type, 10 * Math.random(), 10 * Math.random());
        while (System.currentTimeMillis() < limit) {
            tmp.getRho();
            count++;
        }
        long result = testTimeMillis / count;
        return result;
    }

    
    public static long getP_ThetaDesign2(char type, long testTimeSeconds) {
    	long testTimeMillis = testTimeSeconds * 1000 * 1000;
        long count = 0;
        long start = System.currentTimeMillis();
        long limit = start + testTimeMillis;
        Design2 tmp = new Design2(type, 10 * Math.random(), 10 * Math.random());
        while (System.currentTimeMillis() < limit) {
            tmp.getTheta();
            count++;
        }
        long result = testTimeMillis / count;
        return result;
    }
    /**
     * Find average time to get each Polar  coordinate from getter method in PointCP Design 4
     * @param type char value of either C or P
     * @param testTimeSeconds time to run test in seconds
     * @return average operation time in nanoseconds
     */
    public static long getP_RhoDesign3(char type, long testTimeSeconds) {
        long testTimeMillis = testTimeSeconds * 1000 * 1000;
        long count = 0;
        long start = System.currentTimeMillis();
        long limit = start + testTimeMillis;
        Design3 tmp = new Design3(type, 10 * Math.random(), 10 * Math.random());
        while (System.currentTimeMillis() < limit) {
            tmp.getRho();
            count++;
        }
        long result = testTimeMillis / count;
        return result;
    }
    
    
    public static long getP_ThetaDesign3(char type, long testTimeSeconds) {
    	long testTimeMillis = testTimeSeconds * 1000 * 1000;
        long count = 0;
        long start = System.currentTimeMillis();
        long limit = start + testTimeMillis;
        Design3 tmp = new Design3(type, 10 * Math.random(), 10 * Math.random());
        while (System.currentTimeMillis() < limit) {
            tmp.getTheta();
            count++;
        }
        long result = testTimeMillis / count;
        return result;
    }

    
    public static long getP_RhoDesign6(char type, long testTimeSeconds) {
        long testTimeMillis = testTimeSeconds * 1000 * 1000;
        long count = 0;
        long start = System.currentTimeMillis();
        long limit = start + testTimeMillis;
        Design2 tmp = new Design2(type, 10 * Math.random(), 10 * Math.random());
        while (System.currentTimeMillis() < limit) {
            tmp.getRho();
            count++;
        }
        long result = testTimeMillis / count;
        return result;
    }

    
    public static long getP_ThetaDesign6(char type, long testTimeSeconds) {
    	long testTimeMillis = testTimeSeconds * 1000 * 1000;
        long count = 0;
        long start = System.currentTimeMillis();
        long limit = start + testTimeMillis;
        Design2 tmp = new Design2(type, 10 * Math.random(), 10 * Math.random());
        while (System.currentTimeMillis() < limit) {
            tmp.getTheta();
            count++;
        }
        long result = testTimeMillis / count;
        return result;
    }
    /**
     * Main loop to run tests and print results out to user
     * @param args
     */
    public static void main(String[] args){
        int testTime = 1;

        System.out.println("Average time for getting X of Cartesian from Cartesian PointCP: "+getC_XPointCP('C', testTime)+"ms");
        System.out.println("Average time for getting X of Cartesian from Cartesian Design2: "+getC_XDesign2('C', testTime)+"ms");
        System.out.println("Average time for getting X of Cartesian from Cartesian Design3: "+getC_XDesign3('C', testTime)+"ms");
        System.out.println("Average time for getting X of Cartesian from Cartesian Design6: "+getC_XDesign6('C', testTime)+"ms");
        System.out.println("Average time for getting Y of Cartesian from Cartesian PointCP: "+getC_YPointCP('C', testTime)+"ms");
        System.out.println("Average time for getting Y of Cartesian from Cartesian Design2: "+getC_YDesign2('C', testTime)+"ms");
        System.out.println("Average time for getting Y of Cartesian from Cartesian Design3: "+getC_YDesign3('C', testTime)+"ms");
        System.out.println("Average time for getting Y of Cartesian from Cartesian Design6: "+getC_YDesign6('C', testTime)+"ms");
        System.out.println("Average time for getting Rho of Polar from Cartesian PointCP: "+getP_RhoPointCP('C', testTime)+"ms");
        System.out.println("Average time for getting Rho of Polar from Cartesian Design2: "+getP_RhoDesign2('C', testTime)+"ms");
        System.out.println("Average time for getting Rho of Polar from Cartesian Design3: "+getP_RhoDesign3('C', testTime)+"ms");
        System.out.println("Average time for getting Rho of Polar from Cartesian Design6: "+getP_RhoDesign6('C', testTime)+"ms");
        System.out.println("Average time for getting Theta of Polar from Cartesian PointCP: "+getP_ThetaPointCP('C', testTime)+"ms");
        System.out.println("Average time for getting Theta of Polar from Cartesian Design2: "+getP_ThetaDesign2('C', testTime)+"ms");
        System.out.println("Average time for getting Theta of Polar from Cartesian Design3: "+getP_ThetaDesign3('C', testTime)+"ms");
        System.out.println("Average time for getting Theta of Polar from Cartesian Design6: "+getP_ThetaDesign6('C', testTime)+"ms");

        
        System.out.println("Average time for getting X of Cartesian from Polar PointCP: "+getC_XPointCP('P', testTime)+"ms");
        System.out.println("Average time for getting X of Cartesian from Polar Design2: "+getC_XDesign2('P', testTime)+"ms");
        System.out.println("Average time for getting X of Cartesian from Polar Design3: "+getC_XDesign3('P', testTime)+"ms");
        System.out.println("Average time for getting X of Cartesian from Polar Design6: "+getC_XDesign6('P', testTime)+"ms");

        System.out.println("Average time for getting Y of Cartesian from Polar PointCP: "+getC_YPointCP('P', testTime)+"ms");
        System.out.println("Average time for getting Y of Cartesian from Polar Design2: "+getC_YDesign2('P', testTime)+"ms");
        System.out.println("Average time for getting Y of Cartesian from Polar Design3: "+getC_YDesign3('P', testTime)+"ms");
        System.out.println("Average time for getting Y of Cartesian from Polar Design6: "+getC_YDesign6('P', testTime)+"ms");

        System.out.println("Average time for getting Rho of Polar from Polar PointCP: "+getP_RhoPointCP('P', testTime)+"ms");
        System.out.println("Average time for getting Rho of Polar from Polar Design2: "+getP_RhoDesign2('P', testTime)+"ms");
        System.out.println("Average time for getting Rho of Polar from Polar Design3: "+getP_RhoDesign3('P', testTime)+"ms");
        System.out.println("Average time for getting Rho of Polar from Polar Design6: "+getP_RhoDesign6('P', testTime)+"ms");

        System.out.println("Average time for getting Theta of Polar from Polar PointCP: "+getP_ThetaPointCP('P', testTime)+"ms");
        System.out.println("Average time for getting Theta of Polar from Polar Design2: "+getP_ThetaDesign2('P', testTime)+"ms");
        System.out.println("Average time for getting Theta of Polar from Polar Design3: "+getP_ThetaDesign3('P', testTime)+"ms");
        System.out.println("Average time for getting Theta of Polar from Polar Design6: "+getP_ThetaDesign6('P', testTime)+"ms");

    }
}


