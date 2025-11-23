package singBelajar;
import java.util.Scanner;
public class tugasAlpropekan13_2511533015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b;
		int j = 0;
		int i;
		Scanner batas = new Scanner (System.in);
		System.out.print("Inputkan nilai batas");
		b = batas.nextInt ();
		batas.close ();
		for (i=0; i<=b; i+1) {
			if (i % 2!=0) {
				j=j+1;
			}
		}
	}
}