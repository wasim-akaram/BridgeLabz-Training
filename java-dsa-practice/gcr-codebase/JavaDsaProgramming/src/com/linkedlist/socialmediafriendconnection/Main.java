package com.linkedlist.socialmediafriendconnection;



public class Main 
{

    public static void main(String[] args) 
    {

        SocialMedia app = new SocialMedia();

        app.addUser(1, "Wasim", 22);
        app.addUser(2, "Akaram", 23);
        app.addUser(3, "Rahul", 21);
        app.addUser(4, "Neha", 20);

        app.addFriendConnection(1, 2);
        app.addFriendConnection(1, 3);
        app.addFriendConnection(2, 3);
        app.addFriendConnection(2, 4);

        app.displayFriends(1);
        app.displayFriends(2);

        app.findMutualFriends(1, 2);

        app.searchUserByName("Neha");
        app.searchUserById(3);

        app.countFriends();

        app.removeFriendConnection(1, 3);
        app.displayFriends(1);
    }
}
