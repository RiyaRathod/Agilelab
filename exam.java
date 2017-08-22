import java.util.*;

class exam
{
    public static void main(String args[])
    {
        action a = new action();
    }
}

class action
{
    Scanner s = new Scanner(System.in);

    action()
    {
        System.out.println("Enter Number of the Row :");
        int col=s.nextInt();
        double data[][]=new double[2][col];

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<col;j++)
            {
                data[i][j]=s.nextDouble();
            }
        }
/*amruta + riya*/
        System.out.println("Entered Data are : ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(data[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("Enter value of the variable which you want to find out : ");
        double search=s.nextDouble();

        double h=data[0][1]-data[0][0];
        double p=(search-data[0][col-1])/h;

        double arr[][]=new double[col-1][col-1];
        int iteration=0;
        for(int i=0;i<col-1;i++)
        {
            for(int j=0;j<col-1-iteration;j++)
            {
                if(i==0)
                {
                    arr[i][j]=data[1][j+1]-data[1][j];
                }
                else
                {
                    if(j!=4)
                        arr[i][j]=arr[i-1][j+1]-arr[i-1][j];
                }

            }
            iteration++;
        }

        System.out.println("Data in the matrix are : ");
        for(int i=0;i<col-1;i++)
        {
            for(int j=0;j<col-1;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Value of P : "+p);
        System.out.println("Value of H : "+h);

        double sum=1,total=0,fact=1;
        int i,count=0;
        int back=col-2;
        while(true)
        {
            for(i=0;i<col-1;i++)
            {
                for(int j=0;j<i+1;j++)
                {
                    sum*=(p+j);
                }
                System.out.println(sum);
                for(int k=1;k<=i+1;k++)
                {
                    fact*=k;
                }
                System.out.println(fact + "  " + arr[i][back]);
                total+=(sum*arr[i][back])/fact;
                System.out.println(total);
                fact=1;
                back--;
                sum=1;
                if(i==col-2)
                 {
                     count=1;
                     break;
                 }
            }
            if(count==1)
                break;
        }
        System.out.println("Answer is "+(total+data[1][col-1]));
    }

};
