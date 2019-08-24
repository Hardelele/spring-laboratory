## Navigation
[Go back to xml-helper.md](https://github.com/Hardelele/Spring-Handbook/blob/master/xml/xml-helper.md)
1. Tag <beans ... />: [beans/bean/bean.md](https://github.com/Hardelele/Spring-Handbook/blob/master/xml/beans/bean/bean.md)
## Content:
Any description...
###### <bean .../> 
> `<bean .../>` it's a main XML tag in Spring. You shoold use it for include your class inside of container.
###### attributes:
- id = "..."
- class = "..."
- factory-method = "..."
- scope = "..." // Set of values: singleton, prototype, request, session, global-session; More: Spring in action p.80
- init-method = "..."
- destroy-method = "..."
> XML has a single tag `<bean .../>`, and also has a double `<bean ...> ... </bean>` 
