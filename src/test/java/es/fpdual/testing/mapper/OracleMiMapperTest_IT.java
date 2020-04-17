package es.fpdual.testing.mapper;

import org.junit.runner.*;
import org.springframework.test.annotation.*;
import org.springframework.test.context.*;
import org.springframework.test.context.junit4.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring-configuration/testing-persistencia.xml",
        "classpath:spring-configuration/testing-oracle-persistencia.xml" })
@Rollback
public class OracleMiMapperTest_IT extends BaseMiMappertTest {

}
