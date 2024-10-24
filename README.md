## ⓘ About
Backend of the Commerce system developed using SpringBoot (Study System) (RESTFul API).

The system must maintain a register of users, products and their categories. Each
The user has a name, email, telephone number, date of birth and an access password. You
Product data are: name, description, price and image. The system must present
a catalog of products, which can be filtered by product name. From
from this catalogue, the user can select a product to view its details and to
decide whether to add it to a shopping cart. User can add and remove items
of the shopping cart, as well as changing the quantities of each item. Once the
user decides to close the order, the order must then be saved in the system with the status
of "awaiting payment". The data for an order are: the moment it was saved,
status, and a list of items, where each item refers to a product and its quantity in the
order. The status of an order can be: awaiting payment, paid, shipped,
delivered and cancelled. When the user pays for an order, the payment instant
must be registered. System users can be customers or administrators,
every registered user is a customer by default. Unidentified users
can register in the system, browse the product catalog and the shopping cart
shopping. Customers can update their registration in the system, register orders and view
your own requests. Administrator users have access to the administrative area where
You can access user, product and category registrations.
    

## 💻 Technologies used:

* Spring Framework V.3.3.4
* Spring MVC
* Spring Security
* Apache Maven (Dependency Injector)
* Java JDK-17
* Docker
* Railway
* H2 Database (In-memory database), however the system can be integrated with PostgreSQL.
* [Postman](https://www.postman.com/interstellar-moon-715825/workspace/dscommerce/collection/21958705-2780c03f-bd09-44e5-ae31-1cf74309bf93?action=share&creator=21958705)
  


## 🛠️ Additional Information: 


<p align="center">1º Layered Design Pattern (DTO) </p>

<div align="center"> 
    <img src="https://user-images.githubusercontent.com/101218403/251632425-81872d36-798c-47af-a055-90ac847b9bda.png"/> 
</div>



<p align="center">2º Domain Layer </p>

<div align="center"> 
    <img src="https://github.com/user-attachments/assets/86510cbf-3857-4f29-91a9-4f5352579f91"/> 
</div>

<p align="center">3º Front-end User Interface </p>

<div align="center"> 
    <img src="https://github.com/user-attachments/assets/ecdc4e32-ffd5-42b5-b5d6-ac33be5a3b71"/> 
</div>
