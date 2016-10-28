package homework5;

import java.util.*;

public class DiamondStars {
	public void diamond(){
		Scanner s = new Scanner(System.in);
		
		System.out.print("다이아몬드의 크기입력:");
		int size = s.nextInt();
		
		int cnt = 1;
		for(int i=0; i<(size*2)-1; i++){
			if(i<size-1){
			for(int j=1; j<size-i; j++)
				System.out.print(" ");
			
			for(int k=0; k<cnt; k++)
				System.out.print("*");
			
			cnt = cnt+2;
			System.out.println();
			}
			else{
				for(int j=i; j>=size; j--)
					System.out.print(" ");
				
				for(int k=0; k<cnt; k++)
					System.out.print("*");
				
				cnt = cnt-2;
				System.out.println();
			}
		}
	}
}
