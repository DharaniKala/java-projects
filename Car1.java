package tasks;

public class Car1 {
	private String model;
	private double speed;


	public Car1() {
		
	}
	
	
	
	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public double getSpeed() {
		return speed;
	}



	public void setSpeed(double speed) {
		this.speed = speed;
	}



	public boolean start() {
		return true;
	}
		public void accelerate() {
			speed += 10;
		}
		
		public void changeInt(int i) {
			i = i+10;
		}
		public static void main (String S[]) {
			Car car1 = new Car();
			Car car2 = new Car();
			
			car1.speed = 20.0; //encapsulation
			car2.speed = 30.0;
			
			System.out.println(car1.speed);
			System.out.println(car2.speed);
			int count = 100;
	
			System.out.println(count);
			
		}


}

