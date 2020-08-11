/**
 *
 */
package cars;


public abstract class Car {
    protected int speed;
    protected Colors color;

    public Car(Colors color) {
        this.speed = 0;
        this.color = color;
    }

    public Colors getColor()
    {
        return (this.color);
    }

    public abstract int valueOfCar();
}
