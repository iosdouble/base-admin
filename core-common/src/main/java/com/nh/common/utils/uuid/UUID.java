package com.nh.common.utils.uuid;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/**
 * com.nh.common.utils.uuid
 * create by admin nihui
 * create time 2020/12/4
 * version 1.0
 **/
public final class UUID implements java.io.Serializable, Comparable<UUID> {
    @Override
    public int compareTo(UUID o) {
        return 0;
    }
}
