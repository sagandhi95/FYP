import java.util.Random;

public class KeyGen {
	public static String generateKey() {
		Random r = new Random();
		int Low = 0;
		int High = 2;
		StringBuilder key = new StringBuilder("");
		for(int i=0;i<1028;i++){
			int Result = r.nextInt(High-Low) + Low;
			key.append(Result);
		}
		return key.toString();
	}
}
