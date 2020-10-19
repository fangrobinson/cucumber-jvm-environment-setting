Feature: BookProgressTracker

  Scenario: book with 200 pages and 50 read
    Given I have a new book with 200 pages
    When I read 50 pages
    Then I have 150 pages left

  Scenario: book with 200 pages and 50 read
    Given I have a new book with 200 pages
    When I read 50 pages
    Then Book is not finished

  Scenario: book with 200 pages and 200 read is finished
    Given I have a new book with 200 pages
    When I read 200 pages
    Then Book is finished