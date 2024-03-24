import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //1번역부터 10번 종착역까지.
        //내린다, 탄다.
        //출력 : 타고 있는 사람의 수가 가장 많을 때의 사람 수.

        int total_max =0;
        int total = 0;
        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int down = Integer.parseInt(st.nextToken());
            int up = Integer.parseInt(st.nextToken());

            total = total + up - down;
            total_max = Math.max(total_max,total);
        }

        System.out.println(total_max);
    }
}
