class Shape{
    String color;
    Shape(){
        this.color = "black";
    }
    Shape(String color){
        this.color = color;
    }
}


class Rectangle extends Shape{
    int width;
    int length;
    Rectangle(String color,int width,int length){
    super(color);
    this.width = width;
    this.length = length;
    }
    int CalcArea(){
        int rett = width * length;
        return rett;
    }
}

public class ShapeHierachy{
    public static void main(String[] args){
        Rectangle rect = new Rectangle("pink ",38,45);
        System.out.println("Width: "+rect.width);
        System.out.println("Length: "+rect.length);
        System.out.println("Color: "+rect.color);
        System.out.println("Area: "+rect.CalcArea());
    }
}