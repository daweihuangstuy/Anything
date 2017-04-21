import java.util.ArrayList;
public class ArrayPriorityQueue implements Comparable,PriorityQueue<Ticket>{
    
    private ArrayList<Ticket> q;
    public ArrayPriorityQueue(){
	q = new ArrayList();
    }
 

    public void add(Ticket x)
   { 
	//initialize high, low, midpt indices
	int lo = 0;
	int med = 0;
	int hi = q.size() - 1;

	while ( lo < hi ) { //running until target is found or bounds cross

	    med = (lo + hi) / 2;
	    int a = q.get(med).getVIPlvl().compareTo( x.getVIPlvl());
	    if ( a == 0 ) {
		//equal value found, insert here
		lo = med;
		break;
	    }
	    else if ( a > 0 )
		//newVal < med, so look at lower half of data
		hi = med - 1;
	    else
		//newVal > med, so look at upper half of data
		lo = med + 1;
	}
	//	System.out.println(lo);
	//System.out.println(q.size());
	//keeps order
	if(lo != 0){
	    while((Integer)q.get(lo - 1).getVIPlvl().compareTo((Integer)q.get(lo).getVIPlvl()) == 0){
           lo -= 1;
        }
	}
       
	// If you made it this far, newVal is not present.
	// So insert at lo.
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
	for (int i = q.size(); i >= 0; i--){
	    System.out.println( q.get(i).getID() + " --> ");
	}
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
    }
    

}
