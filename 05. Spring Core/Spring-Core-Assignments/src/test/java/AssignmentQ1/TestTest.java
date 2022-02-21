package AssignmentQ1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestTest {

    private Customer Customer;
	private ApplicationContext context;

    @BeforeAll
    public void init(){
        context = new ClassPathXmlApplicationContext("AssignmentQ1.xml");
        Customer = context.getBean("Customer",Customer.class);
    }
    
    @Test
    public void TestCustomer()
    {
        assertEquals(Customer.toString(),"Customer [customerId=101, customerName=Sanket Bollamwar, customerContact=7709496916, CustomerAddress=Address [street=Street No.6, city=Ballarpur, state=Maharashtra, zip=442701, country=India]]");

    }

}
