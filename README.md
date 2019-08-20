# Spring Handbook
## Description
###### XML Helper:
***1. Beans***
- Example of <beans> namespace.
- Tag <bean />: attributes and elements.
## XML Helper
###### Сode example:
```
<?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
                           http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">
 
  <bean id="..." class="..." />
 
</beans>
```
###### `<bean .../>` it's a main XML tag in Spring. You shoold use it for include your class inside of container.
>
###### attributes:
- id = "..."
- class = "..."
- factory-method = "..."
- scope = "..." // Set of values: singleton, prototype, request, session, global-session; More: Spring in action p.80
> XML has a single tag `<bean .../>`, and also has a double `<bean ...> ... </bean>` 
###### <constructor-arg .../>
> `<constructor-arg .../>` used between double tags `<bean ...> ... </bean>` for include values or  to the constructor
###### attributes:
- value = "..."
- ref = "..."

