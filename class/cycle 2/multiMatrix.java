import java.util.*;
class multiMatrix{
    public static void main(String args[]){
        int a[][],b[][],c[][],i,j,k;
        Scanner s=new Scanner(System.in);
        try{
            System.out.println("Enter  the order of matrix 1:");
            int n1 =s.nextInt();
            int n2=s.nextInt();
            a=new int[n1][n2];
            System.out.println("\nEnter the elements of Matrix 1 : ");
            for(  i=0;i<n1;i++){
                for( j=0;j<n2;j++){
                    a[i][j]=s.nextInt();
                }
            }
            System.out.println("Enter  the order of matrix 2:");
            int n3 =s.nextInt();
            int n4=s.nextInt();
            b=new int[n3][n4];
            System.out.println("\nEnter the elements of Matrix 2 : ");
            for(  i=0;i<n3;i++){
                for( j=0;j<n4;j++){
                    b[i][j]=s.nextInt();
                }
            }
            System.out.println("MATRIX 1:");
            for(i=0;i<n1;i++){
                for(j=0;j<n2;j++){
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println();
            }
            System.out.println("MATRIX 2:");
            for(i=0;i<n3;i++){
                for(j=0;j<n4;j++){
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println();
            }
            if(n2==n3){
                c=new int[n1][n4];
                for(i=0;i<n1;i++) {
                    for(j=0;j<n4;j++) {
                        for(k=0;k<n2;k++) {
                            c[i][j]=c[i][j]+a[i][k]*b[k][j];
                        }
                    }
                }
                System.out.println("The Resultant Matrix is: \n");
                for(i=0;i<n1;i++) {
                    for(j=0;j<n4;j++) {
                        System.out.println(c[i][j]+"\t");
                    }
                    System.out.println();
                }
            }
            else {
                System.out.println("multiplication not possible");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            s.close();
        }
    }
}