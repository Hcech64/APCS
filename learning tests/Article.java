public class Article extends Text{

  public String periodical;

  public Article() {

  }

  public Article(String t, String a, int y, String p) {
    title = t;
    author = a;
    year = y;
    periodical = p;

  }

  public String toString() {
    return author + ", " + title + ", " + year + ", " + periodical;
  }

}
