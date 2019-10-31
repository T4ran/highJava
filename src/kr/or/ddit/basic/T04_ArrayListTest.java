package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Scanner;

/*
	문제 1) 5명의 별명을 입력하여 ArrayList에 저장하고 별명의 길이가 제일 긴 별명을 출력하시오.
	(단, 각 별명의 길이는 모두 다르게 입력한다.)
	
	문제 2) 문제 1에서 별명의 길이가 같은 것을 여러개 입력했을 때도 출력되도록 처리하시오.
*/
public class T04_ArrayListTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//String tempString="";
		int tempNum=0;
		
		ArrayList<String> names = new ArrayList<String>(5);
		
		for(int i=0;i<5;i++)
		{
			System.out.println("별명을 입력하세요 > ");
			names.add(s.nextLine());
			/*
			if(tempString.length())
			{
				
			}
			*/
			if(tempNum<names.get(i).length())
			{
				tempNum = names.get(i).length();
			}
		}
		
		for(int i=0;i<5;i++)
		{
			if(names.get(i).length()==tempNum)
				System.out.println(names.get(i));
		}
		
		s.close();
	}
}
