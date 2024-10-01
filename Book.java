//lab 2 Q3
public class Book {
    private String aut;
    private String tittle;
    private String genr;
    public Book(String aut,String tittle,String genr){
        this.aut=aut;
        this.tittle=tittle;
        this.genr=genr;
    }public void setTitle(String title) {
        this.tittle = title;
    }public void setaut(String aut) {
        this.aut = aut;
    }public void setgenr(String genr) {
        this.genr = genr;
    }public String getTitle() {
        return tittle;
    }public String getaut() {
        return aut;
    }public String getgenr() {
        return genr;
    }
    public void DisplayDetail(){
       System.out.println("Tittle: " + tittle);
       System.out.println("Aut: " + aut);
       System.out.println("Genr: " + genr);
    }

    public static void main(String[] args){
       Book book=new Book( "SIKANDR ", "guest list", "Dystopian");
       
       book.DisplayDetail();
    }
}