public class Ticket implements Comparable<Ticket>{
    private int ID;
    private Integer VIPlvl;
    private boolean solved;
    private String solution;

    public Ticket(int id, int vip){
	ID = id;
	VIPlvl = vip;
	solved = false;
	solution = "";
    }

    //accessors
    public int getID(){
	return ID;
    }
    
    //0 is the largest.
    public Integer getVIPlvl(){
	return VIPlvl;
    }

    //mutators
    public void solve(){
	solved = true;
    }

    public void setSolution(String s){
    solution = s;
    }

    public int compareTo(Ticket T){

        if (this.getVIPlvl() == T.getVIPlvl()) { return 0; }
        else if (this.getVIPlvl() > T.getVIPlvl()){ return 1;}
        else { return -1; }
    }



    

}
