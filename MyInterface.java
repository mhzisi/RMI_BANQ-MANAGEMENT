import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Scanner;

public interface MyInterface extends Remote {

    String sayHello()throws RemoteException;
    int lireSolde(Scanner n) throws RemoteException;
    void debiter(Scanner n,Scanner s) throws RemoteException;
    void crediter(Scanner n,Scanner s)throws RemoteException;
    void register()throws RemoteException;
}
