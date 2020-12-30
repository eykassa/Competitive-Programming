import java.util.Scanner;

public class ThreasureHunt {
    static String [][]map;
    static int count=0;
    static int mapRow=0;
    static int mapCol=0;
    public static void main(String []args){
        Scanner in= new Scanner(System.in);
        String [] k=in.nextLine().split(" ");
        int row=Integer.parseInt(k[0]);
        int col=Integer.parseInt(k[1]);
        map=new String [row][col];
        for(int i=0; i<row; i++){
            String next=in.nextLine();
            for(int j=0; j<col; j++){
                map[i][j]=""+next.charAt(j);
            }
        }
        count=0;
        mapRow=0;
        mapCol=0;
        boolean done=false;
        while(!done){
            if(map[mapRow][mapCol].equals("T")){
                System.out.println(count);
                done=true;
                break;
            }
            else if(map[mapRow][mapCol].equals("D")){
                System.out.println("Lost");
                done=true;
                break;
            }
            else{
                boolean result=move(mapRow,mapCol,map[mapRow][mapCol]);
                if(!result){
                    System.out.println("Out");
                    done=true;
                    break;
                }

            }
        }
    }


    public static boolean move(int row, int col,String next){
        int r=row;
        int c=col;
        if(next.equals("E")){
            c++;
        }
        else if(next.equals("W")){
            c--;
        }
        else if(next.equals("N")){
            r--;
        }
        else if(next.equals("S")){
            r++;
        }


        if(r<0 || r>=map.length || c<0||c>=map[0].length){
            return false;
        }
        else{
            map[row][col]="D";
            count++;
            mapRow=r;
            mapCol=c;
            return true;
        }


    }
}
