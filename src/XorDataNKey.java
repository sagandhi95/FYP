
public class XorDataNKey {
	private static boolean bitOf(char in) {
	    return (in == '1');
	}

	private static char charOf(boolean in) {
	    return (in) ? '1' : '0';
	}

	public static void main(String[] args) {
	    String lseq = "0011111111101111111111111100101101111100110000001011111000010100";
	    String tseq = "0011111111100000110011001100110011001100110011001100110011001100";

	    StringBuilder sb = new StringBuilder();

	    for (int i = 0; i < lseq.length(); i++) {
	        sb.append(charOf(bitOf(lseq.charAt(i)) ^ bitOf(tseq.charAt(i))));
	    }

	    String result = sb.toString();
	    System.out.println(result);
	}
}
