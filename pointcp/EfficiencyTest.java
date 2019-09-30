package pointcp;



public class EfficiencyTest {

    /**
     * Find average time to initialize PointCP
     * @param type char value of either C or P
     * @param testTimeSeconds time to run test in seconds
     * @return average operation time in nanoseconds
     */
    public static long initPointCP(char type, long testTimeSeconds){
        long testTimeNano = testTimeSeconds * 1000 * 1000 * 1000;
        long count = 0;
        long start = System.nanoTime();
        long limit = start + testTimeNano;
        while(System.nanoTime() < limit){
            new PointCP(type, 10*Math.random(), 10*Math.random());
            count++;
        }
        long result = testTimeNano/count;
        return result;
    }

    /**
     * Find average time to initialize PointCP Design 2
     * @param type char value of either C or P
     * @param testTimeSeconds time to run test in seconds
     * @return average operation time in nanoseconds
     */
    public static long initDesign2(char type, long testTimeSeconds){
        long testTimeNano = testTimeSeconds * 1000 * 1000 * 1000;
        long count = 0;
        long start = System.nanoTime();
        long limit = start + testTimeNano;
        while(System.nanoTime() < limit){
            new Design2(type, 10*Math.random(), 10*Math.random());
            count++;
        }
        long result = testTimeNano/count;
        return result;
    }

    /**
     * Find average time to initialize PointCP Design 4
     * @param type char value of either C or P
     * @param testTimeSeconds time to run test in seconds
     * @return average operation time in nanoseconds
     */
    public static long initDesign3(char type, long testTimeSeconds){
        long testTimeNano = testTimeSeconds * 1000 * 1000 * 1000;
        long count = 0;
        long start = System.nanoTime();
        long limit = start + testTimeNano;
        while(System.nanoTime() < limit){
            new Design3(type, 10*Math.random(), 10*Math.random());
            count++;
        }
        long result = testTimeNano/count;
        return result;
    }

    /**
     * Find average time to get each Cartesian coordinate from getter method in PointCP
     * @param type char value of either C or P
     * @param testTimeSeconds time to run test in seconds
     * @return average operation time in nanoseconds
     */
    public static long getCPointCP(char type, long testTimeSeconds){
        long testTimeNano = testTimeSeconds * 1000 * 1000 * 1000;
        long count = 0;
        long start = System.nanoTime();
        long limit = start + testTimeNano;
        PointCP tmp = new PointCP(type, 10*Math.random(), 10*Math.random());
        while(System.nanoTime() < limit){
            tmp.getX();
            count++;
            tmp.getY();
            count++;
        }
        long result = testTimeNano/count;
        return result;
    }

    /**
     * Find average time to get each Cartesian coordinate from getter method in PointCP Design 2
     * @param type char value of either C or P
     * @param testTimeSeconds time to run test in seconds
     * @return average operation time in nanoseconds
     */
    public static long getCDesign2(char type, long testTimeSeconds) {
        long testTimeNano = testTimeSeconds * 1000 * 1000 * 1000;
        long count = 0;
        long start = System.nanoTime();
        long limit = start + testTimeNano;
        Design2 tmp = new Design2(type, 10 * Math.random(), 10 * Math.random());
        while (System.nanoTime() < limit) {
            tmp.getX();
            count++;
            tmp.getY();
            count++;
        }
        long result = testTimeNano / count;
        return result;
    }

    /**
     * Find average time to get each Cartesian coordinate from getter method in PointCP Design 4
     * @param type char value of either C or P
     * @param testTimeSeconds time to run test in seconds
     * @return average operation time in nanoseconds
     */
    public static long getCDesign3(char type, long testTimeSeconds) {
        long testTimeNano = testTimeSeconds * 1000 * 1000 * 1000;
        long count = 0;
        long start = System.nanoTime();
        long limit = start + testTimeNano;
        Design3 tmp = new Design3(type, 10 * Math.random(), 10 * Math.random());
        while (System.nanoTime() < limit) {
            tmp.getX();
            count++;
            tmp.getY();
            count++;
        }
        long result = testTimeNano / count;
        return result;
    }

    /**
     * Find average time to get each Polar  coordinate from getter method in PointCP
     * @param type char value of either C or P
     * @param testTimeSeconds time to run test in seconds
     * @return average operation time in nanoseconds
     */
    public static long getPPointCP(char type, long testTimeSeconds) {
        long testTimeNano = testTimeSeconds * 1000 * 1000 * 1000;
        long count = 0;
        long start = System.nanoTime();
        long limit = start + testTimeNano;
        PointCP tmp = new PointCP(type, 10 * Math.random(), 10 * Math.random());
        while (System.nanoTime() < limit) {
            tmp.getRho();
            count++;
            tmp.getTheta();
            count++;
        }
        long result = testTimeNano / count;
        return result;
    }

    /**
     * Find average time to get each Polar  coordinate from getter method in PointCP Design 2
     * @param type char value of either C or P
     * @param testTimeSeconds time to run test in seconds
     * @return average operation time in nanoseconds
     */
    public static long getPDesign2(char type, long testTimeSeconds) {
        long testTimeNano = testTimeSeconds * 1000 * 1000 * 1000;
        long count = 0;
        long start = System.nanoTime();
        long limit = start + testTimeNano;
        Design2 tmp = new Design2(type, 10 * Math.random(), 10 * Math.random());
        while (System.nanoTime() < limit) {
            tmp.getRho();
            count++;
            tmp.getTheta();
            count++;
        }
        long result = testTimeNano / count;
        return result;
    }

    /**
     * Find average time to get each Polar  coordinate from getter method in PointCP Design 4
     * @param type char value of either C or P
     * @param testTimeSeconds time to run test in seconds
     * @return average operation time in nanoseconds
     */
    public static long getPDesign3(char type, long testTimeSeconds) {
        long testTimeNano = testTimeSeconds * 1000 * 1000 * 1000;
        long count = 0;
        long start = System.nanoTime();
        long limit = start + testTimeNano;
        Design3 tmp = new Design3(type, 10 * Math.random(), 10 * Math.random());
        while (System.nanoTime() < limit) {
            tmp.getRho();
            count++;
            tmp.getTheta();
            count++;
        }
        long result = testTimeNano / count;
        return result;
    }

    /**
     * Main loop to run tests and print results out to user
     * @param args
     */
    public static void main(String[] args){
        int testTime = 5;
        System.out.println("Average time for initializing C PointCP: "+initPointCP('C', testTime)+"ns");
        System.out.println("Average time for initializing C PointCPD2: "+initDesign2('C', testTime)+"ns");
        System.out.println("Average time for initializing C PointCPD4: "+initDesign3('C', testTime)+"ns");
        System.out.println("Average time for initializing P PointCP: "+initPointCP('P', testTime)+"ns");
        System.out.println("Average time for initializing P PointCPD2: "+initDesign2('P', testTime)+"ns");
        System.out.println("Average time for initializing P PointCPD4: "+initDesign3('P', testTime)+"ns");

        System.out.println("Average time for getting Cartesian from Cartesian PointCP: "+getCPointCP('C', testTime)+"ns");
        System.out.println("Average time for getting Cartesian from Cartesian PointCPD2: "+getCDesign2('C', testTime)+"ns");
        System.out.println("Average time for getting Cartesian from Cartesian PointCPD4: "+getCDesign3('C', testTime)+"ns");
        System.out.println("Average time for getting Polar from Cartesian PointCP: "+getPPointCP('C', testTime)+"ns");
        System.out.println("Average time for getting Polar from Cartesian PointCPD2: "+getPDesign2('C', testTime)+"ns");
        System.out.println("Average time for getting Polar from Cartesian PointCPD4: "+getPDesign3('C', testTime)+"ns");

        System.out.println("Average time for getting Cartesian from Polar PointCP: "+getCPointCP('P', testTime)+"ns");
        System.out.println("Average time for getting Cartesian from Polar PointCPD2: "+getCDesign2('P', testTime)+"ns");
        System.out.println("Average time for getting Cartesian from Polar PointCPD4: "+getCDesign3('P', testTime)+"ns");
        System.out.println("Average time for getting Polar from Polar PointCP: "+getPPointCP('P', testTime)+"ns");
        System.out.println("Average time for getting Polar from Polar PointCPD2: "+getPDesign2('P', testTime)+"ns");
        System.out.println("Average time for getting Polar from Polar PointCPD4: "+getPDesign3('P', testTime)+"ns");
    }
}

