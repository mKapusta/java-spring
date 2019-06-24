import com.example.java.JavaAnnotationBeanClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertNotNull;

/**
 * Cette classe de test utiliser un fichier applicationContext.xml à créer pour récupérer ses Bean Spring
 */
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class ComponentXMLTestClass {

    @Autowired(required = false)
    private JavaAnnotationBeanClass javaComponent;

    @Test
    public void testString() {
        assertNotNull(javaComponent);
        assertNull(javaComponent.getJavaBeanClass());
        assertNotNull(javaComponent.getUpperJavaBeanClass());
    }
}
