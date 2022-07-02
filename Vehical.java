import java.util.Iterator;
import java.util.Scanner;

class General {
	private String name;
	String brand;
	double price;
	String fuelType;
	String specialFeature;
	String wheelType;
	String wheelModel;
	String average;
	String vehicalEngine;
	
	String option = "Your ans: ";
	
	public String getName() {
		return name;
	}
	
	public void setName(String cusName) {
		name = cusName;
	}
	
	static {
		System.out.println("*** Welcome to Qspiders Showroom ***");
		System.out.println(" ");
	}
}

class Wheel extends General {
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter Your Full Name: ");
		String n = sc.nextLine();
		System.out.println();
		System.out.println("========= Welcome " + n + " ===========" );
		setName(n);
		System.out.println("Please Select which type of vehicle you are looking for");
		System.out.println(" ");
	}
	
	
	
//	choose wheel type
	public void chooseWheelType() {
		System.out.println("For Two Wheeler Please Select: 1");
		System.out.println("For Three Wheeler Please Select: 2");
		System.out.println("For Four Wheeler Please Select: 3");
		System.out.println("For Six Wheeler Please Select: 4");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print(option);
		int wheelOption = sc.nextInt();
		
		if(wheelOption <=4 && wheelOption >0) {
			selectWheelType(wheelOption);
		} else {
			System.out.println("You Selected " + wheelOption + " option which is not valid please select valid option");
			chooseWheelType();
		}
		
	}
	
//	set wheel type
	public void selectWheelType(int wheel) {
		
		
		switch (wheel) {
		case 1:
			wheelType = "Two Wheeler";
			break;
		case 2:
			wheelType = "Three Wheeler";
			break;
		case 3:
			wheelType = "Four Wheeler";
			break;
		case 4:
			wheelType = "Six Wheeler";
			break;
		default: 
			wheelType = "";
		}
		
		System.out.println("You Selected " + wheelType + " Vehicle");
		System.out.println(" ");
		
		System.out.println("Are You Sure");
		System.out.println("Yes: 1");
		System.out.println("No: 2");
		
		Scanner sc = new Scanner(System.in);
		System.out.print(option);
		int confirm = sc.nextInt();
		System.out.println(" ");
		
		
		if(confirm == 1) {
			
		} else {
			System.out.println(" ");
			chooseWheelType();
		} 
	}
	
}

class Cycle {
	String brand;
	String feature;
	double price;
	
	Cycle(String brand, String feature, double price) {
		this.brand = brand;
		this.feature = feature;
		this.price = price;
	}
	
	public void getDetails() {
		System.out.println("==================================");
		System.out.println("Brand: " + brand);
		System.out.println("Feature: " + feature);
		System.out.println("Price: " + price);
		System.out.println("==================================");
		System.out.println(" ");
	}
}

class Bike {
	String brand;
	String bikeModal;
	String engine;
	double price;
	String feature;
	String average;
	
	
	Bike(String brand, String bikeModal, String engine, double price, String average, String feature) {
		this.brand = brand;
		this.bikeModal = bikeModal;
		this.feature = feature;
		this.engine = engine;
		this.price = price;
		this.average = average;
	}
	
	@Override
	public String toString() {
		System.out.println("==================================");
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + bikeModal);
		System.out.println("Engine: " + engine);
		System.out.println("Price: " + price);
		System.out.println("Average: " + average);
		System.out.println("Feature: " + feature);
		System.out.println("==================================");
		return "";
	}
}

class ThreeWheeler {
	String brand;
	String threeWheelerModal;
	String engine;
	double price;
	String feature;
	String average;
	
	ThreeWheeler(String brand, String bikeModal, String engine, double price, String average, String feature) {
		this.brand = brand;
		this.threeWheelerModal = bikeModal;
		this.feature = feature;
		this.engine = engine;
		this.price = price;
		this.average = average;
	}
	
	@Override
	public String toString() {
		System.out.println("==================================");
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + threeWheelerModal);
		System.out.println("Engine: " + engine);
		System.out.println("Price: " + price);
		System.out.println("Average: " + average);
		System.out.println("Feature: " + feature);
		System.out.println("==================================");
		return "";
	}
}

class FourWheeler {
	String brand;
	String fourWheelerModal;
	String engine;
	double price;
	String feature;
	String average;
	
	FourWheeler(String brand, String fourWheelerModal, String engine, double price, String average, String feature) {
		this.brand = brand;
		this.fourWheelerModal = fourWheelerModal;
		this.feature = feature;
		this.engine = engine;
		this.price = price;
		this.average = average;
	
	}
	
	@Override
	public String toString() {
		System.out.println("==================================");
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + fourWheelerModal);
		System.out.println("Engine: " + engine);
		System.out.println("Price: " + price);
		System.out.println("Average: " + average);
		System.out.println("Feature: " + feature);
		System.out.println("==================================");
		return "";
	}
}

class WheelModal extends Wheel {
	
//	=========== TWO WHEELERS SUBMETHODS ====================
	
	public void selectCycle() {
		Cycle c1 = new Cycle("Hero", "shock absorber", 6500);
		Cycle c2 = new Cycle("Atlas", "Head Light", 7500);
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Select 1 for Hero Cycle Details");
		System.out.println("Select 2 for Atlas Cycle Details");
		System.out.print(option);
		int n = sc.nextInt();
		System.out.println(" ");
		
		switch(n) {
			case 1:
				c1.getDetails();
				System.out.println("Select 1 for buy");
				System.out.println("Select 2 for see other detils");
				int no = sc.nextInt();
				if(no == 1) {
					price = c1.price;
					brand = c1.brand;
					specialFeature = c1.feature;
				} else {
					selectCycle();
				}
				break;
			case 2:
				c2.getDetails();
				System.out.println("Select 1 for buy");
				System.out.println("Select 2 for see other detils");
				System.out.println(option);
				int no2 = sc.nextInt();
				
				System.out.println(" ");
				if(no2 == 1) {
					price = c1.price;
					brand = c1.brand;
					specialFeature = c1.feature;
				} else {
					selectCycle();
				}
				break;
			default:
				System.out.println("Please Select Valid Option");
				System.out.println(" ");
				selectCycle();
		}
		sc.close();
	}
	
	public void selectBike() {
		Bike b1 = new Bike("Hero","Hero Splender Plus", "97.2cc", 67000 ,"60 kmpl", "Comfortable");
		Bike b2 = new Bike("TVS","TVS Radeon", "109.7cc", 69000 ,"65 kmpl", "Fast & Comfortable");
		Bike b3 = new Bike("TVS","TVS Sport", "109.7cc", 58000 ,"70 kmpl", "High Average");
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Select 1 for Hero Splender Plus Details");
		System.out.println("Select 2 for TVS Radeon Details");
		System.out.println("Select 3 for TVS Sport Details");
		System.out.print("Your ans: ");
		int n = sc.nextInt();
		System.out.println(" ");
		
		switch(n) {
			case 1:
				System.out.println(b1);
				System.out.println("Select 1 for buy");
				System.out.println("Select 2 for see other detils");
				System.out.print(option);
				int no = sc.nextInt();
				System.out.println(" ");
				if(no == 1) {
					brand = b1.brand;
					specialFeature = b1.feature;
					wheelModel = b1.bikeModal;
					vehicalEngine = b1.engine;
					price = b1.price;
					specialFeature = b1.feature;
					average = b1.average;
					
				} else {
					selectBike();
				}
				break;
				
			case 2:
				System.out.println(b2);
				System.out.println("Select 1 for buy");
				System.out.println("Select 2 for see other detils");
				System.out.print(option);
				int no2 = sc.nextInt();
				System.out.println(" ");
				if(no2 == 1) {
					brand = b2.brand;
					specialFeature = b2.feature;
					wheelModel = b2.bikeModal;
					vehicalEngine = b2.engine;
					price = b2.price;
					specialFeature = b2.feature;
					average = b2.average;
					
				} else {
					selectBike();
				}
				break;
				
			case 3:
				System.out.println(b3);
				System.out.println("Select 1 for buy");
				System.out.println("Select 2 for see other detils");
				System.out.print(option);
				int no3 = sc.nextInt();
				System.out.println(" ");
				if(no3 == 1) {
					brand = b3.brand;
					specialFeature = b3.feature;
					wheelModel = b3.bikeModal;
					vehicalEngine = b3.engine;
					price = b3.price;
					specialFeature = b3.feature;
					average = b3.average;
					
				} else {
					selectBike();
				}
				break;
			
			default:
				System.out.println("Please Select Valid Option");
				selectBike();
				break;
		}
		sc.close();
	}
	
//	=========== TWO WHEELERS SUBMETHODS ENDS ====================
	
//	=========== THREE WHEELERS SUBMETHODS ====================
	
	public void selectAuto() {
		ThreeWheeler a1 = new ThreeWheeler("Mahindra","Mahindra Treo", "97.2cc", 67000 ,"60 kmpl", "Comfortable");
		ThreeWheeler a2 = new ThreeWheeler("Bajaj","Bajaj Compact", "97.2cc", 67000 ,"60 kmpl", "Comfortable");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select 1 for Mahindra Treo Details");
		System.out.println("Select 2 for Bajaj Compact Details");
		
		System.out.print("Your ans: ");
		int n = sc.nextInt();
		System.out.println(" ");
		
		switch(n) {
			case 1:
				System.out.println(a1);
				System.out.println("Select 1 for buy");
				System.out.println("Select 2 for see other detils");
				System.out.print(option);
				int no = sc.nextInt();
				System.out.println(" ");
				if(no == 1) {
					brand = a1.brand;
					specialFeature = a1.feature;
					wheelModel = a1.threeWheelerModal;
					vehicalEngine = a1.engine;
					price = a1.price;
					specialFeature = a1.feature;
					average = a1.average;
					
				} else {
					selectAuto();
				}
				break;
				
			case 2:
				System.out.println(a2);
				System.out.println("Select 1 for buy");
				System.out.println("Select 2 for see other detils");
				System.out.print(option);
				int no2 = sc.nextInt();
				System.out.println(" ");
				if(no2 == 1) {
					brand = a2.brand;
					specialFeature = a2.feature;
					wheelModel = a2.threeWheelerModal;
					vehicalEngine = a2.engine;
					price = a2.price;
					specialFeature = a2.feature;
					average = a2.average;
					
				} else {
					selectAuto();
				}
				break;
			
			default:
				System.out.println("Please Select Valid Option");
				selectAuto();
				break;
		}
		sc.close();
	}
	
	public void selectTumTum() {
		ThreeWheeler t1 = new ThreeWheeler("Piaggio","Piaggio Ape", "97.2cc", 67000 ,"60 kmpl", "Comfortable");
		ThreeWheeler t2 = new ThreeWheeler("Bajaj","Bajaj Maxima Z", "97.2cc", 67000 ,"60 kmpl", "Comfortable");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select 1 for Piaggio Ape Details");
		System.out.println("Select 2 for Bajaj Maxima Z Details");
		
		System.out.print("Your ans: ");
		int n = sc.nextInt();
		System.out.println(" ");
		
		switch(n) {
			case 1:
				System.out.println(t1);
				System.out.println("Select 1 for buy");
				System.out.println("Select 2 for see other detils");
				System.out.print(option);
				int no = sc.nextInt();
				System.out.println(" ");
				if(no == 1) {
					brand = t1.brand;
					specialFeature = t1.feature;
					wheelModel = t1.threeWheelerModal;
					vehicalEngine = t1.engine;
					price = t1.price;
					specialFeature = t1.feature;
					average = t1.average;
					
				} else {
					selectTumTum();
				}
				break;
				
			case 2:
				System.out.println(t2);
				System.out.println("Select 1 for buy");
				System.out.println("Select 2 for see other detils");
				System.out.print(option);
				int no2 = sc.nextInt();
				System.out.println(" ");
				if(no2 == 1) {
					brand = t2.brand;
					specialFeature = t2.feature;
					wheelModel = t2.threeWheelerModal;
					vehicalEngine = t2.engine;
					price = t2.price;
					specialFeature = t2.feature;
					average = t2.average;
					
				} else {
					selectTumTum();
				}
				break;
			
			default:
				System.out.println("Please Select Valid Option");
				selectTumTum();
				break;
		}
		sc.close();
	}
	
//	=========== THREE WHEELERS SUBMETHODS ENDS ====================
	
//	=========== FOUR WHEELERS SUBMETHODS ====================
	
	public void selectPetrolCar() {
		FourWheeler p1 = new FourWheeler("Mahindra","Mahindra Thar", "1997cc", 1300000 ,"45 kmpl", "automatic transmission");
		FourWheeler p2 = new FourWheeler("Hyundai","Hyundai Venue", "998cc", 700000 ,"55 kmpl", "Additional standard features include 15-inch alloy wheels, a rearview camera");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select 1 for Mahindra Thar Details");
		System.out.println("Select 2 for Hyundai Venue Details");
		
		System.out.print("Your ans: ");
		int n = sc.nextInt();
		System.out.println(" ");
		
		switch(n) {
			case 1:
				System.out.println(p1);
				System.out.println("Select 1 for buy");
				System.out.println("Select 2 for see other detils");
				System.out.print(option);
				int no = sc.nextInt();
				System.out.println(" ");
				if(no == 1) {
					brand = p1.brand;
					specialFeature = p1.feature;
					wheelModel = p1.fourWheelerModal;
					vehicalEngine = p1.engine;
					price = p1.price;
					specialFeature = p1.feature;
					average = p1.average;
					
				} else {
					selectPetrolCar();
				}
				break;
				
			case 2:
				System.out.println(p2);
				System.out.println("Select 1 for buy");
				System.out.println("Select 2 for see other detils");
				System.out.print(option);
				int no2 = sc.nextInt();
				System.out.println(" ");
				if(no2 == 1) {
					brand = p2.brand;
					specialFeature = p2.feature;
					wheelModel = p2.fourWheelerModal;
					vehicalEngine = p2.engine;
					price = p2.price;
					specialFeature = p2.feature;
					average = p2.average;
					
				} else {
					selectPetrolCar();
				}
				break;
			
			default:
				System.out.println("Please Select Valid Option");
				selectPetrolCar();
				break;
		}
		sc.close();
	}
	
	public void selectDieselCar() {
		FourWheeler p1 = new FourWheeler("Mercedes","Mercedes-Benz GLS", "2097cc", 11300000 ,"35 kmpl", "Passenger Airbag, Fog Lights - Front");
		FourWheeler p2 = new FourWheeler("Mahindra","Mahindra Scorpio-N", "998cc", 1700000 ,"55 kmpl", "Auto Booster Headlamps, Largest Sunroof in the Segment.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select 1 for Mercedes-Benz GLS Details");
		System.out.println("Select 2 for Mahindra Scorpio-N Details");
		
		System.out.print("Your ans: ");
		int n = sc.nextInt();
		System.out.println(" ");
		
		switch(n) {
			case 1:
				System.out.println(p1);
				System.out.println("Select 1 for buy");
				System.out.println("Select 2 for see other detils");
				System.out.print(option);
				int no = sc.nextInt();
				System.out.println(" ");
				if(no == 1) {
					brand = p1.brand;
					specialFeature = p1.feature;
					wheelModel = p1.fourWheelerModal;
					vehicalEngine = p1.engine;
					price = p1.price;
					specialFeature = p1.feature;
					average = p1.average;
					
				} else {
					selectDieselCar();
				}
				break;
				
			case 2:
				System.out.println(p2);
				System.out.println("Select 1 for buy");
				System.out.println("Select 2 for see other detils");
				System.out.print(option);
				int no2 = sc.nextInt();
				System.out.println(" ");
				if(no2 == 1) {
					brand = p2.brand;
					specialFeature = p2.feature;
					wheelModel = p2.fourWheelerModal;
					vehicalEngine = p2.engine;
					price = p2.price;
					specialFeature = p2.feature;
					average = p2.average;
					
				} else {
					selectDieselCar();
				}
				break;
			
			default:
				System.out.println("Please Select Valid Option");
				selectDieselCar();
				break;
		}
		sc.close();
	}
	
	public void selectEvCar() {
		FourWheeler p1 = new FourWheeler("Mercedes","Mercedes-Benz EQC", "2097cc", 11300000 ,"35 kmpl", "Passenger Airbag, Fog Lights - Front");
		FourWheeler p2 = new FourWheeler("Tesla","Tesla Modal S", "998cc", 9500000 ,"55 kmpl", "Auto Booster Headlamps, Largest Sunroof in the Segment.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select 1 for Mercedes-Benz EQC Details");
		System.out.println("Select 2 for Tesla Modal S Details");
		
		System.out.print("Your ans: ");
		int n = sc.nextInt();
		System.out.println(" ");
		
		switch(n) {
			case 1:
				System.out.println(p1);
				System.out.println("Select 1 for buy");
				System.out.println("Select 2 for see other detils");
				System.out.print(option);
				int no = sc.nextInt();
				System.out.println(" ");
				if(no == 1) {
					brand = p1.brand;
					wheelModel = p1.fourWheelerModal;
					vehicalEngine = p1.engine;
					price = p1.price;
					specialFeature = p1.feature;
					average = p1.average;
					
				} else {
					selectEvCar();
				}
				break;
				
			case 2:
				System.out.println(p2);
				System.out.println("Select 1 for buy");
				System.out.println("Select 2 for see other detils");
				System.out.print(option);
				int no2 = sc.nextInt();
				System.out.println(" ");
				if(no2 == 1) {
					brand = p2.brand;
					specialFeature = p2.feature;
					wheelModel = p2.fourWheelerModal;
					vehicalEngine = p2.engine;
					price = p2.price;
					specialFeature = p2.feature;
					average = p2.average;
					
				} else {
					selectEvCar();
				}
				break;
			
			default:
				System.out.println("Please Select Valid Option");
				selectEvCar();
				break;
		}
		sc.close();
	}
	
//	=========== FOUR WHEELERS SUBMETHODS ENDS ====================
	
//	=========== SIX WHEELERS SUBMETHODS ========================
	public void selectDieselBus() {
		FourWheeler p1 = new FourWheeler("Mercedes","Mercedes Benz 2441", "1997cc", 1300000 ,"45 kmpl", "automatic transmission");
		FourWheeler p2 = new FourWheeler("Hyundai","Hyundai Venue 354", "998cc", 700000 ,"55 kmpl", "Additional standard features include 15-inch alloy wheels, a rearview camera");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select 1 for Mercedes Benz 2441 Details");
		System.out.println("Select 2 for Hyundai Venue 354 Details");
		
		System.out.print("Your ans: ");
		int n = sc.nextInt();
		System.out.println(" ");
		
		switch(n) {
			case 1:
				System.out.println(p1);
				System.out.println("Select 1 for buy");
				System.out.println("Select 2 for see other detils");
				System.out.print(option);
				int no = sc.nextInt();
				System.out.println(" ");
				if(no == 1) {
					brand = p1.brand;
					specialFeature = p1.feature;
					wheelModel = p1.fourWheelerModal;
					vehicalEngine = p1.engine;
					price = p1.price;
					specialFeature = p1.feature;
					average = p1.average;
					
				} else {
					selectDieselBus();
				}
				break;
				
			case 2:
				System.out.println(p2);
				System.out.println("Select 1 for buy");
				System.out.println("Select 2 for see other detils");
				System.out.print(option);
				int no2 = sc.nextInt();
				System.out.println(" ");
				if(no2 == 1) {
					brand = p2.brand;
					specialFeature = p2.feature;
					wheelModel = p2.fourWheelerModal;
					vehicalEngine = p2.engine;
					price = p2.price;
					specialFeature = p2.feature;
					average = p2.average;
					
				} else {
					selectDieselBus();
				}
				break;
			
			default:
				System.out.println("Please Select Valid Option");
				selectDieselBus();
				break;
		}
		sc.close();
	}
	
	public void selectEvBus() {
		FourWheeler p1 = new FourWheeler("Mercedes","Mercedes Benz 2781", "1997cc", 1300000 ,"45 kmpl", "automatic transmission");
		FourWheeler p2 = new FourWheeler("Mahindra","Mahindra Venue 391", "998cc", 700000 ,"55 kmpl", "Additional standard features include 15-inch alloy wheels, a rearview camera");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select 1 for Mercedes Benz 2781 Details");
		System.out.println("Select 2 for Mahindra Venue 391 Details");
		
		System.out.print("Your ans: ");
		int n = sc.nextInt();
		System.out.println(" ");
		
		switch(n) {
			case 1:
				System.out.println(p1);
				System.out.println("Select 1 for buy");
				System.out.println("Select 2 for see other detils");
				System.out.print(option);
				int no = sc.nextInt();
				System.out.println(" ");
				if(no == 1) {
					brand = p1.brand;
					specialFeature = p1.feature;
					wheelModel = p1.fourWheelerModal;
					vehicalEngine = p1.engine;
					price = p1.price;
					specialFeature = p1.feature;
					average = p1.average;
					
				} else {
					selectEvBus();
				}
				break;
				
			case 2:
				System.out.println(p2);
				System.out.println("Select 1 for buy");
				System.out.println("Select 2 for see other detils");
				System.out.print(option);
				int no2 = sc.nextInt();
				System.out.println(" ");
				if(no2 == 1) {
					brand = p2.brand;
					specialFeature = p2.feature;
					wheelModel = p2.fourWheelerModal;
					vehicalEngine = p2.engine;
					price = p2.price;
					specialFeature = p2.feature;
					average = p2.average;
					
				} else {
					selectEvBus();
				}
				break;
			
			default:
				System.out.println("Please Select Valid Option");
				selectEvBus();
				break;
		}
		sc.close();
	}
//	=========== SIX WHEELERS SUBMETHODS END ========================
	
	public void twoWheelers() {
		String type1 = "Cycle";
		String type2 = "Bike";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("For " + type1 +  " Please Select: 1");
		System.out.println("For " + type2 + " Please Select: 2");
		
		System.out.print(option);
		int n = sc.nextInt();
		System.out.println(" ");
		
		if(n > 0 && n <= 2) {
			
		switch(n) {
				case 1:
					System.out.println("You Selected " + type1 + " Option");
					wheelModel = type1;
					selectCycle();
					break;
					
				case 2:
					System.out.println("You Selected " + type2 + " Option");
					wheelModel = type2;
					selectBike();
					break;
			}
		} else {
			System.out.println("Please select valid option");
			System.out.println(" ");
			twoWheelers();
		}
		
		sc.close();
	}
	
	public void threeWheelers() {
		String type1 = "Auto";
		String type2 = "Tum Tum";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("For " + type1 +  " Please Select: 1");
		System.out.println("For " + type2 + " Please Select: 2");
		
		System.out.print(option);
		int n = sc.nextInt();
		System.out.println(" ");
		
		if(n > 0 && n <= 2) {
			
		switch(n) {
				case 1:
					System.out.println("You Selected " + type1 + " Option");
					wheelModel = type1;
					selectAuto();
					break;
					
				case 2:
					System.out.println("You Selected " + type2 + " Option");
					wheelModel = type2;
					selectTumTum();
					break;
			}
		} else {
			System.out.println("Please select valid option");
			System.out.println(" ");
			threeWheelers();
		}
		
		sc.close();
	}
	
	public void fourWheelers() {
		String type1 = "Petrol";
		String type2 = "Diesel";
		String type3 = "EV";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("For " + type1 +  " Please Select: 1");
		System.out.println("For " + type2 + " Please Select: 2");
		System.out.println("For " + type3 + " Please Select: 3");
		
		System.out.print(option);
		int n = sc.nextInt();
		System.out.println(" ");
		
		if(n > 0 && n <= 3) {
			
		switch(n) {
				case 1:
					System.out.println("You Selected " + type1 + " Option");
					fuelType = type1;
					selectPetrolCar();
					break;
					
				case 2:
					System.out.println("You Selected " + type2 + " Option");
					fuelType = type2;
					selectDieselCar();
					break;
					
				case 3:
					System.out.println("You Selected " + type3 + " Option");
					fuelType = type2;
					selectEvCar();
					break;
			}
		} else {
			System.out.println("Please select valid option");
			System.out.println(" ");
			threeWheelers();
		}
		
		sc.close();
	}
	
	public void sixWheelers() {
		String type1 = "Diesel";
		String type2 = "Electric";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("For " + type1 +  " Please Select: 1");
		System.out.println("For " + type2 + " Please Select: 2");
		
		System.out.print(option);
		int n = sc.nextInt();
		System.out.println(" ");
		
		if(n > 0 && n <= 2) {
			
		switch(n) {
				case 1:
					System.out.println("You Selected " + type1 + " Option");
					fuelType = type1;
					selectDieselBus();
					break;
					
				case 2:
					System.out.println("You Selected " + type2 + " Option");
					fuelType = type2;
					selectEvBus();
					break;
			}
		} else {
			System.out.println("Please select valid option");
			System.out.println(" ");
			threeWheelers();
		}
		
		sc.close();
	}
	
	public void chooseModal() {
		switch(wheelType) {
			case "Two Wheeler":
				wheelType = "Two Wheeler";
				twoWheelers();
				break;
				
			case "Three Wheeler":
				wheelType = "Three Wheeler";
				threeWheelers();
				break;
				
			case "Four Wheeler":
				wheelType = "Four Wheeler";
				fourWheelers();
				break;
				
			case "Six Wheeler":
				wheelType = "Six Wheeler";
				sixWheelers();
				break;
				
			default: 
				System.out.println("Somthing went wrong");
				
		}
		
	}
}


public class Vehical {
	
	public static void main(String[] args) 
	{

		WheelModal col1 = new WheelModal();
		
		col1.chooseWheelType();
		col1.chooseModal();     
		
		System.out.println(" ");
		System.out.println("Thank You for comming");
		System.out.println(" ");
		System.out.println("======== Your vehicle details ======");
		
		System.out.println("Customer Name  : " + col1.getName());
		System.out.println("Brand          : " + col1.brand);
		System.out.println("Model          : " + col1.wheelModel);
		System.out.println("Vehicle        : " + col1.wheelType);
		System.out.println("Engine         : " + col1.vehicalEngine);
		System.out.println("Fuel Type      : " + col1.fuelType);
		System.out.println("Price          : " + col1.price);
		System.out.println("Average        : " + col1.average);
		System.out.println("Feature        : " + col1.specialFeature);
	}

}
