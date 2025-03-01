public class App {
    public static void main(String[] args) {
        try {
             System.out.println("Risultato: "+ DriveFactory.create("MySqlDriver"));
             System.out.println("Risultato: "+ DriveFactory.create("PostgreSqlDriver"));
             System.out.println("Risultato: "+ DriveFactory.create("PostgreSql"));
        } catch (Exception e) {
            System.err.println(e);
        }

    }
}
