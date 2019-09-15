package co.edureka.model;

// Bean : Structure of Object
public class Connection {
	
	String url;
	String username;
	String password;
	String dataBase;
	
	// When Object is created in memory, default constructor will be automatically executed
	public Connection() {
		System.out.println(">> Connection Object Constructed");
	}

	public Connection(String url, String username, String password, String dataBase) {
		this.url = url;
		this.username = username;
		this.password = password;
		this.dataBase = dataBase;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDataBase() {
		return dataBase;
	}

	public void setDataBase(String dataBase) {
		this.dataBase = dataBase;
	}

	@Override
	public String toString() {
		return "Connection [url=" + url + ", username=" + username + ", password=" + password + ", dataBase=" + dataBase
				+ "] HashCode: "+super.toString();
	}
	
	// myInit and myDestroy are user defined methods and can be any name of your choice

	public void myInit() {
		System.out.println(">> myInit Executed");
	}
	
	public void myDestroy() {
		System.out.println(">> myDestroy Executed");
	}
	
}
