//leb2 q 5
class rectangles {
    public int height;
    public int  width;
    public int size;

    public   void rectangle(int height,int width){
        this.height=height;
        this.width=width;
    }
    public int  getArea(){
        return size = height+width;
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
}
public class rectanglesize {
    public static void main(String[] args) {
        rectangles size_of_Rectangle = new rectangles();
        size_of_Rectangle.setHeight(15);
        size_of_Rectangle.setWidth(30);
        System.out.println("rectangle Size ;  ");
        System.out.println(size_of_Rectangle.getArea());
    }
}
