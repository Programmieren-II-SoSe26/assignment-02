package aufgabe_1;

public class File {

    public int getFileHash() {
        int hash = 7;
        hash = 31 * hash + (name == null ? 0 : name.hashCode());
        hash = 31 * hash + (content == null ? 0 : content.hashCode());
        return hash;
    }
}
