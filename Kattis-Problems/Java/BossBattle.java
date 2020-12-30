import java.util.Scanner;
class BossBattle {
  public static void main(String []args){
        Scanner in= new Scanner(System.in);
      int value=Integer.parseInt(in.nextLine());
      System.out.println(get(value));
      
    }
    public static int get(int value){
        if(value<=3){
            return 1;
        }
        else{
            return (value-3)+1;
        }
    }
}
