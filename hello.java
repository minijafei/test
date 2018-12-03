import java.util.Scanner;

public class Frist 
{

	public static void main(String[] args) 
	{
		Show();
	}
}
public class void Show() 
{
		System.out.println("Hello World!");
}
class Rand 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		//获取随机数
		//Math. random(); 范围[0,1)
		int num = (int)(Math.random()*10);
		System.out.println("随机数为"+num);

		System.out.print("请输入你的会员号:");
		int val = input.nextInt();
		System.out.println();

		int bai = (val/100)%10;

		if(num==bai)
			System.out.println("幸运会员");
		else
			System.out.println("谢谢参与");
	}
}
