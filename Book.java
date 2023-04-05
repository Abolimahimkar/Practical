package Inheritance;


class Book{
  public static void main(String[] args) {
    Author auther = new Author("Micheal", 32, "USA");
    Publisher publisher = new Publisher("Sun Publication","ABC-1110", "London");
    Book b = new Book("core java", 800, auther, publisher);
    System.out.println("Book Name: "+b.name);
    System.out.println("Book Price: "+b.price);
    System.out.println("------------Author Details----------");
    System.out.println("Auther Name: "+b.auther.AuthorName);
    System.out.println("Auther Age: "+b.auther.Age);
    System.out.println("Auther place: "+b.auther.Place);
    System.out.println("------------Publisher Details-------");
    System.out.println("Publisher Name: "+b.publisher.name);
    System.out.println("Publisher ID: "+b.publisher.publisherID);
    System.out.println("Publisher City: "+b.publisher.city);
  }
  
}

  


