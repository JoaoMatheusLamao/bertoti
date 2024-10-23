public class DatabaseConnection {

    // Instância única da classe
    private static DatabaseConnection instance;

    // Construtor privado para impedir a criação de novas instâncias
    private DatabaseConnection() {
        // Código para inicializar a conexão com o banco de dados
        System.out.println("Conexão com o banco de dados criada.");
    }

    // Método estático para obter a instância única da classe
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Método para simular o uso da conexão
    public void query(String sql) {
        System.out.println("Executando query: " + sql);
    }
}
