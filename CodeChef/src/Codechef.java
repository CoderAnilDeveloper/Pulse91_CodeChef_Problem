
import java.util.*;
import java.io.*;

public class Codechef
{
    public static void main(String[] args)
    {
        
        Scanner scan= new Scanner(System.in);
        int T,K,N;
        T=scan.nextInt();
        
        while(T>0)
        {
            N=scan.nextInt();
            K=scan.nextInt();
            int item[]=new int[N];
            
            for(int i=0;i<N;i++)
            {
                item[i]=scan.nextInt();
            }
            
            Arrays.sort(item);
            
            
            int sum_son=0,sum_chef=0;
            
            if(K <= N-K)
            {
                for(int i=0;i<K;i++)
                {
                    sum_son = sum_son + item[i];
                }
                for(int i=K;i<N;i++)
                {
                    sum_chef = sum_chef + item[i];
                }
            }
            
            else
            {
                for(int i=0;i<N-K;i++)
                {
                    sum_son = sum_son + item[i];
                }
                
                for(int i=N-K;i<N;i++)
                {
                    sum_chef = sum_chef + item[i];
                }
            }
            System.out.println(sum_chef - sum_son);
            T--;
        }
    }
}
