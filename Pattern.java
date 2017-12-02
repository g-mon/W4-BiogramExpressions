
/**
 * Write a description of class Pattern here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pattern
{
   private double x;
   private double y;
   private int odd;
   public Pattern(int startx, int starty){
       x=10+startx;
       y=10+starty;
       odd=1;
    }
   public void doOnce(){
       y= (Math.cos(x*1.6))*((-1)^odd);
       odd+=1;
    }
    public boolean finished(){
        return x+y>100;
    }
}
