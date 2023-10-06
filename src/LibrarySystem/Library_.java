package LibrarySystem;

public class Library_ {
    Libraryitem Shelf[]=new Libraryitem[5];
    public void addbook(Libraryitem item){
        System.out.println("add book");
       for(int i=1;i<5;i++){
           if(Shelf[i]==null){
               Shelf[i]=item;
           }
           else{
               System.out.println("shelf is full");
           }

        }
    }
    public void borrowitem(Libraryitem item){
        System.out.println("borrowbook");
        for(int i=1;i<5;i++){
            if(Shelf[i]==null){
                if(Shelf[i].isBorrowed()==true){
                    System.out.println(Shelf[i]);
                }
            }


        }
    }
    public void displayAvailableitems(){
        for(int i=1;i<5;i++){
            System.out.println(Shelf[i]);
        }
    }
    public void Borrweditem(){
        for(int i=1;i<5;i++){
            if(Shelf[i].isBorrowed()){

                    System.out.println(Shelf[i]);
                }

        }

    }

}
