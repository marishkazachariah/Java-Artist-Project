public class ArtistImplementation implements Artist {
    private String name;

    public ArtistImplementation(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String artistName) {
        name = artistName;
    }

    @Override
    public String toString() {
        return String.format("%s", name);
    }
}