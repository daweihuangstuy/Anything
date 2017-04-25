public class HelpDesk{

   //the Queue of tickets...                                                                        
    private ArrayPriorityQueue TQ;

   //this will hold the processed ticket's ID number                                                
    private int ticket;

    public HelpDesk(){
        ticket = TQ.peekMin().getID();
    }

    public static void main(String[] args){

        ArrayPriorityQueue a = new ArrayPriorityQueue();
        Ticket alpha = new Ticket(1, 1);
        Ticket beta = new Ticket(15, 15);
        Ticket king = new Ticket(0, 0);
        Ticket dan = new Ticket(0, 0);
        Ticket alice = new Ticket(6, 6);
        Ticket bob = new Ticket(12, 12);
        a.add(beta);
        System.out.println(a);
	System.out.println(alpha.compareTo(beta)); //-1
        a.add(alpha);
        System.out.println(a);
        a.add(king);
        System.out.println(a);
        a.add(bob);
        a.add(dan);
        a.add(alice);
        System.out.println(a);
    }



}

