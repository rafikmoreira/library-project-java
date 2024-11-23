
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Author;
import model.Book;
import model.Client;
import utils.Menu;

public class LibraryApp {
  public static void main(String[] args) {
    System.out.println("Welcome to the Library!");
    Scanner scanner = new Scanner(System.in);
    List<Author> authors = new ArrayList<>();
    List<Client> clients = new ArrayList<>();
    List<Book> books = new ArrayList<>();

    String[] initialOptions = {
        "Add author",
        "Add client",
        "Add book",
        "List authors",
        "List clients",
        "List books",
        "Exit"
    };

    while (true) {
      int option = Menu.showMenu(initialOptions, scanner);
      System.out.println("Choose an option: " + option);
      scanner.nextLine();

      switch (option) {
        case 1 -> {
          System.out.println("Enter author's name:");
          String authorName = scanner.nextLine();
          System.out.println("Enter author's birth date (yyyy-mm-dd):");
          LocalDate authorBirthDate = LocalDate.parse(scanner.nextLine());
          addAuthor(authors, authorName, authorBirthDate);
        }
        case 2 -> {
          System.out.println("Enter client's name:");
          String clientName = scanner.nextLine();
          System.out.println("Enter client's birth date (yyyy-mm-dd):");
          LocalDate clientBirthDate = LocalDate.parse(scanner.nextLine());
          addClient(clients, clientName, clientBirthDate);
        }
        case 3 -> listBooks(books);
        case 4 -> listAuthors(authors);
        case 5 -> listClients(clients);
        case 6 -> {
          System.out.println("Goodbye!");
          scanner.close();
          System.exit(0);
        }
      }
    }

  }

  public static void addAuthor(List<Author> authors, String name, LocalDate birthDate) {
    Author author = new Author(name, birthDate);
    authors.add(author);
  }

  public static void addClient(List<Client> clients, String name, LocalDate birthDate) {
    Client client = new Client(name, birthDate);
    clients.add(client);
  }

  public static void addBook(List<Book> books, String title, Author author) {
    Book book = new Book(title, author);
    books.add(book);
  }

  public static void listBooks(List<Book> books) {
    for (Book book : books) {
      System.out.println(book);
    }
  }

  public static void listAuthors(List<Author> authors) {
    for (Author author : authors) {
      System.out
          .println(String.format("ID: %s Name: %s", author.getId(), author.getName()));
    }
  }

  public static void listClients(List<Client> clients) {
    for (Client client : clients) {
      System.out.println(client);
    }
  }

  public static int showMenu(Scanner scanner) {
    System.out.println("1. Add author");
    System.out.println("2. Add client");
    System.out.println("3. Add book");
    System.out.println("4. List authors");
    System.out.println("5. List clients");
    System.out.println("6. List books");
    System.out.println("7. Exit");

    int option = scanner.nextInt();

    return option;
  }
}