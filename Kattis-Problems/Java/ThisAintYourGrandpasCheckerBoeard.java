import java.util.Scanner;

public class WeigthOfWords {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int size=Integer.parseInt(in.nextLine());
        String [][]array=new String [size][size];
        for(int i=0; i<size; i++){
            String next=in.nextLine();
            for(int j=0; j< size; j++){
                array[i][j]=""+next.charAt(j);
            }
        }

        int nW=0;
        int nB=0;
        boolean result=true;
        int dnW=0;
        int dnB=0;
        boolean ddone=false;
        boolean done=false;
        for(int i=0; i<size; i++) {
            int checkW = 0;
            int checkB = 0;
            int numW = 0;
            int numB = 0;
            int dcheckW = 0;
            int dcheckB = 0;
            int dnumW = 0;
            int dnumB = 0;
            for (int j = 0; j < size; j++) {
                String ch = array[i][j];
                array[i][j] = ch;
                if (ch.equals("W")) {
                    numW++;
                    checkW++;
                    if (checkB < 3) {
                        checkB = 0;
                    }
                } else {
                    numB++;
                    checkB++;
                    if (checkW < 3) {
                        checkW = 0;
                    }
                }
                String ch2 = array[j][i];

                if (ch2.equals("W")) {
                    dnumW++;
                    dcheckW++;
                    if (dcheckB < 3) {
                        dcheckB = 0;
                    }
                } else {
                    dnumB++;
                    dcheckB++;
                    if (dcheckW < 3) {
                        dcheckW = 0;
                    }
                }


            }
            if (checkB >= 3 || checkW >= 3) {
                System.out.println(0);
                result=false;
                break;
            }
            if (!done) {
                nW = numW;
                nB = numB;
            }
            done = true;
            if (nW != numW || nB != numB) {
                System.out.println(0);
                result=false;
                break;
            }


            if (dcheckB >= 3 || dcheckW >= 3) {
                System.out.println(0);
                result=false;
                break;
            }
            if (!ddone) {
                dnW = dnumW;
                dnB = dnumB;
            }
            ddone = true;
            if (dnW != dnumW || dnB != dnumB) {
                System.out.println(0);
                result=false;
                break;
            }
        }
        if(result) {
            System.out.println(1);
        }

    }
}
