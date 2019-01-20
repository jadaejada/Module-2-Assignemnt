package module1;
//Author Name: Jada Mothersil
//Date: 1/13/2018
//Program Name: Mothersil_Airplane
//Purpose: Simulation using "call" button, call attendent


public class Airplane {	
	


	
	private boolean buttonLight;
	private int seatNumber; 
	
	
	boolean[] buttonligtht = new boolean[] {false, false, false, false, false};

	
		
		public Airplane(boolean[] buttonLight, int seatNumber) {
			this.buttonligtht = buttonLight;
			this.seatNumber = seatNumber;
		}


		public int getseatNumber() {
			return seatNumber;
		}
		public void setseatNumber(int seatNumber) {
			this.seatNumber = seatNumber;
		}
		
		public boolean getbuttonLight() {
			if (seatNumber >= 5) {
				buttonLight = true;
				System.out.println("light is on" + buttonLight);
			}
			else {
				buttonLight = false;
				System.out.println("Light is off");
			}
			return buttonLight;
		}
		public void setbuttonLight(boolean buttonLight) {
			this.buttonLight = buttonLight;
		}
}

/*//array
	private boolean[] lights = new boolean[5];

	//cancel method reset all lights to false
	public void cancel() {
		for (int i =0; i < 5; i++)
			lights[i] = false;
	}
//call method
	public void call (int seatNumber) {
		lights [seatNumber] = !lights[seatNumber];
	}
	//currentState method returns status of lights
	public boolean[] currentState() {
		return lights;
	}*/
