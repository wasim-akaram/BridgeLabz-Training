package com.stringbuffer;

public class ComparisionStringBufferAndStringBuilder {

	public static void main(String[] args) 
	{
        int n = 1_000_000;

        long start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append("hello");
        long sbTime = System.nanoTime() - start;

        start = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < n; i++) sbuf.append("hello");
        long sbufTime = System.nanoTime() - start;

        System.out.println("StringBuilder Time: " + sbTime);
        System.out.println("StringBuffer Time: " + sbufTime);
    }
}
