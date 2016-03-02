import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Test;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivan on 1/03/16.
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.hasItem;

public class ListImplementTest {

    @Test
    public void testList(){
        ListImplement l1 = new ListImplement();
        l1.add("Objeto");
        assertEquals("Objeto", l1.get(0));
        assertEquals(1, l1.size());
        l1.add("Objeto1");
        assertEquals("Objeto1", l1.get(1));
        assertEquals(1, l1.indexOf("Objeto1"));
        l1.remove("Objeto");
        assertEquals(0, l1.indexOf("Objeto1"));
        assertEquals(false, l1.isEmpty());
        l1.set(1,"Objeto2");
        assertEquals("Objeto2", l1.get(1));
        l1.add("ObjetoA");
        l1.add("ObjetoB");
        l1.add("ObjetoB");
        l1.add("ObjetoB");
        l1.add("ObjetoE");
        l1.add("ObjetoF");
        List l2 = l1.subList(3,6);
        assertEquals("ObjetoB",l2.get(2));
        l1.removeAll(l2);
        assertEquals(3, l1.indexOf("ObjetoE"));
        l1.addAll(l2);
        assertEquals(5, l1.indexOf("ObjetoB"));
        l1.addAll(1,l2);
        assertEquals("ObjetoB", l1.get(1));
        assertEquals("ObjetoB", l1.get(8));
        l1.clear();
        assertEquals(true, l1.isEmpty());
        //assertEquals("0", l1.);

    }
}
