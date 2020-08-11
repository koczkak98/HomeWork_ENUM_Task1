/**
 *
 */
package cars;

public class Ford extends Car {

    public Ford(Colors color) {
        super(color);
    }

    @Override
    public int valueOfCar() {
        int value = 0;

        if(this.color == Colors.WHITE) {
            value = 0;
        }
        else if((this.color == Colors.BLUE)  ||
                (this.color == Colors.GREEN) ||
                (this.color == Colors.BLACK)){
            value = 50;
        }

        else if((this.color == Colors.YELLOW))
        {
            value = 20;
        }
        else {
            /** Car is RED */
            value = 100;
        }

        return value;
    }


}
