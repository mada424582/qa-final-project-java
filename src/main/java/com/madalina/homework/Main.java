package com.madalina.homework;

public class Main {
    public static void main(String[] args) {
        UserRepository userr = new UserRepository();
        User user1 = new User("testuser",25);
        AdminUser user2 = new AdminUser("admin", 30, "full_access");
        User user3 = new User("ab", 22);
        User user4 = new User("baduser", -5);

        try { userr.addUser(user1);
        }
        catch (InvalidUserDataException e) {
            System.out.println("Eroare:" + " " + e.getMessage());
        }
        try {userr.addUser(user2);
        }
        catch (InvalidUserDataException e) {
            System.out.println("Eroare: " +" "+ e.getMessage());
        }
        try {userr.addUser(user3);
        }
        catch (InvalidUserDataException e){
            System.out.println("Eroare:" +" " + e.getMessage());
        }
        try {
            userr.addUser(user4);
        }
        catch (InvalidUserDataException e){
            System.out.println("Eroare:" + " " + e.getMessage());
        }
        System.out.println("Utilizatori adaugati cu succes:");
        for (User u: userr.getUsers()){
            System.out.println(u);
        }
    }
}