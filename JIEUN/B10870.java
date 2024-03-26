import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //피보나치 수 0부터 시작.
        int n = Integer.parseInt(br.readLine());

        System.out.println(Fibonacci(n));
    }

   public static int Fibonacci(int N) {
        if(N == 0) return 0;
        if(N == 1) return 1;

        return Fibonacci(N - 1) + Fibonacci(N - 2);
    }
}
