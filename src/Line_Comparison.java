

    public class Line_Comparison {
        public double isEqual(double x1,double x2,double y1,double y2){
            double length_line = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
            return length_line;
        }
        public static void main(String[] args) {

            Line_Comparison uc3 = new Line_Comparison();
            double ans1_length_line=uc3.isEqual(1, 5, 4, 9);
            double ans2_length_line=uc3.isEqual(2, 4, 5, 6);

            if(ans1_length_line == ans2_length_line){
                System.out.println("Length of  both lines are equal");
            }else if(ans1_length_line<ans2_length_line){
                System.out.println("Length of  line 1 is less than line 2");
            }
            else{
                System.out.println("Length of line 1 is greater than line 2");
            }
        }
    }
