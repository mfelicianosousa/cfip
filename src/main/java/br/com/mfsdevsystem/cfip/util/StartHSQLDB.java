package br.com.mfsdevsystem.cfip.util;

public class StartHSQLDB {
	
	static String FILE_URL = "file:/javaDatabase/cfip/database/cfip_db";
	
	public static void main(String[] args) {
		//local();
		server();
	}
	
	static void local() {
		final String[] dbArgs = {"--user", "sa", "--password","","--url", "jdbc:hsqldb:"+FILE_URL};
//		DatabaseManagerSwing.main(dbArgs);
		
	}
	
	static void server() {
		final String[] dbArg = {"--database.0", FILE_URL, "--dbname.0", "cfip_db", "--port","5454"};
//     	org.hsqldb.server.Server.main(dbArg);
		/* final String[] dbArg = {"--url", "jdbc:hsqldb:hsql://localhost:5454/cfip_db" };
		DatabaseManagerSwing.main(dbArgsServer);*/
		
	}

}
