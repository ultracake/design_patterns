package RMI;

import java.rmi.Remote;
/*
 Remote method invocations can fail in many additional ways compared to local method invocations
 (such as network-related communication problems and server problems),
 and remote methods will report such failures by throwing a "java.rmi.RemoteException".
*/
import java.rmi.RemoteException;

public interface Hello extends Remote
{
    String sayHello() throws RemoteException;
}
