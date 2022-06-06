import java.awt.Color;
public class Test {
    public static void main(String[] args) {
        int n=5;
        
        Color red=new Color(254,0,0);
        Color black=new Color(0,0,0);
        
        StdDraw.setXscale(0,n);
        StdDraw.setYscale(0,n);
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(((i+j)%2)==0){
                    StdDraw.setPenColor(red);
                    StdDraw.filledSquare(i+0.5, j+0.5, 0.5);
                }else{
                    StdDraw.setPenColor(black);
                    StdDraw.filledCircle(i+0.5, j+0.5, 0.5);
                }
                
            }
        }
        StdDraw.show();
}
}
