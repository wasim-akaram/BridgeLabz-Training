package com.linkedlist.socialmediafriendconnection;


class SocialMedia {

    private UserNode head;

    // Add a new user
    public void addUser(int id, String name, int age) {
        UserNode newUser = new UserNode(id, name, age);
        newUser.next = head;
        head = newUser;
    }

    // Search user by ID
    private UserNode findUserById(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // Search user by Name
    public void searchUserByName(String name) {
        UserNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                displayUser(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("User not found");
    }

    // Search user by ID
    public void searchUserById(int id) {
        UserNode user = findUserById(id);
        if (user == null)
            System.out.println("User not found");
        else
            displayUser(user);
    }

    // Add friend connection (bidirectional)
    public void addFriendConnection(int userId1, int userId2) {
        UserNode u1 = findUserById(userId1);
        UserNode u2 = findUserById(userId2);

        if (u1 == null || u2 == null) {
            System.out.println("One or both users not found");
            return;
        }

        addFriend(u1, userId2);
        addFriend(u2, userId1);

        System.out.println("Friend connection added");
    }

    private void addFriend(UserNode user, int friendId) {
        FriendNode newFriend = new FriendNode(friendId);
        newFriend.next = user.friendHead;
        user.friendHead = newFriend;
    }

    // Remove friend connection (bidirectional)
    public void removeFriendConnection(int userId1, int userId2) {
        UserNode u1 = findUserById(userId1);
        UserNode u2 = findUserById(userId2);

        if (u1 == null || u2 == null) {
            System.out.println("One or both users not found");
            return;
        }

        removeFriend(u1, userId2);
        removeFriend(u2, userId1);

        System.out.println("Friend connection removed");
    }

    private void removeFriend(UserNode user, int friendId) {
        FriendNode curr = user.friendHead;
        FriendNode prev = null;

        while (curr != null && curr.friendId != friendId) {
            prev = curr;
            curr = curr.next;
        }

        if (curr == null) return;

        if (prev == null)
            user.friendHead = curr.next;
        else
            prev.next = curr.next;

        curr.next = null;
    }

    // Display all friends of a user
    public void displayFriends(int userId) {
        UserNode user = findUserById(userId);

        if (user == null) {
            System.out.println("User not found");
            return;
        }

        System.out.println("Friends of " + user.name + ":");
        FriendNode temp = user.friendHead;

        if (temp == null) {
            System.out.println("No friends");
            return;
        }

        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Count number of friends for each user
    public void countFriends() {
        UserNode temp = head;

        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friendHead;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends");
            temp = temp.next;
        }
    }

    // Find mutual friends
    public void findMutualFriends(int userId1, int userId2) {
        UserNode u1 = findUserById(userId1);
        UserNode u2 = findUserById(userId2);

        if (u1 == null || u2 == null) {
            System.out.println("One or both users not found");
            return;
        }

        System.out.println("Mutual friends between " + u1.name + " and " + u2.name + ":");

        FriendNode f1 = u1.friendHead;
        boolean found = false;

        while (f1 != null) {
            FriendNode f2 = u2.friendHead;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.print(f1.friendId + " ");
                    found = true;
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }

        if (!found)
            System.out.println("None");
        else
            System.out.println();
    }

    // Helper method
    private void displayUser(UserNode u) {
        
        System.out.println("User ID : " + u.userId);
        System.out.println("Name    : " + u.name);
        System.out.println("Age     : " + u.age);
    }
}
