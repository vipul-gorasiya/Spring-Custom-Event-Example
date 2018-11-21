# Spring Custom Event examples

## How is it used in example

- [EmailEvent](SpringCustomEventExample/src/main/java/com/vipul/event/EmailEvent.java) - Event
- [EmailAppListener](SpringCustomEventExample/src/main/java/com/vipul/event/EmailAppListener.java) - Event Listener defined by implementing ApplicationListener
- [EmailMethodListener](SpringCustomEventExample/src/main/java/com/vipul/event/EmailMethodListener.java) - Event Listener defined by @EventListener
- [EmailMethodAsyncListener](SpringCustomEventExample/src/main/java/com/vipul/event/EmailMethodAsyncListener.java) - Asynchronous Event Listener defined by @EventListener + @Async 

All Event Listener are listening to Email Event only. But are defined with @Order so all will execute in sequence defined in @Order.

- [EmailService](SpringCustomEventExample/src/main/java/com/vipul/service/EmailService.java) - Event publisher defined by implementing ApplicationEventPublisherAware. This service publishes event which is subscribed by three aforementioned listeners. 

## Importing and running project

1. Import project as Maven project
2. Run application as Spring Boot Application
3. Observe log to see the sequence of execution and relate it with the code in ExampleService.java
