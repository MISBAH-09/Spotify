package LibrarySystem;

public class Libraryitem {
    private String title;
    private String author;
    private int year;
    private int Id;
    private boolean isBorrowed;
    LibraryItemType itemType;
    public int counter = 1;

    public Libraryitem(String title, String author, int year,int Id, boolean isBorrowed, LibraryItemType itemType) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.Id=Id;
        this.isBorrowed = isBorrowed;
        this.itemType = itemType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public LibraryItemType getItemType() {
        return itemType;
    }

    public void setItemType(LibraryItemType itemType) {
        this.itemType = itemType;
    }

//    public void displayItems(Library lib) {
//        for (int k = 0; k < counter; k++) {
//            System.out.println(lib[k]);
//        }
//    }


//    public boolean equals(Object obj) {
//        Library temp=(Library) obj;
//        return title.equals(temp.Id)&&author.equals(temp.Id);
//    }
//    public void displayborowItems(Library[]){
//        for(int i =1;i<10; i++){
//            if (Library[i].isborrowe== true) {
//                System.out.println(Library[i]);
//            }
//        }
//
//    }

}
