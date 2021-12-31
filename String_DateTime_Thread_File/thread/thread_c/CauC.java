package thread_c;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import thread_b.WorkerThread;

public class CauC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca = new Scanner(System.in);
		String s = "";
		int i = 0;
		ExecutorService executor = Executors.newSingleThreadScheduledExecutor();

		while (!(s.equals("stop"))) {
			i++;
			Runnable worker = new WorkerThread(""+i);
            executor.execute(worker);
            s =sca.nextLine();
		}
		executor.shutdown();
	}
}

