package app;

public class App {
	
		public static void main(String args[]) {

			System.out.println("Hello World");
			Account account = new Account("David","Barn", 123452);
			Service add = new Service();
			add.addAccount(account);
			System.out.println(add.getAccounts(123452));
	
			
		}

}
