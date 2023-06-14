package com.hisatrade.hisa;

import com.hisatrade.hisa.HisaTradeApp;
import com.hisatrade.hisa.config.AsyncSyncConfiguration;
import com.hisatrade.hisa.config.EmbeddedElasticsearch;
import com.hisatrade.hisa.config.EmbeddedKafka;
import com.hisatrade.hisa.config.EmbeddedSQL;
import com.hisatrade.hisa.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { HisaTradeApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedKafka
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
