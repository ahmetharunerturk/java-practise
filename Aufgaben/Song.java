public class Song {
    private String title;
    private String performer;
    private int year;
    private String genre;
    private float personalRating;

    public Song(String title, String performer, int year, String genre, float personalRating) {
        this.title = title;
        this.performer = performer;
        this.year = year;
        this.genre = genre;
        this.personalRating = personalRating;
    }

    public void printSongInfo() {
        System.out.println(title + " von " + performer + " erschien " + year +
                " und gehört zum Genre " + genre + ". Ich gebe dem Song eine persönliche Wertung von " + personalRating + ".");
    }
}


