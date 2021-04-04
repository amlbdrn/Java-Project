package ex2;

import ex1.BankAccount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBank {

    @Test
    public void testgetAccount(){
        Bank b=new Bank();
        for(int i=0;i<10;i++){
            b.addAccount("Laurentiu Popescu"+i,i*125+10000*i);
        }
        BankAccount a=new BankAccount("Maria Marioara", 7*240+100000*7);
        assertEquals(a,b.getAccount("Flavius"));
    }
}
