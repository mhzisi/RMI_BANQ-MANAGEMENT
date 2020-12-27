
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class Server extends UnicastRemoteObject implements MyInterface {
COMPTE_b[] c;
    
    
    public Server() throws RemoteException {}

    public String sayHello() {
        return "Hello Client in your banq account  !!";
    }
   public int lireSolde(Scanner n){
       int j=0;
       
       for(int i=0;i<c.length;i++){
           if (n.nextLine()==c[i].getname())  j=i;
       
               }
       return c[j].getsolde();
       
   }
   public void debiter(Scanner n, Scanner s){
       int m = s.nextInt();
       for(int i=0;i<c.length;i++){
           if (n.nextLine()==c[i].getname()){
       if ((c[i].getsolde()==0)||(c[i].getsolde()<m)) System.out.println("operation invalid");
       else
       c[i].setsolde(c[i].getsolde()-m);
           break;
           }
       }
           }
   public void crediter(Scanner n,Scanner m){
       
       for(int i=0;i<c.length;i++){
           if (n.nextLine()==c[i].getname()){
       c[i].setsolde(c[i].getsolde()+m.nextInt());
           }}
           }
   public void register(){
      
       Scanner n = new Scanner(System.in);
       Scanner solde = new Scanner(System.in);
    System.out.println("Enter username");
       c[c.length+1].setname(n.nextLine());
       System.out.println("Enter your solde");
      c[c.length+1].setsolde(solde.nextInt());
       
               
   }
  

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();

        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }

    
  
}
