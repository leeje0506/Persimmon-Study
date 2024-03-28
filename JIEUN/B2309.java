import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class B2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] height = new int[9];
        int total = 0;

        for (int i = 0; i < 9; i++) {
            height[i] = Integer.parseInt(br.readLine());
            total += height[i];
        }

        Arrays.sort(height);

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                //전체에서 두 난쟁이의 키를 뺐을 때, 100이 되는 조합을 찾는 로직
                if (total - height[i] - height[j] == 100) {
                    for (int k = 0; k < 9; k++) {
                        //진짜가 아닌 두 난쟁이를 제외하고 출력
                        if (k == i || k == j) continue;
                        System.out.println(height[k]);
                    }
                    return;
                }
            }
        }
    }
}
