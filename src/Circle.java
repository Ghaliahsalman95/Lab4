public class Circle extends Shape{
    private double radius;

    private Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(this.getRadius(),2);
    }

    @Override
    public double calculateCircumference() {
        return (Math.PI)*(2*this.getRadius());
    }
}
