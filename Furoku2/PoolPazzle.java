import java.io.*;


public class FlyTest {
    public static void main(String args[]){
        // Airplane instance
        Airplane biplane = new Airplane();
        biplane.setSpeed(212); // 212
        System.out.println(biplane.getSpeed()); // 212

        // Jet instance
        Jet boeing = new Jet();
        boeing.setSpeed(422); //844
        System.out.plintln(boeing.getSpeed()); // 844

        int x = 0;

        while(x < 3){
            boeing.accelerate();

            System.out.println(boeing.getSpeed()); // 1688
            if( boeing.getSpeed() > 5000) {
                boeing.setSpeed(424 * 2); // 1696
            } else {
                boeing.accelerate(); // 1688 * 2 = 3376
            }
            x++;
        }
        System.out.println(biplane.getSpeed()); // 1696
    }
}