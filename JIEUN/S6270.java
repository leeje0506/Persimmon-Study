import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class S6270 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 제한 구간의 수
        int M = Integer.parseInt(st.nextToken()); // 테스트 구간의 수
        int[] limitLengths = new int[N]; // 제한 구간의 길이
        int[] limitSpeeds = new int[N]; // 제한 속도
        int[] testLengths = new int[M]; // 테스트 구간의 길이
        int[] testSpeeds = new int[M]; // 테스트 속도

        // 제한 구간
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            limitLengths[i] = Integer.parseInt(st.nextToken());
            limitSpeeds[i] = Integer.parseInt(st.nextToken());
        }

        // 테스트 구간
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            testLengths[i] = Integer.parseInt(st.nextToken());
            testSpeeds[i] = Integer.parseInt(st.nextToken());
        }

        int maxOverSpeed = 0; // 최대 초과 속도
        int limitIndex = 0; // 현재 확인중인 제한 구간 인덱스
        int limitRemain = limitLengths[0]; // 현재 제한 구간의 남은 길이

        // 테스트 구간  확인
        for (int i = 0; i < M; i++) {
            int testRemain = testLengths[i]; // 테스트 구간의 남은 길이

            while (testRemain > 0) {
                if (testRemain >= limitRemain) {
                    // 테스트 구간이 제한 구간보다 길거나 같을 경우
                    int overSpeed = testSpeeds[i] - limitSpeeds[limitIndex];
                    maxOverSpeed = Math.max(maxOverSpeed, overSpeed);

                    // 제한 구간만큼 테스트 구간 줄이기
                    testRemain -= limitRemain;
                    // 다음 제한 구간으로
                    limitIndex++;
                    if (limitIndex < N) {
                        limitRemain = limitLengths[limitIndex];
                    }
                } else {
                    // 테스트 구간이 제한 구간보다 짧을 경우
                    int overSpeed = testSpeeds[i] - limitSpeeds[limitIndex];
                    maxOverSpeed = Math.max(maxOverSpeed, overSpeed);

                    // 남은 제한 구간 길이 업데이트
                    limitRemain -= testRemain;
                    // 테스트 구간 종료
                    testRemain = 0;
                }
            }
        }

        System.out.println(Math.max(maxOverSpeed, 0)); // 제한 속도를 초과하지 않았다면 0 출력
    }
}


