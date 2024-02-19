import java.util.Scanner;

public class Secondsmallest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try {
            int i,j;
            System.out.println("Enter  the size of array:");
            int n = s.nextInt();
            System.out.println("Enter "+n+" elements: ");
            int a[] = new int[n];
            for ( i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
            for(i=0;i<n-1;i++){
                for(j=0;j<n-i-1;j++){
                    if(a[j]>a[j+1]){
                        int t=a[j];
                        a[j]=a[j+1];
                        a[j+1]=t;
                    }
                }
            }
            System.out.print("The second smallest element is :"+a[1]);
     } catch(Exception e){
            System.out.println(e);
        }
        finally{
            s.close();
        }

    }
}
