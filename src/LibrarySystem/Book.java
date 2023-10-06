package LibrarySystem;

public class Book extends Libraryitem{
    private int pagescount;
    Book(String title, String author, int year,int Id, boolean isBorrowed, LibraryItemType itemType,int pagescount){
        super(title,author,year,Id,isBorrowed,itemType);
        this.pagescount=pagescount;
    }

    public int getPagescount() {
        return pagescount;
    }

    public void setPagescount(int pagescount) {
        this.pagescount = pagescount;
    }
    public void borrowitem(Book b){
        if(b.isBorrowed()==true){
            System.out.println("book is borrowed");
        }else{
            System.out.println("Book is not borrowed");
        }
    }




}
