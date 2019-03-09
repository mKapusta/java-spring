import com.example.annotations.JavaComponent;
import com.example.configuration.JavaConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNull;

@ContextConfiguration(classes = {JavaConfiguration.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class ComponentJavaTestClass {

    @Autowired(required = false)
    private JavaComponent javaComponent;

    @Test
    public void testString() {
        assertNotNull(javaComponent);
        assertNotNull(javaComponent.getJavaBeanClass());
        assertNull(javaComponent.getBeanClass());
    }
}
