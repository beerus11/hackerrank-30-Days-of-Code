//Write MyBook Class
class MyBook extends Book
    {
    int price;
    MyBook(String t , String a , int p)
        {
        super(t,a);
        this.price =p;
    }
    void display()
        {
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}
