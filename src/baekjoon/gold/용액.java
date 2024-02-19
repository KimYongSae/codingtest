package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 용액 {



    // 입력받은 숫자들중 두개를 선택한다.
    // 선택한 숫자의 합이 0과 가장 가까운 수인 경우를 구하는 문제.
    // tc   -99 -2 -1 4 98
    // 숫자는 음수도 같이 나오며, 거리가 같은경우( -1과 1같이) 아무거나 출력한다.
    // tc의 경우 -99와 98을 더했을때 나오는 숫자인 -1이 0과 가장 가까우므로 -99 98이 정답이다.




    // 기본적으로 강사님이 강의해주신 알고리즘과 코드를 그대로 사용한다.
    // 다만 정답이 되는 조건이 두 수의 합이 0과 가장 가까운 수를 구하는 것이니
    // 첫번째 수는 for문으로 순회하고 두번째 수는 이진탐색으로 찾는 방식을 취한다.


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int arr[] = new int[num];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        } // for

        int tmp = Integer.MAX_VALUE;        // 임시로 값을 지정

        int ans1 = 0;   // 1번숫자
        int ans2 = 0;   // 2번숫자

        for (int i = 0; i < num; i++) {
            int left = i+1;         // 이진탐색을 하기위한 숫자범위중 가장 왼쪽
            int right = num-1;      // 이진탐색을 하기위한 숫자범위중 가장 오른쪽

            while(left <= right){   // 정렬이 되어 있을태니 왼쪽숫자가 오른쪽숫자보다 커지면 다 찾은것
                int mid = (left + right) / 2;
                int sum = arr[i] + arr[mid];    // 두 수의 합

                if( Math.abs(sum) < tmp){       // 그 합의 절대값과 임시값을 비교해서 작다면 저장
                    ans1 = arr[i];              // 절대값이 작다는건 0과 가깝다는 뜻
                    ans2 = arr[mid];
                    tmp = Math.abs(sum);
                }
                if( sum < 0 ){              // 두 수의 합이 0보다 작으면
                    left = mid + 1;         // 0과 가까워지기 위해선 수가 커져야 하니까 왼쪽숫자의 인덱스를 크게해준다.
                } else{                     // 두 수의 합이 0보다 크면
                    right = mid - 1;        // 0과 가까워지기 위해선 수가 작아져야 하니 오른쪽 숫자의 인덱스를 작게한다.
                } // if-else
            } // while
        } // for
        System.out.println(ans1 + " " + ans2);
    } // main
} // end class
