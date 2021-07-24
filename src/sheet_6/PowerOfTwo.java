package sheet_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PowerOfTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(reader.readLine());
        String result = "YES";
        while ( n > 1 ) {
            if (n%2 == 1) {
                result = "NO";
                break;
            }
            n /= 2;
        }

        System.out.println(result);
    }
}
