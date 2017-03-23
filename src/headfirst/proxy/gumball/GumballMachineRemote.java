package headfirst.proxy.gumball;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Gavin on 2017/3/23.
 */
public interface GumballMachineRemote extends Remote {
    int getCount() throws RemoteException;

    String getLocation() throws RemoteException;

    State getState() throws RemoteException;
}
