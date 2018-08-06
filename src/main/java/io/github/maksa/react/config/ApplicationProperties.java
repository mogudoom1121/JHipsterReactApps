package io.github.maksa.react.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to React Sample Apps.
 * <p>
 * Properties are configured in the application.yml file.
 * See {@link io.github.jhipster.config.JHipsterProperties} for a good example.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {

}
