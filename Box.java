import java.util.*;

public class Box {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		double w,h,area,perimter;
		
		System.out.println("�簢�� �ʺ� �Է��Ͻÿ�:");
		w= scn.nextDouble();
		
		System.out.println("�簢�� ���� �Է��Ͻÿ�:");
		h= scn.nextDouble();
		
		area=w*h;
		perimter=2.0*(w+h);
		
		System.out.println("�簢���� ������"+area);
		System.out.println("�簢���� �ѷ���"+perimter);
		
		scn.close();
	}
}
