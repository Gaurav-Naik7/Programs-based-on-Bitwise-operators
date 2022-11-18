//Program which switches 7th bit OFF

import java.lang.*;
import java.util.*;

class Assignment30_1
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int value=sobj.nextInt();
		
		Bitwise bobj=new Bitwise();
		int iRet=bobj.OffBit(value);
		
		System.out.println(iRet);
	}
}

class Bitwise
{
	public int OffBit(int iNo)
	{
		
		int iMask=0X00000040;
		int iResult=0;
		
		iResult=iNo & ~(iMask);
		
		return iResult;
	}
}