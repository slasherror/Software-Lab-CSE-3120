public class Main{
    public static void main(String[] args) { 
       ShapeFactory shapeFactory=ShapeFactory.getInstance(); 
       ShapeFactory shapeFactory1=ShapeFactory.getInstance(); 
       Shape shape1 = shapeFactory.getShape("Square");shape1.draw(); 
       Shape shape2 = shapeFactory.getShape("RECTANGLE");shape2.draw(); 
       System.out.println(shapeFactory.hashCode());
       System.out.println(shapeFactory1.hashCode());
    } 
}