package Client;


import java.rmi.*;

public interface AuctionClientIntf extends Remote {
	public void callBack(String str) throws java.rmi.RemoteException;
	public int getClientId() throws java.rmi.RemoteException;
}

