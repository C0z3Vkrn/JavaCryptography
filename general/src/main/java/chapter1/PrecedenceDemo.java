package chapter1;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.crypto.util.PBKDFConfig;

import java.security.MessageDigest;
import java.security.Security;

public class PrecedenceDemo {
    public static void main(String[] args) throws Exception {
        //Security.addProvider(new BouncyCastleProvider());
        System.out.println(MessageDigest.getInstance("SHA1").getProvider().getName());
        System.out.println(MessageDigest.getInstance("SHA1", "BC").getProvider().getName());

    }

}
