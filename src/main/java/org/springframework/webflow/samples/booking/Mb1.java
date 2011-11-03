package org.springframework.webflow.samples.booking;

import java.util.ArrayList;
import java.util.List;

public class Mb1 {
    public Mb1() {
	al = new ArrayList();
	for (int i = 0; i < 50; i++) {
	    al.add(i);
	}
    }

    String a = "b";

    public String getA() {
	return a;
    }

    public void setA(String a) {
	this.a = a;
    }

    List al;

    public List getAl() {
	return al;
    }
}
