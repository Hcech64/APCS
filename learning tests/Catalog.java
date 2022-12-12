public class Catalog {

  public static void main(String[] args) {

    Text book1 = new Book();
    Text book2 = new Book("The Hobbit", "Tolkien", 2006, "Harper Collins");
    Book book3 = new Book("Democracy in America", "Tocqueville", 2003, "Penguin");
    Article art = new Article ("Is tyler smexy?", "Obama", 2022, "Sussypublisher");
    Website web = new Website ("https://www.youtube.com/watch?v=dQw4w9WgXcQ");

    System.out.println(book1);
    System.out.println(book2);
    System.out.println(book3);
    System.out.println(art);
    System.out.println(web);

    


  }
}
