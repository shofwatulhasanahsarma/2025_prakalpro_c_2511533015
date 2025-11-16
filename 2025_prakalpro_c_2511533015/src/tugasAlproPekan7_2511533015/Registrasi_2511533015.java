package tugasAlproPekan7_2511533015;
import java.util.Scanner;
public class Registrasi_2511533015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Siapkan Scanner untuk membaca input dari pengguna
		Scanner scanner = new Scanner (System.in);
		System.out.println("==== REGISTRASI AKUN BARU ====");
		
		//2. Ambil semua input dari pengguna
		System.out.print("Masukkan Username: ");
		String username = scanner.nextLine();
		
		System.out.print("Masukkan Password: ");
		String password = scanner.nextLine();
		// Variabel ini tidak digunakan di output,tapi tetap perlu dituliskan
		
		System.out.print("Masukkan Email: ");
		String email = scanner.nextLine();
		
		System.out.print("Masukkan PIN (6 digit): ");
		String pin = scanner.nextLine();
		
		//3. Lakukan Validasi Email
		// Cek apakah email mengandung "@" DAN "."
		if (email.contains("@") && email.contains(".")) {
			
			// SKENARIO SUKSES (GAMBAR 1)
			
			System.out.println("\n--- REGISTRASI BERHASIL ---");
			// Tanda \" digunakan untuk mencetak karakter kutip "
			System.out.println("Akun untuk \"" + username + "\" telah berhasil dibuat.");
			
			// Menampilkan Detail Akun
			System.out.println("\n--- Detail Akun ---");
			System.out.println("Username (Lowercase): " + username.toLowerCase());
			System.out.println("Email (Uppercase) : " + email.toUpperCase());
			//Menggabungkan string username dan pin
			System.out.println("ID Pengguna (Gabungan): " + username + pin);
			
			// Menampilkan Uji Tipe Data
			System.out.println("\n--- Uji Tipe Data (PIN Anda: " + pin + ") ---");
			
			// Uji Tipe Data Integer (Angka)
			try {
				// Ubah string PIN menjadi angka (integer)
				int pinAngka = Integer.parseInt(pin);
				int hasilTambahAngka = pinAngka + 10;
				System.out.println("PIN (int) + 10 = " + hasilTambahAngka);
			} catch (NumberFormatException e) {
				// Tangani jika PIN yang dimasukkan bukan angka (misal: "abc")
				System.out.println("PIN (int) + 10 = GAGAL (PIN harus berupa angka)");
			}
			
			// Uji Tipe Data String (Teks)
			// Tanda + pada String berarti "menggabungkan"
			String hasilTambahString = pin + "10";
			System.out.println("PIN (String) + \"10\" = " + hasilTambahString);
			
		} else {
			
			// --- SKENARIO GAGAL (GAMBAR 2) ---
			
			System.out.println("\n--- REGISTRASI GAGAL ---");
			System.out.println("Email Anda \"" + email + "\" tidak valid (harus mengandung '@' dan '.').");
			System.out.println("Silakan coba lagi.");
		}
		
		// 4. Tutu[ scanner setelah selesai digunakan
		scanner.close();

	}

}
