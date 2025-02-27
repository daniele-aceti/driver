public class App {
    public static void main(String[] args) {
        try {
             System.out.println("Risultato: "+ DriveFactory.Create("MySqlDriver"));
             System.out.println("Risultato: "+ DriveFactory.Create("PostgreSqlDriver"));
             System.out.println("Risultato: "+ DriveFactory.Create("PostgreSql"));
        } catch (Exception e) {
            System.err.println(e);
        }

    }
}
