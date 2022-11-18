//Program to count number of ON (1 bits)

import java.lang.*;
import java.util.*;

class Assignment33_1
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int value=sobj.nextInt();
		
		Bitwise bobj=new Bitwise();
		int iRet=bobj.CountOne(value);
		
		System.out.println(iRet);
	}
}

class Bitwise
{
	public int CountOne(int iNo)
	{
		
		int iCnt=0;
		
		while(iNo>0)
		{
			iCnt=iCnt+ (iNo & 1);
			iNo=iNo>>1;
		}
			
		return iCnt;
	}
}