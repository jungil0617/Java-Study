package construct.ex;

public class Book {
    String title;
    String author;
    int page = 0;

    // 기본
    Book() {
        this("", "", 0);
    }

    // 제목, 저자
    Book(String title, String author) {
        this(title, author, 0);
    }

    // 제목, 저자, 페이지
    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo() {
        System.out.println("제목 : " + title + " 저자 : " + author + " 페이지 : " + page);
    }
}
