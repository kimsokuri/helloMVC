package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Customer;

public class CustomerService {
	private Map<String, Customer> customerMap;//선언만한거
	//key:String, value:Customer 객체.
	
	public CustomerService() {
		customerMap = new HashMap<String, Customer>();
		//여기서 해쉬맵 객체 생성(new)해줌
		
		addCustomer(new Customer("id001","alice","alice.mail.com"));
		addCustomer(new Customer("id002","kimbob","kimbob.mail.com"));
		addCustomer(new Customer("id003","minsoo","minsoo.mail.com"));
		addCustomer(new Customer("id004","jooheon","jooheon.mail.com"));
		addCustomer(new Customer("id005","gg","gg.mail.com"));
		//customer 객체 생성(알아서 maven생성자 돌아)
		
	}
	private void addCustomer(Customer customer) {
		//이 함수는 받은 저 customer객체를 hashmap에 넣어주는 역할을 담당해야해
		
		customerMap.put(customer.getId(),customer);
	}
	public Customer findCustomer(String id) { 
		//id에 해당하는 Customer객체를 hashmap에서 리턴하겠다는거임.
		
		if(id != null) //id가 null아닐때까지 계속
			return (customerMap.get(id.toLowerCase()));
		//key값으로 값빼오는 작업 하는거임 (get으로)
		//근데 id를 대문자로 쓸쑤도있으니까 소문자로 변환시키는 작업도 넣음
		else
			return null;
		
	}
	
	public List<Customer> getAllCustomers(){
		//customer의 모든 value를 list형식으로 리턴할려고함
		List<Customer> customerList = new ArrayList<Customer>(customerMap.values());
		//customerMap.values()의 값을 모두 가지고있는 arraylist를 customerList라고하는데 그걸 리턴
		return customerList;
	}

}
