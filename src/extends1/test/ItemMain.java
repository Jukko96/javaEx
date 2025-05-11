package extends1.test;

public class ItemMain {
    public static void main(String[] args) {
        Book book = new Book("JAVA", 1000, "author", 100);
        Album album = new Album("앨범1", 20000, "아티스트");
        Movie movie = new Movie("영화1", 30000, "감독", "배우");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 가격의 합 = "+sum);
    }
}
