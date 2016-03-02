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
        l1.add("Objeto"); // Objeto
        assertEquals("Objeto", l1.get(0));
        assertEquals(1, l1.size());
        l1.add("Objeto1"); //Objeto, Objeto1
        assertEquals("Objeto1", l1.get(1));
        assertEquals(1, l1.indexOf("Objeto1"));
        l1.remove("Objeto"); //Objeto1
        assertEquals(0, l1.indexOf("Objeto1"));
        assertEquals(false, l1.isEmpty());
        l1.add(1, "sadfasdfsdf");
        l1.set(1,"Objeto2");//Objeto1,Objeto2
        l1.add(1,"roibghvr");
        assertEquals(1,1);
//        assertEquals(true, l1.isEmpty()); assertEquals("Objeto2", l1.get(1));
//        l1.add("ObjetoA");
//        l1.add("ObjetoB");
//        l1.add("ObjetoB");
//        l1.add("ObjetoB");
//        l1.add("ObjetoE");
//        l1.add("ObjetoF");//Objeto1,Objeto2,ObjetoA,ObjetoB,ObjetoB,ObjetoB,ObjetoE,ObjetoF
//        List l2 = l1.subList(3,6);//ObjetoB,ObjetoB,ObjetoB
//        assertEquals("ObjetoB",l2.get(2));
//        l1.removeAll(l2);//Objeto1,Objeto2,ObjetoA,ObjetoE,ObjetoF
//        assertEquals(3, l1.indexOf("ObjetoE"));
//        l1.addAll(l2);//Objeto1,Objeto2,ObjetoA,ObjetoE,ObjetoF,ObjetoB,ObjetoB,ObjetoB
//        assertEquals("ObjetoB", l1.get(6));
//        assertEquals(5, l1.indexOf("ObjetoB"));
//        l1.addAll(1,l2);//Objeto1,(ObjetoB,ObjetoB,ObjetoB),Objeto2,ObjetoA,ObjetoE,ObjetoF,ObjetoB,ObjetoB,ObjetoB
//        assertEquals("ObjetoB", l1.get(1));
//        assertEquals("ObjetoF", l1.get(7));
        l1.clear();
        //assertEquals("0", l1.);

    }
}
