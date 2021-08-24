package chapter14;

public class NoGeneric {
	Object[] v;

	  void set(Object[] n) {
	      v = n;
	  }

	  Object[] get() {
	      return v;
	  }

	  void print() {
	      for(Object o : v) {
	          System.out.print(o + " ");
	      }
	      System.out.println();
	  }
	}