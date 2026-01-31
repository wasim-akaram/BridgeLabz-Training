package com.javaStreams.pipedStream;
import java.io.IOException;
import java.io.PipedOutputStream;

class Writer implements Runnable 
{

    private PipedOutputStream pipeout;

    public Writer(PipedOutputStream pipeout) 
    {
        this.pipeout = pipeout;
    }

    @Override
    public void run() 
    {
        try 
        {
            String message = "Hello from Writer Thread";
            pipeout.write(message.getBytes());
            pipeout.close();
        }
        catch (IOException e) 
        {
            System.out.println("Writer error: " + e.getMessage());
        }
    }
}
