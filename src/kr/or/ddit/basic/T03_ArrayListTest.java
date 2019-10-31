package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Scanner;

/*
	문제 ) 5명의 사람 이름을 입력하여 ArrayList에 저장하고 이중에 '김'씨 성의 이름을 출력하시오.
	(단, 입력은 Scanner를 이용하여 입력받으시오.)
*/
public class T03_ArrayListTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		ArrayList<String> names = new ArrayList<String>(5);
		
		for(int i=0;i<5;i++)
		{
			System.out.println("이름을 입력하세요 > ");
			names.add(s.nextLine());
		}
		
		for(int i=0;i<5;i++)
		{
			//charAt, get(index)를 사용해볼것.
			if(names.get(i).charAt(0)=='김')
			{
				System.out.println(names.get(i));
			}
		}
		
		s.close();
	}
}
