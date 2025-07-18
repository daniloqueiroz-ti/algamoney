# AlgaWorks Full Stack Angular/SpringRest Project

## *Algamoney*
This repository contains the front-end and back-end files for the Algamoney project, built and taught by AlgaWorks in the Fullstack Angular and Spring course.
Algamoney is a software for controlling and tracking financial income and expenses.


### It was developed with the following technologies:

- Backend: REST API with the Spring Boot 2.5 framework on Java 16
- Frontend: Single-Page Application (SPA) with Angular 10
- PrimeNG component library in the user interface
- User authentication and authorization with OAuth 2 and JWT (JSON Web Token)
- MariaDB 10+ database
- Flyway (database migrations)
- Jaspersoft JasperReports (PDF reports)
- Apache Maven (project and dependency manager)
- Node.js and NPM (Node Package Manager) for dependency management and front-end building.

## Screenshots

*Login page*

<img width="1366" height="726" alt="image" src="https://github.com/user-attachments/assets/87816c25-e4f5-4b82-aca2-ce8d51063965" />


*Dashboard with pie and line charts showing information on last month's releases*

<img width="1366" height="654" alt="image" src="https://github.com/user-attachments/assets/0be89500-e97f-46b1-b44c-f23c2e815ce9" />


*Edit page of a person*

<img width="1366" height="728" alt="image" src="https://github.com/user-attachments/assets/ee58a92f-cad3-4e5f-9f74-a6d3acc3a918" />


*Recording a revenue financial entry*

<img width="1366" height="728" alt="image" src="https://github.com/user-attachments/assets/2d56e611-53a8-4517-b253-2dcf31fea8bd" />


*PDF file with the release report*

<img width="1366" height="738" alt="image" src="https://github.com/user-attachments/assets/3995ab36-269c-4853-88fd-0957b4e96dfd" />


## Software Features

- Release Categories
  - Search all registered categories
  - Search for a category by code
  - Create a new category

- People
  - Search for all registered people
  - Search for people by name
  - Search for a person by code
  - Register a new person
  - Remove a person using the code
  - Update a person's data
    
- Financial Entries
  - Search for Entries
  - Search for entries by description and due date
  - Search for an entry by code
  - Create a new entry
  - Remove an entry
  - Update an entry

- PDF reports with entry information

- Automatic email reminders for upcoming entries

- Security
  - Register users in the database with different access privileges to features

 
### Postman

Note: To execute requests in Postman, you must first generate a JWT/OAuth 2 token. This token must then be sent along with requests made via URLs. The front-end application handles all these details without user intervention. 

*Authorization* 

<img width="1337" height="632" alt="image" src="https://github.com/user-attachments/assets/d1d337a7-8ea0-47c5-9fc1-55033ca67016" />


*Registration of a person*

<img width="1334" height="467" alt="image" src="https://github.com/user-attachments/assets/7046be31-68a8-4a3a-a1f0-daad575b06ec" />


### * URL * Method * Description *
- http://localhost:8080/algamoney-api/oauth/token POST Requests Access Token
- http://localhost:8080/algamoney-api/oauth/token POST Requests Refresh Token
- http://localhost:8080/algamoney-api/tokens/revoke DELETE Revokes the current token
- http://localhost:8080/algamoney-api/people/ GET Returns all people registered in the database (with pagination)
- http://localhost:8080/algamoney-api/people/ POST Registers a person
- http://localhost:8080/algamoney-api/people/{id} GET Returns a person's record based on their ID
- http://localhost:8080/algamoney-api/people/{id} DELETE Deletes a person's record based on their ID her
- http://localhost:8080/algamoney-api/people/{id} PUT Updates a person's record based on their ID
- http://localhost:8080/algamoney-api/people/{id}/active PUT Updates a person's active property based on their ID. In the request body, you must send a JSON with true or false.
- http://localhost:8080/algamoney-api/categories GET Returns all categories
- http://localhost:8080/algamoney-api/categories POST Registers a category
- http://localhost:8080/algamoney-api/categories/{id} GET Returns a category based on the ID
- http://localhost:8080/algamoney-api/journalentries POST Registers a journal entry
- http://localhost:8080/algamoney-api/journalentries GET Returns all journal entries (with (pagination)
- http://localhost:8080/algamoney-api/journalentries/{id} GET Returns a journal entry based on the ID
- http://localhost:8080/algamoney-api/journalentries/{id} DELETE Deletes a journal entry based on the ID
- http://localhost:8080/algamoney-api/journalentries?summary GET Returns summarized journal entries (the result only returns the person's name instead of the full record with address)
- http://localhost:8080/algamoney-api/journalentries?description={searchparam}&dueDateFrom=YYYY-MM-DD&dueDateTo=YYYY-MM-DD GET Searches journal entries with the parameters entered in the URL (description and date ranges). expiration)
- http://localhost:8080/algamoney-api/journalentries/statistics/by-day GET Returns posting statistics based on a time period
- http://localhost:8080/algamoney-api/journalentries/statistics/by-category GET Returns posting statistics based on categories
- http://localhost:8080/algamoney-api/journalentries/reports/by-person?begin={YYYY-MM-DD}&end={YYYY-MM-DD} GET Returns a PDF report based on the time period specified in the URL
- http://localhost:8080/algamoney-api/states GET Returns all states registered in the database
- http://localhost:8080/algamoney-api/cities?state={id} GET Returns a list of cities based on the state ID passed as a parameter
