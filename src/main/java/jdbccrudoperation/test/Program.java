package jdbccrudoperation.test;
import java.util.List;
import java.util.Scanner;
import jdbccrudoperation.dao.BookDao;
import jdbccrudoperation.pojo.Book;

public class Program {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        while ((choice = Program.menuList()) != 0) {
            switch (choice) {
                case 1:
                    try (BookDao dao = new BookDao()) {
                        int count = dao.insert(new Book(119, "yuo", "PQR", "XYZ", 1000));
                        System.out.println(count + " " + "record inserted");
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    break;
                case 2:
                    try (BookDao dao = new BookDao()) {
                        System.out.println("Enter Book Id :");
                        int bookId = sc.nextInt();
                        int count = dao.delete(bookId);
                        System.out.println(count + " " + "record deleted");
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    break;
                case 3:
                    try (BookDao dao = new BookDao()) {
                        System.out.println("Enter Book Id :");
                        int bookId = sc.nextInt();
                        System.out.println("Enter Price :");
                        int price = sc.nextInt();
                        int count = dao.update(bookId, price);
                        System.out.println(count + " " + "record updated");
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    break;
                case 4:
                    try (BookDao dao = new BookDao()) {
                        List<Book> books = dao.getBooks();
                        books.forEach(System.out::println);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    break;
            }
        }
    }
    private static int menuList() {
        System.out.println("0.Exit");
        System.out.println("1.Insert");
        System.out.println("2.Delete");
        System.out.println("3.Update");
        System.out.println("4.Select");
        System.out.println("Enter choice :");
        return sc.nextInt();
    }
}
