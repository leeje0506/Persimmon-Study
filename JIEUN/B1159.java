import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;

public class B1159 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 선수 수 N을 입력받음
        int N = Integer.parseInt(br.readLine());

        // 각 성의 첫 글자를 키로, 등장 횟수를 값으로 하는 해시맵 생성
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String surname = br.readLine(); // 선수의 성 입력 받음
            char initial = surname.charAt(0); // 성의 첫 글자

            // 성의 첫 글자를 키로 가지는 값이 있으면 그 값을 1 증가, 없으면 1로 초기화
            map.put(initial, map.getOrDefault(initial, 0) + 1);
        }

        // 사전순으로 정렬하기 위해 StringBuilder 사용
        StringBuilder sb = new StringBuilder();
        // 사전순으로 출력해야 하므로 알파벳 순회
        for (char c = 'a'; c <= 'z'; c++) {
            // 해당 글자로 시작하는 성이 5번 이상 나온 경우
            if (map.containsKey(c) && map.get(c) >= 5) {
                sb.append(c); // 결과 문자열에 추가
            }
        }

        // 결과 문자열이 비어있다면 "PREDAJA" 출력, 아니면 결과 문자열 출력
        System.out.println(sb.length() > 0 ? sb.toString() : "PREDAJA");
    }
}
