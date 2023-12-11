Feature: Get Booking

  Background:
    #* def nameFeature = 'Fatih'
    * def createBooking = call read('classpath:caller/createBooking/createBookingCaller.feature@create_booking_caller')
    #{"name":#(nameFeature)}
    * def id = createBooking.responseId
    Given url baseUrl
    And path 'booking', id

    Scenario: Get Booking
      When method get
      Then status 200
      * print response