#### Build OK; Deploy OK; run OK

1. In parent project run : mvn clean package
2. Manual deploy on wf10

wildfly - app deployment error: cannot create HibernateJpaAutoConfiguration
solution - exclude auto guessing for jpa model classes 
https://stackoverflow.com/questions/36387265/disable-all-database-related-auto-configuration-in-spring-boot
- in case when repositories are not configured yet

@EntityScan DEPRECATED - Spring 1.5.x
Solution - for now use spring boot version 1.4.x Not 1.5.x
https://stackoverflow.com/questions/38896414/difference-between-entityscan-and-componentscan

CAUTION
Package names in SpringBoot annotation are not type safe!

### Problem with Tree UI component - Not Available in vaadin 8.x
Solution: add new dependencies:
https://vaadin.com/forum/#!/thread/15031831/15036434

```You have to replace the vaadin-server dependency with vaadin-compatibility-server.
If you are using the default widgetset (you are not compiling it by yourself):
Replace the vaadin-client-compiled dependency with vaadin-compatibility-client-compiled.
Add @Widgetset("com.vaadin.v7.Vaadin7WidgetSet") to your UI implementations.
If you are using a custom widgetset:
Replace the vaadin-client dependency with vaadin-compatibility-client.
Recompile it.
```


