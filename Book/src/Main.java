//I denna uppgift ska vi skapa ett enkelt bokningssystem för ett bibliotek. Vi ska börja med att skapa en klass som heter Book. Varje bok ska ha:
//
//Ett namn
//En författare
//Ett år
//En upplaga
//Status: tillgänglig eller inte
//Dessutom ska klassen Book ha:
//Status ska vara tillgänglig by default när en bok skapas.
//En metod loan som kollar om en bok går att låna eller inte (dvs tillgänglig eller inte) och göra följande:
// Om boken är tillgänglig, då ska bokens status ändras till otillgänglig och metoden ska returnera true. Annars returnera false
//En metod returnBook som gör motsatsen till loan.
//En toString metod som returnerar en sträng med bokinformationen.
//Skriv en Main funktion som kör ditt program://
//Programmet skriver ut en meny först:
//Add a book to the library
//Search for a book by name
//List all available books
//Return a book
//        Quit
//Hur programmet ska bete sig får du hitta på själv. Tänk på följande:
//
//I alternativ 2, om den boken som man söker efter finns, då ska steget efter vara att fråga användaren om den vill låna boken eller inte och fortsätta beroende på vad användaren matar in.
//Gör strängen som toString-metoden returnerar omfattande och presenterar informationen om boken på ett tydligt sätt.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> bookArrayList = new ArrayList<>();
        System.out.println("Greetings! What do you want?");
       boolean menu = true;
        do {
            System.out.println("1. Add a book to the library");
            System.out.println("2. Search for a book by name");
            System.out.println("3. List all available books");
            System.out.println("4. Return a book");
            System.out.println("5. Quit");
            int a = sc.nextInt();
            sc.nextLine();
            switch (a) {
                case 1:
                    Book book = new Book();
                    System.out.println("Title?");
                    book.setName(sc.nextLine());
                    System.out.println("Author?");
                    book.setAuthor(sc.nextLine());
                    System.out.println("Year?");
                    book.setYear(sc.nextLine());
                    System.out.println("Edit?");
                    book.setEdit(sc.nextLine());
                    bookArrayList.add(book);
                    System.out.println("Thank you! You've added the book " + book.toString());
                    // System.out.println(bookArrayList.toString());
                    break;
                case 2:
                    System.out.println("What do you want to find?");// Search for a book by name, doesnt go in i loop
                    String search = sc.nextLine();
                    System.out.println(bookArrayList.toString());
                    for (int i = 0; i < bookArrayList.size(); i++) {
                        System.out.println("bro");
                        if (bookArrayList.get(i).getName() == search) {
                            System.out.println("I found it!" + bookArrayList.get(i).toString()); // funkar inte
                        } else {
                            System.out.println("found nothin sir");
                        }
                    }
                    break;
                case 3:
                    System.out.println(bookArrayList.toString());
                    break;
                case 4:
                    System.out.println("Which book would you like to return?");
                    String returnBook = sc.nextLine();
                    for (Book book1 : bookArrayList) {
                        if (book1.getName() == returnBook) {
                            book1.returnBook(book1);
                            System.out.println("You've returned " + returnBook);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Come again!");
                    menu = false;
                    break;
            }
        }   while (menu == true);
    }
}