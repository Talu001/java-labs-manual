 class rectangles {
    public int height;
    public int  width;
    public int rectangle_size;

    public   void rectangle(int height,int width){
        this.height=height;
        this.width=width;
    }
    public int  getArea(){
        return rectangle_size = height+width;
    }
    public int getwidth(){
        return width;

    }
    public void setWidth( int width){
        this.width=width;
    }public int getHeight(){
        return height;
    }public void setHeight(int height){
        this.height=height;
    }
public class rectangle_sizes{
    public static void main(String[] args) {
        rectangles size_of_Rectangle = new rectangles();
        size_of_Rectangle.setHeight(15);
        size_of_Rectangle.setWidth(30);
        System.out.println("Area of rectangle 1: ");
        System.out.println(size_of_Rectangle.getArea());

    }
}
 }