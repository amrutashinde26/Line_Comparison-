

public class Line_Comparison {

    public void isEqual(double x1,double x2,double y1,double y2){
        double length_line = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.println("Length of line is :"+length_line);
    }

    public static void main(String[] args) {

        Line_Comparison uc1 = new Line_Comparison();
        uc1.isEqual(1, 5, 4, 9);


    }
}
