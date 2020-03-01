package ru.hh.nab.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ru.hh.nab.app.Resource;
//import ru.hh.nab.resource.Company;

@Configuration
@Import(Resource.class)
public class JerseyConfig {
}
