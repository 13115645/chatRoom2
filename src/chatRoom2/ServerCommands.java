package chatRoom2;

/**
 * 
 * @author Yasiru Dahanayake
 * 
 */

public class ServerCommands
{

	static int random = (int) (Math.random() * 50 + 1);
	private static final String hello = "fdgsfdgfdgs";
	private static final String serverShutdownRequest = "shutdownallclientsandstarttimer";
	private static final String serverKickRequest = "kickedFromTheServer";
	private static final String terminateClient = "terminate";
	private static final String closeinstantly = "closeallalicents";
	private static final String abortshutdown = "resettimerandprogressbar";

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

	/*
	 * closes all clients and shuts down terminates the clients instantly
	 */
	public static String getCloseinstantly()
	{
		return closeinstantly;
	}
	
	/*
	 * resets the shutdown sequence in client
	 */
	public static String getAbortshutdown(){
		return abortshutdown;
	}
	
	

}