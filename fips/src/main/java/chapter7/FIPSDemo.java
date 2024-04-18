package chapter7;

import java.security.MessageDigest;
import java.security.Security;

import org.bouncycastle.jcajce.provider.BouncyCastleFipsProvider;

// BC FIPS distrubution 和 BC regular distribution不兼容

public class FIPSDemo {
    public static void main(String[] args) throws Exception {
       // Security.addProvider(new BouncyCastleFipsProvider());

        // 创建SHA-256哈希算法实例
        MessageDigest digest = MessageDigest.getInstance("SHA-256", "BCFIPS");

        // 计算消息的哈希值
        byte[] hash = digest.digest("Hello, world!".getBytes());

        // 将哈希值转换为十六进制字符串
        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }

        System.out.println("SHA-256 Hash: " + hexString.toString());
    }
}
