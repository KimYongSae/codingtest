package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.PriorityQueue;

public class 카드_정렬하기 {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		int cnt = Integer.parseInt(br.readLine());

		for(int i = 0; i < cnt; i ++) {
			pq.add(Integer.parseInt(br.readLine()));
		}

		int tmp = 0;
		int answer = 0;


//		우선순위큐로 작은거 꺼내서 계속 더해가면 답이 나올거라 생각
//

//		if(pq.size() <= 1 ) {
//			System.out.println(pq.poll());
//		} else {
//			while(!pq.isEmpty()) {
//				tmp += pq.poll();
//
//				answer += tmp;
//			}
//		}
//		System.out.println(answer);

//		해놓고 보니 성립 안하긴 하는데 처음 poll한 값을 빼면 정답이라 왠지 방향성은 맞는것처럼 느껴짐
//		테스트케이스를 더 찾아봄

//		https://www.acmicpc.net/board/view/72799
//		4
//		30
//		40		70
//		50		120
//		100		220
//		답: 410

//		테스트케이스 옆에 더한 숫자를 적어놓으니
//		처음 두값만 따로 더해주고 더한값과 다음값을 더하는방식으로 풀면 될거라 보여짐
//		더한 값을 deque에 넣고 하나씩 pop하는 방식으로 구현해보자

//		Deque<Integer> dq = new ArrayDeque<>();
//
//		if(pq.size() <= 1 ) {
//			System.out.println(pq.poll());
//		} else {
//			tmp = pq.poll()+pq.poll();
//			dq.add(tmp);
//
//			while(!pq.isEmpty()) {
//			dq.addLast(dq.peekLast() + pq.poll());
//			}
//			while(!dq.isEmpty()) {
//				answer += dq.pop();
//			}
//		}
//		System.out.println(answer);

//		잘작동한다. 제출 ㄱ

//		개같이멸망

//		테스트케이스를 더 확인해


//		4
//		30
//		40		70
//		50		120
//		60		180
//		답: 360

//		바로 다음번 테스트케이스에 반례가 나옴

//		지금까지 위에서부터 차례대로 더하면 되는줄는데
//		더한 값을 다시 전체 배열과 비교해서 작은 값만 두개 뽑아야하는것이었음

//		deque같은걸 쓸게 아니라 priorityqueue에 그냥 다시 넣고 두개 다시 뽑아야하는거였던거

//		while(!pq.isEmpty()) {  //  이러면 poll 두번할때 에러날
		while(pq.size() >= 2)  {

			int polltmp1 = pq.poll();
			int polltmp2 = pq.poll();

			answer += polltmp1 + polltmp2;

			pq.add(polltmp1 + polltmp2);


		}

		System.out.println(answer);



	}

}
