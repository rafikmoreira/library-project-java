package utils;

import java.util.Scanner;

public class Menu {

  public static int showMenu(String[] options, Scanner scanner) {

    for (int i = 0; i < options.length; i++) {
      System.out.println((i + 1) + ". " + options[i]);
    }

    int option = scanner.nextInt();

    if (option < 1 || option > options.length) {
      System.out.println("Invalid option. Please try again.");
      scanner.nextLine();
      return showMenu(options, scanner);
    }

    return option;
  }

}
