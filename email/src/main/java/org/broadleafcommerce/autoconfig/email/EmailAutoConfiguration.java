/*
 * #%L
 * BroadleafCommerce Email
 * %%
 * Copyright (C) 2009 - 2017 Broadleaf Commerce
 * %%
 * Licensed under the Broadleaf Fair Use License Agreement, Version 1.0
 * (the "Fair Use License" located  at http://license.broadleafcommerce.org/fair_use_license-1.0.txt)
 * unless the restrictions on use therein are violated and require payment to Broadleaf in which case
 * the Broadleaf End User License Agreement (EULA), Version 1.1
 * (the "Commercial License" located at http://license.broadleafcommerce.org/commercial_license-1.1.txt)
 * shall apply.
 * 
 * Alternatively, the Commercial License may be replaced with a mutually agreed upon license (the "Custom License")
 * between you and Broadleaf Commerce. You may not use this file except in compliance with the applicable license.
 * #L%
 */
package org.broadleafcommerce.autoconfig.email;

import org.broadleafcommerce.common.email.service.info.EmailInfo;
import org.broadleafcommerce.common.email.service.info.NullEmailInfo;
import org.broadleafcommerce.common.extensibility.FrameworkXmlBeanDefinitionReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

/**
 * Created by brandon on 1/19/17.
 */
@Configuration
@ImportResource(value = {
        "classpath:/bl-email-applicationContext-persistence.xml"
}, reader = FrameworkXmlBeanDefinitionReader.class)
@ComponentScan(basePackages = {
        "org.broadleafcommerce.common.email"
})
public class EmailAutoConfiguration {

    @Bean
    public EmailInfo blEmailInfo() {
        return new EmailInfo();
    }

    @Bean
    public EmailInfo blNullEmailInfo() throws IOException {
        return new NullEmailInfo();
    }
}