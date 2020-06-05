/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Change {

    private char fromCharacter;
    private char toCharacter;

    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString){
        String replaced = "";
        for ( int i=0; i < characterString.length(); i++) {
            char character = characterString.charAt(i);
            if ( character == fromCharacter ) {
                replaced += toCharacter;
            }  else {
                replaced += character;
            }
        }
        return replaced;

        //atau
        //return characterString.replace(fromCharacter, toCharacter);
    }
}
