package geomeasure;

public class GeoSystem implements Calculator{
   double x1,x2;
   double y1,y2;
   double ans;
   
   
   
 
   public GeoSystem(double x1, double x2, double y1, double y2) {
	this.x1 = x1;
	this.x2 = x2;
	this.y1 = y1;
	this.y2 = y2;
   }

   @Override
   public void calculation()
   {
	 this.ans = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
   }
   
   
}