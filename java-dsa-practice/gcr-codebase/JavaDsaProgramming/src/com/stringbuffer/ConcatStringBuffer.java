package com.stringbuffer;



public class ConcatStringBuffer 
{
    public static String concat(String[] arr) {
        StringBuffer sb = new StringBuffer();
        for (String s : arr) {
            sb.append(s);
        }
        return sb.toString();
    }
}
