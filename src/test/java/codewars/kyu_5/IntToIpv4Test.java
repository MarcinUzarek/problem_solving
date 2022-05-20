package codewars.kyu_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntToIpv4Test {

    @Test
    void should_return_all_zeros_for_given_0() {
        assertEquals("0.0.0.0", IntToIpv4.longToIP(0));
    }

    @Test
    public void should_return_correct_ip() {
        assertEquals("128.114.17.104", IntToIpv4.longToIP(2154959208L));
        assertEquals("128.32.10.1", IntToIpv4.longToIP(2149583361L));
        assertEquals("0.0.0.32", IntToIpv4.longToIP(32L));
    }

}