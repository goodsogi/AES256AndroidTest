package com.plusapps.aes256test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testEncryption();
    }

    private void testEncryption() {

        String testString = "monkey";
        String encryptedString = "";
        String decryptedString = "";
        try {
            AES256Util aes256Util = new AES256Util();
            encryptedString = aes256Util.encrypt(testString);

            Log.d("monkey", "encryptedString: " + encryptedString);

            decryptedString = aes256Util.decrypt(encryptedString);
            Log.d("monkey", "decryptedString: " + decryptedString);


        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }


    }
}
