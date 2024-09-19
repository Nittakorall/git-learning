//I denna uppgift ska vi skapa ett enkelt bokningssystem för ett bibliotek. Vi ska börja med att skapa en klass som heter Book. Varje bok ska ha:
//
//+Ett namn
//+En författare
//+Ett år
//+En upplaga
//+Status: tillgänglig eller inte
//+Dessutom ska klassen Book ha:
//+Status ska vara tillgänglig by default när en bok skapas.
//+En metod loan som kollar om en bok går att låna eller inte (dvs tillgänglig eller inte) och göra följande:
// +Om boken är tillgänglig, då ska bokens status ändras till otillgänglig och metoden ska returnera true. Annars returnera false
//+En metod returnBook som gör motsatsen till loan.
//+En toString metod som returnerar en sträng med bokinformationen.
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

public class Book {
    private String name;
    private String author;
    private String year;
    private String edit;
    private boolean avaliability;

    public Book(String edit, String year, String author, String name) {
        this.edit = edit;
        this.year = year;
        this.author = author;
        this.name = name;
        this.avaliability = true;
    }
    public Book() {
        this.edit = "n/a";
        this.year = "n/a";
        this.author = "n/a";
        this.name = "n/a";
        this.avaliability = true;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getEdit() {
        return edit;
    }

    public void setEdit(String edit) {
        this.edit = edit;
    }

    public String Loan(Book book) {
        if (book.avaliability == true) {
            book.avaliability = false;
            return "Book is available for loan and you've loaned it";
        } else if (book.avaliability == false) {
            return "Book is already loaned";
        } else {
            return "Missing information";
        }
    }

    public String returnBook(Book book) {
        if (book.avaliability == true) {

            return "Book is already returned";
        } else if (book.avaliability == false) {
            book.avaliability = true;
            return "Thank you for returning the book";
        } else {
            return "Somethin' went wrong, bro";
        }
    }

    @Override
    public String toString() {
        if (this.avaliability) {
        return
                "Title: " +name + "Author: " + author + "Year: " + year + "Loaned: no";}
        else {
            return
                    "Title: " +name + "Author: " + author + "Year: " + year + "Loaned: yes";}
        }
    }


