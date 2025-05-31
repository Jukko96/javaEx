package start.test;

public class MovieMain {
    public static void main(String[] args) {

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인셉션리뷰!";


        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review  = "어바웃 타임 리뷰";
        MovieReview[] reviews = {inception,aboutTime};

        //단축키 **iter**
        for(MovieReview review : reviews ){
            System.out.println("영화명 :" + review.title + " 리뷰:"+review.review);
        }

    }
}
