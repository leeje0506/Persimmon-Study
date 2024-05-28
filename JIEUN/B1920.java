import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


/*
입력 : N개의 정수
출력 : M개의 줄에 답 출력. 존재 :1, 존재X : 0
조건 : A의 존재 여부
풀이 예상 :
M만큼 for문을 돌면서 num(=A)을 N만큼 for문을 돌려 arr[i]와 비교한다.
 */

//public class B1920 {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        StringBuilder sb = new StringBuilder();
//
//        int N = Integer.parseInt(br.readLine());
//        int [] arr = new int[N];
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < N; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//
//        int M = Integer.parseInt(br.readLine());
//
//        st = new StringTokenizer(br.readLine());
//
//        int cnt =0;
//        for (int i = 0; i < M; i++) {
//            int num = Integer.parseInt(st.nextToken());
//            for (int j = 0; j < N; j++) {
//                if(num == arr[j]){
//                    cnt++;
//                }
//            }
//            if(cnt>=1){
//                sb.append("1" + "\n");
//            }else{
//                sb.append("0" + "\n");
//            }
//            cnt =0;
//        }
//
//        System.out.println(sb);
//    }
//
//}

/*
N * M이라 그런지 시간초과에 딱 걸렸다.
입력을 다시 보니 최대 100,000 * 100,000이라 넘을 수 밖에 없었다.
버퍼드리더, 스트링빌더를 이미 사용 중이기 때문에 로직을 바꿔야 한다고 생각했다.
탐색 방법 중 이진탐색을 이용하기로 했다.
 */

public class B1920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //이진탐색을 위한 정렬
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(binarySearch(arr, num)){
                sb.append("1" +"\n");
            }else{
                sb.append("0" +"\n");
            }
        }
        System.out.println(sb);
    }

    public static boolean binarySearch (int [] arr, int A){
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) /2 ;
            if(arr[mid] == A){
                return true;
            }
            if(arr[mid] < A){
                low = mid+1;
            }else{
                high = mid-1;
            }

        }
        return false;
    }

}