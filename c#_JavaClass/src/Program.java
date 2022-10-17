
public class Program {

	public static void main(String[] args) {
	   CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
       customerManager.GiveCredit(); 
	}
}

class CreditManager {
	public void Calculate() {
		System.out.println("Hesaplandı");
	}

	public void Save() {
		System.out.println("Kaydedildi");
	}
}

interface ICreditManager {
	void Calculate();

	void Save();
}

abstract class BaseCreditManager implements ICreditManager{
	public abstract void Calculate();
	
	public void Save() {
        System.out.println("Kaydedildi");
	}
}

class TeacherCreditManager extends BaseCreditManager implements ICreditManager {
	@Override
	public void Calculate() {
		System.out.println("Ogretmen kredisi hesaplandı");
	}

}

class MilitaryCreditManager extends BaseCreditManager implements ICreditManager {
	@Override
	public void Calculate() {
		System.out.println("Asker kredisi hesaplandı");
	}

}

class Customer {
	public Customer() {
		System.out.println("musteri nesnesi baslatıldı");
	}

	int id;
	String city;
}

class Person extends Customer {
	String name;
	String secondName;
	String nationalIdentity;
}

class Company extends Customer {
	String companyName;
	String taxNumber;
}

class CustomerManager {

	private Customer _customer;
	private ICreditManager _creditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager) {

		_customer = customer;
		_creditManager = creditManager;

	}

	public void Save() {
		System.out.println("Musteri kaydedildi");
	}

	public void Delete() {
		System.out.println("Musteri Silindi");
	}

	public void GiveCredit() {
		_creditManager.Calculate();
		System.out.println("Kredi verildi");

	}

}
