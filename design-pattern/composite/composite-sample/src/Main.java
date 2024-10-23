public class Main {
    public static void main(String[] args) {
        File file1 = new File("documento.txt", 100);
        File file2 = new File("imagem.png", 20);
        Folder folder1 = new Folder("Pasta1");
        Folder folder2 = new Folder("Pasta2");

        folder1.addComponent(file1);
        folder1.addComponent(file2);
        folder2.addComponent(folder1);

        folder2.showDetails();
    }
}