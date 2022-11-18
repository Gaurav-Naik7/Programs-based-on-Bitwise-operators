import java.lang.*;
import java.util.*;

class Assignment32_5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in); 

        System.out.println("Enter number ");
        int value = sobj.nextInt();

        Bitwise bobj = new Bitwise();
        int iRet = bobj.ToggleBit(value);
		
		System.out.println(iRet);
		
    }
}

class Bitwise
{
        public int ToggleBit(int iNo)
        {
            int iMask1 = 0X0000000F;
			
			int iMask2 = 0X0000000F;
			
			int iPos=0;
	
			if((0X0000000F<iNo) && (iNo<=0X000000FF))
			{
				iPos=2;
			}
			else if((0X000000FF<iNo) && (iNo<=0X00000FFF))
			{
				iPos=3;
			}
			else if((0X00000FFF<iNo) && (iNo<=0X0000FFFF))
			{
				iPos=4;
			}
			else if((0X0000FFFF<iNo) && (iNo<=0X00FFFFF))
			{
				iPos=5;
			}
			else if((0X000FFFFF<iNo) && (iNo<=0X00FFFFFF))
			{
				iPos=6;
			}
			else if((0X00FFFFFF<iNo) && (iNo<=0X0FFFFFFF))
			{
				iPos=7;
			}
			else if((0X0FFFFFFF<iNo) && (iNo<=0XFFFFFFFF))
			{
				iPos=8;
			}
			
			iMask2 = iMask2 << ((iPos-1)*4);
			
			if((0X00000000<iNo) && (iNo<=0X0000000F))
			{
				iMask2=0X00000000;
			}
			
			int iMask3 = iMask1+iMask2;
			
			int iResult = 0;
            iResult = iNo ^ iMask3;
            
			return iResult;
			
        }
}

