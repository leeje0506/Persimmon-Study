
/*
입력 : A(낮에올라감), B(밤에떨어짐), V(정상높이)
출력 : 나무 막대를 모두 올라가는데 걸리는 일 수.
조건 :
낮 A 미터 올라가는데 밤에 자는 동안 B미터 미끌어짐
=> 하루에 A-B 만큼 이동한다.
정상(V)에 올라간 다음은 미끌어지지 않음.
풀이 예상 :
V에 도달하면 멈추는 while문을 생성한다.
 */

/*
while문을 사용한 방법은 시간이 오래 걸린다.
whlie문 대신 길이 / (올라간 칸 - 내려간 칸)으로 하면 어떨까?
그리고 정상에 도착하면 미끄러지지 않으니까 밤이어도 미끄러지지 않음.
그러니까 최종 도달 목표를 V-B로 잡으면 되겠다.
=> 딱 떨어진다면 낭비되는 +1일을 방지할 수 있다.
=> 딱 떨어지지 않으면 +1일 해줘야 함.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        Long A = Long.parseLong(st.nextToken());
        Long B = Long.parseLong(st.nextToken());
        Long V = Long.parseLong(st.nextToken());
        Long answer =0L;
        Long cnt = 0L;

        long dayDist = A - B; //하루에 움직이는 거리(미터)
        long goalDest = V - B; //최종 목적지(미터)

        // 최종목적지 / 하루에 움직이는 거리
        if(goalDest%dayDist != 0){ //나눠 떨어지지 않는 경우는 하루를 더 추가로 가야한다는 것
            System.out.println(goalDest/dayDist + 1);
        }else{ // 나눠떨어진다는 것은 바로 낮에 도착했다는 뜻
            System.out.println(goalDest/dayDist);
        }

    }


}
