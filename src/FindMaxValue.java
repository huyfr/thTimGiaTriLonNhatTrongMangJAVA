import java.util.Scanner;

public class FindMaxValue
{
    public static void main(String[] args)
    {
        int size;
        int arr[];

        Scanner sc=new Scanner(System.in);

        do
        {
            System.out.print("Enter a size array: ");
            size=sc.nextInt();
            if (size>20)
            {
                System.out.println("Size should not exceed 20");
            }
        }
        while (size>20);

        arr=new int[size];

        for (int j=0; j<arr.length; j++)
        {
            System.out.print("Enter element "+(j+1)+" : ");
            arr[j]=sc.nextInt();
        }

        System.out.print("Property list: ");
        for (int j=0; j<arr.length; j++)
        {
            System.out.print(arr[j]+"\t");
        }

        System.out.println();
        int max=arr[0];
        int index=1;

        for (int j=0; j<arr.length; j++)
        {
            if ((arr[j]>max))
            {
                max=arr[j];
                index=j+1;
            }
        }
        System.out.print("The largest property value in the list is "+max+" , at position "+index);
    }
}
