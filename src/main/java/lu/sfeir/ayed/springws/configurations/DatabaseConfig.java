package lu.sfeir.ayed.springws.configurations;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.ejb.HibernatePersistence;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("lu.sfeir.ayed.springws.repository")
public class DatabaseConfig {

	@Autowired
	private Environment env;

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    dataSource.setDriverClassName(env.getProperty("db.driver"));
	    dataSource.setUrl(env.getProperty("db.url"));
	    dataSource.setUsername(env.getProperty("db.username"));
	    dataSource.setPassword(env.getProperty("db.password"));
	    return dataSource;
	}

	private Map<String,?> jpaProperties() {
		Map<String,String> jpaPropertiesMap = new HashMap<String,String>();
		jpaPropertiesMap.put("hibernate.dialect",env.getProperty("hibernate.dialect"));
		jpaPropertiesMap.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
		return jpaPropertiesMap;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		factoryBean.setPersistenceProviderClass(HibernatePersistenceProvider.class);
		factoryBean.setDataSource(dataSource());
		factoryBean.setPackagesToScan(env.getProperty("entitymanager.packagesToScan"));
		factoryBean.setJpaPropertyMap(jpaProperties());
		return factoryBean;
	}


}
