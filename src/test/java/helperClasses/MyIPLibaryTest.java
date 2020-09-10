package helperClasses;

import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyIPLibaryTest extends TestCase {

    @Test
    void returnPrivateCClassIP() throws Exception {
        assertEquals("192.168.123.123", MyIPLibary.returnPrivateCClassIP(123,123));

//        assertEquals(new Exception("IP-Adress-Nr. > 255  ==> not possible!"),MyIPLibary.returnPrivateCClassIP(300,123) );
//        assertEquals(new Exception("IP-Adress-Nr. > 255  ==> not possible!"),MyIPLibary.returnPrivateCClassIP(123,300) );
    }
}