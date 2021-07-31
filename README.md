# Spring for Full-Stack Web Apps


# Lab 11 Overview 
* Set up a basic webapp that will be useful for the next 5 labs.

## Setup
* Use the Spring Initializer to create a new application with artifact songr with Web and Thymeleaf (and optionally Devtools) dependencies. Download the zip file and extract the directory it contains. Add the course gitignore file into that directory. Run git init, git add ., and git commit -m "initial commit from Spring init". Create a new GitHub repo, and push your initial commit to your master branch there. Then, check out a new branch to begin your work for the day.

## Feature Tasks
* Ensure that you can run the Spring app.
* Create a hello world route at /hello, and ensure that you can visit that route in your browser and see a rendered template come back.
* Create a route that turns words into UPPER CASE. For instance, I should be able to visit /capitalize/hello and get back an HTML page containing the response HELLO, or I could visit /capitalize/this is Kinda Capitalized and get an HTML page containing the response THIS IS KINDA CAPITALIZED.
* Create a basic splash page for the Songr app, available at the root route, and style it appropriately with CSS.
* Create an Album class to act as a model in our app.
* An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art.
* Create a route at /albums that shows three album instances. (These will be hardcoded for today’s lab; create an array that contains three albums, and then display those three on the page.)

# Lab 12 Overview
**Continue working in the same songr webapp you generated for the previous lab. Ensure that you have all of these dependencies in your build.gradle. (Note that when you add the dependencies on postgres and JPA, your app will stop working until you have the configuration in application.properties to access your Postgres database.)**

## Feature Tasks
- Album model should be saved in a database
- Album has 
  - Title
  -  Artist
  -  SongCount
  -  Length
  -  Img Url
- A user should be able to see information about all the albums on the site.
- A user should be able to add albums to the site.  
