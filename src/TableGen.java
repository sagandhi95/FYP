import java.util.Random;

public class TableGen {
	public static void main(String[] args) {
		Random r = new Random();
		int Low = 1;
		int High = 128;
		for(int i=0;i<16;i++){
			for(int j=0;j<16;j++){
				int Result = r.nextInt(High-Low) + Low;
				System.out.print(Result+"\t");
			}
			System.out.println();
		}
	}
}
