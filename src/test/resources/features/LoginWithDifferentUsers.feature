Feature:  data driven testing with diff user accounts
  User story: As a user, I should be able to login with different users using their correct emails and passwords.

  Scenario Outline: Verify user Information <email>
    Given user is on the login page
    When I login using "<email>" and "<password>"
    Then account holder name should be "<name>"

    @students
    Examples:
      | email             | password | name            |
      | student27@library | oMapQ5NZ | Test Student 27 |
      | student28@library | Dmr6hS9g | Test Student 28 |
      | student29@library | OQki3KSB | Test Student 29 |
      | student30@library | 1HLRfjPS | Test Student 30 |
      | student31@library | M3jrKdwA | Test Student 31 |
      | student32@library | V1xApWfv | Test Student 32 |
      | student33@library | qnV4VRwB | Test Student 33 |
      | student34@library | 5sWM3AE7 | Test Student 34 |
      | student35@library | AhjsbI64 | Test Student 35 |
      | student36@library | w0QE2uN6 | Test Student 36 |
      | student37@library | 6X1i4eU7 | Test Student 37 |
      | student38@library | KcD0IURm | Test Student 38 |
      | student39@library | gOAdqiF7 | Test Student 39 |
      | student40@library | nKjsonzr | Test Student 40 |

    @librarians
    Examples:
      | email               | password | name              |
      | librarian13@library | 6LS0qdmt| Test Librarian 13 |
      | librarian14@library | DqscDBb7| Test Librarian 14 |
      | librarian15@library | czIccsem| Test Librarian 15 |
      | librarian16@library | dlw79gzq| Test Librarian 16 |
      | librarian17@library | 9L74alrG| Test Librarian 17 |
      | librarian18@library | cKTohYW6| Test Librarian 18 |
      | librarian19@library | H82TblAL| Test Librarian 19 |
      | librarian20@library | yMJIokhp| Test Librarian 20 |
      | librarian21@library | hOFlkKhD| Test Librarian 21 |
      | librarian22@library | 7SDEws39| Test Librarian 22 |

