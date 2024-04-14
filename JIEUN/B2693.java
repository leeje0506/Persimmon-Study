import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class B2693 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            String [] nums = br.readLine().split(" ");
            Integer [] num = new Integer[nums.length];

            for (int j = 0; j < nums.length; j++) {
                num[j] = Integer.parseInt(nums[j]);
            }

            //내림차순 정렬
            Arrays.sort(num, Collections.reverseOrder());

            System.out.println(num[2]); // 3번째로 큰 수 출력
        }

    }
}
