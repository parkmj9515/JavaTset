package JavaTest;

import java.util.ArrayList;
import java.util.List;


public class UserApp {

	public static void main(String[] args) {
		
		List<User> lser = new ArrayList<>();
		
			
		System.out.println("---------------회원 + 운영자 전체리스트---------------");
		User u1 = new Staff("1.master","m7788","운영자",3500000);	
		User u2 = new Customer("2.jung-ws","j1357913579","정우성",1000);	
		User u3 = new Customer("3.LeeHR","a123!!","이효리",2500);
		User u4 = new Customer("4.ms-park","y2345","박명수",1200);
		
		lser.add(u1);
		lser.add(u2);
		lser.add(u3);
		lser.add(u4);
		
		u1.showInfo();
		u2.showInfo();
		u3.showInfo();
		u4.showInfo();

		int salary = ((Staff)u1).getSalary();
		System.out.println("운영자의 연봉은" + salary*12 + "입니다");
		
		

	}

}
