package org.zerock.myapp.baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.PriorityQueue;

public class ī��_�����ϱ� {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		int cnt = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < cnt; i ++) {
			pq.add(Integer.parseInt(br.readLine()));
		}
		
		int tmp = 0;
		int answer = 0;
		
		
//		�켱����ť�� ������ ������ ��� ���ذ��� ���� ���ðŶ� ����
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
		
//		�س��� ���� ���� ���ϱ� �ϴµ� ó�� poll�� ���� ���� �����̶� ���� ���⼺�� �´°�ó�� ������ 
//		�׽�Ʈ���̽��� �� ã�ƺ�
		
//		https://www.acmicpc.net/board/view/72799
//		4									
//		30		
//		40		70
//		50		120
//		100		220
//		��: 410
		
//		�׽�Ʈ���̽� ���� ���� ���ڸ� ���������
//		ó�� �ΰ��� ���� �����ְ� ���Ѱ��� �������� ���ϴ¹������ Ǯ�� �ɰŶ� ������
//		���� ���� deque�� �ְ� �ϳ��� pop�ϴ� ������� �����غ��� 
		
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
		
//		���۵��Ѵ�. ���� �� 
		
//		�����̸��
		
//		�׽�Ʈ���̽��� �� Ȯ����
		
		
//		4
//		30		
//		40		70
//		50		120
//		60		180
//		��: 360
		
//		�ٷ� ������ �׽�Ʈ���̽��� �ݷʰ� ���� 
		
//		���ݱ��� ���������� ���ʴ�� ���ϸ� �Ǵ��ٴµ� 
//		���� ���� �ٽ� ��ü �迭�� ���ؼ� ���� ���� �ΰ� �̾ƾ��ϴ°��̾��� 
		
//		deque������ ���� �ƴ϶� priorityqueue�� �׳� �ٽ� �ְ� �ΰ� �ٽ� �̾ƾ��ϴ°ſ�����
		
//		while(!pq.isEmpty()) {  //  �̷��� poll �ι��Ҷ� ������
		while(pq.size() >= 2)  {
		
			int polltmp1 = pq.poll();
			int polltmp2 = pq.poll();
			
			answer += polltmp1 + polltmp2;
			
			pq.add(polltmp1 + polltmp2);
			
			
		}
		
		System.out.println(answer);
		
		
		
	}

}
