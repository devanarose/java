import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        int a[][],i,j;
        Scanner s=new Scanner(System.in);
        try{
            System.out.println("Enter  the order of matrix:");
            int n1 =s.nextInt();
            int n2=s.nextInt();
            a=new int[n1][n2];
            System.out.println("\nEnter the elements of Matrix: ");
            for(  i=0;i<n1;i++){
                for( j=0;j<n2;j++){
                    a[i][j]=s.nextInt();
                }
            }
            System.out.println( "\nThe entered Matrix is:\t");
            for(i=0;i<n1;i++){
                for(j=0;j<n2;j++){
                    System.out.println(a[i][j]+"\t");
                }
                System.out.println();
            }
            System.out.println( "\nTranspose:\t");
            for(i=0;i<n1;i++){
                for(j=0;j<n2;j++){
                    System.out.print(a[j][i]+"\t");
                }
                System.out.println();
            }
    } catch(Exception e){
        System.out.println(e);
    }
    finally{
        s.close();
    }
}
}
