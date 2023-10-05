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
//    @Override
//    public List<Artist> search(String lastname) {
//        List<Artist> matchingArtists = new ArrayList<>();
//
//        for (Artist artist : artists) {
//            String artistName = artist.getName().toLowerCase();
//
//            if (artistName.contains(lastname.toLowerCase())) {
//                matchingArtists.add(artist);
//            }
//        }
//
//        return matchingArtists;
//    }

    // Implementing the search method using a binary search
    @Override
    public List<Artist> search(String lastname) {
        List<Artist> matchingArtists = new ArrayList<>();
        int left = 0;
        int right = artists.size() - 1;

        while(left <= right) {
            int mid = artists.size() / 2;
            String midName = artists.get(mid).getName();
            int midValue = midName.compareTo(lastname);

            if(midValue == 0) {
                matchingArtists.add(artists.get(midValue));
            } else if (midValue < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return matchingArtists;
    }
}