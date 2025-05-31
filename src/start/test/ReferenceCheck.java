package start.test;

public class ReferenceCheck {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "title1";
        movieReview1.review = "review1";
        MovieReview clone = movieReview1;
        movieReview1 = new MovieReview();
        movieReview1.title = "title2";
        movieReview1.review = "review2";
        System.out.println("clone title : "+clone.title +", clone review :" + clone.review);
        System.out.println("movieReview1 title : "+movieReview1.title +", movieReview1 review :" + movieReview1.review);
    }
}
