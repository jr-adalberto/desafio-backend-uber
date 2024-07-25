Email Microservice
Uber Backend Challenge
Java Spring Licence

This project is an API built using Java, Java Spring, AWS Simple Email Service.

The Microservice was developed for my Youtube Channel, to demonstrate how to solve the Uber Backend Challenge.

Table of Contents
Installation
Configuration
Usage
API Endpoints
Database
Contributing
Installation
Clone the repository:
git clone https://github.com/Fernanda-Kipper/desafio-backend-uber.git
Install dependencies with Maven

Update application.properties puting your AWS Credentials

aws.region=us-east-1
aws.accessKeyId=1111111
aws.secretKey=111111
Usage
Start the application with Maven
The API will be accessible at http://localhost:8080
API Endpoints
The API provides the following endpoints:

GET EMAIL

POST /api/email/send - Send a e-mail from your sender to the destination
BODY

{
"to": "liveskipperdev@gmail.com",
"subject": "teste",
"body": "teste"
}
Contributing
Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request to the repository.

When contributing to this project, please follow the existing code style, commit conventions, and submit your changes in a separate branch.