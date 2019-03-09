import com.example.configuration.JavaConfiguration;
import com.example.configuration.OtherJavaConfiguration;
import com.example.java.JavaBeanClass;
import com.example.java.UpperJavaBeanClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@ContextConfiguration(classes = {JavaConfiguration.class, OtherJavaConfiguration.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class MainJavaTestClass {

    @Autowired(required = false)
    private String javaRandomString;

    @Autowired(required = false)
    private JavaBeanClass monBean;

    @Autowired(required = false)
    private JavaBeanClass monBean2;

    @Autowired(required = false)
    private UpperJavaBeanClass upperBean;


    @Test
    public void testString() {
        assertNotNull(javaRandomString);
        assertEquals(javaRandomString, "test");
    }

    @Test
    public void testBean() {
        assertNotNull(monBean);
        assertEquals(monBean.getRandomValue(), 2);
    }

    @Test
    public void testBean2() {
        assertNotNull(monBean2);
        assertEquals(monBean2.getRandomValue(), 3);
    }

    @Test
    public void testUpperBean() {
        assertNotNull(upperBean);
        assertEquals(upperBean.getJavaBeanClass(), monBean2);
    }
}
