package 배열예제;

public class ArrayEx01 {

	public static void main(String[] args) {
		 int a = 10; //4바이트 크기에 1이라는 정수값을 저장하는 a라는 변수를 선
	       
	        
		  // int [] scores = {85, 90, 70, 80};  //1차원 배열의 초기화 

	        int [] scores = {85, 90, 70, 80, 100};  //1차원 배열의 초기화 

	        System.out.println("JAVA 점수" + scores[0]);
	        System.out.println("CSS 점수" + scores[1]);
	        System.out.println("JAVA Script 점수" + scores[2]);
	        System.out.println("데이터베이 점수" + scores[3]);
	       
	       //[문제] 4과목의 총점과 평균을 구하시오. 
	       //제어문의 반복문 중에서for문 적
	         int totalSum = 0; //누적 변수는 초기값 0으로 주자 !!
	 	   
	        /*
	        for(int  i=0; i<4; i++ )
	       {  
	    	  totalSum = totalSum + scores[i];  
	    	 
	    	   
	       }
	       */
	         for(int  i=0; i<scores.length; i++ ) { //length는 배열 객체의 필드라고 한다.   
		    	  totalSum = totalSum + scores[i];  
		    	 
		    	   
		       }
	         
	        System.out.println("총점 :" + totalSum);
	        /*
	         * [주의] 정수와 정수의 연산결과는 정수값이 나옴!!
	         * 325/4 =81 => 81
	         * 그런데 실수값의 결과를 얻기 위해서 
	         * (double)이라는 캐스트 연산자를 통해서 강제형변환 => 81.25
	         */
	        
	      /* double avg = (double)totalSum/4 ;
	       
	       */
	        
	        double avg = (double)totalSum/scores.length ;
	       System.out.println("평균 :"+ avg);
	       
		}
	

	}


