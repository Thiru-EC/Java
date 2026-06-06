import java.util.*;
public class marks{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the students register numbers");
int n=sc.nextInt(); 

int []a=new int[n];
for(int i=0;i<=n;i++){
a[i]=sc.nextInt();
System.out.println(a[i]+" ");
}
System.out.println("Enter how many student marks do you enter ");
int m=sc.nextInt();
double []avg=new double[n];
for(int i=0;i<m;i++){
sc.nextLine();

System.out.println("Enter the subjects");
int c=sc.nextInt();



System.out.println("Enter the Marks");
int sum=0;
for(int j=0;j<c;j++){
sum+=sc.nextInt();
}
avg[i]=(double)sum/c;
}

for(int i=0;i<m-1;i++){
for(int j=0;j<m-i-1;j++){
if(avg[j]<avg[j+1]){

double temp=avg[j];
avg[j]=avg[j+1];
avg[j+1]=temp;
}
}
}
for(int i=0;i<m;i++){

System.out.printf("%.2f",avg[i]+);
System.out.println();
}
}
}











