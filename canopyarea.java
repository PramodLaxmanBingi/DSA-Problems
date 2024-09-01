import java.util.*;
public class Canopyarea {
    public static int Area(int n){
        double area;
        area = (3.14)*n*n;
        return (int)Math.round(area); //(int) anedi enduku ante area anedi double lo untadi kabati int loki marchadaniki
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
        System.out.println(Area(n));
    }
}
