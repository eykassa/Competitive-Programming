import java.util.Scanner;

public class merge {
    private static int [][]array;
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        array=new int [4][4];
        for(int i=0; i<4; i++){
            String next=in.nextLine();
            Scanner inline=new Scanner(next);
            for(int j=0; j<4; j++){
                array[i][j]=inline.nextInt();
            }
        }
        int direction=Integer.parseInt(in.nextLine());
        if(direction==0){
            for(int i=0; i<4; i++){
                for(int j=3;j>=0;j--) {
                   if(array[i][j]==0){
                       swap(i,j,0);
                   }
                }
            }
        }
        else if(direction==1){
            for(int i=0; i<4; i++){
                for(int j=3; j>=0; j--){
                    if(array[j][i]==0){
                        swap(j,i,1);
                    }
                }
            }
        }
        else if(direction==2){
            for(int i=0; i<4; i++){
                for(int j=0;j<4;j++) {
                    if(array[i][j]==0){
                        swap(i,j,2);
                    }
                }
            }
        }
        else if(direction==3) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (array[j][i] == 0) {
                        swap(j, i, 3);
                    }
                }
            }

        }
        add(direction);
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static  void swap(int x, int y,int d){
        if(d==0) {
            int pos=y+1;
            if(y==3){
                return;
            }
            while(pos<=3) {
                int temp=array[x][pos-1];
                array[x][pos-1]=array[x][pos];
                array[x][pos]=temp;
                pos++;
            }
        }
        else if(d==1){
            int pos=x+1;
            if(x==3){
                return;
            }
            while(pos<=3) {
                int temp=array[pos-1][y];
                array[pos-1][y]=array[pos][y];
                array[pos][y]=temp;
                pos++;
            }
        }
        else if(d==2){
            int pos=y-1;
            if(y==0){
                return;
            }

            while(pos>=0) {
                int temp=array[x][pos];
                array[x][pos]=array[x][pos+1];
                array[x][pos+1]=temp;
                pos--;
            }
        }
        else if(d==3){
            int pos=x-1;
            if(x==0){
                return;
            }

            while(pos>=0) {
                int temp=array[pos][y];
                array[pos][y]=array[pos+1][y];
                array[pos+1][y]=temp;
                pos--;
            }
        }


    }
    public static void add(int d){
        if(d==0){
            for(int j=0; j<4;j++) {
                for (int i = 1; i < 4; i++) {
                    if (array[j][i - 1] == array[j][i]) {
                        array[j][i - 1] = array[j][i - 1] + array[j][i];
                        array[j][i]=0;
                        swap(j,i,d);
                    }
                }
            }
        }
        else if(d==1){
            for(int j=0; j<4;j++) {
                for (int i = 1; i < 4; i++) {
                    if (array[i-1][j] == array[i][j]) {
                        array[i-1][j] = array[i-1][j] + array[i][j];
                        array[i][j]=0;
                        swap(i,j,d);
                    }
                }
            }
        }
        else if(d==2){
            for(int j=0; j<4;j++) {
                for (int i = 2; i >= 0; i--) {
                    if (array[j][i + 1] == array[j][i]) {
                        array[j][i + 1] = array[j][i + 1] + array[j][i];
                        array[j][i]=0;
                        swap(j,i,d);
                    }
                }
            }
        }
        else if(d==3){
            for(int j=0; j<4;j++) {
                for (int i = 2; i >= 0; i--) {
                    if (array[i+1][j] == array[i][j]) {
                        array[i+1][j] = array[i+1][j] + array[i][j];
                        array[i][j]=0;
                        swap(i,j,d);
                    }
                }
            }
        }
    }
}

