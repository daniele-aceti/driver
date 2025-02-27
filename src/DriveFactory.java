public class DriveFactory {
    public static Driver Create(String type)throws Exception{
        Driver result = null;
        if(type.equals("MySqlDriver")){
            result = new MySqlDriver();
        }else if (type.equals("PostgreSqlDriver")){
            result = new PostgreSqlDriver();
        }else {
            throw new Exception("Il valore inserito non è corretto");
        }
     return result;
    }
}
