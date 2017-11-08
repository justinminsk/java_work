
public class TemperatureConverter {
	private double Celsius;
	private double Fahrenheit;
	private double Kelvin;

	public TemperatureConverter(double newCelsius) {
		Celsius = newCelsius;
		Fahrenheit = (Celsius * 9 / 5) + 32;
		Kelvin = Celsius + 273.15;
	}

	public void setCelsius(double newCelsius) {
		Celsius = newCelsius;
		Kelvin = Celsius + 273.15;
		Fahrenheit = (Celsius * 9 / 5) + 32;
	}

	public void setFahrenheit(double newFahrenheit) {
		Fahrenheit = newFahrenheit;
		Celsius = (Fahrenheit - 32) * 5 / 9;
		Kelvin = (Fahrenheit - 32) * 5 / 9 + 273.15;
	}

	public void setKelvin(double newKelvin) {
		Kelvin = newKelvin;
		Fahrenheit = (Kelvin - 273.15) * 9 / 5 + 32;
		Celsius = Kelvin - 273.15;
	}

	public double getCelsius() {
		return Celsius;
	}

	public double getFahrenheit() {
		return Fahrenheit;
	}

	public double getKelvin() {
		return Kelvin;
	}

	public String toString() {
		return "Today's temperature is " + Celsius + " Celsius" + " or " + Fahrenheit + " Fahrenheit " + " or " + Kelvin
				+ " Kelvin.";
	}
}
