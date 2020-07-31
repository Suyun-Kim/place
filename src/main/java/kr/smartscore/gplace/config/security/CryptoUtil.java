package kr.smartscore.gplace.config.security;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * 기능 :
 * 작성자 :
 * 작성일자 :
 **/

@Component
@Log4j2
public class CryptoUtil {

    @Getter
    private final String seed_key = "3dxbWFjbQ";

    public String decKey (String encKey, String key) throws UnsupportedEncodingException {

        if (key == null)
            key = this.seed_key;

        int len_encKey = encKey.length();
        int len_seedKey = key.length();
        int len_decKey = 0;
        int keyCharAt = 0;
        int xor = 0;

        String decKey = "";
        String keyChar = "";
        String cha = "";
        String ret = "";

        if (len_encKey == 0 || len_seedKey < 3)
            return null;

        encKey = encKey.replaceAll(" ", "+");
        decKey = base64_decode(encKey);
        len_decKey = decKey.length();

        for (int i = 0; i < len_decKey; i++) {

            keyCharAt = (i % len_seedKey);
            keyChar = key.substring(keyCharAt, (keyCharAt+1));
            cha = decKey.substring(i, (i+1));

            int right_xor = keyChar.charAt(0);
            int left_xor = cha.charAt(0);

            xor = (left_xor ^ right_xor);
            ret += (char)xor;

        }

        return ret;
    }

    public String base64_decode (String str) throws UnsupportedEncodingException {

        Base64.Decoder decoder = Base64.getDecoder();
        byte[] deKey = decoder.decode(str);

        return new String(deKey, "UTF-8");
    }

    public String base64_encode (byte[] str) {
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] enKey = encoder.encode(str);
        return "";
    }

    public String encrypt(String str, String key) {
        char[] enc_key = key.toCharArray();
        byte[] bytes = str.getBytes();

        Integer len = bytes.length;
        Integer key_len = enc_key.length;

        String let = "";
        for( int i = 0; i < len; i++ ) {
            int keyCharAt = i % key_len;
            char keyChar = enc_key[keyCharAt];
            int keyCode = (int)keyChar;

            byte charCode = bytes[i];

            let += (char)(charCode ^ keyCode);
        }

        Base64.Encoder encoder = Base64.getEncoder();
        byte[] targetBytes = let.getBytes();

        String encodedString = encoder.encodeToString(targetBytes);

        return encodedString;
    }
}
