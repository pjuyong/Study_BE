package nested.test.ex1;

public class Library {
    private int bookCount;
    private Book[] books;

    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }

    private static class Book {
        public String title;
        public String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }

    public void addBook(String title, String author) {
        if(books.length > bookCount) {
            books[bookCount] = new Book(title, author);
            bookCount++;
        } else {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 == ");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("도서 제목 : " + books[i].title + ", 저자 : " + books[i].author);
        }
    }
}
