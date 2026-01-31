package com.javaStreams.pipedStream;

import java.io.IOException;
import java.io.PipedInputStream;

class Reader implements Runnable 
{

    private PipedInputStream pipedin;

    public Reader(PipedInputStream pipedin) 
    {
        this.pipedin = pipedin;
    }

    @Override
    public void run() 
    {
        try 
        {
            int data;
            while ((data = pipedin.read()) != -1) 
            {
                System.out.print((char) data);
            }
            pipedin.close();
        } 
        catch (IOException e) 
        {
            System.out.println("Reader error: " + e.getMessage());
        }
    }
}