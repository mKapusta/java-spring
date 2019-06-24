import com.example.xml.BeanXMLClass;
import com.example.xml.UpperXMLBeanClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;

@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class MainXMLTestClass {

    @Autowired(required = false)
    private String randomString;

    @Autowired(required = false)
    private BeanXMLClass monBean;

    @Autowired(required = false)
    private BeanXMLClass monBean2;

    @Autowired(required = false)
    private UpperXMLBeanClass upperBean;


    @Test
    public void testString() {
        assertNotNull(randomString);
        assertEquals(randomString, "test");
    }

    @Test
    public void testBean() {
        assertNotNull(monBean);
        assertEquals(monBean.getRandomValue(), "test");
    }

    @Test
    public void testBean2() {
        assertNotNull(monBean2);
        assertEquals(monBean2.getRandomValue(), "test2");
    }

    @Test
    public void testUpperBean() {
        assertNotNull(upperBean);
        assertEquals(upperBean.getBeanXMLClass(), monBean2);
    }
}
