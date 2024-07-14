import java.util.*;
class Ambicable{
  public static void main(String[]args){
    Scanner ob=new Scanner(System.in);
    int num1=obj.nextInt();
    int num2=obj.nextInt();
    int i,j, DivSum1=0,DivSum2=0;
    for(i=1;i<num1;i++){
      if(num1 %i==0){
        DivSum1=DivSum1+ i;
      }
    }
    for(j=1;j<num2;j++){
      if(num2 % j==0){
        DivSum2= DivSum2 + j;
      }
    }
    if((DivSum1 == num2) &&(DivSum2 == num1)){
      System.out.print("Ambicable Number");
    } else{
      System.out.print("Not a Ambicable Number");
    }
  }
}
      
