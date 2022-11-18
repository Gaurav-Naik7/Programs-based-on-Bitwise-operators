//Program which ON first 4 bits

import java.lang.*;
import java.util.*;

class Assignment30_5
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int value=sobj.nextInt();
		
		Bitwise bobj=new Bitwise();
		int iRet=bobj.OnBit(value);
		
		System.out.println(iRet);
	}
}

class Bitwise
{
	public int OnBit(int iNo)
	{
		
		int iMask=0X0000000F;
		int iResult=0;
		
		iResult=iNo | iMask;
		
		return iResult;
	}
}