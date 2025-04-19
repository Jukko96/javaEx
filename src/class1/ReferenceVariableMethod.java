package class1;

import test.MovieReview;

public class ReferenceVariableMethod {
    public static void main(String[] args) {
        MovieReview 인셉션 = createReview("인셉션", "인셉션 리뷰!");
        MovieReview aboutTime = createReview("어바웃 타임", "어바웃 타임 리뷰!");
        MovieReview[] reviews = {인셉션,aboutTime};

        //단축키 **iter**
        for(MovieReview review : reviews ){
            System.out.println("영화명 :" + review.title + " 리뷰:"+review.review+" 메모리 주소 :"+review);
        }

    }
    public static MovieReview createReview (String title, String review){
        MovieReview newReview = new MovieReview();
        newReview.title = title;
        newReview.review = review;
        System.out.println(newReview.title + " 메모리 주소 값: " + newReview);
        return newReview;
    }
}
