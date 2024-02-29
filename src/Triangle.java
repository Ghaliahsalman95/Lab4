public class Triangle extends Shape{
    private double height;
    private double base;

    public Triangle() {
    }

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return (0.5*this.getHeight())*this.getBase();
    }

    @Override
    public double calculateCircumference() {
        //نظرية فيثاغورس لايجاد الوتر و من ثم حساب المحيط
        double hypotenuse=Math.pow(this.getBase(),2)+Math.pow(this.getHeight(),2);
        hypotenuse=Math.pow(hypotenuse,2);
      hypotenuse= Math.sqrt(hypotenuse);
      return (hypotenuse+this.getHeight()+this.getBase());
    }
}
