import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2609 {
    static int answer1, answer2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int one = Integer.parseInt(st.nextToken());
        int two = Integer.parseInt(st.nextToken());
        int min_num = Math.min(one, two);
        int max_num = Math.max(one, two);

        //유클리드 호제법을 사용해서 풀어보자.

        //최대공약수
        while(min_num !=0) {
            int tmp = max_num % min_num;
            max_num = min_num;
            min_num = tmp;
        }
        answer1 = max_num;
        System.out.println(answer1);

        //최소공배수
        answer2 = one * two / max_num;
        System.out.println(answer2);

    }
}
