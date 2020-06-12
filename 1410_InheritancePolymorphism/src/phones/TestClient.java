package phones;

public class TestClient {

	public static void main(String[] args) {
		RotaryPhone rotary = new RotaryPhone("Model 500", new Dimension(143, 208, 119), Voltage.V110);
		PushButtonPhone pushButton = new PushButtonPhone("Cortelco 2500", new Dimension(178, 228, 127), Voltage.DUAL);
		SmartPhone smart1 = new SmartPhone("Pixel3", new Dimension(145.6, 68.2, 7.9), 128);
		SmartPhone smart2 = new SmartPhone("iPhone8", new Dimension(138.4, 67.3, 7.3), 64);
		
		System.out.println("Various Phones:");
		System.out.println(rotary.toString());
		System.out.println(pushButton.toString());
		System.out.println(smart1.toString());
		System.out.println(smart2.toString());
		System.out.println();
		
		rotary.plugIn();
		pushButton.plugIn();
		
		Phone[] deskPhones = {rotary, pushButton};
		
		((DeskPhone)deskPhones[(int)(Math.random()*deskPhones.length)]).unplug();
		
		Phone[] phones = {rotary, pushButton, smart1, smart2};
		
		System.out.println("Array Elements:");
		for(Phone phone : phones) {
			System.out.println(phone.toString());
			System.out.println(phone.call(8019574111L));
			if(phone instanceof SmartPhone) {
				System.out.println(((SmartPhone) phone).browse());
				System.out.println(((SmartPhone) phone).takePicture());
			}
			System.out.println();
		}

	}

}
