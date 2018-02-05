package com.sameer.tutorialSpring.DI.SetterDI;

/**
 * Created by Sameer on 2/5/2018.
 */
public class TextEditor {
    private SpellChecker spellChecker;

    // a setter method to inject the dependency.
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("setSpellChecker." );
        this.spellChecker = spellChecker;
    }
    // a getter method to return spellChecker
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
