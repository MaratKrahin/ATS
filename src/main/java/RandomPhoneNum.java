class RandomPhoneNum {

    public String randomPhoneNumber() {
        return "8 - (" + (900 + (int) (Math.random() * ((999 - 900) + 1))) + ") " +
                (100 + (int) (Math.random() * ((999 - 100) + 1))) + "-" +
                (10 + (int) (Math.random() * ((99 - 10) + 1))) + "-" +
                (10 + (int) (Math.random() * ((99 - 10) + 1)));
    }
}

