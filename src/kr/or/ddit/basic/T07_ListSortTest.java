package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
	Comparable and Comparator 예제
*/

public class T07_ListSortTest {
	public static void main(String[] args) {
		List<Member> memList = new ArrayList<>();
		
		memList.add(new Member(1, "ABC", "000-0000-0000"));
		memList.add(new Member(2, "DEF", "111-1111-1111"));
		memList.add(new Member(3, "QWE", "222-2222-2222"));
		memList.add(new Member(4, "ASD", "333-3333-3333"));
		memList.add(new Member(5, "ZXC", "444-4444-4444"));
		memList.add(new Member(6, "JKL", "555-5555-5555"));
		
		System.out.println("정렬 전 : ");
		for(Member mem : memList)
		{
			System.out.println(mem);
		}
		
		System.out.println("=====");
		
		Collections.sort(memList);	//정렬하기
		
		System.out.println("이름의 오름차순으로 정렬 후 : ");
		for(Member mem : memList)
		{
			System.out.println(mem);
		}
		System.out.println("=====");
		
		Collections.sort(memList, new SortNumDesc());
		System.out.println("번호의 내림차순으로 정렬 후 : ");
		for(Member mem : memList)
		{
			System.out.println(mem);
		}
				
	}
}


/*
	회원의 정보를 저장할 클래스
	회원정보는 회원번호, 회원이름, 전화번호가 있다.
	회원이름을 기준으로 오름차순 정렬이 될 수 있는 클래스를 만들어보자.
*/

class Member implements Comparable<Member>
{
	private int num;		//번호
	private String name;	//이름
	private String tel;		//전화번호


	public Member(int num, String name, String tel) {
		super();
		this.num = num;
		this.name = name;
		this.tel = tel;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Member[num = " + num 
				+ ", name = " + name
				+ ", tel = " + tel;
	}
	
	/*
		이름을 기준으로 오름차순 정렬이 되도록 설정한다.
	*/
	
	@Override
	public int compareTo(Member o) {
		return getName().compareTo(o.getName());
	}
}

class SortNumDesc implements Comparator<Member>
{
	@Override
	public int compare(Member o1, Member o2)
	{
		/*if(o1.getNum() > o2.getNum())
		{
			return -1;
		}
		else if(o1.getNum()==o2.getNum())
		{
			return 0;
		}
		else
			return 1;*/
		
		//Wrapper클래스에서 제공하는 메서드를 이용하는 방법1
		//return Integer.compare(o1.getNum(), o2.getNum())*-1;
		
		//Wrapper클래스에서 제공하는 메서드를 이용하는 방법2
		return new Integer(o1.getNum()).compareTo(o2.getNum())*-1;
	}
}