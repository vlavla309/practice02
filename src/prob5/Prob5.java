package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);

		Random r = new Random();

		while(true) {
			int min=1, max=100;
			int count=0;
			int k = r.nextInt(100) + 1;
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			while(true) {
				count++;
				System.out.println(min+"-"+max);
				System.out.print(count+">>");
				int input=scanner.nextInt();

				if(input==k) {
					System.out.println("맞았습니다.");
					break;
				}
				if(input > k) {
					if(!(input>100)) {
						max=input;
					}
					System.out.println("더  낮게");
				}
				if(input < k) {
					if(!(input<1)) {
						min=input;
					}System.out.println("더  높게");
				}
			}
			System.out.println("다시하시겠습니까(y/n)>>");
			String answer = scanner.next();
			if( answer.equals("n") ){
				break;
			}
		}


		scanner.close();

	}
}