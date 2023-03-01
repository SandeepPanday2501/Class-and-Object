public class Shape {
   public int width =10;
    int height =20;

   Shape(){
      width = 10;
      height =20;
   }
   Shape(int w, int h) {
      width = w;
      height = h;
   }
   public void area(){
      System.out.println("What is up?");
      System.out.println("Area =" + (width * height));
   }

}
