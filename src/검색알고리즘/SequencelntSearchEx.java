package 검색알고리즘;

import java.util.Scanner;

/*
 * 순차검색(Sequential search)알고리즘
 */
public class SequencelntSearchEx {

	public static void main(String[] args) {
    //준비단계
		int[] data = {30,10,50,40,20,70,90,25};
		int i;
		int n = 8;
		
		//입력단계
     System.out.println("찾고자 하는 값은?");
     Scanner scan = new Scanner(System.in);
     int find = scan.nextInt();
     
     //순차 검색 알고리즘 적용
     for(i=0; i<n; i++) {
    	 if(find == data[i]) {
    		 System.out.println("찾고자 하는 값은"+ data[i]+"입니다.");
    		 break;
    	 }
     }
     if(i == n) {
    	 System.out.println(find + "을(를)찾을 수 없습니다.");
     }
	}

}
