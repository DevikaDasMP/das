class A{
    int[][] A={
            {1,2,3},
            {5,6,7},
            {8,9,10}
        };
        int[][] B={
            {11,12,13},
            {14,15,16},
            {17,18,19}
        };
        int C[]=new int[3];
        int D[]=new int[3];
        int E[][]=new int[3][3];
        {
        for(int i=0;i<=2;i++){
            C[i]=A[i][i];
        }
        int i=0,j=2;
        while(i<=2)
        {
            D[i]=B[i][j];
            i++;
            j--;
        }
        for(int k=0;k<=2;k++)
        {
            E[0][k]=C[k]+D[k];
        }
    }

}
    
class Array
{
     public static void main(String[] args)
    {
        A sts=new A();
        //sts.sample();
        for (int i=0;i<=2;i++)
        {
        System.out.print(sts.E[0][i]+"\t");
        }
    }
}
   




































































