public class ImdbData {

    private int year;
    private int lenght;
    private String title;
    private String subject;
    private int poplaurity;
    private boolean hasWonAward;

    public ImdbData(int year, int lenght, String title, String subject, int popularity, String hasWonAward){
        this.year=year;
        this.lenght=lenght;
        this.title=title;
        this.subject = subject;
        this.poplaurity=popularity;
        if(hasWonAward.equals("Yes"))
            this.hasWonAward = true;
        else{
            this.hasWonAward= false;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle() {
        this.title=title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getPoplaurity() {
        return poplaurity;
    }

    public void setPoplaurity(int poplaurity) {
        this.poplaurity = poplaurity;
    }

    public boolean isHasWonAward() {
        return hasWonAward;
    }

    public void setHasWonAward(boolean hasWonAward) {
        this.hasWonAward = hasWonAward;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "year=" + year +
                ", lenght=" + lenght +
                ", title='" + title + '\'' +
                ", subject='" + subject + '\'' +
                ", poplaurity=" + poplaurity +
                ", hasWonAward=" + hasWonAward +
                '}';
    }

}
