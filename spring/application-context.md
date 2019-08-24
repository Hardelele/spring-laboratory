###### Code Example
```
ApplicationContext nameOfContext = new ClassPathXmlApplicationContext("something.xml");
AnyInterface name = (AnyInterface) nameOfContext.getBean(" Name of our entity ");
name.methodOfOurEntity();
```
> As example you can use it inside main() method.