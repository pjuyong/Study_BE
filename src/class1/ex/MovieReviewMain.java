package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        MovieReview movieReview2 = new MovieReview();

        movieReview1.title = "inception";
        movieReview1.review = "life is forever!";

        movieReview2.title = "about time";
        movieReview2.review = "life time moview!";

        MovieReview[] mr = {movieReview1, movieReview2};

        for (int i = 0; i < mr.length; i++) {
            System.out.println("Moview Title : " + mr[i].title + "\nReview : " + mr[i].review + "\n");
        }

        for (MovieReview movieReviews : mr) {
            System.out.println("Moview Title : " + movieReviews.title + "\nReview : " + movieReviews.review + "\n");
        }

    }
}
