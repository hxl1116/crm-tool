# Customer Relationship Management Tool (CRM Tool)

CRM Tool is a Java API used to access customer data from a database

## Project Status
CRM Tool currently exists as a desktop CRUD application, but will be updated to a local-machine, web-based, 
REST-full API.

## Installation
Clone the project into an IDE. For IntelliJ, open the Database tab on the right sidebar and add the customer.db by
selecting "Data Source from Path".

## Usage
Compile and run. Enter commands through standard input.

```text
// Displays formatted customer data
get;id

// Adds a new customer to the database
add;firstName,lastName,address,email,age,gender,profession

// Updates an existing customer in the database
update;id,firstName,lastName,address,email,age,gender,profession

// Deletes a customer from the database
delete;id
```

## Contributing
This project is being worked on by [Henry Larson](https://github.com/hxl1116) and 
[Griffin Seibold](https://github.com/gxs1619).

## License
[MIT](https://choosealicense.com/licenses/mit/)