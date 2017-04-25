import java.util.ArrayList;
public class ArrayPriorityQueue implements PriorityQueue<Ticket>{

    private ArrayList<Ticket> q;
    public ArrayPriorityQueue(){
        q = new ArrayList();
    }

    public void add(Ticket x)
   {
       if (isEmpty()) {q.add(0, x); return;}

       if(q.size() == 1){
           if (q.get(0).compareTo(x) == 0 || q.get(0).compareTo(x) > 0){
               q.add(1,x);
               return; }
           else {
               q.add(0, x);
               return;}
       }


        //initialize high, low, midpt indices                                                                                     
        int lo = 0;
        int med = 0;
        int hi = q.size() - 1;


        while ( lo <= hi) { //running until target is found or bounds cross                                                         
            med = (lo + hi) / 2;
            int a = x.compareTo(q.get(med));
            if ( a == 0){
                lo = med;
                hi = lo;
            }
            if ( a > 0 ){
                //newVal less than val at med so we move closer to the front                                                       
                hi = med - 1;}
            else{
		         //newVal less than val at med so we move closer to the back
		lo = med + 1; }
        }
        //keeps order                                                                                                              
	if(lo > 0){
            while(q.get(lo - 1).compareTo(x) == 0){
           lo -= 1;
            }
            }

        // If you made it this far, newVal is not present.                                                // So insert at lo.                                                                                                        
        q.add(lo,x);
    }//end add                                                                                                                     

    //returns whether or not the PQ is empty
    public boolean isEmpty(){
        return q.size() == 0;
    }

    //Returns the smallest item in the PQ from the front  
 public Ticket peekMin(){
        return q.get(0);
    }

    //Removes and returns the smallest item from the front                                                                         
    public Ticket removeMin(){
        Ticket old = peekMin();
        q.remove(0);
        return old;
    }
   

    public String toString(){
        String ret = " FRONT ... ";
        for (int i = q.size() - 1; i >= 0; i--){
            ret += " --> " + q.get(i).getID();
        }
    ret+=" ...END";
    return ret;
    } 




    public static void main(String[] args){
        ArrayPriorityQueue a = new ArrayPriorityQueue();
        Ticket alpha = new Ticket(209853738, 0);
        Ticket beta = new Ticket(1234, 15);
        Ticket king = new Ticket(999, 0);

        a.add(beta);
        System.out.println(a);
        a.add(alpha);
        System.out.println(a);
        a.add(king);
        System.out.println(a);
    }
}

