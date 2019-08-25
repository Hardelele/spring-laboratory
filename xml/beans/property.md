## Navigation
[Go back to xml-helper.md](https://github.com/Hardelele/Spring-Handbook/blob/master/xml/xml-helper.md)
## Content:
##### <property .../>
One of the main tags in spring. Have to make dependency, assign value, etc.
> `<property .../>` can be used to assign value for internal parameters or include external classes to interface.
###### attributes:
- name = "..."
- value = "..."
- ref = "..."
###### Example:
```
<bean id="name" class="ref.ClassName">

 <property name="Internal parameter" value="Any value" />
 <property name="Name of interface" ref="Name of class" />
 
</bean>
```
