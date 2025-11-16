package tugasAlproPekan7_2511533015;

public class Akun_2511533015 {

    // --- Atribut (private untuk enkapsulasi) ---
    private String username;
    private String password;
    private String email;
    private int pinAngka;

    // --- Constructor ---
    public Akun_2511533015(String username, String password, String email, int pinAngka) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.pinAngka = pinAngka;
    }

    // --- Helper Methods ---

    /** Validasi password minimal 8 karakter */
    public boolean isPasswordValid() {
        return this.password != null && this.password.length() >= 8;
    }

    /** Validasi email harus mengandung '@' dan '.' */
    public boolean isEmailValid() {
        if (this.email == null) return false;
        return this.email.contains("@") && this.email.contains(".");
    }

    // --- Getter & Setter ---
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPinAngka() {
        return pinAngka;
    }

    public void setPinAngka(int pinAngka) {
        this.pinAngka = pinAngka;
    }

    // --- Main Method untuk Testing ---
    public static void main(String[] args) {
        Akun_2511533015 pengguna1 = new Akun_2511533015(
                "user123", "P@sswordKuat123", "contoh@email.com", 676767);

        Akun_2511533015 pengguna2 = new Akun_2511533015(
                "pendek", "short", "invalidemail", 123456);

        System.out.println("--- Hasil Validasi Pengguna 1 ---");
        System.out.println("Username: " + pengguna1.getUsername());
        System.out.println("Password valid? " + pengguna1.isPasswordValid());
        System.out.println("Email valid? " + pengguna1.isEmailValid());

        System.out.println("\n--- Hasil Validasi Pengguna 2 ---");
        System.out.println("Username: " + pengguna2.getUsername());
        System.out.println("Password valid? " + pengguna2.isPasswordValid());
        System.out.println("Email valid? " + pengguna2.isEmailValid());
    }
}
