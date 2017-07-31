package tr.org.kamp.linux.threadexample;

public class ThreadExample {
	public static void main(String[] args) {
		boolean shouldRun = true;
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				try {
					Thread.sleep(1500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("0 çalıştı.");
				
			}
		}).start();
		
		while(shouldRun) {
			System.out.println("1 çalisti");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
		System.out.println("2 çalıştı.");
		System.out.println("3 çalıştı.");
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub,
				try {
					Thread.sleep(750);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("4 çalıştı.");
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("5 çalıştı.");
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("6 çalıştı.");
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("7 çalıştı.");
			}
		}).start();
	}

}
