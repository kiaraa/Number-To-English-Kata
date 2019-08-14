
public class TempConverter {
	public int convert(int temp, String unit) {
		if (unit.equalsIgnoreCase("F")) {
			return (int) (temp * (9.0/5.0) + 32);
		}
		else {
			return (int)((temp - 32) * 5.0/9.0);
		}
	}
}
