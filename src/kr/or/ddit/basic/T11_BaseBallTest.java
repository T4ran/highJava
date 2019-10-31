package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class T11_BaseBallTest {
/*
	문제) Set을 이용하여 숫자 야구 게임 프로그램을 작성하시오.
		컴퓨터의 숫자는 난수를 이용하여 구한다.
		(스트라이크는 S, 볼은 B로 출력한다.)
		
		(컴퓨터의 난수가 9 5 7 일 때 실행 예시)
		숫자 입력 => 3 5 6
		3 5 6 => 1S 0B
		
		숫자 입력 => 9 5 7
		9 5 7 => 3S 0B
		
		n번째 만에 맞췄군요.
		
*/
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cnt=0, strike=0, ball=0;
		String str="";
		String arr[] = {};
		
		Set<Integer> number = new HashSet<Integer>();
		
		while(number.size()<3)
		{
			number.add((int)(Math.random()*9 + 1));
		}
		
		List<Integer> listNumber = new ArrayList<Integer>(number);
		Collections.shuffle(listNumber);	//shuffle
		System.out.println(listNumber);		//출력확인
		
		System.out.println("숫자 야구 게임을 시작합니다.");
		do
		{
			cnt++;
			strike=0;
			ball=0;
			System.out.println("숫자 3개를 입력해주세요.(',' 로 구분한다.)");
			str = s.nextLine();
			arr = str.split(",");
			System.out.println("숫자입력 => "+arr[0]+" "+arr[1]+" "+arr[2]);
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(Integer.parseInt(arr[i])==listNumber.get(j))
					{
						if(i==j)
						{
							strike++;
						}
						else
						{
							ball++;
						}
					}
				}
			}
			
			System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" => "+ strike+"S "+ball+"B");
		}while(strike!=3);
		
		System.out.println(cnt + "번째 만에 맞췄군요.");
		
		s.close();
	}
}
