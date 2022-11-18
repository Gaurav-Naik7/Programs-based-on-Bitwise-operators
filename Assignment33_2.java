import java.lang.*;
import java.util.*;

class Assignment33_2
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int value1=sobj.nextInt();
		
		System.out.println("Enter second number: ");
		int value2=sobj.nextInt();
		
		Bitwise bobj=new Bitwise();
		int iRet=bobj.CountOne(value1,value2);
		
		System.out.println(iRet);
	}
}

class Bitwise
{
	public int CountOne(int iNo1,int iNo2)
	{
		
		int iCnt=0;
		int iCnt1=0;
		int iCnt2=0;
		
		int iNo3=0;
		
		if(iNo1>=iNo2)
		{
			iNo3=iNo2;
		}
		else
		{
			iNo3=iNo1;
		}
		
		while(iNo3>0)
		{
			iCnt1=iNo1 & 1;
			iCnt2=iNo2 & 1;
			
			if(iCnt1==iCnt2)
			{
				iCnt++;
			}
			
			iNo1=iNo1>>1;
			iNo2=iNo2>>1;
			iNo3=iNo3>>1;
		}
			
		return iCnt;
	}
}