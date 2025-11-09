package tugaspekan6_2511533015;

import java.util.Random;
import java.util.Scanner;

public class tugaspratikumAlgo_pekan6_2511533015 {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        Random rand = new Random();

	        int tebakan = 7; // Tetap seperti contoh kasus
	        int percobaan = 0;
	        boolean menang = false;

	        do {
	            percobaan++;

	            int dadu1 = rand.nextInt(6) + 1;
	            int dadu2 = rand.nextInt(6) + 1;
	            int jumlah = dadu1 + dadu2;

	            System.out.println(dadu1 + " + " + dadu2 + " = " + jumlah);

	            if (jumlah == tebakan) {
	                System.out.println("Tebakan Anda Benar");
	                menang = true;
	            } else {
	                System.out.println("Tebakan Anda Salah");
	                System.out.print("Apakah mau lempar dadu (ya / tidak?) ");
	                String jawab = input.next();
	                if (!jawab.equalsIgnoreCase("ya")) {
	                    break;
	                }
	            }

	        } while (!menang);

	        if (menang) {
	            System.out.println("Anda menang setelah " + percobaan + " percobaan!");
	        } else {
	            System.out.println("Permainan berakhir. Coba lagi nanti!");
	        }

	        input.close();
	    }
	}
