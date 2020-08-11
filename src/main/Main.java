/**
 *
 */
package main;

import cars.Colors;
import cars.Ford;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Ford myBlueFord = new Ford(Colors.BLUE);

        Ford myWhiteFord = new Ford(Colors.WHITE);

        Ford myRedFord = new Ford(Colors.RED);

        Ford myBlackFord = new Ford(Colors.BLACK);


        System.out.println("Value of my " + myBlueFord.getColor()
                + " Ford: " + myBlueFord.valueOfCar());

        System.out.println("Value of my " + myWhiteFord.getColor()
                + " Ford: " + myWhiteFord.valueOfCar());

        System.out.println("Value of my " + myRedFord.getColor()
                + " Ford: " + myRedFord.valueOfCar());

        System.out.println("Value of my " + myBlackFord.getColor()
                + " Ford: " + myBlackFord.valueOfCar());
    }

}
