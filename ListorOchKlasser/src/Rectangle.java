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
        private int x;
        private int y;
        private int width;
        private int height;

        public Rectangle() {
            this.x = 0;
            this.y = 0;
            this.width = 0;
            this.height = 0;
        }
        public Rectangle(int width, int height) {
            this.x = 0;
            this.y = 0;
            this.width = width;
            this.height = height;
        }

        public Rectangle(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }

    public int calculateArea (int width, int height) {
        int area = width * height;
        return area;
    }
     public int calculatePerimeter (int width, int height) {
         int perimeter = (width + height) * 2;
         return perimeter;
     }
     public void setXY (int x, int y) {
          this.y = y;
         this.x = x;
     }

     public int getWidth() {
         return width;
     }

     public void setWidth(int width) {
         this.width = width;
     }

     public int getY() {
         return y;
     }

     public void setY(int y) {
         this.y = y;
     }

     public void setX(int x) {
         this.x = x;
     }

     public int getHeight() {
         return height;
     }

     public void setHeight(int height) {
         this.height = height;
     }

     public int getX() {
         return x;
     }
 }

