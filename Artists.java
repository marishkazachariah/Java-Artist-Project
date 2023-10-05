public interface Artists {
    void add(Artist artist);

    Artist get(int index);

    void editArtist(String oldName, String newName);
}