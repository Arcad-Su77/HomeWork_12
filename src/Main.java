import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание \"Классы\"");
        // Инициализация и Ввод данных
        Scanner sc = new Scanner(System.in);
            System.out.print("Название книги: ");
                String inNameBook = sc.nextLine();
            System.out.print("Год издания книги: ");
                String inYearPublication = sc.nextLine();
            System.out.print("Фамилия автора: ");
                String inNameLast = sc.nextLine();
            System.out.print("Имя автора: ");
                String inName = sc.nextLine();
            System.out.print("Отчество автора: ");
                String inNameMidle = sc.nextLine();
        sc.close();

        // Решение
        Author author = new Author(inName, inNameLast, inNameMidle);
        LibBook book = new LibBook(inNameBook, inYearPublication, author);

        // Вывод
        System.out.println("book.getName() = " + book.getNameBook());
        System.out.println("book.author.getAuthorFIO(Author.FIO_LEFT) = " + book.author.getAuthorFIO(Author.FIO_LEFT));
        System.out.println("book.author.getAuthorFIO(Author.FIO_RIGHT) = " + book.author.getAuthorFIO(Author.FIO_RIGHT));
        System.out.println(book);
        System.out.println(author);

    }
}