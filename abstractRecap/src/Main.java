public class Main {
    public static void main(String[] args) {
        CustomerManager CManager = new CustomerManager();
        CManager.BDManager = new OracleDatabaseManager();
        CManager.BDManager.getData();

        CManager.BDManager = new MysqlManager();
        CManager.BDManager.getData();


    }
}
