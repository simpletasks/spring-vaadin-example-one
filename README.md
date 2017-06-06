1. In parent project run : mvn package
2. Manual deploy on wf10

wildfly - app deployment error: cannot create HibernateJpaAutoConfiguration
solution - exclude auto guessing for jpa model classes 
https://stackoverflow.com/questions/36387265/disable-all-database-related-auto-configuration-in-spring-boot

@EntityScan DEPRECATED - Spring
Solution - for now use spring boot version 1.4x. Not 1.5.x
https://stackoverflow.com/questions/38896414/difference-between-entityscan-and-componentscan

CAUTION
Package names in SpringBoot annotation are not type safe!

