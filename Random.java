import java.lang.Math;
import java.util.Scanner;
public class Random {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int min=0;
    int max=100;
    for(int i=5;i>0;i--)
    {
    System.out.println("Choice left:"+(i-1));
    int a=(int)(Math.random()*(max-min+1)+min);
    System.out.print("Enter the no.:\t");
    int x=sc.nextInt();
    System.out.println("Random value:"+a);
    if(x==a){
      System.out.println("Matched");
    }
    else{
      System.out.println("Not matched");
    }
    System.out.println("\n");

}
}
}
