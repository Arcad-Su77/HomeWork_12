import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание \"Классы\"");
        // Инициализация и Ввод данных
        Scanner sc = new Scanner(System.in);
        System.out.print("Название книги: ");
        String inNameBook = sc.nextLine();
        System.out.print("Имя автора: ");
        String inNameFerst = sc.nextLine();
        System.out.print("Фамилия автора: ");
        String inNameLast = sc.nextLine();
        sc.close();

        // Решение
        Author author = new Author(inNameFerst, inNameLast);
        LibBook book = new LibBook(inNameBook, author);

        // Вывод
        System.out.println("book.getName() = " + book.getNameBook());
        System.out.println("book.author.getAuthorNameFerst() = " + book.author.getAuthorNameFerst());
        System.out.println("book.author.getAuthorNameLast() = " + book.author.getAuthorNameLast());
        System.out.println("author.getAuthorNameLast() = " + author.getAuthorNameLast());
    }
}