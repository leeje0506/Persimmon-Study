import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());

        for (int t = 0; t < tc; t++) {
            int n = Integer.parseInt(br.readLine());

            String nToBinary = Integer.toBinaryString(n); // 이진수로 변환

            for(int j = nToBinary.length() - 1; j >= 0; j--) { // 위치가 낮은것 부터 출력하기 위해 j--
                if(nToBinary.charAt(j) == '1') { // j 위치에서 1일 때
                    sb.append(nToBinary.length() - j - 1).append(" ");
                }
            }
            System.out.println(sb);
            sb.setLength(0);
        }

    }
}
