public class Rectangle extends Shape{
    private double height,width;

    private Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return this.getHeight()*this.getWidth();
    }

    @Override
    public double calculateCircumference() {
        return (2*(this.getWidth()+this.getHeight()));
    }
}
