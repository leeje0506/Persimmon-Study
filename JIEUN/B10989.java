import java.io.*;

/*
입력 : N, N개의 수
출력 : N줄로 출력
조건 : 오름차순, N(1<=N<=10,000,000), N개의 숫자들 : 이 수는 10,000보다 작거나 같은 자연수
풀이 예상 :
어쩐지 퀵 정렬로 하면 시간 초과가 날 것만 같다. (최악일 때 N^2이기 때문에..)
찾아보니 데이터의 범위가 제한된 경우 "카운팅 정렬(계수 정렬):항상 O(N+K)의 시간 복잡도"이 최적의 방법일 수 있단다.
카운팅 정렬을 사용해서 풀어보면 될 것 같다.
 */
public class B10989 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int [] cnt = new int [10001];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            cnt[num]++;
        }

        for (int i = 0; i < cnt.length; i++) {
            while(cnt[i] > 0){
                sb.append(i).append("\n");
                //순회하면서 카운트 줄여주기
                cnt[i]--;
            }
        }

        System.out.print(sb);
    }

}
