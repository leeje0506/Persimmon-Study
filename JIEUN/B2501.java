import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B2501 {
    static int n, k;
    static ArrayList<Integer> nums;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        nums = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                nums.add(i);
            }
        }

        Collections.sort(nums);
//        System.out.println(nums);

        if(nums.size() < k){
            System.out.println(0);
        }else{
            System.out.println(nums.get(k-1));
        }


    }
}
