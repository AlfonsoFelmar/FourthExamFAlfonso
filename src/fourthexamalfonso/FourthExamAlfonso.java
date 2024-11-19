package fourthexamalfonso;
import java.util.Scanner;
import java.util.Set;


public class FourthExamAlfonso {

    public static void main(String[] args) {
        Graph graph = new Graph();
        Scanner scn = new Scanner(System.in);

        System.out.println("Social Network System:");
        System.out.println("1. Add User");
        System.out.println("2. Add Friendship");
        System.out.println("3. Display Friends");
        System.out.println("4. Get Recommended Friends");
        System.out.println("5. Exit");

        while (true) {
            System.out.print("\nEnter your choice: ");
            int choice = scn.nextInt();
            scn.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the user to add: ");
                    String user = scn.nextLine();
                    graph.addUser(user);
                    System.out.println("User " + user + " added.");
                    break;

                case 2:
                    System.out.print("Enter the name of the first user: ");
                    String user1 = scn.nextLine();
                    System.out.print("Enter the name of the second user: ");
                    String user2 = scn.nextLine();
                    graph.addFriend(user1, user2);
                    System.out.println("Friendship added between " + user1 + " and " + user2 + ".");
                    break;

                case 3:
                    System.out.println("Displaying all users and their friends:");
                    graph.displayFriends();
                    break;

                case 4:
                    System.out.print("Enter the name of the user to get recommendations for: ");
                    String targetUser = scn.nextLine();
                    Set<String> recommendedFriends = graph.getRecommendedFriends(targetUser);
                    if (recommendedFriends.isEmpty()) {
                        System.out.println("No recommended friends for " + targetUser + ".");
                    } else {
                        System.out.println("Recommended friends for " + targetUser + ": " + recommendedFriends);
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scn.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
