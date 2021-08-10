
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
	
	static int migrationDestinationDisconnectRetryCount = 60;
	static int migrationDestinationDisconnectRetryDelay = 5;
	
	static boolean peerReachable = false;
	static int peerReachableAfter = 100;

	public static void main(String[] args) throws Exception {

		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(peerReachableAfter * 1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				peerReachable = true;
			}
		}).start();
		
		Test2 t = new Test2();
		Object obj = t.invoke("getRemoteSyncMode", new Class[] {String.class}, new Object[] {"xyz"});
		System.out.println(obj);

	}
	
	String getRemoteSyncMode(String luName) throws Exception {
		if (peerReachable) {
			return "TARGET";
		} else {
			throw new Exception("Peer is not reachable");
		}
	}

	Object invoke(String methodName, Class[] params, Object[] args) throws Exception {
		Method method = this.getClass().getDeclaredMethod(methodName, params);
        for (int i = 0; i < migrationDestinationDisconnectRetryCount; i++) {
        	try {
    			return method.invoke(this, args);
    		} catch (Exception e) {
				e.printStackTrace();
				Thread.sleep(migrationDestinationDisconnectRetryDelay * 1000);
    		}
		}
		throw new Exception("Error while executing method : " + methodName + " with args: " + Arrays.asList(args));
	}

}
