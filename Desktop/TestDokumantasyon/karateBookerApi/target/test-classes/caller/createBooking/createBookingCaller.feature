Feature: Create Booking Caller

  Background:
    Given url baseUrl
    And path 'booking'
    * def dataGenerator = Java.type('helpers.DataGenerator')
    * def randomName = dataGenerator.generateRandomString(5)
    * def jsRandomName = call read('classpath:helpers/randomDataGenerator.js')

  @create_booking_caller
    Scenario: Create Booking
      * def requestBody = read ('classpath:model/createUpdateBooking.json')
      #* requestBody.firstname = jsRandomName
      And request requestBody
      When method post
      Then status 200
      * def responseId = response.bookingid
      * print response

