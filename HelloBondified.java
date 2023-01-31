/***********************************************
    Nest method invocations

    Richie   Xue
    hw009
    worked with Vanessa Huang (pd3), Zidane Karim (pd2)
    advised by no one 

 **********************************************/

public class HelloBondified {

    public static void main( String[] commandLine) {
        System.out.println( dialog( "James", "Bond"));
        System.out.println( dialog( "firstStub", "lastStub"));
    }

/*
    method dialog
    returns the 2-person dialog for one name
*/
    private static String dialog( String firstName
                                , String lastName) {
        return myName(firstName, lastName) + "\n" + hello(firstName, lastName) + "\n" + correction(firstName, lastName) + "\n" + helloCorrected(firstName, lastName);
    }

/*
    method bondify
    returns a phrase in the form
        "lastName", "firstName" "lastName"
*/
    private static String bondify( String firstName, String lastName) {
        String firstLast = firstName + ' ' + lastName;
        return lastName + ", " + firstLast;
    }

/*
    method myName
    returns a sentence stating a name in bondified form in the form  
        My name is bondified name. 
*/
    private static String myName( String firstName, String lastName) {
        return "My name is " + bondify(firstName, lastName) + ".";
    }

/*
    method hello
    returns a phrase greeting the person's bondified name in the form
        Hello, bondified name. How you doon?
*/
    private static String hello( String firstName
                            , String lastName) {
        return "Hello, " + bondify(firstName, lastName) + ". How you doon?";
    }

/*
    method correction
    returns a phrase correcting the bondification in the form 
        Not "bondified name". Just "full name". 
*/
    private static String correction( String firstName
                            , String lastName) {
        return "Not \"" + bondify(firstName, lastName) + ".\" Just \"" + firstName + " " + lastName + ".\"";
    }

/*
    method helloCorrected
    returns a greeting phrase in the form 
        Hello, fullName. How you doon? 
*/
    private static String helloCorrected( String firstName
                            , String lastName) {
        return "Hello, " + firstName + " " + lastName + ". How you doon?";
    }

}
