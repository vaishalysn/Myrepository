package oops1;
interface Messenger
{
void sendSMS();	
}
interface Whatsapp
{
void sendSMS();
}
class Facebook implements Messenger, Whatsapp
{
public void sendSMS()
{
System.out.println("I am sending SMS through Facebook");	
}
}
public class Multiinheritance {


	public static void main(String[] args) {
		
Facebook obj= new Facebook();
obj.sendSMS();
	}

}
