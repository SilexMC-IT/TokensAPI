package com.github.silexmc.tokens.api;

import java.math.BigInteger;
import java.util.UUID;

public interface TokensAPI {
    BigInteger getTokens(UUID uniqueID);

    String getStringTokens(UUID uniqueID);

    String getFormatTokens(UUID uniqueID);

    BigInteger getTotalTokens(UUID uniqueID);

    String getStringTotalTokens(UUID uniqueID);

    String getFormatTotalTokens(UUID uniqueID);

    boolean hasTokens(UUID uniqueID, BigInteger tokens);

    default boolean hasTokens(UUID uniqueID, Integer money) {
        return this.hasTokens(uniqueID, BigInteger.valueOf(money));
    }

    void setTokens(UUID uniqueID, BigInteger tokens);

    default void setTokens(UUID uniqueID, Integer money) {
        this.setTokens(uniqueID, BigInteger.valueOf(money));
    }

    void giveTokens(UUID uniqueID, BigInteger tokens);

    default void giveTokens(UUID uniqueID, Integer money) {
        this.giveTokens(uniqueID, BigInteger.valueOf(money));
    }

    void takeTokens(UUID uniqueID, BigInteger tokens);

    default void takeTokens(UUID uniqueID, Integer money) {
        this.takeTokens(uniqueID, BigInteger.valueOf(money));
    }
}
