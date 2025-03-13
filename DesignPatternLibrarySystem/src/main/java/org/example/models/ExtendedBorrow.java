package org.example.models;

public class ExtendedBorrow extends Borrowable{
    public ExtendedBorrow(Book book) {
        super(book);
    }

    public void extend() {
        System.out.println("⏳ Mượn sách " + book.title + " đã được gia hạn!");
    }
}
