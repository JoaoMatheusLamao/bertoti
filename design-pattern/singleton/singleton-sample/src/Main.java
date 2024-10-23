public class Main {
    public static void main(String[] args) {
        DatabaseConnection dbConnection1 = DatabaseConnection.getInstance();
        dbConnection1.query("SELECT * FROM users");

        // Tentar obter outra conexão; retornará a mesma instância
        DatabaseConnection dbConnection2 = DatabaseConnection.getInstance();
        dbConnection2.query("SELECT * FROM products");

        // Verificar se ambas as instâncias são a mesma
        System.out.println(dbConnection1 == dbConnection2);  // true
    }
}