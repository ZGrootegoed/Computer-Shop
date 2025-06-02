# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS

### C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

### Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.

Directory: images

File name: Zlogo.png

I added a new directory in the static directory and called it "images", I then added a png image that I could use as my company's logo.


File name: demo.css

Line #1 - #8: Added a class selector to select the HTML container element in mainscreen. Then in the selector I added a background image for my company's logo, a background color, a blend mode to give the image opacity, a background position, a no repeat so there is only one image, and a background-size.


File name: mainscreen.HTML

Line #13: Added line reference to demo.css stylesheet

Line #14: Changed title to Zach's Computer Emporium. Added inline CSS styles to change the font color, background color, padding, and make the text bold.

Line #19: Changed h1 to Zach's Computer Emporium. Added inline CSS styles to change font and background color. Also added padding.

Line #29: Changed h2 to Computer Parts. Added inline CSS styles to change font and background color. Also added padding.

Line #61: Changed h2 to Computer Products. Added inline CSS styles to change font and background color. Also added padding.


### D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.


File name: about.html

Created an about html file within the templates directory.

Line #13: Added line reference to demo.css stylesheet

Line #14: Changed the title to About Computer Emporium

Line #19: Changed h1 to About the Emporium

Line #20-27: Added the grid div around two form elements with buttons in each for redirection to the mainscreen and the about.

Line #29: Changed the h2 to About Us
Line #30-39: Added a way to create a grid in CSS via div elements. Added a paragraph explaining the about and an image.

Line #41- 44: Added a Mission and Mission statement.

Line #47-52: Added a Values statement with an unordered list.

Line #54: Added a store front image.


File name: Zstore.png

Added a store front image to the images directory.


File name: AboutController.java

Created a controller file within the controllers directory.

Line #7-14: Added the Controller and GetMapping annotations.

Line #19-26: Added RequestMapping annotations to link the buttons to redirect to the main and about screens.


File name: demo.css

Line #9-22: Added styling for h1 and h2 elements within the container styling.

Line #25-38: Created a 1 row, 2 column grid.

Line #40: Added styling for the store image and centered it.

Filename: mainscreen.html

Line #20-27: Added the buttons for redirecting to Mainscreen and About.


### E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

### Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.

File name: BootStrapData.java

Line #58-91: Created parts and their associated parameters.

Line #93-100: Created a conditional if statement in order to not create duplicate parts.

Line #113-117: Created products and their associated parameters.

Line #119-125: Created a conditional if statement in order to not create duplicate products.


### F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
* The “Buy Now” button must be next to the buttons that update and delete products.
* The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
* Display a message that indicates the success or failure of a purchase.

File name: mainscreen.html

Line #95-96: Added a Buy Now button


File name: AddProductController.java

Line #177-193: Created a mapping for the Buy Now Button and an if conditional for checking if the inventory is 0 or has at least 1 in which it will decrement the product inventory by 1.


File name: failPurchase.html

Created an html template for a fail to purchase page with a return to mainscreen button.


File name successPurchase.html

Created an html template for a successful purchase page with a return to mainscreen button.


File name: MainScreenController.java

Line #58-66: Created mapping to redirect to the success or fail html pages if the button was able to decrement or not.


File name: Demo.CSS

Line #46-66: Added styling for the fail and success html pages and return button.


### G.  Modify the parts to track maximum and minimum inventory by doing the following:
* Add additional fields to the part entity for maximum and minimum inventory.
* Modify the sample inventory to include the maximum and minimum fields.
* Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
* Rename the file the persistent storage is saved to.
* Modify the code to enforce that the inventory is between or at the minimum and maximum value.


File name: InhousePartForm.html

Line: #22-23: Added fields for minimum and maximum inputs.


File name: OutsourcedPartForm.html

Line: #24-25: Added fields for minimum and maximum inputs.


File name: BootStrapData.java

Line #58-101: Added Max and Min values to the parts.


File name: Part.java

Line #20: Added a call method to inventCheck validator

Line #35-39: Added min and max integers with an @min for positive values only.

Line #49-54: Added min and Max inventory data types to class.

Line #58-63: Added min and Max inventory data types to class.

Line #98-109: Added getters and setters for Min and Max inventory integers.


File name: inventCheck.java

Line#1-18: Created an inventCheck annotation file to create a validator for inventory not being between the min and max values. This also includes an error message for inventory having to be between the min and max.


File name: inventValidator.java

Line #1-23: Create a validator that includes a conditional if statement to check if the inventory is between the min or max.



### H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
* Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
* Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
* Display error messages when adding and updating parts if the inventory is greater than the maximum.


File name: productForm.html

Line #7: Added demo.css reference

Line #41-42: Added Max and Min Inventory table headers

Line #51-53: Added max and min part inventory references

Line #65-66: Added Max and Min Inventory table headers

Line #75-76: Added Max and Min Inventory table headers


File name: InhousePartForm.html

Line #8: Added demo.css reference

Line: #14-32: Removed previous Error fields and added a catch all error list inside a div to display all errors.


File name: OutsourcedPartForm.html

Line #8: Added demo.css reference

Line #18-32: Removed previous Error fields and added a catch all error list inside a div to display all errors.


File name: demo.css

Line #68-76: Added styling for lists and tables


File name: EnufPartsValidator.java

Line #36: Added an if conditional statement to return false if adding the associated part would cause its inventory to be less than the minimum.


### I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

File name: PartTest.java

Line #105-139: Added two getter and setter units tests for both minimum and maximum inventory for parts.


### J.  Remove the class files for any unused validators in order to clean your code.

File name Part.java

Line #3, #19: Deleted references to ValidDeletePart validator


File name: ValidDeletePart.java

File name: DeletePartValidator.java

Deleted both of the above mentioned files