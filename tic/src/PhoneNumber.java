import java.util.ArrayList;
import java.util.Random;

public class PhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random ran =new Random();
		Random ran2 =new Random();
		Random ran3 =new Random();
		Random ran4 =new Random();
		Random ran5 =new Random();
		Random ran6 =new Random();
		Random ran7 =new Random();
		int number = 0;
		int number2 = 0;
		int number3 = 0;
		int number4 = 0;
		int number5 = 0;
		int number6 = 0;
		int number7 = 0;
		int w=0;
		ArrayList a =new ArrayList(); 
		for(w=0;w<20000000;w++) {
		//for(int j=0;j<7;j++) {
			 number=ran.nextInt(7);
			 number2=ran2.nextInt(7);
			 number3=ran3.nextInt(7);
			 number4=ran4.nextInt(7);
			 number5=ran5.nextInt(7);
			 number6=ran6.nextInt(7);
			 number7=ran7.nextInt(7);
		//}
		String numero = "67"+number+number2+number3+number4+number5+number6+number7;
		Integer.parseInt(numero);
		if(a.contains(numero)) {
			System.out.println("-----");
			w--;
		}
		a.add(numero);
		
		System.out.println(" nous avons deja " + w++ + " "+numero);
		}
	}

}
