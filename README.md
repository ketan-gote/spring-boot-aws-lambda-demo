# Spring Cloud AWS Lambda Demo
Demo focus on Spring Boot AWS Lambda function Demo.

Once Application is build follow below steps to deploy on AWS Lambda

### 1 - Create AWS Function

<img width="1680" alt="Screen Shot 2021-09-16 at 3 23 36 PM" src="https://user-images.githubusercontent.com/23295769/133591674-db6e8101-05db-454a-a5a7-6529b1e94f7c.png">

### 2 - Upload JAR
<img width="1598" alt="Screen Shot 2021-09-16 at 3 26 22 PM" src="https://user-images.githubusercontent.com/23295769/133592067-522c708c-4d0b-4b4c-a34d-fac5f599e101.png">


### 3 - Add entry class name (com.demo.AWSLambdaHandler). Note this is class is defined in our Spring Boot project
 
<img width="908" alt="Screen Shot 2021-09-16 at 3 36 19 PM" src="https://user-images.githubusercontent.com/23295769/133593659-7db58d34-39c0-4195-83f6-2ff23aeae1be.png">

 
### 4 - Add Trigger, This will be defined in API Gateway to trigger AWS Function

<img width="1608" alt="Screen Shot 2021-09-16 at 3 30 53 PM" src="https://user-images.githubusercontent.com/23295769/133592901-b48ec24d-8854-4fa1-b821-a2326e919c6e.png">

<img width="854" alt="Screen Shot 2021-09-16 at 3 31 12 PM" src="https://user-images.githubusercontent.com/23295769/133592912-0aee01b1-8a40-4d3a-a990-2027ec4a4c61.png">

Note: Have defined OPEN for demo purpose only never define for PROD.

## 5 - Above Step will provide a URL in API gateway, which you can use for testing

<img width="1603" alt="Screen Shot 2021-09-16 at 3 33 46 PM" src="https://user-images.githubusercontent.com/23295769/133593283-1012f361-00d7-47a9-b421-570d3e812b4c.png">


## 6 - Use Below CURL command too test Serverless function
curl -X POST \
  https://b5hasx7xhj.execute-api.ap-south-1.amazonaws.com/default/spring-boot-aws-lambda \
  -H 'cache-control: no-cache' \
  -H 'content-type: text/plain' \
  -H 'postman-token: d27664ce-8113-2c50-92aa-39486b9ee66d' \
  -d Test
  
## 7 - You can check logs in Cloud Watch Logs.  
