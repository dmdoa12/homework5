package homework5;

import java.util.*;

public class TriangleStars {
	public void triangle(){
		Scanner s = new Scanner(System.in);
		
		System.out.print("직삼각형의 왼쪽여백과 높이입력:");
		int blank = s.nextInt();
		int height = s.nextInt();
		
		blank++;
		
		for(int i=1; i<=height; i++){
			for(int j=0; j<blank-i; j++){
				System.out.print(" ");
			}
			for(int k=0; k<i; k++)
				System.out.print("*");
			
			System.out.println();
		}
	}
}
