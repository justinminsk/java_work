
public class Driver2 {
	public static void main(String[] args) {
		TemperatureConverter temp1 = new TemperatureConverter(20);
		System.out.println(temp1.toString());
		temp1.setKelvin(273.15);
		System.out.println(temp1.toString());
	}
}
