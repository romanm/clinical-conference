package edu.probe1;

public class JavaRunCommandExample {
    public static void main(String[] args) {

	Runtime r = Runtime.getRuntime();
	Process p = null;
	// String cmd[] = { "/bin/sh", "ls", "-l" };
	String cmd[] = { "gvim" };

	System.out.println("----------------" + r);
	try {
	    System.out.println("----------------2");
	    p = r.exec(cmd);
	    System.out.println("----------------3" + p);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
