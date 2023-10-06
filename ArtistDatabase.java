import java.util.ArrayList;
import java.util.List;

public class ArtistDatabase {
    private List<Artist> artists = new ArrayList<>();
    public void initializeDatabase() {
        artists.add(new ArtistImplementation("Jack Johnson"));
        artists.add(new ArtistImplementation("Dolly Parton"));
        artists.add(new ArtistImplementation("Charlie XCX"));
        artists.add(new ArtistImplementation("Dua Lipa"));
        artists.add(new ArtistImplementation("Gorillaz"));

        StringBuilder csvData = new StringBuilder();

        // append the title/header to StringBuilder
        csvData.append("Names\n");

        // append artist names using the format() method
        for (int i = 0; i < artists.size(); i++) {
            csvData.append(String.format("%s\n", artists.get(i)));
        }
        System.out.println(csvData);
    }
}
