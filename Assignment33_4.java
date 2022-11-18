import java.lang.*;
import java.util.*;

class Assignment33_4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in); 

        System.out.println("Enter number ");
        int value = sobj.nextInt();

        System.out.println("Enter position ");
        int pos1 = sobj.nextInt();
		
		System.out.println("Enter position ");
        int pos2 = sobj.nextInt();

        Bitwise bobj = new Bitwise();
        boolean bRet = bobj.ChkeBit(value,pos1,pos2);
		
		if(bRet==false)
		{
			System.out.println("FALSE");
		}
		else
		{
			System.out.println("TRUE");
		}
    }
}

class Bitwise
{
        public boolean ChkeBit(int iNo, int iPos1, int iPos2)
        {
            int iMask1 = 0X00000001;
			int iMask2 = 0X00000001;
			int iMask3 = 0X00000000;
            int iResult = 0;

            iMask1 = iMask1 << (iPos1-1);
			iMask2 = iMask2 << (iPos2-1);
			
			iMask3=iMask1+iMask2;

            iResult = iNo & iMask3;
            
			if(iResult==0)
			{
				return false;
			}
			else
			{
				return true;
			}
        }
}

