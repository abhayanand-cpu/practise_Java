class Fan{
	
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	private int speed;
	private boolean on;
	private double radius;
	String color;
	
	Fan(){
		
		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";
		
	}
	
	public int GetSpeed() {
		return speed;
	}
	
	public boolean GetOn() {
		return on;
	}
	
	public double GetRadius() {
		return radius;
	}
	
	String GetColor() {
		return color;
	}
	
	public void SetSpeed( int speed ) {
		this.speed = speed;
	}
	
	public void SetOn( boolean on ) {
		this.on = on;
	}
	
	public void SetRadius( double radius ) {
		this.radius = radius;
	}
	
	void SetColor( String color ) {
		this.color = color;
	}
	
	public String toString() {
		
		String result = "Speed: "+GetSpeed()+"\nColor: "+GetColor()+"\nRadius: "+GetRadius();
		if( GetOn() )
			return result += "\nFan is on";
		else
			return result += "\nFan is off";
	}
	
}
public class A7Q5 {

	public static void main(String[] args) {
		System.out.println("------1st FAN-------\n");
		Fan F1 = new Fan();
		F1.SetSpeed(F1.FAST);
		F1.SetRadius(10);
		F1.SetColor("Yellow");
		F1.SetOn(true);
		System.out.println(F1.toString());
		
		System.out.println("\n------2nst FAN-------\n");
		Fan F2 = new Fan();
		F2.SetSpeed(F2.MEDIUM);
		F2.SetRadius(5);
		F2.SetColor("Blue");
		F2.SetOn(false);
		System.out.println(F2.toString());
	}

}
