package programmers.lv2;

import java.util.Arrays;

public class Test {
	public static void main(String args[]) {

		String abc = "http://localhost:8080/*";

		String[] tmp = abc.split("/");
		System.out.println(tmp[tmp.length-1]);
	}
}
	