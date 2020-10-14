package RMI;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer implements Hello
{
    private int port = 1099;    // rmi default port on the server
    private String host = "localhost"; // the server's host

    public RMIServer()
    {
    }

    @Override
    public String sayHello() throws RemoteException
    {
        return "hi, cakes are good";
    }

    public static void main(String args[])
    {
        try
        {
            RMIServer remoteObj = new RMIServer();
            Hello stub = (Hello) UnicastRemoteObject.exportObject(remoteObj, 0);
            //starts the rmiregistry
            LocateRegistry.createRegistry(1099);
            //bind the object to the registry
            //Naming.bind("rmi://localhost:1099/RMIServer", remoteObj);


            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("Hello", stub);

            System.err.println("RMI Server is ready");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
