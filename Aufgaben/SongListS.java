import java . util . Scanner ;

public class SongListS {

    //Name: Ahmet Harun Ertürk
    //Matrikelnummer: 5127661

    public static void main(String[] args) {

        String title;
        String performer;
        int year;
        String genre;
        float personalRating;


        System.out.println("Attribute Titel: ");
        Scanner myScanner = new Scanner ( System . in ) ;
        title = myScanner . next () ;

        System.out.println("Interpret: ");
        Scanner myScanner1 = new Scanner ( System . in ) ;
        performer = myScanner1 . next () ;

        System.out.println("Erscheinungsjahr: ");
        Scanner myScanner2 = new Scanner ( System . in ) ;
        year = myScanner2 . nextInt () ;

        System.out.println("Genre: ");
        Scanner myScanner3 = new Scanner ( System . in ) ;
        genre = myScanner3 . next () ;

        System.out.println("persönliche Wertung: ");
        Scanner myScanner4 = new Scanner ( System . in ) ;
        personalRating = myScanner4 . nextFloat () ;
        myScanner4.close();

        Song songS = new Song(title, performer, year, genre, personalRating);


        songS.printSongInfo();






    }

}

