package homework5;

import java.util.*;

public class IsoscelesTriangleStars {
	public void pyramid(){
		Scanner s = new Scanner(System.in);
		System.out.print("이등변삼각형 높이입력:");
		
		int height = s.nextInt();
		int cnt = 1;
		for(int i=0; i<height; i++){
			for(int j=0; j<height-i; j++)
				System.out.print(" ");
			
			for(int k=0; k<cnt; k++)
				System.out.print("*");
			
			cnt = cnt+2;
			System.out.println();
		}
	}
}
