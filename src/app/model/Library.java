package app.model;

public class Library {

    User user;
    Publication publication;
    final int size = 2;

    public Library(User user, Publication publication) {
        this.user = user;
        this.publication = publication;
    }

    public int getSize() {
        return size;
    }
}
