package com.sameer.tutorialSpring.DI.ConstructorDI;

/**
 * Created by Sameer on 2/5/2018.
 */
public class TextEditor {
    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Text Editor Constructor");
        this.spellChecker = spellChecker;
    }

    public void checkSpell(){
        spellChecker.checkSpelling();
    }
}
