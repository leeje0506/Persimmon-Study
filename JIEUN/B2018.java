import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
투 포인터를 정복해보자

입력 : 정수 N
출력 : 입력된 자연수 N을 몇 개의 연속된 자연수의 합으로 나타내는 지의 가짓 수
조건 : 사용하는 자연수는 N이하여야 한다
예시 :
15를 나타내는 방법 15,7+8,4+5+6,1+2+3+4+5 (총 4가지)
10을 나타내는 방법 10,1+2+3+4 (총 2가지)

풀이 :
포인터가 되는 인덱스를 기반, 왼쪽 startidx, 오른쪽 endidx라고 한다
입력값에 도달했을 때의 가짓 수를 구한다
1.while문을 통해 endidx == input일 때 반복 수행
2. sum == input => 조건에 만족(sum+endidx), 가짓수++, endidx++
3. sum > input => sum-startidx, startidx++
4. sum < input => endidx++, sum+endidx

 */
public class B2018 {
    public static int N, answer, input, startidx, endidx, sum, count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        input = N;
        startidx = 1;
        endidx = 1;
        sum = 1;
        count = 1;

        //1~15까지 수행
        while (endidx != input){
            if(sum == input){
                count++;
                endidx++;
                sum+=endidx;
            }
            else if (sum > input){
                sum-=startidx;
                startidx++;
            }
            else {
                endidx++;
                sum+=endidx;
            }
        }
        answer = count;
        System.out.println(answer);
    }
}
