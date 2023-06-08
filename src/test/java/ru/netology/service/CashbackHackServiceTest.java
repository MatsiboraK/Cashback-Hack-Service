package ru.netology.service;

import org.junit.Test;

public class CashbackHackServiceTest {
        CashbackHackService service = new CashbackHackService();

        @org.junit.Test
        public void shouldSuggestAddingOn500() {
            int amount = 500;

            int actual = service.remain(amount);
            int expected = 500;

            org.junit.Assert.assertEquals(actual, expected);
        }

        @Test
        public void shouldSuggestAddingOn100() {
            int amount = 900;

            int actual = service.remain(amount);
            int expected = 100;

            org.junit.Assert.assertEquals(actual, expected);
        }

        @org.junit.Test
        public void shouldSuggestAddingOn900() {
            int amount = 100;

            int actual = service.remain(amount);
            int expected = 900;

            org.junit.Assert.assertEquals(actual, expected);
        }

        @org.junit.Test
        public void shouldSuggestAddingOn0() {
            int amount = 0;

            int actual = service.remain(amount);
            int expected = 1000;

            org.junit.Assert.assertEquals(actual, expected);
        }

        @org.junit.Test
        public void shouldSuggestAddingOn1000() {
            int amount = 1000;

            int actual = service.remain(amount);
            int expected = 0;

            org.junit.Assert.assertEquals(actual, expected);
        }

        @org.junit.Test
        public void shouldSuggestAddingOn1() {
            int amount = 999;

            int actual = service.remain(amount);
            int expected = 1;

            org.junit.Assert.assertEquals(actual, expected);
        }

        @org.junit.Test
        public void shouldSuggestAddingOn999() {
            int amount = 1;

            int actual = service.remain(amount);
            int expected = 999;

            org.junit.Assert.assertEquals(actual, expected);
        }

        @org.junit.Test
        public void shouldSuggestAddingOn500IfAmountMoreThen1000() {
            int amount = 1500;

            int actual = service.remain(amount);
            int expected = 500;

            org.junit.Assert.assertEquals(actual, expected);
        }

        @org.junit.Test
        public void shouldSuggestAddingOn100IfAmountMoreThen1000() {
            int amount = 1900;

            int actual = service.remain(amount);
            int expected = 100;

            org.junit.Assert.assertEquals(actual, expected);
        }

        @org.junit.Test
        public void shouldSuggestAddingOn1000IfAmountMoreThen1000() {
            int amount = 2000;

            int actual = service.remain(amount);
            int expected = 1000;

            org.junit.Assert.assertEquals(actual, expected);
        }
    }

