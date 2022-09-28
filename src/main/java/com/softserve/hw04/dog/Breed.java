package com.softserve.hw04.dog;

public enum Breed {
        CORGI ("Corgi"),
        BULLDOG ("Bulldog"),
        MALTIPU ("Maltipu");

        private final String breedName;

        Breed(String breedName){
            this.breedName = breedName;
        }
        public String getBreedName() {
            return breedName;
        }
}
