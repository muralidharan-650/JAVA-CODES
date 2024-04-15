import java.util.*;
class betro
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long n1=sc.nextLong();
        long n2=sc.nextLong();
        long sum1=0;
        long sum2=0;
        for(long i=1;i<=n1/2;i++)
        {
            if(n1%i==0)
                sum1+=i;
        }
        System.out.println(sum1);
        for(long j=1;j<=n2/2;j++)
        {
            if(n2%j==0)
                sum2+=j;
        }
        System.out.println(sum2);
        if(((sum1-1)==n2) && (((sum2-1)==n1)))
        {
            System.out.print("Betrothed Number");
        }
        else
            System.out.print("Not a Betrothed Number");
    }
}