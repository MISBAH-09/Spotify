package LibrarySystem;

public class Magzines extends Libraryitem{
    private int issuenumber;
    Magzines(String title, String author, int year,int Id, boolean isBorrowed, LibraryItemType itemType,int issuenumber){
        super(title,author,year,Id,isBorrowed,itemType);
        this.issuenumber=issuenumber;
    }

    public int getIssuenumber() {
        return issuenumber;
    }

    public void setIssuenumber(int issuenumber) {
        this.issuenumber = issuenumber;
    }
}
