package �迭����;

public class ArrayEx01 {

	public static void main(String[] args) {
		 int a = 10; //4����Ʈ ũ�⿡ 1�̶�� �������� �����ϴ� a��� ������ ��
	       
	        
		  // int [] scores = {85, 90, 70, 80};  //1���� �迭�� �ʱ�ȭ 

	        int [] scores = {85, 90, 70, 80, 100};  //1���� �迭�� �ʱ�ȭ 

	        System.out.println("JAVA ����" + scores[0]);
	        System.out.println("CSS ����" + scores[1]);
	        System.out.println("JAVA Script ����" + scores[2]);
	        System.out.println("�����ͺ��� ����" + scores[3]);
	       
	       //[����] 4������ ������ ����� ���Ͻÿ�. 
	       //����� �ݺ��� �߿���for�� ��
	         int totalSum = 0; //���� ������ �ʱⰪ 0���� ���� !!
	 	   
	        /*
	        for(int  i=0; i<4; i++ )
	       {  
	    	  totalSum = totalSum + scores[i];  
	    	 
	    	   
	       }
	       */
	         for(int  i=0; i<scores.length; i++ ) { //length�� �迭 ��ü�� �ʵ��� �Ѵ�.   
		    	  totalSum = totalSum + scores[i];  
		    	 
		    	   
		       }
	         
	        System.out.println("���� :" + totalSum);
	        /*
	         * [����] ������ ������ �������� �������� ����!!
	         * 325/4 =81 => 81
	         * �׷��� �Ǽ����� ����� ��� ���ؼ� 
	         * (double)�̶�� ĳ��Ʈ �����ڸ� ���ؼ� ��������ȯ => 81.25
	         */
	        
	      /* double avg = (double)totalSum/4 ;
	       
	       */
	        
	        double avg = (double)totalSum/scores.length ;
	       System.out.println("��� :"+ avg);
	       
		}
	

	}


