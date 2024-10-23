public class File implements FileSystemComponent {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void showDetails() {
        System.out.println("File: " + name + ", Size: " + size);
    }

    @Override
    public int getSize() {
        return size;
    }
}
