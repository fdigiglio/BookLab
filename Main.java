class Main {
    public static void main(String[] args) {
      /*
      INSTRUCTIONS
  
      REQUIRED FOR ALL LEVELS
      - Create at 4 different book objects, 2 using each constructor.
      - Give each book at least 5 ratings using the addRatings method (ratings should be between 0 and 5 stars)
      - Print out all the information for each book in a neatly formatted manner
      - Add comments to your code describing what is happening
      
      REQUIRED FOR MEETS EXPECTATIONS
      - All the stuff above, plus:
          - Instead of selecting ratings, use Math.random to assign random ratings to books (still between 0 and 5)
  
      REQUIRED FOR EXCEEDS EXPECTATIONS
      - All the stuff above, plus:
          - Using ONLY the methods in Book and the String methods substring and length, calculate and print the following data about your book objects:
            - The total pages in all of your books combined (Check)
            - The total number of characters (letters, symbols, and spaces) in all the book titles combined (Check)
            - The first letter of each author's name, concatenated together (Check)
            - The last letter of each book's title, concatenated together (Check)
            - The average rating of all the books' average ratings (Check)
          - Comment your new code
          - Ensure your output is neatly formatted
      */

        


        //Book Creation
        //Uses default constructor
        Book harryPotter = new Book();
        Book percyJackson = new Book();
      

        //Uses second constructor
        Book catcherInTheRye = new Book("Catcher in the Rye", "J.D Salinger", 196, 3.8, 5);
        Book catch22 = new Book("Catch-22", "Joseph Heller", 116, 4.0, 5);
  
        //Add stars; Grabs the total rating and divides by the rating count and sets a knew avg rating
        harryPotter.addRating(4);
        percyJackson.addRating(5);
        catcherInTheRye.addRating(4);
        catch22.addRating(4);

        //Random var and goes from zero to 5 and then rounds the rating down to whole number
        double getRandom = Math.floor(Math.random() * 6);
        
        //add stars randomly
        harryPotter.addRating(getRandom);
        percyJackson.addRating(getRandom);
        catcherInTheRye.addRating(getRandom);
        catch22.addRating(getRandom);

        System.out.println(harryPotter.getRating());
        System.out.println(percyJackson.getRating());
        System.out.println(catcherInTheRye.getRating());
        System.out.println(catch22.getRating());

        //Get the page numbers of each book and add up
        int harryPotterPages = harryPotter.getPages();
        int percyJacksonPages = percyJackson.getPages();
        int catcherInTheRyePages = catcherInTheRye.getPages();
        int catch22Pages = catch22.getPages();

        int totalPages = harryPotterPages + percyJacksonPages + catcherInTheRyePages + catch22Pages;
        System.out.println("The total page number is: " + totalPages);


        //Get length of each books titles and add up
        int harryPotterTitleLength = harryPotter.getTitleLength();
        int percyJacksonTitleLength = percyJackson.getTitleLength();
        int catcherInTheRyeTitleLength = catcherInTheRye.getTitleLength();
        int catch22TitleLength = catch22.getTitleLength();

        int totalTitleLength = harryPotterTitleLength + percyJacksonTitleLength + catcherInTheRyeTitleLength + catch22TitleLength; 
        System.out.println("The total title length in character is: " + totalTitleLength);


        //Get first letter of each books author and concat
        String harryPotterAuthor = harryPotter.getFirstLetterAuthor();
        String percyJacksonAuthor = percyJackson.getFirstLetterAuthor();
        String catcherInTheRyeAuthor = catcherInTheRye.getFirstLetterAuthor();
        String catch22Author = catch22.getFirstLetterAuthor();

        System.out.println("First Letter of each author: " + harryPotterAuthor + percyJacksonAuthor + catcherInTheRyeAuthor + catch22Author);

        //Uses method made in book.java to grab last letter of title
        String harryPotterTitleLastLetter = harryPotter.lastLetterTitle();
        String percyJacksonTitleLastLetter = percyJackson.lastLetterTitle();
        String catcherInTheRyeTitleLastLetter = catcherInTheRye.lastLetterTitle();
        String catch22TitleLastLetter = catch22.lastLetterTitle();

        String totalLastTitleLetter =harryPotterTitleLastLetter  + percyJacksonTitleLastLetter + catcherInTheRyeTitleLastLetter + catch22TitleLastLetter;
        System.out.println(totalLastTitleLetter);

        //Grab rating of each book and average it out
        double harryPotterRating = harryPotter.getRating();
        double percyJacksonRating = percyJackson.getRating();
        double catcherInTheRyeRating = catcherInTheRye.getRating();
        double catch22Rating = catch22.getRating();

        double avgOfRating = (harryPotterRating + percyJacksonRating + catcherInTheRyeRating + catch22Rating) / 5;
        System.out.println("The average rating is: " + avgOfRating);

    }
  }