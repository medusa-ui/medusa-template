# Medusa UI quickstart
Template repository for Medusa UI, an open-source bidirectional micro-frontend framework built in Java, on top of Spring Reactive and Thymeleaf. 

Use me to quick start your next new project! 

See more examples in the component showcase at https://www.getmedusa.io/

## How to start
Boot it up via a standard `mvn spring-boot:run`

Then access the server at http://localhost:8080

## What does it contain?
This is a very lightweight, minimal setup.


It contains two controllers. A simple hello world controller, and a fragment controller.

The hello world shows a page with a counter that initializes at 0 and can increase with a button press.

It also embeds a fragment. The fragment shows the current time.

The fragment's controller initializes with the current time, and has scheduling enabled to showcase bi-directionality. 

A scheduled job, running every second, pushes a new date to you if you're on the hello-world page.


