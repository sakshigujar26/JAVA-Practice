
interface MyInter {
    void connect();

    void disconnect();
}

class OracleDB implements MyInter {
    public void connect() {
        System.out.println("Connected to Oracle");
    }

    public void disconnect() {
        System.out.println("Disconnected from Oracle");
    }

}

class SybaseDB implements MyInter {
    public void connect() {
        System.out.println("Connected to SybaseDB");
    }

    public void disconnect() {
        System.out.println("Disconnected from SybaseDB");
    }

}

public class InterfaceDemo {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName(args[0]);
        MyInter mi = (MyInter) c.getDeclaredConstructor().newInstance();
        mi.connect();
        mi.disconnect();
    }
}





























/*

interface MyInter{
	void connect();
	void disconnect();
}
class OracleDB implements MyInter{
	public void connect(){
		System.out.println("oracle");
		}
	public void disconnect(){
	System.out.println(" disconect oracle");
	}
	
	}
class SybaseDb implements MyInter{
	public void connect(){
		System.out.println("SybaseDB");
		}
	public void disconnect(){
	System.out.println(" disconect SybaseDB");
	}
	
	}
class InterfaceDemo{
	public static void main(String args[]) throws Exception{
	Class c = Class.forName(args[0]);
	MyInter mi = (MyInter)c.newInstance();
	mi.connect();
	mi.disconnect();
	}
	}
	*/
