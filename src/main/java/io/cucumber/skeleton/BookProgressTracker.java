package io.cucumber.skeleton;

public class BookProgressTracker {

    private int totalPages;
    private int pagesRead;

    public BookProgressTracker(int totalPages){
        this.totalPages = totalPages;
    }

    public void pagesWereRead(int pagesRead){
        this.pagesRead = this.pagesRead + pagesRead;
    }

    public int pagesLeft(){
        return this.totalPages-this.pagesRead;
    }

    public boolean isFinished(){
        return this.pagesRead == this.totalPages;
    }

}
