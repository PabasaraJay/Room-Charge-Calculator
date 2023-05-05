import java.util.Scanner;

public class RoomChargeCalculator {

 public static Scanner in = new Scanner(System.in);

  
 public static String yesNo;

 
	public static int deluxDoublefixedPrice = 5000;
	public static int standardFamilyfixedPrice = 3000;
	public static int standardSinglefixedPrice = 2000;

 
	public static int balconyPrice = 500;
	public static int parkingPrice = 200;
	public static int tvPrice = 200;
	public static int kitchenPrice = 1000;
	public static int wifiPrice = 100;
	public static int gardenPrice = 200;
	public static int acPrice = 500;

 
	public static void main(String args[]) {

  
		System.out.println(" Room Charge Calculator");
		System.out.println("1.Delux Double ");
		System.out.println("2.Standard Family ");
		System.out.println("3.Standard Single ");
		System.out.println("4.Quit");
		System.out.print("Enter Your Choice (1-4): ");
		int chooseNum = in.nextInt();

  
		switch (chooseNum) {
			case 1:
			System.out.println();
			System.out.println("Delux Double room  fixed price: " + deluxDoublefixedPrice + "\n");
   
   
			System.out.println(" Additional chargers if the following are requested ");
			System.out.println(" Balcony Charge: " + balconyPrice);
			System.out.println(" Parking Charge: " + parkingPrice);
			System.out.println(" TV Charge: " + tvPrice);
			System.out.println(" Kitchen Charge: " + kitchenPrice);
			System.out.println(" WiFi Charge: " + wifiPrice);

   
			System.out.print("Do you need additional services? Yes/No: ");
			yesNo = in.next();

   
			if (yesNo.toLowerCase().equals("yes")) {
				System.out.println();
    
    
				System.out.print(" balcony? yes/no: ");
				String balcony = in.next();
				boolean balconyConfirmed = confirmExtra(balcony);
				

    
				System.out.print(" Parking? yes/no: ");
				String parking = in.next();
				boolean parkingConfirmed = confirmExtra(parking);
				

    
				System.out.print(" TV? yes/no: ");
				String tv = in.next();
				boolean tvConfirmed = confirmExtra(tv);
				

		
				System.out.print(" Kitchen? yes/no: ");
				String kitchen = in.next();
				boolean kitchenConfirmed = confirmExtra(kitchen);

   
				System.out.print(" WiFi? yes/no: ");
				String wifi = in.next();
				boolean wifiConfirmed = confirmExtra(wifi);
				

    
				getChargeDeluxDouble(balconyConfirmed, parkingConfirmed, tvConfirmed, kitchenConfirmed, wifiConfirmed);
			} else {
				
				System.out.println(" Total Room Charge is : "  + deluxDoublefixedPrice);
					}
			break;

			case 2:
				System.out.println();
				System.out.println("Standard Family room fixed price: " + standardFamilyfixedPrice + "\n");
   
				kitchenPrice=500;
   
				System.out.println("**** Our aditional services ****");
				System.out.println(" Parking Charge: " + parkingPrice);
				System.out.println(" Kitchen Charge: " + kitchenPrice);
				System.out.println(" Garden Charge: " + gardenPrice);

   
				System.out.print("Do you need additional servicess? Yes/No: ");
				yesNo = in.next();

   
				if (yesNo.toLowerCase().equals("yes")) {
					System.out.println();

    
					System.out.print(" Parking? yes/no: ");
					String parking = in.next();
					boolean parkingConfirmed = confirmExtra(parking);

    
					System.out.print(" Kitchen? yes/no: ");
					String kitchen = in.next();
					boolean kitchenConfirmed = confirmExtra(kitchen);

    
					System.out.print(" Garden? yes/no: ");
					String garden = in.next();
					boolean gardenConfirmed = confirmExtra(garden);

    
					getChargeStandardFamily(parkingConfirmed, kitchenConfirmed, gardenConfirmed);
				} else {
					
					System.out.println("Total Room Charge is : "  + standardFamilyfixedPrice);
				}
			break;

			case 3:
				System.out.println();
				System.out.println("Standard Single Fixed Price: " + standardSinglefixedPrice + "\n");
   
				System.out.println("**** Our aditional services ****");
				System.out.println(" Parking Charge: " + parkingPrice);
				System.out.println(" AC Charge: " + acPrice);
				System.out.println(" WiFi Charge: " + wifiPrice);

	
				System.out.print("Do you need additional services? Yes/No: ");
				yesNo = in.next();

   
				if (yesNo.toLowerCase().equals("yes")) {
    
    
					System.out.print(" Parking? yes/no: ");
					String parking = in.next();
					boolean parkingConfirmed = confirmExtra(parking);

    
					System.out.print(" AC? yes/no: ");
					String ac = in.next();
					boolean acConfirmed = confirmExtra(ac);


					System.out.print(" Wifi? yes/no: ");
					String wifi = in.next();
					boolean wifiConfirmed = confirmExtra(wifi);

    
					getChargeStandardSingle(parkingConfirmed, acConfirmed, wifiConfirmed);
				} else {
					
					System.out.println("Total Room Charge is : " + standardSinglefixedPrice);
					}

			break;
			case 4:
				System.out.println(" Calculator Closed ");
				in.close();
			break;

			default:
				System.out.println(" Error: Please Select From the Available Packages");
				in.close();
			break;
			}
		}

 
		public static boolean confirmExtra(String answer) {
		boolean confirm;
		if (answer.toLowerCase().equals("yes")) {
			confirm = true;
		} else {
			confirm = false;
			}

		return confirm;

		}

 
		public static int getPrice(boolean action, int price) {

		if (action == true) {
			return price;
		} else {
			price = 0;
		return price;
			}
		}

 
		public static void getChargeDeluxDouble(boolean balcony, boolean parking, boolean tv, boolean kitchen,boolean wifi) {

  
			int getBalconyPrice = getPrice(balcony, balconyPrice);
			int getParkingPrice = getPrice(parking, parkingPrice);
			int getTvPrice = getPrice(tv, tvPrice);
			int getKitchenPrice = getPrice(kitchen, kitchenPrice);
			int getWifiPrice = getPrice(wifi, wifiPrice);

  
			int totalPrice = deluxDoublefixedPrice + getBalconyPrice + getParkingPrice + getTvPrice + getKitchenPrice + getWifiPrice;
	
			System.out.println("Total Room Charge is : "  + totalPrice);
		}

 
		public static void getChargeStandardFamily(boolean parking, boolean kitchen, boolean garden) {

  
			int getParkingPrice = getPrice(parking, parkingPrice);
			int getKitchenPrice = getPrice(kitchen, kitchenPrice);
			int getGardenPrice = getPrice(garden, gardenPrice);

  
			int totalPrice = standardFamilyfixedPrice + getParkingPrice + getKitchenPrice + getGardenPrice;
	
			System.out.println("Total Room Charge is : "  + totalPrice);
		}

 
		public static void getChargeStandardSingle(boolean parking, boolean ac, boolean wifi) {

  
			int getParkingPrice = getPrice(parking, parkingPrice);
			int getAcPrice = getPrice(ac, acPrice);
			int getWifiPrice = getPrice(wifi, wifiPrice);


			int totalPrice = standardSinglefixedPrice + getParkingPrice + getAcPrice + getWifiPrice;
	
			System.out.println("Total Room Charge is : " + totalPrice);
		}

}


