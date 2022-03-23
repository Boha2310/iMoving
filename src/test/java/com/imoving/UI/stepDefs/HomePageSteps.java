package com.imoving.UI.stepDefs;



import com.imoving.UI.dataProviders.ConfigReader;
import com.imoving.UI.methods.CustomAssertions;
import com.imoving.UI.methods.DropDownHelper;
import com.imoving.UI.methods.Helper;
import com.imoving.UI.pageObjects.*;
import com.imoving.UI.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePageSteps {
    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    TheseAreRecommendedRoomsPopUp theseAreRecommendedRoomsPopUp = new TheseAreRecommendedRoomsPopUp();
    FullInventoryPage fullInventoryPage = new FullInventoryPage();
    LivingRoomPage livingRoomPage = new LivingRoomPage();
    BedroomPage bedroomPage = new BedroomPage();
    DiningRoom diningRoom = new DiningRoom();
    kitchenRoom KitchenRoom = new kitchenRoom();
    Bathroom bathroom = new Bathroom();
    RatioRoom ratioRoom = new RatioRoom();
    BoxCalculator boxCalculator = new BoxCalculator();
    SetYourRoadPage setYourRoadPage = new SetYourRoadPage();



    @Given("user is on qa environment")
    public void user_is_on_qa_environment() {
        driver.get(ConfigReader.getProperty("environment"));
    }

    @When("user should click compare quotes button")
    public void user_should_click_compare_quotes_button() {
        Helper.click(homePage.laborTab);
        Helper.pause(5000);
    }

    @Then("user should see {string} and {string} texts")
    public void user_should_see_and_texts(String string, String string2) {

    }

    @Given("user should select {string} in What are You moving drop down")
    public void user_should_select_in_what_are_you_moving_drop_down(String houseType) {
        DropDownHelper.selectUsingVisibleText(homePage.whatAreYouMovingDropDownMenu, houseType);
        Helper.pause(5000);

    }

    @Then("{string} should be selected")
    public void should_be_selected(String myApartment) {
        Assertions.assertEquals(myApartment,Helper.getTextValue(homePage.whatAreYouMovingDropDownMenuSelectedValue).trim());

    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Given("user should select {string} in Move Size drop down menu")
    public void user_should_select_in_move_size_drop_down_menu(String oneBedroom) {
        DropDownHelper.selectUsingVisibleText(homePage.houseMoveSizeSelect, oneBedroom);

        
    }
    @When("user click compare quotes button")
    public void user_click_compare_quotes_button() {
        Helper.click(homePage.compareQuotesButton);

    }
    @Then("{string} pop up should appear")
    public void pop_up_should_appear(String myHouse) {
        Helper.waitElementToBeDisplayed(homePage.whatAreYouMovingDropDownMenuText);
        
        
    }
    @When("user click on Continue button in These are recommended rooms for a popup")
    public void user_click_on_continue_button_in_these_are_recommended_rooms_for_a_popup() {

        theseAreRecommendedRoomsPopUp.clickContinueButton();
        
    }
    @Then("Boxes pop up should appear with {string} button")
    public void boxes_pop_up_should_appear_with_button(String txt) {
        CustomAssertions.assetText("GOT IT", txt, fullInventoryPage.iMovingCalculatingTxt);
        
    }
    @When("user click on GOT IT button in Boxes pop up")
    public void user_click_on_got_it_button_in_boxes_pop_up() {
    Helper.click(fullInventoryPage.gotItButtonBoxPopUp);
        
    }
    @Then("user should see hint {string}")
    public void user_should_see_hint(String txt) {
    CustomAssertions.assetText("Here you can see all your rooms and start moving!", txt, fullInventoryPage.hereYouCanSeeAllYourRoomsAndStartMovingText);
        
    }
    @When("user clicks to next button in Here you can see all your rooms and start moving!")
    public void user_clicks_to_next_button_in_here_you_can_see_all_your_rooms_and_start_moving() {
        Helper.click(fullInventoryPage.nextButtonHereYouCanSeeAllRoomsHint);
        
    }
    @Then("user should see the hint {string}")
    public void user_should_see_the_hint(String text) {
        CustomAssertions.assetText("Here you can see inventory items for selected room!", text, fullInventoryPage.nextButtonHereYouCanSeeAllRoomsHintText);
    }




    @Then("user clicks to next Here you can see inventory items for selected room!")
    public void user_clicks_to_next_here_you_can_see_inventory_items_for_selected_room() {
        Helper.click(fullInventoryPage.nextButtonGereYouCanSeeInventoryItems);

    }

    @Then("user should see {string}")
    public void user_should_see(String text1) {
        CustomAssertions.assetText("Press this button to save choosed items and move to the next room!", text1, fullInventoryPage.okButtonHereYouCanSeeAllRoomsHintText);
    }
    @Then("user clicks to ok Press this button to save choosed items and move to the next room!")
    public void user_clicks_to_ok_press_this_button_to_save_choosed_items_and_move_to_the_next_room() {
        Helper.click(fullInventoryPage.okPressThisButtonToSave);
        
        ///////////////////////////////////////////////////////////
    }
    @Then("user should click add to inventory Sofa in living room")
    public void user_should_click_add_to_inventory_sofa_in_living_room() {
        Helper.waitElementToBeDisplayed(livingRoomPage.sofaPicture);
        Helper.negativeToElement(livingRoomPage.sofaPicture);
        Helper.click(livingRoomPage.sofaAddToInventoryButton);

        
        
    }
    @Then("user should click add to inventory TV in living room")
    public void user_should_click_add_to_inventory_tv_in_living_room() {
        Helper.negativeToElement(livingRoomPage.tvPicture);
        Helper.click(livingRoomPage.tvAddToInventoryButton);
        
    }
    @Then("user should click to Save and go to next in living room")
    public void user_should_click_to_save_and_go_to_next_in_living_room() {
        Helper.click(livingRoomPage.saveAndGoToNextFromLivingRoom);
        
        
    }
    @Then("user should click add to inventory Dresser in Bedroom")
    public void user_should_click_add_to_inventory_dresser_in_bedroom() {
        Helper.negativeToElement(bedroomPage.dresserPicture);
        Helper.click(bedroomPage.dresserAddToInventoryButton);
        
    }
    @Then("user should click add to inventory Bed in Bedroom")
    public void user_should_click_add_to_inventory_bed_in_bedroom() {
        Helper.negativeToElement(bedroomPage.bedPicture);
        Helper.click(bedroomPage.bedAddToInventoryButton);
        
    }
    @Then("user should click to Save and go to next in Bedroom")
    public void user_should_click_to_save_and_go_to_next_in_bedroom() {
        Helper.click(bedroomPage.saveAndGoToNextFromBedRoom);
        
    }
    @Then("user should click add to inventory Kitchen\\/Dining Chairs in Dining Room")
    public void user_should_click_add_to_inventory_kitchen_dining_chairs_in_dining_room() {
        Helper.negativeToElement(diningRoom.kitchenDiningChairsPicture);
        Helper.click(diningRoom.kitchenDiningChairsAddToInventoryButton);
        
    }
    @Then("user should click add to inventory Kitchen\\/Dining Table in Dining Room")
    public void user_should_click_add_to_inventory_kitchen_dining_table_in_dining_room() {
        Helper.negativeToElement(diningRoom.kitchenDiningTablePicture);
        Helper.click(diningRoom.kitchenDiningTableAddToInventoryButton);
        
    }
    @Then("user should click to Save and go to next in Dining Room")
    public void user_should_click_to_save_and_go_to_next_in_dining_room() {
        Helper.click(diningRoom.saveAndGoToNextFromDiningRoom);
    }
    @Then("user should click add to inventory Kitchen\\/Dining Chairs in Kitchen Room")
    public void user_should_click_add_to_inventory_kitchen_dining_chairs_in_kitchen_room() {
        Helper.negativeToElement(KitchenRoom.kitchenDiningChairsPicture);
        Helper.click(KitchenRoom.kitchenDiningChairsAddToInventoryButton);
        
    }
    @Then("user should click add to inventory Kitchen\\/Dining Table in Kitchen Room")
    public void user_should_click_add_to_inventory_kitchen_dining_table_in_kitchen_room() {
        Helper.negativeToElement(KitchenRoom.kitchenDiningTablePicture);
        Helper.click(KitchenRoom.kitchenDiningTableAddToInventoryButton);
        
    }
    @Then("user should click to Save and go to next in Kitchen Room")
    public void user_should_click_to_save_and_go_to_next_in_kitchen_room() {
        Helper.click(KitchenRoom.saveAndGoToNextFromKitchenRoom);
        
    }
    @Then("user should click add to inventory Basket\\/Hamper in Bathroom")
    public void user_should_click_add_to_inventory_basket_hamper_in_bathroom() {
        Helper.negativeToElement(bathroom.basketHamperPicture);
        Helper.click(bathroom.basketHamperAddToInventoryButton);
        
    }
    @Then("user should click add to inventory Trash Can in Bathroom")
    public void user_should_click_add_to_inventory_trash_can_in_bathroom() {
        Helper.negativeToElement(bathroom.trashCanPicture);
        Helper.click(bathroom.trashCanAddToInventoryButton);
        
    }
    @Then("user should click to Save and go to next in Bathroom")
    public void user_should_click_to_save_and_go_to_next_in_bathroom() {
        Helper.click(bathroom.saveAndGoToNextFromBathroom);
        
    }
    @Then("user should click add to inventory Outdoor Chair in Patio")
    public void user_should_click_add_to_inventory_outdoor_chair_in_patio() {
        Helper.negativeToElement(ratioRoom.outdoorChairPicture);
        Helper.click(ratioRoom.outdoorChairAddToInventoryButton);
        
    }
    @Then("user should click add to inventory Outdoors Table in Patio")
    public void user_should_click_add_to_inventory_outdoors_table_in_patio() {
        Helper.negativeToElement(ratioRoom.outdoorTablePicture);
        Helper.click(ratioRoom.outdoorTableAddToInventoryButton);
        
    }
    @Then("user should click to Save and go to next in Patio")
    public void user_should_click_to_save_and_go_to_next_in_patio() {
        Helper.click(ratioRoom.saveAndGoToNextFromRatioRoom);
        
    }
    @Then("user see Box Calculator")
    public void user_see_box_calculator() {

        
    }
    @Then("user should click Add and Continue in Box Calculator")
    public void user_should_click_add_and_continue_in_box_calculator() {
    Helper.click(boxCalculator.boxCalculatorAddAndContinueButton);
    }

    @When("user should see {string} form")
    public void user_should_see_form(String setYourRoad) {
        CustomAssertions.assetText("Set your road", setYourRoad, setYourRoadPage.setYourRoadText);

    }
    @Then("user should click to pick up form")
    public void user_should_click_to_pick_up_form() {
Helper.click(setYourRoadPage.pickUpFormButton);
Helper.pause(5000);

    }

    @Then("user should enter {string} street")
    public void user_should_enter_street(String streetName) {
        Helper.sendKeys(setYourRoadPage.enterZipCodeField, streetName);


    }

    @Then("user should click to Enter zip code field")
    public void user_should_click_to_enter_zip_code_field() {



    }

    @Then("user should add {int} flight of stairs")
    public void user_should_add_flight_of_stairs(Integer numberFlightOfStairs) {
      //  Assertions.fail();

    Helper.multiClick(setYourRoadPage.flightOfStairsIncreaseButton,numberFlightOfStairs);
        Helper.click(setYourRoadPage.enterZipCodeField);
        Helper.sandKeys(setYourRoadPage.enterZipCodeField, Keys.ARROW_DOWN);
        Helper.sandKeys(setYourRoadPage.enterZipCodeField, Keys.ENTER);
    }
}
