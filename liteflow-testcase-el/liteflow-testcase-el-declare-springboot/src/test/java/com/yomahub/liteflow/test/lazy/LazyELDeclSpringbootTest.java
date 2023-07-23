package com.yomahub.liteflow.test.lazy;

import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import com.yomahub.liteflow.test.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

//spring的延迟加载在el表达形式模式下不起作用
/*@ExtendWith(SpringExtension.class)
@TestPropertySource(value = "classpath:/lazy/application.properties")
@SpringBootTest(classes = LazyELDeclSpringbootTest.class)
@EnableAutoConfiguration
@ComponentScan({"com.yomahub.liteflow.test.lazy.cmp"})*/
public class LazyELDeclSpringbootTest extends BaseTest {

	/*
	 * @Resource private FlowExecutor flowExecutor;
	 *
	 * @Test public void testLazy() throws Exception{ LiteflowResponse response =
	 * flowExecutor.execute2Resp("chain1", "arg");
	 * Assertions.assertTrue(response.isSuccess()); }
	 */

}
