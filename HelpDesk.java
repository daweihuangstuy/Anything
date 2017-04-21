public class HelpDesk{
 
   //the Queue of tickets...
    private ArrayPriorityQueue<Ticket> TQ;

   //this will hold the processed ticket's ID number
    private int ticket;
 
    
    public HelpDesk(){
	ticket = TQ.peekMin().getID();
    }


}