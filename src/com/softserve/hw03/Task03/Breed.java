package com.softserve.hw03.Task03;

public enum Breed {
    Beagle("Beagle"),
    American_Bulldog("American Bulldog"),
    German_Shepherd_Dog("German Shepherd Dog"),
    Golden_Retriever("Golden Retriever"),
    Jack_Russell_Terrier("Jack Russell Terrier");
            ;
    private String breed;

    Breed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Breed{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
