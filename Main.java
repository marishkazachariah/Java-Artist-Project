import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArtistsImplementation artistsImplementation = new ArtistsImplementation();

        artistsImplementation.add(new ArtistImplementation("Samson Adder"));
        artistsImplementation.add(new ArtistImplementation("Jane Smith"));
        artistsImplementation.add(new ArtistImplementation("Alice Johnson"));

        List<Artist> matchingArtists = artistsImplementation.search("Adder");

        for (Artist artist : matchingArtists) {
            System.out.println("Artist: " + artist.getName());
        }
    }
}