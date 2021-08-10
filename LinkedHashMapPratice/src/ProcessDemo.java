import java.io.IOException;

public class ProcessDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		/*Process iostat = new ProcessBuilder().command("iostat", "-C").inheritIO().start();
		int exitCode = iostat.waitFor();
		System.out.println("exitCode = " + exitCode);
*/		
		
		Process exec = Runtime.getRuntime().exec(new String[] { "iostat", "-C" });
		Thread.sleep(1000000);
		exec.waitFor();
		System.out.println(exec.exitValue());
	}

}
