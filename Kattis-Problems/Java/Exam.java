import java.util.Scanner;
class Exam {
  public static void main(String []args){
        Scanner in= new Scanner(System.in);
      int correct=Integer.parseInt(in.nextLine());
      String first=in.nextLine();
      String second=in.nextLine();
    int size=first.length();
    int count=0;
    for(int i=0; i<size; i++){
      if(first.charAt(i)==second.charAt(i)){
        count++;
      }
      }
    int result=0;
    if(count==0){
      result=size-correct;
      
    }
    else if(correct>count){
        result=(size-count-(correct-count))+count;
    }
    else{
      result=(size-count)+correct;
    }
   
    
    System.out.println(result);
  }
    
}
