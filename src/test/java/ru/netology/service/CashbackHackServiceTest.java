package ru.netology.service;

public class CashbackHackServiceTest {
        CashbackHackService service = new CashbackHackService();

        @org.junit.Test
        public void shouldSuggestAddingOn500() {
            int amount = 500;

            int actual = service.remain(amount);
            int expected = 500;

            org.junit.Assert.assertEquals(expected, actual);
        }

        @org.junit.Test
        public void shouldSuggestAddingOn100() {
            int amount = 900;

            int actual = service.remain(amount);
            int expected = 100;

            org.junit.Assert.assertEquals(expected, actual);
        }

        @org.junit.Test
        public void shouldSuggestAddingOn900() {
            int amount = 100;

            int actual = service.remain(amount);
            int expected = 900;

            org.junit.Assert.assertEquals(expected, actual);
        }

        @org.junit.Test
        public void shouldSuggestAddingOn0() {
            int amount = 0;

            int actual = service.remain(amount);
            int expected = 1000;

            org.junit.Assert.assertEquals(expected, actual);
        }

        @org.junit.Test
        public void shouldSuggestAddingOn1000() {
            int amount = 1000;

            int actual = service.remain(amount);
            int expected = 0;

            org.junit.Assert.assertEquals(expected, actual);
        }

        @org.junit.Test
        public void shouldSuggestAddingOn1() {
            int amount = 999;

            int actual = service.remain(amount);
            int expected = 1;

            org.junit.Assert.assertEquals(expected, actual);
        }

        @org.junit.Test
        public void shouldSuggestAddingOn999() {
            int amount = 1;

            int actual = service.remain(amount);
            int expected = 999;

            org.junit.Assert.assertEquals(expected, actual);
        }

        @org.junit.Test
        public void shouldSuggestAddingOn500IfAmountMoreThen1000() {
            int amount = 1500;

            int actual = service.remain(amount);
            int expected = 500;

            org.junit.Assert.assertEquals(expected, actual);
        }

        @org.junit.Test
        public void shouldSuggestAddingOn100IfAmountMoreThen1000() {
            int amount = 1900;

            int actual = service.remain(amount);
            int expected = 100;

            org.junit.Assert.assertEquals(expected, actual);
        }

        @org.junit.Test
        public void shouldSuggestAddingOn1000IfAmountMoreThen1000() {
            int amount = 2000;

            int actual = service.remain(amount);
            int expected = 1000;

            org.junit.Assert.assertEquals(expected, actual);
        }

    @org.junit.jupiter.api.Test
    public void shouldSuggestAddingOn500Junit5() {
        int amount = 500;

        int actual = service.remain(amount);
        int expected = 500;

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldSuggestAddingOn100Junit5() {
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldSuggestAddingOn900Junit5() {
        int amount = 100;

        int actual = service.remain(amount);
        int expected = 900;

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldSuggestAddingOn0Junit5() {
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldSuggestAddingOn1000Junit5() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldSuggestAddingOn1Junit5() {
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldSuggestAddingOn999Junit5() {
        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldSuggestAddingOn500IfAmountMoreThen1000Junit5() {
        int amount = 1500;

        int actual = service.remain(amount);
        int expected = 500;

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldSuggestAddingOn100IfAmountMoreThen1000Junit5() {
        int amount = 1900;

        int actual = service.remain(amount);
        int expected = 100;

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldSuggestAddingOn1000IfAmountMoreThen1000Junit5() {
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 1000;

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
    }

