package homework5;

import java.util.*;

public class ExamForWhileStars {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String check="";
		try{
			while(!check.equals("end")){
				mainMenu();
				System.out.print("���ϴ� �޴���:");
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
					System.out.print("�߸� �Է��ϼ̽��ϴ�.\n");
					continue;
				}//switch
			}//while
		}
		finally{
			if(s!=null)
				s.close();
			System.out.println("���α׷� ����");
		}
	}
	
	static void mainMenu(){
		System.out.println("1.���簢�� �����");
		System.out.println("2.�����ﰢ �����");
		System.out.println("3.�̵ �ﰢ�� �����");
		System.out.println("4.���̾Ƹ�� ����� ");
		System.out.println("5.�����ϱ� ");
	}
}
