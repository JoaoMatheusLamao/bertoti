import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {
    private final String name;
    private final List<FileSystemComponent> components = new ArrayList<>();
    private int size;

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
        size++;
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
        size--;
    }

    @Override
    public void showDetails() {
        System.out.println("Pasta: " + name);
        for (FileSystemComponent component : components) {
            component.showDetails();
        }
    }

    @Override
    public int getSize() {
        return size;
    }
}
