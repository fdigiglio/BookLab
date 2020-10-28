public class Book {
    private String title;
    private String author;
    private int numPages;
    private double avgRating;
    private int ratingCount;
    
    /*
    *Creates a book with default values
    */
    public Book(){
        title = "Something";
        author = "Anonymous";
        numPages = 1000;
        avgRating = 1.0;
        ratingCount = 1;
    }
    
    /*
    *Creates a book with the given values
    *@param bTitle - title of the book
    *@param bAuthor - author of the book
    *@param pages - how many pages are in the book
    *@param bRating - the book's average rating, out of 5 stars
    *@param rCount - how many ratings the book has
    */
    public Book(String bTitle, String bAuthor, int pages, double bRating, int rCount) {
        title = bTitle;
        author = bAuthor;
        numPages = pages;
        avgRating = bRating;
        ratingCount = rCount;
    }
    
    /*
    *@return the author of this book as a String
    */
    public String getAuthor() {
        return author;
    }
    
    /*
    *@return the title of this book as a String
    */
    public String getTitle() {
        return title;
    }
        
    /*
    *@return the pages of this book as an int
    */
    public int getPages() {
        return numPages;
    }
    
    /*
    *@return the rating of this book as a double
    */
    public double getRating() {
        return Math.ceil(avgRating);
    }

    /*
    *adds a rating of this book 
    *and calculates a new average rating
    *@param stars, the rating to be added to the book, *possible values are from 0 - 5
    */
    public void addRating(double stars){
        //calculate total of all ratings
        double total= avgRating * ratingCount;
        //increase number of ratings to include this new one
        ratingCount++;
        //add this rating to the total of all ratings
        total += stars;
        //recalculate average
        avgRating = total / ratingCount;
    }

    public int getTitleLength(){
        int titleLength = title.length();
        return titleLength;
    }

    public String getFirstLetterAuthor(){
        return author.substring(0, 1);
    }

    public String lastLetterTitle(){
        int titleLength = title.length();
        return title.substring(titleLength - 1);
    }
    
}