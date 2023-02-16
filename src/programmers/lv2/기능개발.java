package programmers.lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class 기능개발 {


	public static void main(String[] args) {

		int[]a = {93,30,55};
		int[]b = {1,30,5};

		Queue<Integer> q = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();
		List<Integer> list = new ArrayList<>();
		int[] day = new int[100];


		int count = 1;

		for(int i = 0; i < a.length; i ++) {
			q.add(a[i]);
		}
		for(int i = 0; i < b.length; i ++) {
			q2.add(b[i]);
		}

		while(!q.isEmpty()) {
			if(q.peek() + (count * q2.peek()) >= 100) {
				q.poll();
				q2.poll();
				day[count]++;
			} else {
				count++;
			}
		}

		for(int i = 0; i < day.length; i++) {
			if(day[i] != 0) {
				list.add(day[i]);
			}
		}

		int[] answer = new int[list.size()];

		for(int i = 0; i < list.size(); i ++) {
			answer[i] = list.get(i);
		}

		System.out.println(Arrays.toString(answer));

	}

}
