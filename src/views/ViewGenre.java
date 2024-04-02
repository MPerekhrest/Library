package views;

import models.Genre;
import utils.Validator;

import java.util.Scanner;

public class ViewGenre {
    String title;

    Genre genre;
    String name;
    String description;

    Scanner scanner;

  public ViewGenre( Genre genre) {
      this.genre = genre;
  }

    public boolean getInputs() {
        scanner = new Scanner(System.in);
        title = "Please, create new genre:";
        System.out.println(title);
        title = "Input name of genre:";
        System.out.println(title);
        name = Validator.validateName(scanner);
        genre.setName(name);

        title = "Input description of genre: ";
        System.out.println(title);
        description = Validator.validateDescription(scanner);
        genre.setDescription(description);

        title = "If you want add genre - continue writing, click 'y' ";
        System.out.println(title);

        String answer = scanner.nextLine().trim();

        return answer.equals("y");

//        scanner.close();
    }
}
