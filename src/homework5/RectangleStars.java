package homework5;

import java.util.*;

public class RectangleStars {
	public void Square(){
		Scanner s = new Scanner(System.in);
		
		System.out.print("정사각형 크기입력:");
		int size = s.nextInt();
		
		for(int i=0; i<size; i=i+2){
			for(int j=0; j<size; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
