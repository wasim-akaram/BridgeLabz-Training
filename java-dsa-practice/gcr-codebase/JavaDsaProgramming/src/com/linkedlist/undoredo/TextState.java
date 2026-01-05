package com.linkedlist.undoredo;



class TextState 
{
	
	
    String content;
    TextState next;
    TextState prev;
    

    TextState(String content) 
    {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}
