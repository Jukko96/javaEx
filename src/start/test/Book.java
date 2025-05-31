package start.test;

public class Book {
    String title;
    String author;
    int page;
    Book(){
//        this.title = "";
//        this.author = "";
//        this.page = 0;
        this("","",0);
    }
    Book(String title, String author){
        this.title = title;
        this.author = author;
        this.page = 0;
    }
    Book(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }
    void displayInfo(){
        System.out.println("제목: "+this.title+" 저자: "+ this.author + " 페이지:"+ this.page);
    }

}
