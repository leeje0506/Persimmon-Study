import javax.crypto.Cipher;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B15649 {

    static int n, m;
    static int [] arr;
    static boolean [] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int [m];
        visit = new boolean[n+1];

        dfs(0);

    }

    public static void dfs (int depth){

        if(depth == m){
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        //백트래킹
        for (int i = 0; i <= n; i++) {
            // i번째 수가 아직 수열에 포함되지 않았다면
            if(!visit[i]){
                visit[i] = true;
                arr[depth] =  i; // 현재 깊이를 인덱스로 하여 i값을 수열에 추가
                dfs(depth + 1);
                visit[i] = false; // 다른 수열을 위해 i번째 수의 방문 표시를 해제
            }

        }
    }
}
