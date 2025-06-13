### About project:
This project is a custom MVC web application utizing Java, Spring Framework and Libraries, and Maven. This application is a custom computer shop that runs to localhost: 8080. Some features of this application include the ability to add both inhouse and outsourced parts. Also able to make a purchase on a computer product and make updates to both the parts and products. The products can be updated to add specific parts to the products and will decrement based on buy now purchases. 

### Breakdown of project:

Customized HTML front end to for user interface display including a NAV bar that redirects to the Home page and an About page. This utilizes Spring Framework to build this MVC application with Maven dependency. 

### HOME PAGE:

![Image](https://github.com/user-attachments/assets/a4d2caaf-bcda-42a5-8158-f3298ab9309d)

### ABOUT PAGE:

![Image](https://github.com/user-attachments/assets/ee397071-29ca-4ce8-92ca-e61e20c01598)

### OUTSOURCED PART DETAIL PAGE:

![Image](https://github.com/user-attachments/assets/ebfce28e-d3d9-4b16-88fd-5ee45775c77c)

### PRODUCT DETAIL PAGE:

![Image](https://github.com/user-attachments/assets/32af6715-799b-4fd6-a889-9bd8110dcb4d)

### INVENTORY:

There is a BootStrap file where sample inventory of five products and five parts are created. There are conditional statements that ensure that products and parts are only added if the inventory lists are empty. As well as no duplications of the list when the application is rerun. 

### FUNCTIONALITIES:

The Buy Now button on the product list is created with certain parameters and mapped. Conditional for checking if the inventory is zero otherwise the product gets decremented by 1. There are success and failure purchase screens that display upon clicking where the user can select to return to the home page. Mapping for those screens are in the main controller screen java file. 

### VALIDATIONS:

Validations are created to track the maximum and minimum product and parts inventory. In the Part file there is a call method for the validator to check the inventory. The minimum value has an @min for positive values only. The min and max inventory data types are added to class where there are getters and setters for them. If the inventory is not between the min and max value then an error message is displayed. This error message is in a catch all error list that displays the associated error message. Making it impossible to decrement below zero. 

### UNIT TESTS:

There are two getter and setter unit tests for the maximum and minimum fields in the PartTest Java class in the test package. 
