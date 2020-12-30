import java.util.*;

public class ICanGuessTheDataStructure {
    public static void main(String []args){
        Scanner in =new Scanner(System.in);
        while(in.hasNextInt()) {
            int testCases=in.nextInt();
            Stack<Integer>stack=new Stack<>();
            PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
            Queue<Integer>queue=new LinkedList<Integer>();
            boolean s=true,p=true,q=true;
            for (int i = 0; i < testCases; i++) {
                int command = in.nextInt();
                int value = in.nextInt();
                if (command == 1) {
                    stack.push(value);
                    pq.add(value);
                    queue.add(value);
                } else {
                    if (stack.size()==0||stack.pop() != value) {
                        s = false;
                    }  if (pq.size()==0||pq.remove() != value) {
                        p = false;
                    }  if (queue.size()==0||queue.remove() != value) {
                        q = false;
                    }
                }

            }
            if(!s&&!p&&!q){
                System.out.println("impossible");
            }
            else if(s&&p||p&&q || s&&q){
                System.out.println("not sure");
            }
            else{
                if(s){
                    System.out.println("stack");
                }
                else if(p){
                    System.out.println("priority queue");
                }
                else if(q){
                    System.out.println("queue");
                }
            }

        }

    }
}
