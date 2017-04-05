package chatRoom2;

/**
 * 
 * @author Yasiru Dahanayake
 * 
 */
public class ClientRequests
{

	private static final String clientExitRequest = "closecurrentclient";
	private static final String clientConnectionRequest = "connectmetotheserver";

	/*
	 * Used to connect to the server, if not server does not
	 * connect to the client
	 */
	public static String getClientconnectionrequest()
	{
		return clientConnectionRequest;
	}

	/*
	 * If the client makes a request to exit the server.
	 */
	public static String getClientexitrequest()
	{
		return clientExitRequest;
	}
}
