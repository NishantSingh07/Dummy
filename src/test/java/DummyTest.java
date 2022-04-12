import org.junit.jupiter.api.Test;

public class DummyTest {

    @Test
    public void DummyTest1(){
        System.out.println("First Name is "+ System.getenv("FirstName"));

    }

    @Test
    public void DummmyTest2(){
        System.out.println("Last Name is "+ System.getenv("LastName"));
    }
}
