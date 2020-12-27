import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;


public class Client {

    public static void main(String[] args) throws RemoteException, NotBoundException {
        try {
            int a=10;
           
            MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            System.out.println(service1.sayHello());
            Scanner obj=new Scanner(System.in);
            while(a!=0){
            System.out.println("Your first time !! create an account on press o 1");
            System.out.println(" To debit money press 2");
            System.out.println(" To credite money press 3");
            System.out.println(" To check your solde press 4");
  System.out.println(" To Exit press 0");
  a=obj.nextInt();
  switch(a){
                case 1:
                    service1.register();
                    break;
                case 2:
                    service1.debiter(obj, obj);
                break;
                case 3:
                    service1.crediter(obj, obj);
                    break;
                case 4:
                    service1.lireSolde(obj);
                    break;
                case 0: System.out.println("good bye");
                        System.exit(0);
                         break;
  }
            }
        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.toString());
        }
    }

}
