package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefinitions {
    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        Belly belly = new Belly();
        belly.eat(cukes);
    }

    @When("I wait {int} hour")
    public void i_wait_hour(Integer int1) {

    }


    @Then("my belly should growl")
    public void my_belly_should_growl() {

    }

    private BookProgressTracker bookProgress;

    @Given("I have a new book with {int} pages")
    public void i_have_a_new_book_with_pages(Integer pagesAmount) {
        this.bookProgress = new BookProgressTracker(pagesAmount);
    }

    @When("I read {int} pages")
    public void i_read_pages(Integer pagesRead) {
        // Write code here that turns the phrase above into concrete actions
        this.bookProgress.pagesWereRead(pagesRead);
    }
    @Then("I have {int} pages left")
    public void i_have_pages_left(Integer pagesLeft) throws AssertionError {
        if (this.bookProgress.pagesLeft() != pagesLeft){
            throw new AssertionError();
        }
    }

    @Then("Book is finished")
    public void book_is_finished() throws AssertionError {
        if (!this.bookProgress.isFinished()){
            throw new AssertionError();
        }
    }

    @Then("Book is not finished")
    public void book_is_not_finished() {
        if (this.bookProgress.isFinished()){
            throw new AssertionError();
        }
    }

}
