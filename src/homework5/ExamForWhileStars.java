package homework5;

import java.util.*;

public class ExamForWhileStars {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String check="";
		try{
			while(!check.equals("end")){
				mainMenu();
				System.out.print("원하는 메뉴는:");
				int menu = s.nextInt();
				switch(menu){
				case 1:
					new RectangleStars().Square();
					break;
				case 2:
					new TriangleStars().triangle();
					break;
			    /**
				case 3:
					new SumAndAvg().sumAvg();
					break;
				case 4:
					new GuGuDan().dan();
					break;
				**/
				case 5:
					check="end";
					break;
				default:
					System.out.print("잘못 입력하셨습니다.\n");
					continue;
				}//switch
			}//while
		}
		finally{
			if(s!=null)
				s.close();
			System.out.println("프로그램 종료");
		}
	}
	
	static void mainMenu(){
		System.out.println("1.정사각형 별찍기");
		System.out.println("2.직각삼각 별찍기");
		System.out.println("3.이등변 삼각형 별찍기");
		System.out.println("4.다이아몬드 별찍기 ");
		System.out.println("5.종료하기 ");
	}
}
