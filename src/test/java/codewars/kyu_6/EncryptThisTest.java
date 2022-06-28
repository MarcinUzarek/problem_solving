package codewars.kyu_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EncryptThisTest {

    @Test
    public void should_encrypt_sentences() {
        assertEquals("84eh 108sse 104e 115eokp 116eh 109ero 104e 104dare",
                EncryptThis.encryptThis("The less he spoke the more he heard"));

        assertEquals("87yh 99na 119e 110to 97ll 98e 108eki 116tah 119esi 111dl 98dri",
                EncryptThis.encryptThis("Why can we not all be like that wise old bird"));

        assertEquals("84kanh 121uo 80roti 102ro 97ll 121ruo 104ple",
                EncryptThis.encryptThis("Thank you Piotr for all your help"));
    }

    @Test
    void should_return_empty_string_for_empty_input() {
        assertEquals("", EncryptThis.encryptThis(""));
    }

    @Test
    void should_return_ASCII_for_one_letter_word() {
        assertEquals("65", EncryptThis.encryptThis("A"));
    }

    @Test
    void should_return_ASCII_code_with_unchanged_letter_for_two_letter_word() {
        assertEquals("104e", EncryptThis.encryptThis("he"));
    }

}