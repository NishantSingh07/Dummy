import org.junit.jupiter.api.Test;

public class DummyTest {

    @Test
    public void DummyTest1(){

        String FirstName = System.getenv().get("#{FirstName}#");
        System.out.println("First Name is "+ FirstName);


    }

    @Test
    public void DummmyTest2(){
        String LastName = System.getenv().get("#{LastName}#");
        System.out.println("Last Name is "+ LastName);
    }
}
