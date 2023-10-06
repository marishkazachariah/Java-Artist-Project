import java.util.ArrayList;
import java.util.List;

public class ArtistsImplementation implements Artists, Searchable{

    private List<Artist> artists = new ArrayList<>();

    @Override
    public void add(Artist artist) {
        artists.add(artist);
    }

    @Override
    public Artist get(int index) {
        return artists.get(index);
    }

    @Override
    public void editArtist(String oldName, String newName) {
        for (Artist artist : artists) {
            if (artist.getName().equalsIgnoreCase(oldName)) {
                artist.setName(newName);
            }
        }
    }

    // search
    @Override
    public List<Artist> search(String lastname) {
        List<Artist> matchingArtists = new ArrayList<>();

        for (Artist artist : artists) {
            String artistName = artist.getName().toLowerCase();

            if (artistName.contains(lastname.toLowerCase())) {
                matchingArtists.add(artist);
            }
        }

        return matchingArtists;
    }
}