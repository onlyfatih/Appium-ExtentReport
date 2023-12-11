Feature: Delete Booking

  Background:
    * def createBooking = call read('classpath:caller/createBooking/createBookingCaller.feature@create_booking_caller')
    * def id = createBooking.responseId
    Given url baseUrl
    And path 'booking', id

      Scenario: Delete Booking
        When method delete
        Then status 201
        * print response