import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class UAS1A {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> g = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input jumlah data yang akan diproses");
        int u = Integer.parseInt(reader.readLine());

        for (int index = 0; index < u; index++) {
            System.out.println("Masukkan Nama " + (index + 1) + ":");
            String name = reader.readLine();

            System.out.println("Huruf yang akan dihitung : ");
            char s = reader.readLine().charAt(0);

            int count = CountWords(name, s);
            g.add(count);
        }

        for (int count : g) {
            System.out.println(count + " ");
        }
    }

    private static int CountWords(String name, char s) {
        int count = 0;
        for (char c : name.toCharArray()) {
            if (c == s) {
                count++;
            }
        }
        return count;
    }
}