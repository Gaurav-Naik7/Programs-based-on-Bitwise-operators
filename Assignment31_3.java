//Program which toggle's 7th bit

import java.lang.*;
import java.util.*;

class Assignment30_3
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int value=sobj.nextInt();
		
		Bitwise bobj=new Bitwise();
		int iRet=bobj.ToggleBit(value);
		
		System.out.println(iRet);
	}
}

class Bitwise
{
	public int ToggleBit(int iNo)
	{
		
		int iMask=0X00000040;
		int iResult=0;
		
		iResult=iNo ^ iMask;
		
		return iResult;
	}
}