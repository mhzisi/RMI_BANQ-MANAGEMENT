
public class COMPTE_b {
    private String fullname;
    private int solde;
    

    public COMPTE_b() {
    this.fullname="user";
    this.solde=0;
    
    }
    public String getname(){
        return fullname;
    }
    public int getsolde(){
        return solde;
    }
    public void setsolde(int s){
        solde=s;
    }
    public void setname(String s){
        fullname=s;
    }
}
