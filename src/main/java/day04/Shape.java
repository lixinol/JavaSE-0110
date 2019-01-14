package day04;

public class Shape {

        double getArea() {
            return 0;
        }


    class Square extends Shape {

        double length;

        public Square(double length) {
            this.length = length;
        }

          // double getArea() {
         // return super.getArea();
//    }


        @Override
        double getArea() {
            return length * length;
        }
    }

}
