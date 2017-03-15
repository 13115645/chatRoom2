package chatRoom2;

public class ClientRequests
{

	private static final String clientExitRequest = "closecurrentclient";
	private static final String clientConnectionRequest = "connectmetotheserver";

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
