package ctrlstmt.loops;
import java.util.Scanner;
/*
Q. (Airline Reservations System)
A small airline has just purchased a computer for its new
automated reservations system. You’ve been asked to develop the
new system. You’re to write an application to assign seats on
each flight of the airline’s only plane (capacity: 10 seats).
Your application should display the following alternatives:
Please type 1 for First Class and Please type 2 for Economy.
If the user types 1, your application should assign a seat in
the firstclass section (seats 1–5). If the user types 2, your
application should assign a seat in the economy section (seats
6–10). Your application should then display a boarding pass
indicating the person’s seat number and whether it’s in the
first-class or economy section of the plane.
Use a one-dimensional array of primitive type boolean to
represent the seating chart of the plane. Initialize all the
elements of the array to false to indicate that all the seats
are empty. As each seat is assigned, set the corresponding
element of the array to true to indicate that the seat is
no longer available.
Your application should never assign a seat that has already
been assigned. When the economy section is full, your
application should ask the person if it’s acceptable to be
placed in the first-class section (and vice versa). If yes, make
the appropriate seat assignment. If no, display the message
"Next flight leaves in 3 hours."
 */

public class Example12 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        boolean seat[] = new boolean[10];

        try {
            while (true) {
                System.out.println("please type 1 for First Class");
                System.out.println("please type 2 for economy");
                System.out.print("choice : ");
                int inputValue = input.nextInt();
                if (inputValue == 1) {
                    if (!assignSeatsForPlane(seat, 0, 4)) {
                        if (takeConfirmationInputFromUser("firstClass")) {
                            if (!assignSeatsForPlane(seat, 5, 9)) {
                                System.out.println("Next flight leaves in 3 hours.");
                                break;
                            }
                        }
                    }
                } else if (inputValue == 2) {
                    if (!assignSeatsForPlane(seat, 5, 9)) {
                        if (takeConfirmationInputFromUser("economy")) {
                            if (!assignSeatsForPlane(seat, 0, 4)) {
                                System.out.println("Next flight leaves in 3 hours.");
                                break;
                            }
                        }
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);

        } finally {
            input.close();
        }
    }

    private static boolean assignSeatsForPlane(boolean seats[], int startIndex, int endIndex) {
        while (startIndex <= endIndex) {
            if (seats[startIndex] == false) {
                seats[startIndex] = true;
                return true;
            }
            startIndex++;
        }
        return false;
    }

    private static boolean takeConfirmationInputFromUser(String name) {
        if (name == "firstClass") {
            System.out.println("it’s acceptable to be placed in the economy-class section");
        } else {
            System.out.println("it’s acceptable to be placed in the first-class section");
        }
        System.out.println("please type 1 for Yes");
        System.out.println("please type 2 for No");
        int choice = input.nextInt();
        if (choice == 1) {
            return true;
        } else {
            return false;
        }

    }
}
