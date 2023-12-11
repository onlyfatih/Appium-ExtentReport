Feature: Update Booking

  Background:
    * def createBooking = call read('classpath:caller/createBooking/createBookingCaller.feature@create_booking_caller')
    * def id = createBooking.responseId
    Given url baseUrl
    And path 'booking', id

    Scenario: Update Booking
      * def requestBody = createBooking.requestBody
      * requestBody.firstname = 'Cemre'
      And request requestBody
      When method put
      Then status 200
      * print response


