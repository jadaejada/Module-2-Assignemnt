package module1;

import java.util.Scanner;

public class AirplaneTest {
	
	public static void main(String[] args) {
		
	
		
		int seatNumber = 0;
		boolean[] buttonLight = null;
		Airplane airplane1 = new Airplane(buttonLight, seatNumber);
        Scanner input = new Scanner(System.in);
        
        
        // Display the menu
        System.out.println("1\t Cancel for reset all switch");
        System.out.println("2\t Call <num> setting one switch");
        System.out.println("3\t Exit");
        

        System.out.println("Please enter your choice:");
        
        //Get user's choice
        int choice = input.nextInt();
         
        //Display the title of the chosen module
        switch (choice) {

            case 1: System.out.println(Arrays.toString(buttonLight) + resetButtonLight()); 
            System.out.println("The switches have all been reset to off");
	   break;
            case 2: 
            	
            	
            	System.out.println("" + airplane1.getbuttonLight());
                    break;
            case 3: System.out.println("Req Engineering"); 
                    break;
            default: System.out.println("Invalid choice");
        }//end of switch
    }//end of the main method

	private static String resetButtonLight() {
		// TODO Auto-generated method stub
		return null;
	}
}//end of class*/

/*//airplane object
		Airplane airplane = new Airplane();
		boolean[] lights; //varible
		
		//allows for user input
		Scanner input = new Scanner(System.in);
	
		while (true) {
			lights = airplane.currentState();
			for(int i = 0; i < 5; i++)
				if (lights[i])
					System.out.println("On");
				else
					System.out.println("Off");
					System.out.println("");
					
					System.out.println("Enter choice: (1)Cancel, (2)Call Num, (3)Exit");
					
					int command;
					int seatNumber;
					command = input.nextInt();
					if (command == 1) {
						airplane.cancel();
					}
					else if (command == 2) {
						seatNumber = input.nextInt();
						airplane.call(seatNumber);
					}
					else if (command == 3) {
						break;
					}
		}*/
	
	
	
	
	