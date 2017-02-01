 class MyBook extends Book{
    String title;
    String author;
    int price;
    MyBook(String title, String author, int price){
        super(title, author);
        this.price = price;
    }
    protected void display(){
        System.out.println("Title: " + super.title);
        System.out.println("Author: " + super.author);
        System.out.println("Price: " + price);
    }
    
}