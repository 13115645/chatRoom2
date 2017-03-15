package chatRoom2;

public class ServerCommands
{

	static int random = (int) (Math.random() * 50 + 1);
	private static final String hello = "fdgsfdgfdgs";
	private static final String serverShutdownRequest = "shutdownallclientsandstarttimer";
	private static final String serverKickRequest = "kickedFromTheServer";
	private static final String terminateClient = "terminate";

	/*
	 * If the server makes a shutdown request
	 */
	public static String getServershutdownrequest()
	{
		return serverShutdownRequest;
	}

	/*
	 * if the server makes a request to kick client
	 */
	public static String getServerkickrequest()
	{
		return serverKickRequest;
	}

	/*
	 * if the client or server request to terminate client
	 */
	public static String getTerminateclient()
	{
		return terminateClient;
	}

}