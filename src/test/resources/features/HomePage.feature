
  Feature: Home page functionalities

    Background:
      Given user is on qa environment

      Scenario: Verify labor tab button is clickable
        When user should click compare quotes button
        Then user should see "Enter your zip code" and "Move date" texts

        Scenario: Verify user can choose My apartment
          Given user should select "My Apartment" in What are You moving drop down
          Then "My Apartment" should be selected

    @Smoke
          Scenario: Verify user can add items to each room
            Given user should select "My House" in What are You moving drop down
            And user should select "1 Bedroom (500-1000 sq ft)" in Move Size drop down menu
            When user click compare quotes button
            Then "These are recommended rooms for a" pop up should appear
            When user click on Continue button in These are recommended rooms for a popup
            Then Boxes pop up should appear with "GOT IT" button
            When user click on GOT IT button in Boxes pop up
            Then user should see hint "Here you can see all your rooms and start moving!"
            When user clicks to next button in Here you can see all your rooms and start moving!
            Then user should see the hint "Here you can see inventory items for selected room!"
            Then user clicks to next Here you can see inventory items for selected room!
            Then user should see "Press this button to save choosed items and move to the next room!"
            Then user clicks to ok Press this button to save choosed items and move to the next room!
            Then user should click add to inventory Sofa in living room
            Then user should click add to inventory TV in living room
            Then user should click to Save and go to next in living room
            Then user should click add to inventory Dresser in Bedroom
            Then user should click add to inventory Bed in Bedroom
            Then user should click to Save and go to next in Bedroom
            Then user should click add to inventory Kitchen/Dining Chairs in Dining Room
            Then user should click add to inventory Kitchen/Dining Table in Dining Room
            Then user should click to Save and go to next in Dining Room
            Then user should click add to inventory Kitchen/Dining Chairs in Kitchen Room
            Then user should click add to inventory Kitchen/Dining Table in Kitchen Room
            Then user should click to Save and go to next in Kitchen Room
            Then user should click add to inventory Basket/Hamper in Bathroom
            Then user should click add to inventory Trash Can in Bathroom
            Then user should click to Save and go to next in Bathroom
            Then user should click add to inventory Outdoor Chair in Patio
            Then user should click add to inventory Outdoors Table in Patio
            Then user should click to Save and go to next in Patio
            Then user see Box Calculator
            Then user should click Add and Continue in Box Calculator
            When user should see "Set your road" form
            Then user should enter "New Orleans" street
            Then user should click to Enter zip code field
            Then  user should click to pick up form
            Then user should add 10 flight of stairs










