 //• har fyra instansvariabler: x, y, width och height
//• har tre konstruktörer
//1. en som inte tar emot ngt och som sätter alla instansvariabler till 0
//        2. en som tar emot två värden som sätts in i width och height medan x och y sätts
//till 0
//        3. en som tar emot fyra värden som används för att sätta de fyra instansvariablerna
//• en instansmetod calculateArea som returnerar en double med rektangelns area
//• en instansmetod calculatePerimeter som returnerar en double med rektangelns
//        omkrets
//• en instansmetod setXY som låter dig sätta instansvariablerna x och y
//• två instansmetoder setWidth och setHeight som låter dig sätta motsvarande
    public class Rectangle {
        private double x;
        private double y;
        private double width;
        private double height;

        public Rectangle() {
            this.x = 0.0;
            this.y = 0.0;
            this.width = 0.0;
            this.height = 0.0;
        }
        public Rectangle(double width, double height) {
            this.x = 0.0;
            this.y = 0.0;
            this.width = width;
            this.height = height;
        }

        public Rectangle(double x, double y, double width, double height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }

    public double calculateArea (double width, double height) {
        double area = width * height;
        return area;
    }
     public double calculatePerimeter (double width, double height) {
         double perimeter = (width + height) * 2;
         return perimeter;
     }
     public void setXY (double x, double y) {
          this.y = y;
         this.x = x;
     }

     public double getWidth() {
         return width;
     }

     public void setWidth(double width) {
         this.width = width;
     }

     public double getY() {
         return y;
     }

     public void setY(double y) {
         this.y = y;
     }

     public void setX(double x) {
         this.x = x;
     }

     public double getHeight() {
         return height;
     }

     public void setHeight(double height) {
         this.height = height;
     }

     public double getX() {
         return x;
     }
 }

