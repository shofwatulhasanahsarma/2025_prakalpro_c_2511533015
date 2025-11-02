package tugaspekan5_2511533015;

public class tugaspratikumAlgo_pekan5_2511533015 {
    public static void main(String[] args) {
        int[] titik = {0, 4, 8, 12, 12, 8, 4, 0};
        int innerWidth = 16; 
        System.out.print("#");
        for (int i = 0; i < 16; i++)
        	System.out.print("=");
        System.out.println("#");
        
        for (int i = 0; i < 8; i++) {
            int t = titik[i];
            StringBuilder content = new StringBuilder();
            content.append("<>");
            if (t == 0) {
                content.append(" ");
            } else {
                for (int j = 0; j < t; j++)
                	content.append(".");
            }
            content.append("<>");
            
            int contentLen = content.length();
            int remaining = innerWidth - contentLen;
            int left = remaining / 2;
            int right = remaining - left;
            
            System.out.print("|");
            for (int s = 0; s < left; s++) System.out.print(" ");
            System.out.print(content);
            for (int s = 0; s < right; s++) System.out.print(" ");
            System.out.println("|");
        }
        System.out.print("#");
        for (int i = 0; i < 16; i++) System.out.print("=");
        System.out.println("#");
    }
}
